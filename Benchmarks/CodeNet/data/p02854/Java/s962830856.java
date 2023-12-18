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
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{a[i]=s.nextInt();
		sum+=a[i];}
		int count=0;
	//	if(sum%2!=0)
		int i=0;
		int k=0;
		while(i<n && k<sum/2)
		{k+=a[i];
		i++;}
		int p=0;
		i=n-1;
		while(i>=0 && p<sum/2)
		{p+=a[i];
		i--;}
		if(sum%2==0 && k==sum/2)
		System.out.println("0");
		else
		{int l=Math.abs(2*k-sum);
		int g=Math.abs(2*p-sum);
		System.out.println(Math.min(l,g));}
	}}