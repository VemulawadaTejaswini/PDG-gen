/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static long solve(long arr[],int k,int n){
        
        
        long t[]=new long[arr.length+1];
      
        for(int i=2;i<n;i++){
        long min=Long.MAX_VALUE;
             if(i-k<=0){
            for(int j=1;j<i;j++){
                
               
                    min=Math.min(min,Math.abs(arr[i]-arr[j])+t[j]);
                    
                }
             }
                else{
              
              for(int m=i-k;m<i;m++){
                      min=Math.min(min,Math.abs(arr[i]-arr[m])+t[m]);
              }
              
                    
                }
                t[i]=min;
            }
            
            
  return t[arr.length-1];          
        }
        
  
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int k=s.nextInt();
	long arr[]=new long[n+1];
	
	for(int i=1;i<=n;i++){
	    arr[i]=s.nextLong();
	}

System.out.println(	solve(arr,k,n+1));
	
	
	}
}
