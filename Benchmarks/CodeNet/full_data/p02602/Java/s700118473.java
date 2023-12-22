
// Submitted By SUbhash Yadav

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;


public class Main
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc=new FastScanner();
		int n=sc.nextInt(), k=sc.nextInt(); 
		int a[]=sc.readArray(n);
		
		BigInteger bigInteger=new BigInteger("1");
		for(int i=0;i<k;i++) bigInteger=bigInteger.multiply(BigInteger.valueOf(Integer.valueOf(a[i])));
		
		for(int i=k;i<n;i++) {
			//System.out.println(bigInteger);
			BigInteger prevBigInteger=bigInteger;
			bigInteger=bigInteger.divide(BigInteger.valueOf(Integer.valueOf(a[i-k])));
			bigInteger=bigInteger.multiply(BigInteger.valueOf(Integer.valueOf(a[i])));
			if(bigInteger.compareTo(prevBigInteger)>0)
				System.out.println("Yes");
			else {
				System.out.println("No");
			}
			
			
			
		}
		
		
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
