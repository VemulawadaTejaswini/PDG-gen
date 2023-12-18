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
		int n=s.nextInt();
		int a[]=new int[6];
		a[0]=100;
		a[1]=101;
		a[2]=102;
		a[3]=103;
		a[4]=104;
		a[5]=105;
		int b[]=new int[n+1];
		b[0]=1;
		for(int j=1;j<=n;j++)
		{one:for(int i=0;i<6;i++)
		{if(j>=a[i])
		    {b[j]=b[j-a[i]];
		    if(b[j]==1)
		    {break one;}
		}}}
		if(b[n]==0)
		System.out.println("0");
		else
		System.out.println("1");}
}