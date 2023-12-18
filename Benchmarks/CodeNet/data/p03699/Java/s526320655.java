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
		int n = cin.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < n; i++)
			s[i] = cin.nextInt();

		// n = 1..100
		// s[i] = 1..100
		int[] sum = new int[100 * 100 + 1];
		int len = sum.length;
		sum[0] = 1;
		for (int j = 0; j < n; j++) {
			for (int i = len - 1; i >= 0; i--) {
				if (sum[i] != 1)
					continue;
				sum[i + s[j]] = 1;
			}
		}
		int ans = 0;
		for (int i = len - 1; i >= 0; i--)
			if (sum[i] == 1 && i % 10 != 0) {
				ans = i;
				break;
			}
		cout.println(ans);
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
