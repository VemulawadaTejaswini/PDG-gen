import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lucasr
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		CSumOfProductOfPairs solver = new CSumOfProductOfPairs();
		solver.solve(1, in, out);
		out.close();
	}

	static class CSumOfProductOfPairs {
		static final long MOD = 1000000007;

		public void solve(int testNumber, MyScanner sc, PrintWriter out) {
			int N = sc.nextInt();
			long[] vals = sc.nextLongArray(N);
			long sum = 0, sq = 0;
			for (int i = 0; i < N; i++) {
				sum += vals[i];
				sum %= MOD;
				sq += vals[i] * vals[i];
				sq %= MOD;
			}
			long ans = ((sum * sum) - sq) % MOD;
			ans *= 500000004L;
			ans %= MOD;
			out.println(ans);
		}

	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;

		public MyScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = nextLong();
			}
			return ret;
		}

	}
}

