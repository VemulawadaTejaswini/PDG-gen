/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static long solve(long arr[][],int k,int n){
        
        
        long t[][]=new long[n+1][k+1];
        
        for(int i=1;i<=3;i++){
            t[1][i]=arr[0][i-1];
        }
        
        for(int i=2;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(j==1){
                t[i][j]=arr[i-1][j-1]+Math.max(t[i-1][2],t[i-1][3]);
            }
            
            
            else if(j==2){
                 t[i][j]=arr[i-1][j-1]+Math.max(t[i-1][1],t[i-1][3]);
            }
            
            else{
                
                 t[i][j]=arr[i-1][j-1]+Math.max(t[i-1][2],t[i-1][1]);
            }
            }
        }
        long max=0;
        for(int i=1;i<=3;i++){
            max=Math.max(max,t[n][i]);
        }
        
          return max;     
        }
        
  
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	long arr[][]=new long[n][3];
	
	for(int i=0;i<n;i++){
	    for(int j=0;j<3;j++){
	        arr[i][j]=s.nextLong();
	    }
	}
	
	
System.out.println(	solve(arr,3,n));
	
	}
}
