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
		   int n=sc.nextInt();
		   int m=sc.nextInt();
		   int a[]=new int[n];
      int sum=0;
		   for(int i=0;i<n;i++)
		      {a[i]=sc.nextInt();
		      sum+=a[i];}
		 int count=0;
		  int crit=sum/(4*m);
		  for(int i=0;i<n;i++)
		     {
		        if(a[i]>=crit)
		          count++;
		     }
		 if(count>=m)
		 System.out.println("Yes");
		 else
		 System.out.println("No");
		  }     
	catch(Exception e)
		 {}
	}
}
