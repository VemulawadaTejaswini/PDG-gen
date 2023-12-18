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

 public class Main {
    
	public static void main(String[] args) {
		
		InputStream inputStream = System.in;

		InputReader sc = new InputReader(inputStream);

				
		// int t=sc.nextInt();
		 long c=1000000007;
	
	    int n=sc.nextInt();
	    int dp[][]= new int[n][3];
	    int a[][]= new int[n][3];
	   
	 for(int i=0;i<n;i++){
	     a[i][0]=sc.nextInt();
	      a[i][1]=sc.nextInt();
	       a[i][2]=sc.nextInt();
	 }
	  dp[0][0]=a[0][0];
	       dp[0][1]=a[0][1];
	       dp[0][2]=a[0][2];
	  for(int i=1;i<n;i++){
	     dp[i][0]=Math.max(dp[i-1][1],dp[i-1][2])+a[i][0];
	      dp[i][1]=Math.max(dp[i-1][0],dp[i-1][2])+a[i][1];
	       dp[i][2]=Math.max(dp[i-1][1],dp[i-1][0])+a[i][2];
	 }
	 int ans=Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]);
System.out.println(ans);
	    
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