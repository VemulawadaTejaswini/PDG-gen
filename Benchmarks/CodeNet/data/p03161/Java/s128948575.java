/* package codechef; // don't place package name! */

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*; 
import java.lang.*; 
import java.io.*;
import java.math.BigInteger; 
import java.math.*;

 public class Main{
     
	public static void main(String[] args) {
		
		InputStream inputStream = System.in;

		InputReader sc = new InputReader(inputStream);

				
		// int t=sc.nextInt();
		 long c=1000000007;
	
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0;i<n;i++){
	      a[i]=sc.nextInt();
	    }
	    int dp[]= new int[n];
	    dp[0]=0;
	     dp[1]=Math.abs(a[1]-a[0]);
	    for(int i=2;i<n;i++){
	      dp[i]=Integer.MAX_VALUE;
	      for(int j=1;j<=k;j++){
	        if(j<=i){
	      dp[i]=Math.min(dp[i],Math.abs(a[i]-a[i-j])+dp[i-j]);}
	    }
	    }
	    System.out.println(dp[n-1]);
	}
	

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
				    tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
				    throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public float nextFloat() {
			return Float.parseFloat(next());
		}
		
		
	}
}