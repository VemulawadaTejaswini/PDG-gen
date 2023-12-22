
// Submitted By SUbhash Yadav

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc=new FastScanner();
		int t=sc.nextInt();
		int ans=0;
		if(t>=400&&t<600) ans=8;
		else if(t>=600&&t<800) ans=7;
		else if(t>=800&&t<1000) ans=6;
		else if(t>=1000&&t<1200) ans=5;
		else if(t>=1200&&t<1400) ans=4;
		else if(t>=1400&&t<1600) ans=3;
		else if(t>=1600&&t<1800) ans=2;
		else if(t>=1800&&t<2000) ans=1;
		
		System.out.println(ans);
		
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
