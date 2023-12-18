/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    static int check;
	public static void main (String[] args) {
		//System.out.println("GfG!");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int W = sc.nextInt();
		int val[]=new int[n];
		int wt[]=new int[n];
		for(int i=0;i<n;i++){
		    wt[i]=sc.nextInt();
		    val[i]=sc.nextInt();
		    
		}
		int K[][]=new int[n+1][W+1]; 
  
   // Build table K[][] in bottom up manner 
   for (int i = 0; i <= n; i++) 
   { 
       for (int w = 0; w <= W; w++) 
       { 
           if (i==0 || w==0) 
               K[i][w] = 0; 
           else if (wt[i-1] <= w) 
                 K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]); 
           else
                 K[i][w] = K[i-1][w]; 
       } 
   } 
  
   System.out.println(K[n][W]); 
	}}