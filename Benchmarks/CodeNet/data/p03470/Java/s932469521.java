/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


import java.util.* ;

/**
 *
 * @author nai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i< N ; i++){
            set.add(sc.nextInt());
        }
        System.out.println(set.size());
    }
  }
    

