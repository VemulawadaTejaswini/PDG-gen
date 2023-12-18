							//	package Dynamic;
import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    static public void main(String[] args)throws IOException{
    	st=new StringTokenizer(br.readLine());
    	int n=i();
    	int k=i();
    	int ar[]=ari(n);
    	long mod=1000000007l;
    	long c=0l;
    	
    	for(int x=0;x<n;x++)
    	{
    		long cc=0l;
    		for(int y=x+1;y<n;y++)
    		{
    			if(ar[x]>ar[y])
    			{
    				cc++;
    			}
    		}
    		long cc2=0l;
    		for(int y=0;y<x;y++)
    		{
    			if(ar[x]>ar[y])
    			{
    				cc2++;
    			}
    		}
    		//long kk=1*k-1;
    		long kk=1l*k*(k-1);
    		kk/=2l;
    		kk%=mod;
    		kk=kk*(cc+cc2);
    		kk%=mod;
    		kk+=cc*k;
    		kk%=mod;
    		c+=kk;
    		c%=mod;
    	}
    	pl(c);
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
    static void p(int p)
    {
    	System.out.print(p);
    }
    static void p(double p)
    {
    	System.out.print(p);
    }
    static void p(long p)
    {
    	System.out.print(p);
    }
    static void p(char p)
    {
    	System.out.print(p);
    }
    static void p(boolean p)
    {
    	System.out.print(p);
    }
    static void pl(String pl)
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
    static void pl(double pl)
    {
    	System.out.println(pl);
    }
    static void pl(long pl)
    {
    	System.out.println(pl);
    }
    static void pl(boolean pl)
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
    	System.out.println();
    }
    static void parl(long ar[])
    {
    	for(long a:ar)
    		System.out.print(a+" ");
    	System.out.println();
    }
    static void pars(String ar[])
    {
    	for(String a:ar)
    		System.out.print(a+" ");
    	System.out.println();
    }
    static void pard(double ar[])
    {
    	for(double a:ar)
    		System.out.print(a+" ");
    	System.out.println();
    }
    static void parc(char ar[])
    {
    	for(char a:ar)
    		System.out.print(a+" ");
    	System.out.println();
    }
}