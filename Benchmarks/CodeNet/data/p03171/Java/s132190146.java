/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	 
    static long solve(long arr[],int i,int j,long dp[][]){
        
        if(i>j){
            return 0;
        }
        if(i==j){
            return arr[i];
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
        long op1=arr[i]+Math.min(solve(arr,i+2,j,dp),solve(arr,i+1,j-1,dp));
        
        long op2=arr[j]+Math.min(solve(arr,i,j-2,dp),solve(arr,i+1,j-1,dp));
    
        
        return dp[i][j]= Math.max(op1,op2);
        
    }
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
		    long arr[]=new long[n];
		    long sum=0;
		    for(int i=0;i<n;i++){
		        arr[i]=s.nextLong();
		  
		  sum+=arr[i];  }
		    long dp[][]=new long[3005][3005];
		  long m= solve(arr,0,n-1,dp);
	long qw=sum-m;
	long ee=m-qw;
	System.out.println(ee);
	}
}
