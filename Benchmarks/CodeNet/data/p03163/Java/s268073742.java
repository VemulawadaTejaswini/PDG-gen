import java.util.*;
import java.io.*;
import java.text.*;

public class Main {

	static int[] w, v;
	static long dp[][];

	public static long dp(int i, int remw) {

		if (remw < 0)
			return -(int) 1e9;
		if (i == w.length)
			return 0;
		if (dp[i][remw] != -1)
			return dp[i][remw];
		return dp[i][remw] = Math.max(dp(i + 1, remw), v[i] + dp(i + 1, remw - w[i]));
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int maxw = sc.nextInt();
		w = new int[n];
		v = new int[n];
		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		dp = new long[n][maxw + 1];
		for (long[] x : dp) {
			Arrays.fill(x, -1);
		}
		pw.println(dp(0, maxw));
		pw.close();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(FileReader r) {
			br = new BufferedReader(r);
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

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}
}
