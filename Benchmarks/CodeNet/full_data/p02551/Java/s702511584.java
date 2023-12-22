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
	    int q=sc.nextInt();
	    boolean[][] arr=new boolean[n][n];
	    for(int i=0;i<n;i++)
	    arr[n-1][i]=true;
	     for(int i=0;i<n;i++)
	    arr[i][n-1]=true;
	    for(int i=0;i<n;i++)
	    arr[0][i]=true;
	    for(int i=0;i<n;i++)
	    arr[i][0]=true;
	   //now we ready for some input
	   for(int looper=0;looper<q;looper++)
	   {int a=sc.nextInt();
	   int b=sc.nextInt();
	   if(a==1)
	   {arr[0][b-1]=true;
	   for(int i=1;i<n;i++)
	   if(!arr[i][b-1]) arr[i][b-1]=true;
	       else break;
	   }
	     else
	     {arr[b-1][0]=true;
	   for(int i=1;i<n;i++)
	   if(!arr[b-1][i]) arr[b-1][i]=true;
	       else break;
	   }
	       
	   }
	    //k now we count the falsifications
	    long count=0;
	    for(int i=0;i<n;i++)
	    for(int j=0;j<n;j++)
	    {if(!arr[i][j]) count++;
	        
	    }
	    
	    
	    
	    
	        System.out.println(count);
	}
}
