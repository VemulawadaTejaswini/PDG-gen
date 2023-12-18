import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static class aksh implements Comparable<aksh>
	{
		int p;
		int q;
 
		public aksh(int p,int q)
		{
			this.p=p;
			this.q=q;
		}
 
		public int compareTo(aksh o)
		{
			if(p!=o.p)
			return p-o.p;
			else
			return q-o.q;
		}
	}
 
	static class a1
	{
		int x;
		int y;
 
		public a1(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    aksh[] a=new aksh[n];
 
		for(int i=0;i<n;i++)
		{
			a[i]=new aksh(sc.nextInt(),sc.nextInt());
		}
 
		Arrays.sort(a);
		HashMap<String,Integer> s=new HashMap<String,Integer>();
 
		for(int i=0;i<n-1;i++)
		{
			int x=(a[i+1].p-a[i].p);
			int y=(a[i+1].q-a[i].q);
			String input=String.valueOf(x)+"-"+String.valueOf(y);
			if(s.containsKey(input))
			s.put(input,s.get(input)+1);
			else
			s.put(input,1);
		}
		int max=Integer.MIN_VALUE;
		for (Integer val : s.values())
		{
			//System.out.println(val);
			if (max<val) 
			max= val;
		}
 
		System.out.println(n-max);
 
	}
}
