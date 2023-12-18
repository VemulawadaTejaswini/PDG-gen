import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] A = sc.nextIntArray(N);
		int[] B = sc.nextIntArray(N);
		for (int i = 0; i < N; i++) if (A[i] != B[i]) {
			return;
		}
		long ans = small(N, C, A);
		out.println(ans);
	}
	
	int[] x;
	long[][] dp;
	long dp(int N, int C) {
		if (N == 0) {
			if (C == 0) return 1; else return 0;
		}
		if (dp[N][C] >= 0) return dp[N][C];
		long res = 0;
		for (int k = 0; k <= C; k++) {
			res += dp(N-1, C-k) * POW[x[N-1]][k];
			res %= MOD;
		}
		dp[N][C] = res;
		return res;
	}
	long small(int N, int C, int[] x) {
		this.x = x.clone();
		dp = new long[N+1][C+1];
		for (int i = 0; i < dp.length; i++) Arrays.fill(dp[i], -1);
		long res = dp(N, C);
		return res;
	}
	
	static final long MOD = (long)(1e9 + 7);
	static final long[][] POW = new long[410][410];
	static {
		int M = POW[0].length;
		for (int x = 0; x < POW.length; x++) {
			POW[x][0] = 1;
			for (int a = 1; a < M; a++) POW[x][a] = (POW[x][a-1] * x) % MOD;
		}
	}
	static void tr(Object... os) { System.err.println(deepToString(os)); }
	static void tr(long[][] as) { for (long[] a : as) tr(a); }

	void print(int[] a) {
		out.print(a[0]);
		for (int i = 1; i < a.length; i++) out.print(" " + a[i]);
		out.println();
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
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
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}