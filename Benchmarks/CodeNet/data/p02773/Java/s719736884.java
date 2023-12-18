/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int flag;
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int i,j;
		String s[]=new String[n];
		String str[]=new String[n];
		int arr[]=new int[n];
		String sup[] = new String[n];
		
		for( i=0 ;i<n;i++)
		{
		    s[i]=sc.next();
		    
		}
		int count;
		int p=0;
		for(i=0;i<n-1;i++)
		{
		    flag=0;
		    count=0;
		    for(j=i+1;j<n;j++)
		    {
		        
		        if(s[i].equals(s[j]) && (!s[i].equals("") ))
		        {
		            
		            if(count==0)
		            {
		                flag=1;
		                str[p]=s[i];
		            }
		            s[j]="";
		            count++;
		        }
		        
		       
		    }
		    if(flag==1)
		     arr[p++]=count;
		     
		     
		}
		
		int large=0;
		for(i=0;i<p;i++)
		{
		    
		    if(arr[i]>=large)
		    {
		        large=arr[i];
		    }
		    
		    
		}
		
		int check=0;
		
		for(i=0;i<p;i++)
	    {
	     
	     if(arr[i] ==large)   
	     {
	         check=1;
	      sup[i]=str[i];
	     }
	    
	    
	    }
	    
	    if(check==1)
	    {
	        Arrays.sort(sup,0,p);
	    for(i=0;i<p;i++)
	     System.out.println(sup[i]);   
	    
	    
	    }
	    
	    
	    
	    
	    
	    
	    
	    if(large==0)
	    for(i=0;i<n;i++)
	    {
	     System.out.println(s[i]);     
	    }
		
		
		
	}
}
