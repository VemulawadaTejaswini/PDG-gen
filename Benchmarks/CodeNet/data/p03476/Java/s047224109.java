

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 26;
	static int MOD = 998244353;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {
		int n = 100010;
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			boolean[] isPrimes = new boolean[n];
			getPrimes(isPrimes, n);

			int[] sum = new int[n];
			for (int i = 0; i < n; i++) {
				sum[i] = calc(i, isPrimes);
			}
			for (int i = 0; i < n-1; i++) {
				sum[i+1] += sum[i];
			}

			int q = in.nextInt();
			int[] l = new int[q], r = new int[q];
			for (int i = 0; i < q; i++) {
				l[i] = in.nextInt();
				r[i] = in.nextInt();
			}

			for (int i = 0; i < q; i++) {
				out.println(sum[r[i]] - sum[l[i]-1]);
			}

		}

		int calc (int n ,boolean[] isPrimes) {

			if (n % 2 == 1 && isPrimes[n] && isPrimes[(n+1)/2]) {
				return 1;
			} else {
				return 0;
			}
		}

		public static void getPrimes(boolean[] isPrime, int n) {
			Arrays.fill(isPrime, true);
			isPrime[0] = isPrime[1] = false;
			for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
				if (!isPrime[i])
					continue;
				for (int j = i + i; j < isPrime.length; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}




	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}
}