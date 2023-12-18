import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A {
	public static void main(String[] args) throws IOException {
		FastScanner in= new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = in.nextInt();
		int [] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		int [] dp = new int[n];
		dp[0] = 0;
		if(n ==1) {
			System.out.println(0);
			return;
		}
		dp[1] = Math.abs(a[1]-a[0]);
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.min(dp[i-1] + Math.abs(a[i] - a[i-1]), dp[i-2] + Math.abs(a[i] - a[i-2]));
		}
		System.out.println(dp[n-1]);
	}
	
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StringTokenizer("");
		}

		public String next() throws IOException {
			if (!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
				return next();
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}
/*
6 4
0 3 4 6 10 12

7 4
0 3 4 6 10 14 16

*/