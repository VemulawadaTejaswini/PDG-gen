

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static long sum(int a[],int l,int r) {
		long ans=0;
		for(int i=l;i<=r;i++) ans+=a[i];
		return ans;
		
	}
	
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
	int n=sc.nextInt();
	int a[]=sc.readArray(n);
	
	// dp[i][j] minimum cost to mergge the array from i to j
	long dp[][]=new long[n][n];
	
	for(int i=n-1;i>=0;i--) {
		
		for(int j=i;j<n;j++) {
			if(i==j) dp[i][j]=0;
			else {
				dp[i][j]=Long.MAX_VALUE;
				long s=sum(a,i,j);
			
				for(int k=i;k<=j-1;k++)
				{
					
					dp[i][j]=Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+s);
				}
				
				
			}
		
		}
	
	}
	System.out.println(dp[0][n-1]);
	
	
	}
	static class FastScanner{
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
		long nextLong() {
			return Long.parseLong(next());
		}
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}

}
