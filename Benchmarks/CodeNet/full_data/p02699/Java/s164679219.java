/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		
	
	    if(b>=c)
	    {
	        System.out.println("Yes");
	        return;
	    }
	    else if(d>=a)
	    {
	        System.out.println("No");
	        return;
	    }
	   
	     int ans1=c/b;
         if(c%b>0)
           ans1++;
        int ans2=a/d;
         if(a%d>0)
           ans2++;
	    
	   
	    
	    if(ans1<=ans2)
	    {
	        System.out.println("Yes");
	        
	    }
	    else
	    System.out.println("No");
	}
}
