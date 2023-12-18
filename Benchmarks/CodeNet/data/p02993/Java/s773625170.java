/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        
       String W2=null;
       String W1=null;
        for(int count=1; count<=5;count++){
            
         W1 = S1.substring(count,count+1);
        
         
            if(W1.equals(W2)){
            System.out.print("Bad");
            return;
            
        }
        
        W2=W1;
        }
        System.out.print("Good");
    }
    
}
