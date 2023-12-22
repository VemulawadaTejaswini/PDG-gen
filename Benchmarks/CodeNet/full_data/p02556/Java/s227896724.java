/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	   int[] arx=new int[n];
	   int[] ary=new int[n];
	   long dist=0,distmax=0;
	   for(int i =0;i<n;i++)
	   {arx[i]=sc.nextInt();
	       ary[i]=sc.nextInt();
	   }
	    for(int i=0;i<n;i++)
	    {for(int j=i+1;j<n;j++)
	    {dist=(long)Math.abs(arx[i]-arx[j])+(long)Math.abs(ary[i]-ary[j]);
	    if(dist>distmax) distmax=dist;
	        
	    }
	        
	        
	    }
	    System.out.println(distmax);
	    
	        // your code goes here
	
	        
	    
	    
	}
}
