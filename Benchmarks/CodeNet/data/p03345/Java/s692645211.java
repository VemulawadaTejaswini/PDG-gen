/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author nai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] guu = {1,-1,0};
        int[] ki = {-1,1,0};
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        long ans = 0;
        if(K % 2 == 0){
            ans = A - B;
        }else{
            ans = -A + B;
        }
        if(ans > Math.pow(10, 18)){
            System.out.println("Unfair");
            return;
        }
        System.out.println(ans);
    }
    
}