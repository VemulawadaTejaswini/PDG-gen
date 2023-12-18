import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int max_w=sc.nextInt();
		int w[]=new int[n];
		int v[]=new int[n];
		for(int i=0;i<n;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		
		long dp[][]=new long[n][max_w+1];
		for(int k=w[0];k<max_w+1;k++) {
			dp[0][k]=v[0];
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<max_w+1;j++) {
				dp[i][j]=j>=w[i]?Math.max(dp[i-1][j-w[i]]+v[i],dp[i-1][j]):dp[i-1][j];
			}
		}
				
		System.out.println(dp[n-1][max_w]);
	}
	
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	

}



