/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static long gcd(long a, long b) 
    { 
    if (a == 0) 
        return b;  
    return gcd(b % a, a);  
    } 
    static long lcm(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		long count=a[0];
		long ans=0;
		for(int i=1;i<n;i++)
		{count=lcm(count,a[i]);}
		for(int i=0;i<n;i++)
		{ans=(ans+(long)(count/a[i]))%1000000007;}
		System.out.println(ans);}}