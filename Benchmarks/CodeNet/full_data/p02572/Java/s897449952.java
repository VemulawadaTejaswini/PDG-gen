// Working program with FastReader 
import java.io.*; 

import java.util.*; 
 

public class Main 
{ 
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int mod=1000000009;
		FastReader sc=new FastReader(); 
		int n=sc.nextInt();
		long[] a=new long[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextLong();
		
		long pSum[]=new long[n];
			pSum[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		pSum[i]=(a[i]+pSum[i+1])%mod;
	
		
		long sum=0;long prod=1;
		
		for(int i=0;i<n-1;i++)
		{
		    prod=(a[i]*pSum[i+1])%mod;
		    sum=(sum+prod)%mod;
		    prod=1;
		}
	
		System.out.println(sum%mod);
	} 
} 
