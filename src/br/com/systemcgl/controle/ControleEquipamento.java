/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;

import br.com.systemcgl.entidades.Equipamento;
import br.com.systemcgl.repositorio.RepositorioEquipamento;
import static java.lang.String.format;

import java.math.RoundingMode;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author zaretux
 */
public class ControleEquipamento {
  RepositorioEquipamento re = new RepositorioEquipamento();
    
    public void addEquip (Equipamento eq) throws ClassNotFoundException {
        
        String nome = eq.getNome();
        String marca = eq.getMarca();
        String modelo = eq.getModelo();
        String serial = eq.getSerial();
        Double valor = eq.getValorLoca();
        String dispo = eq.getDisponivel();

        re.svEquipDB(nome, marca, modelo, serial, valor, dispo);
        
        
        
        
        
        
    }
    
    public ResultSet listaEquip () throws ClassNotFoundException, SQLException{
        
        ResultSet rs = re.getTEquip();
     
        
        
        return re.getTEquip();
        
    }
    
    public void delEquip(Equipamento eq) throws ClassNotFoundException{
        re.delEquip(eq.getCod());
    }
    
    public void alterEquip (Equipamento eq) throws ClassNotFoundException{
        eq.setCod(eq.getCod() + 1);
        
        re.alterEquip(eq.getCod(),eq.getNome(), eq.getMarca(), eq.getModelo(), eq.getSerial(), eq.getValorLoca());
        
    }
}

