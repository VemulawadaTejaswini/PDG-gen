/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
  public static void main (String[] args) throws java.lang.Exception
   {
	try{
	    Scanner sc=new Scanner(System.in);
		  long n=sc.nextLong();
		  long k=sc.nextLong();
      if(n==0)
         System.out.println("0");
      else
      {long m=n%k;
		 if(m==0)
		  System.out.println("0");  
         
		 else if(m==n)
		   System.out.println(m);
		 else if(k-m>0)
		 System.out.println(k-m);
		       
      }   
	   }     
	catch(Exception e)
		 {}
 	}
}
