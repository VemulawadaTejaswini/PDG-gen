/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platinumalgorithms;

import java.io.*;
import java.util.*;
public class PLATINUMaLGORITHMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i<n; i++){
        h[i] = scan.nextInt();
        }
        int solve = dp(n, h);
    System.out.println(solve);
    }
    public static int dp(int n, int[] h){
    int[] arr = new int[n];
    arr[1] = Math.abs(h[0] - h[1]);
    for(int i = 2; i<arr.length; i++){
    arr[i] = Math.min(Math.abs(h[i-1]-h[i])+arr[i-1], Math.abs(h[i-2]-h[i])+arr[i-2]);
    }
    return arr[n-1];
    }
    
}
