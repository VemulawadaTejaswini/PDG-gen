/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
     public static int minCost(int [][]h , int curr_ind , int n , int [][]dp , int k){
	        if(curr_ind > n  )
	        return 0;
	        
	        if(dp[curr_ind][k]!=-1) return dp[curr_ind][k];
	        
	        int a = Integer.MIN_VALUE;
	        
	        if(k==0){
	            a = Math.max((h[curr_ind][1] + minCost(h,curr_ind+ 1,n,dp,1 )),Math.max((h[curr_ind][2] + minCost(h,curr_ind+ 1,n,dp,2 )),(h[curr_ind][3] + minCost(h,curr_ind+ 1,n,dp,3 ))));
	        }else if(k == 1){
	            a = Math.max((h[curr_ind][2] + minCost(h,curr_ind+ 1,n,dp,2 )),(h[curr_ind][3] + minCost(h,curr_ind+ 1,n,dp,3 )));
	        }else if(k == 2){
	             a = Math.max((h[curr_ind][1] + minCost(h,curr_ind+ 1,n,dp,1 )),(h[curr_ind][3] + minCost(h,curr_ind+ 1,n,dp,3 )));
	        }else{
	             a = Math.max((h[curr_ind][2] + minCost(h,curr_ind+ 1,n,dp,2 )),(h[curr_ind][1] + minCost(h,curr_ind+ 1,n,dp,1 )));
	        }
	        
	        
	        
	       
	        
	        return dp[curr_ind][k] = a;
	        
	        
	    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	   
	    
	    
		// your code goes here
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		
		
		int h[][] = new int[n+1][4];
		for(int i = 1 ;i<=n;i++){
		    for(int j=1;j<=3;j++){
		    h[i][j] = sc.nextInt();
			}}
			
			int dp[][]=new int[n+1][4];
			for(int i=0;i<n+1;i++){
			for(int j =0;j<4;j++){
			dp[i][j] = -1;
			}}
			
			System.out.println(minCost(h , 1 , n , dp , 0));
	}
}
