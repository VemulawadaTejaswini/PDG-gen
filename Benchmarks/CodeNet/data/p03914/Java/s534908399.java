import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	void solve() {
		final int mod = (int) 1e9 + 7;
		int n = in.nextInt();
		int m = in.nextInt();
		// num different, can go to 1
		int[][] dp = new int[n + 1][n + 1];
		dp[1][1] = 1;
		int[][] dp2 = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < dp2.length; j++) {
				Arrays.fill(dp2[j], 0);
			}
			for (int curDiff = 0; curDiff <= n; curDiff++) {
				for (int canGo = 0; canGo <= curDiff; canGo++) {
					long res = dp[curDiff][canGo];
					if (res == 0) {
						continue;
					}
					if (curDiff < n) {
						// new city
						dp2[curDiff + 1][canGo] = (int) ((dp2[curDiff + 1][canGo] + res
								* (n - curDiff)) % mod);
					}
					{
						dp2[curDiff][curDiff] = (int) ((dp2[curDiff][curDiff] + res
								* (canGo)) % mod);
					}
					{
						dp2[curDiff][canGo] = (int) ((dp2[curDiff][canGo] + res
								* (curDiff - canGo)) % mod);
					}
				}
			}
			int[][] tmp = dp;
			dp = dp2;
			dp2 = tmp;
		}
		out.println(dp[n][n]);
	}

	void run() {
		try {
			in = new FastScanner(new File("object.in"));
			out = new PrintWriter(new File("object.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
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
	}

	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
				new Main().runIO();
			}
		}, "1", 1 << 26).start();
	}
}