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
		assert solve(4, new int[] { 1, 4 }) == 7;
		assert solve(4, new int[] { 0, 4 }) == 8;

		assert solve(4, new int[] { 0, 3 }) == 7;
		assert solve(4, new int[] { 0, 5 }) == 8;
		assert solve(1, new int[] { 0 }) == 1;
		assert solve(1000000000, new int[] { 0, 1000, 1000000, 1000000000 }) == 2000000000;
		assert solve(10, new int[] { 0, 3, 5, 7, 100, 110, 200, 300, 311 }) == 67;
		int n = cin.nextInt();
		int t = cin.nextInt();
		int[] u = new int[n];
		for (int i = 0; i < n; i++)
			u[i] = cin.nextInt();
		int ans = solve(t, u);
		cout.println(ans);
	}

	private static int solve(int t, int[] u) {
		int ans = 0;
		int endExcl = 0;
		for (int start : u) {
			if (start < endExcl)
				ans = ans - endExcl + start;
			ans += t;
			endExcl = start + t;
		}
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
