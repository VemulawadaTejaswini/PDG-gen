/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		PrintWriter out=new PrintWriter(System.out);
		FastScanner fs=new FastScanner();
		int x=fs.nextInt();
		int n=fs.nextInt();
		int a[]=fs.readArray(n);
		HashSet<Integer> s=new HashSet();
		for(int i:a)
		s.add(i);
		
		int res=0,ans=Integer.MAX_VALUE;
		for(int i=1;i<=101;i++)
		{
		    if(!s.contains(i)&&Math.abs(x-i)<ans){
		        ans=Math.abs(x-i);
		        res=i;
		    }
		}
		out.println(res);
		out.close();
	
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
}
}
