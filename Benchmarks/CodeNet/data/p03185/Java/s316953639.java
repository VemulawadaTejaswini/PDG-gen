import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Reader in = new Reader();
		int n = in.nextInt();
		long c = in.nextLong();
		int[] h = in.na(n);
		long[] dp = new long[n];
		Arrays.fill(dp, Long.MAX_VALUE);
		dp[0] = 0;
		for(int i = 0; i <n; i++) {
			for(int j = i+1; j<n; j++) {
				dp[j] = Math.min(dp[j],dp[i]+p(h[i]-h[j])+c);
			}
		}
		System.out.println(dp[n-1]);
	}
	public static long p(long x) {
		return x*x;
	}
	static class Reader {
		static BufferedReader br;
		static StringTokenizer st;
		public Reader() {
			this.br = new BufferedReader(new InputStreamReader(System.in));
		}
		public int[] na(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
		public int nextInt() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return Integer.parseInt(st.nextToken());
		}
		public double nextDouble() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return Double.parseDouble(st.nextToken());
		}
		public Long nextLong() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return Long.parseLong(st.nextToken());
		}
		public String next() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return st.nextToken();
		}
		private static void readLine() {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
			}
		}
	}
}
