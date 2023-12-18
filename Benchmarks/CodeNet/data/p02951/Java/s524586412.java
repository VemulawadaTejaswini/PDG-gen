								//package Dynamic;
import java.awt.Paint;

import java.io.*;
import java.math.*;
import java.util.*;
public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static long c=0l; 
    static public void main(String[] args)throws IOException
    {
    	st=new StringTokenizer(br.readLine());
    	int a=i();
    	int b=i();
    	int c=i();
    	int q=a-b;
    	int tt=c-q;
    	if(tt>=0)
    		pl(c-q);
    	else
    		pl("0");
    }
    static int i()throws IOException
    {
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	return Integer.parseInt(st.nextToken());
    }
    static long l()throws IOException
    {
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	return Long.parseLong(st.nextToken());
    }
    static String s()throws IOException
    {
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	return st.nextToken();
    }
    static double d()throws IOException
    {
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	return Double.parseDouble(st.nextToken());
    }
    static void p(String p)
    {
    	System.out.print(p);
    }
    static void pl(String pl)
    {
    	System.out.println(pl);
    }
    static void pl(double pl)
    {
    	System.out.println(pl);
    }
    static void pl(int pl)
    {
    	System.out.println(pl);
    }
    static void pl(char pl)
    {
    	System.out.println(pl);
    }
    static void pl(long pl)
    {
    	System.out.println(pl);
    }
    static void pl()
    {
    	System.out.println();
    }
    static int[] ari(int n)throws IOException
    {
    	int ar[]=new int[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=i();
    	return ar;
    }
    static long[] arl(int n)throws IOException
    {
    	long ar[]=new long[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=l();
    	return ar;
    }
    static String[] ars(int n)throws IOException
    {
    	String ar[]=new String[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=s();
    	return ar;
    }
    static double[] ard(int n)throws IOException
    {
    	double ar[]=new double[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=d();
    	return ar;
    }
    static char[] arc(int n)throws IOException
    {
    	char ar[]=new char[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=st.nextToken().charAt(0);
    	return ar;
    }
    static void pari(int ar[])
    {
    	for(int a:ar)
    		System.out.print(a+" ");
    }
    static void parl(long ar[])
    {
    	for(long a:ar)
    		System.out.print(a+" ");
    }
    static void pars(String ar[])
    {
    	for(String a:ar)
    		System.out.print(a+" ");
    }
    static void pard(double ar[])
    {
    	for(double a:ar)
    		System.out.print(a+" ");
    }
    static void parc(char ar[])
    {
    	for(char a:ar)
    		System.out.print(a+" ");
    }
}