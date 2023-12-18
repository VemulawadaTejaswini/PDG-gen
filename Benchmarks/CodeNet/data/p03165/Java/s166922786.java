import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		Sto[][] dp = new Sto[s.length + 1][t.length + 1];
		for (Sto[] x : dp) {
			for (int i = 0; i < x.length; i++) {
				x[i] = new Sto();
			}
		}
		for (int i = s.length - 1; i >= 0; i--) {
			for (int j = t.length - 1; j >= 0; j--) {
				if (s[i] == t[j]) {
					dp[i][j].len = 1 + dp[i + 1][j + 1].len;
					dp[i][j].s = s[i] + dp[i + 1][j + 1].s;

				} else {
					if (dp[i + 1][j].len >= dp[i][j + 1].len) {
						dp[i][j].len = dp[i + 1][j].len;
						dp[i][j].s = dp[i + 1][j].s;
					} else {
						dp[i][j].s = dp[i][j + 1].s;
						dp[i][j].len = dp[i][j + 1].len;
					}
				}
			}
		}

		out.println(dp[0][0].s);
		out.close();
	}

	static class Sto {
		int len;
		String s;

		public Sto() {
			this.s = "";
			this.len = 0;
		}
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
