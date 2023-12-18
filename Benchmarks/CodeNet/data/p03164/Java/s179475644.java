import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	int mod = 1000000007;

	static public int diff(int[] a, int i, int j) {
		return Math.abs(a[i] - a[j]);
	}

	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
		int n = sc.nextInt();
		int amount = sc.nextInt();

		long[] w = new long[n];
		long[] v = new long[n];

		for (int i = 0; i < n; i++) {
			w[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}

		long[] dp = new long[amount + 1];

		for (int i = 1; i <= n; i++) {
			long _w = w[i - 1];
			long _v = v[i - 1];
			for (int j = amount; j >= 0; j--) {
				if (j - _w >= 0) {
					dp[j] = Math.max(dp[j], dp[j - (int)_w] + _v);
				}
			}
		}

		out.print(dp[amount]);
		/*
		 * int n = sc.nextInt(); // read input as integer long k = sc.nextLong(); //
		 * read input as long double d = sc.nextDouble(); // read input as double String
		 * str = sc.next(); // read input as String String s = sc.nextLine(); // read
		 * whole line as String
		 * 
		 * int result = 3*n; out.println(result); // print via PrintWriter
		 */

		// Stop writing your solution here. -------------------------------------
		out.close();
	}

	// -----------PrintWriter for faster output---------------------------------
	public static PrintWriter out;

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	// --------------------------------------------------------
}
