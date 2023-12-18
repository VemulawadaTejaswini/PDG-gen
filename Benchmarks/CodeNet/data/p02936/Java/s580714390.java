					//			package Dynamic;
import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    static public void main(String[] args)throws IOException{
    	st=new StringTokenizer(br.readLine());
    	int n=i();
    	int q=i();
    	ArrayList<Integer> al[]=new ArrayList[n+1];
    	ArrayList<Integer> ar[]=new ArrayList[n+1];
    	boolean bo[]=new boolean[n+1];
    	for(int x=1;x<=n;x++)
    	{
    		al[x]=new ArrayList<>();
    		ar[x]=new ArrayList<>();
    	}
    	int qq=n-1;
    	while(qq-->0)
    	{
    		int a=i();
    		int b=i();
    		al[a].add(b);
    		al[b].add(a);
    	}
    	LinkedList<Integer> l=new LinkedList<>();
    	l.add(1);
    	while(l.size()>0)
    	{
    		int e=l.remove();
    		bo[e]=true;
	    		for(int val:al[e])
	    		{
	    			if(!bo[val])
	    				{
	    					ar[e].add(val);
	    					bo[val]=true;
	    					l.add(val);
	    				}
	    		}
	    		//pl(l+"");
    	}
    	//pl(Arrays.toString(ar));
    	int tot[]=new int[n+1];
    	while(q-->0)
    	{
    		int a=i();
    		int b=i();
    		tot[a]+=b;
    	}
    	LinkedList<Integer> li=new LinkedList<>();
    	li.add(1);
    	while(li.size()>0)
    	{
    		int e=li.remove();
    		for(int vv:ar[e])
    		{
    			tot[vv]+=tot[e];
    			li.add(vv);
    		}
    		//pl(li+"");
    	}
    	//pl(Arrays.toString(al));
    	//pl(Arrays.toString(ar));
    	for(int y=1;y<=n;y++)
    		p(tot[y]+" ");
    	pl();
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