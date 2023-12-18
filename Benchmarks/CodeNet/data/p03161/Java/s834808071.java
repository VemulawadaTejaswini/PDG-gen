

import java.util.*;



import java.io.*;
public class Main {

	public static void main(String[] args) {
	FastScanner sc=new FastScanner();
	int n=sc.nextInt(),k=sc.nextInt();
	int a[]=sc.readArray(n);
	if(n<=1)
		System.out.println("0");
	else {
		int dp[]=new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
		
		for(int i=1;i<n;i++) {
			for(int j=i-1;j>=0&&j>=i-k;j--) {
				dp[i]=Math.min(dp[i], dp[j]+Math.abs(a[i]-a[j]));
			}
		}
		System.out.println(dp[n-1]);
		
	}

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

