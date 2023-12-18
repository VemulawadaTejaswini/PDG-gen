import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		assert solve(2, 2) == 8;
		assert solve(3, 2) == 12;
		assert solve(1, 8) == 0;
		assert solve(100000, 100000) == 530123477;

		int n = cin.nextInt();
		int m = cin.nextInt();

		long ans = solve(n, m);
		cout.println(ans);
	}

	private static long solve(int n, int m) {
		if (n + 1 != m && n != m + 1 && n != m)
			return 0;
		long mod = (int) 1e9 + 7;
		long dogs = 1;
		long monkeys = 1;
		for (int i = 1; i <= n; i++)
			dogs = (dogs * i) % mod;
		for (int i = 1; i <= m; i++)
			monkeys = (monkeys * i) % mod;
		long ans = (dogs * monkeys) % mod;
		if (n == m)
			ans = (2 * ans) % mod;
		return ans;
	}

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
