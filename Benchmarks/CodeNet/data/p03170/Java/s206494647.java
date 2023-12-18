/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static void solve(int arr[],int k){
        
        int t[]=new int[k+1];
        
        for(int i=1;i<=k;i++){
            
            for(int j=0;j<arr.length;j++){
                
                if(i-arr[j]>=0){
                    if(t[i-arr[j]]==0){
                        t[i]=1;
                        
                        break;
                    }
                }
                
            }
            
           
            
        }
        
        if(t[k]==0){
        System.out.println("Second");
        }
        else{
            System.out.println("first");
        }
        
    }
    
    
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int k=s.nextInt();
	
	int arr[]=new int[n];
	
	for(int i=0;i<arr.length;i++){
	    arr[i]=s.nextInt();
	}
	solve(arr,k);
	
	
	
	
	}
}
