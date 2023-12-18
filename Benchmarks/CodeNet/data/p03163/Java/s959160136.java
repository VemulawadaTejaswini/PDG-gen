/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
     public static long minCost(int []w , int []v , int curr_ind , int n , long [][]dp , int k_w){
	        if(curr_ind > n || k_w <= 0 )
	        return 0;
	        
	        if(dp[curr_ind][k_w]!=-1) return dp[curr_ind][k_w];
	        
	        long a = Long.MIN_VALUE;
	        
	        // do not pick
	        a = Math.max(a , minCost(w,v,curr_ind + 1 , n , dp , k_w ) );
	        
	        //pick the element
	       
	         
	        
	        if(w[curr_ind] <= k_w ){
	            
	       //      System.out.println("pick the ele :");
	       //  System.out.println("item w : "+ w[curr_ind]);
	       //   System.out.println("knap w : "+ k_w);
	            
	          
	             a = Math.max(a , (v[curr_ind] + minCost(w , v , curr_ind + 1 ,n, dp ,  k_w - w[curr_ind])) );
	        }
	        
	        
	       
	        
	        return dp[curr_ind][k_w] = a;
	        
	        
	    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	   
	    
	    
		// your code goes here
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		int k_w = sc.nextInt();
		
	//	System.out.println("W : "+k_w);
		    int w[] = new int[n+1];
			int v[] = new int[n+1];
			
			
		for(int i = 1 ;i<=n;i++){
		  
		    w[i] = sc.nextInt();
		    v[i] = sc.nextInt();
		    
			}
			
			
			long dp[][]=new long[n + 1][k_w + 1];
			
			for(int i=0;i<n+1;i++){
		      for(int j =0;j<k_w + 1;j++){
			dp[i][j] = -1 ;
			}}
			
			System.out.println(minCost(w , v, 1 , n , dp , k_w));
	}
}
