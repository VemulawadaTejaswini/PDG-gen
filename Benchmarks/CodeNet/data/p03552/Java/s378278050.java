
import java.util.Arrays;

public class Main {
	static int n;
	static long z;
	static long w;
	static long[] a;
	private static void solve() {
		n = ni();
		z = nl();
		w = nl();
		a = nal(n);


		for (long[][] v : memo) for (long[] u : v) Arrays.fill(u, -1);

		long ret = dfs(0, 0, 0);
		System.out.println(ret);
	}
	
	static long[][][] memo = new long[2001][2001][2];
	private static long dfs(int now, int pre, int turn) {
		if (memo[now][pre][turn] >= 0) {
			return memo[now][pre][turn];
		}

		if (now == n) {
			if (pre == 0) {
				return Math.abs(a[n - 1] - w);
			} else {
				return Math.abs(a[now - 1] - a[pre - 1]);
			}
		}
		long ret;

		if (turn == 0) {
			ret = Long.MIN_VALUE;
			for (int i = now + 1; i <= n; i ++) {
				ret = Math.max(ret, dfs(i, now, 1));
			}
		} else {
			ret = Long.MAX_VALUE;
			for (int i = now + 1; i <= n; i ++) {
				ret = Math.min(ret, dfs(i, now, 0));
			}
		}
		memo[now][pre][turn] = ret;
		return ret;
	}

	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				String debug = args.length > 0 ? args[0] : null;
				if (debug != null) {
					try {
						is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}
				reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
				solve();
				out.flush();
				tr((System.currentTimeMillis() - start) + "ms");
			}
		}, "", 64000000).start();
	}

	private static java.io.InputStream is = System.in;
	private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
	private static java.util.StringTokenizer tokenizer = null;
	private static java.io.BufferedReader reader;

	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new java.util.StringTokenizer(reader.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	private static double nd() {
		return Double.parseDouble(next());
	}

	private static long nl() {
		return Long.parseLong(next());
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private static char[] ns() {
		return next().toCharArray();
	}

	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}

	private static int[][] ntable(int n, int m) {
		int[][] table = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				table[i][j] = ni();
			}
		}
		return table;
	}

	private static int[][] nlist(int n, int m) {
		int[][] table = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				table[j][i] = ni();
			}
		}
		return table;
	}

	private static int ni() {
		return Integer.parseInt(next());
	}

	private static void tr(Object... o) {
		if (is != System.in)
			System.out.println(java.util.Arrays.deepToString(o));
	}
}
