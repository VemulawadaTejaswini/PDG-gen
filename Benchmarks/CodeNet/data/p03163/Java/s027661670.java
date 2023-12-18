
import java.util.*;
import java.io.*;
public class Main {
	static int[] w, v;
	static int n, s;
	static int[][] dp;
	static StringBuilder sb;
	public static int dp(int idx, int remw) {
		if (remw < 0) {
			return -(int) 1e9;
		}
		if (idx == n) {
			return 0;
		}
		if (dp[idx][remw] != -1) {
			return dp[idx][remw];
		}
		int take = v[idx] + dp(idx + 1, remw - w[idx]);
		int leave = dp(idx + 1, remw);
		return dp[idx][remw] = Math.max(take, leave);
	}
	public static void trace(int idx, int remw) {
		if (idx == n)
			return;
		if (dp(idx, remw) == dp(idx + 1, remw)) {
			trace(idx + 1, remw);
		} else {
			sb.append(idx + " ");
			trace(idx + 1, remw - w[idx]);
		}
	}
	public static void traceIte(int idx, int remw) {
		while (idx != n) {
			if (dp(idx, remw) == dp(idx + 1, remw)) {
				idx++;
			} else {
				sb.append(idx + " ");
				idx++;
				remw -= w[idx];
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		s = sc.nextInt();
		v = sc.nextIntArr(n);
		w = sc.nextIntArr(n);
		dp = new int[n + 1][s + 1];
		for (int[] x : dp)
			Arrays.fill(x, -1);
//		for (int i = n - 1; i >= 0; i-=1000) {
//			for (int j = 0; j < s + 1; j+=1000)
//				dp(i, j);
//		}
		pw.println(dp(0, s));
		sb = new StringBuilder();
		traceIte(0, s);
		//pw.println(sb);
//		for (int idx = n - 1; idx >= 0; idx--) {
//			for (int remw = 0; remw < s + 1; remw++) {
//				int leave = dp[idx + 1][remw];
//				int take = (remw - w[idx]) < 0 ? -(int) 1e9 : (v[idx] + dp[idx + 1][remw - w[idx]]);
//				dp[idx][remw] = Math.max(leave, take);
//			}
//		}
//		for (int idx = n - 1; idx >= 0; idx--) {
//			for (int remw = 0; remw < s + 1; remw++) {
//				int leave = dp[1][remw];
//				int take = (remw - w[idx]) < 0 ? -(int) 1e9 : (v[idx] + dp[1][remw - w[idx]]);
//				dp[0][remw] = Math.max(leave, take);
//			}
//			dp[1] = dp[0];
//			dp[0] = new int[s + 1];
//		}
		// optional trick
//		int[] arr = new int[s + 1];
//		for (int idx = n - 1; idx >= 0; idx--) {
//			for (int remw = s; remw >= 0; remw--) {
//				arr[remw] = Math.max(arr[remw], (remw - w[idx]) < 0 ? -(int) 1e9 : (v[idx] + arr[remw - w[idx]]));
//			}
//		}
//		pw.println(dp[0][s]);
		pw.close();
	}
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}
	}
}