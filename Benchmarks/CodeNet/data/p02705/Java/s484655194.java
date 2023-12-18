/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class a1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		
		double r=sc.nextDouble();
		double circum=2*Math.PI*r;
		System.out.println(String.format("%.20f", circum));
		
	}
}