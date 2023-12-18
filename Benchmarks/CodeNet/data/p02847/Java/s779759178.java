/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Nour
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 //S is SUN, MON, TUE, WED, THU, FRI, or SAT.
 Scanner input=new Scanner(System.in);
 String S =input.next();
 if (S.equals("SUN")){
     System.out.println(7);}
 else if(S.equals("MON")){
     System.out.println(6);}
 else if(S.equals("TUE")){
     System.out.println(5);}
else if(S.equals("WED")){
     System.out.println(4);}
 else if(S.equals("THU")){
     System.out.println(3);}
 else if(S.equals("FRI")){
     System.out.println(2);}
 else if(S.equals("SAT")){
     System.out.println(1);
    }}
    
}
