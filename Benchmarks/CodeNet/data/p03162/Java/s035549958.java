

import java.util.*;



import java.io.*;
public class Main {

	public static void main(String[] args) {
	FastScanner sc=new FastScanner();
	int n=sc.nextInt();
	int a[][]=new int[n][3];
	for(int i=0;i<n;i++) {
		a[i][0]=sc.nextInt();
		a[i][1]=sc.nextInt();
		a[i][2]=sc.nextInt();
	}
	int dp[][]=new int[n][3];
	dp[0][0]=a[0][0];
	dp[0][1]=a[0][1];
	dp[0][2]=a[0][2];
	for(int i=1;i<n;i++) {
		dp[i][0]=Math.max(dp[i-1][1], dp[i-1][2])+a[i][0];
		dp[i][1]=Math.max(dp[i-1][0], dp[i-1][2])+a[i][1];
		dp[i][2]=Math.max(dp[i-1][0], dp[i-1][1])+a[i][2];
	}
//	for(int i=0;i<n;i++)
//		System.out.println(dp[i][0]+" "+dp[i][1]+" "+dp[i][2]);
	int ans=Integer.MIN_VALUE;
	for(int i=0;i<3;i++)ans=Math.max(ans, dp[n-1][i]);
	System.out.println(ans);


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

