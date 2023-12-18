import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	
	final long MOD =  (long)(1e9+7);
	
	int[] w, v;
	void solve() {
		int N = sc.nextInt();
		int W = sc.nextInt();
		w = new int[N];
		v = new int[N];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		final long INF = 1L<<58;
		long[][] dp = new long[N+1][301];
		for (int i = 0; i < dp.length; i++) 
			Arrays.fill(dp[i], -INF);
		dp[0][0] = 0;
		for (int i = 0; i < N; i++) {
			for (int nn = N-1; nn >= 0; nn--) {
				for (int ww = 0; ww <= 300; ww++) {
					int ww2 = ww + (w[i] - w[0]);
					if (ww2 <= 300) 
						dp[nn+1][ww2] = max(dp[nn+1][ww2], dp[nn][ww] + v[i]);
				}
			}
		}
		
		long ans = 0;
		for (int n = 0; n <= N; n++) {
			long WW = W - (long)n * w[0];
			if (WW < 0) continue;
			if (WW > 300) WW = 300;
			for (int w = 0; w <= WW; w++)
				ans = max(ans, dp[n][w]);
		}
		out.println(ans);
	}
	
	static void tr(Object... os) { System.err.println(deepToString(os)); }
	static void tr(int[][] as) { for (int[] a : as) tr(a); }

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