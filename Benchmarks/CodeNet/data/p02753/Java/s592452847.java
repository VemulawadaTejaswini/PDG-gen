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
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    double c=a/0.08;
	    int cc=(int)c;
	    
	    double d=b/0.1;
	    int dd=(int)d;
	    if(c==d)
	     System.out.println((int)c);
	    else
	    System.out.println("-1");
       }     
	catch(Exception e)
		 {}
	}
}
