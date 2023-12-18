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
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0, min = 100;
        int ans1 = 0,ans2 = 0;
        int[] temp = new int[N];
        //uekara sita
        for(int i = 0; i < N ; i++){
            temp[i] = sc.nextInt();
            if(temp[i] < max){
                ans1++;
            }
            if(temp[i] > max){
                max = temp[i];
            }
            
        }
        for( int i = N-1 ; i>=0 ; i--){
            if(temp[i] > min){
                ans2++;
            }
            if(temp[i] < min){
                min = temp[i];
            }
        }
        if(ans1 > ans2){
            ans1 = ans2;
        }
        System.out.println(ans1 + 1);
    }
    
}