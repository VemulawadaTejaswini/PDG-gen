/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package AtCoder;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

/**
 *
 * @author Jagmohan Mandre
 */
class Main {
   public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
         try {
          int D = sc.nextInt();
          int T = sc.nextInt();
          int S = sc.nextInt();
          double time = ((double)D / (double)S) ;
          if(time <= T){
              System.out.println("Yes");
          } else {
              System.out.println("No");
          }
        } catch (Exception e) {
            return;
        }
    }
}
