/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    long n=s.nextLong();
	    int k=s.nextInt();
	    long a[]=new long[k];
	    long sum=0;
	    for(int i=0;i<k;i++)
	    {a[i]=s.nextLong();sum+=a[i];}
	    if(sum>=n)
	    System.out.println("Yes");
	    else
	    System.out.println("No");
	}}
	    