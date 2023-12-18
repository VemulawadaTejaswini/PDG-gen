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
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a == 0)
	{
	    System.out.println(0);
	}
	else if(b == 0)
	{
	    System.out.println(n);
	}
	else{
	    int sum = a+b;
	    System.out.println((int)Math.floor(n/sum * a) + n%sum);
	}
	}
}
