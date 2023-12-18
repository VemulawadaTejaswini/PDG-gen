
import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
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

	static long INF = Long.MAX_VALUE/3;
	static long MK = (long)pow(10, 15);

	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		public void solve(int testNumber, InputReader in, PrintWriter out) {

			long k = in.nextLong();

			long count = 0;
			for (long n = 1; n <= MK; n++) {

				long m = n+1;
				long a1 = n+2;
				long a2 = n+3;
				long a3 = n+4;
				long a4 = n+5;
				long a5 = n+6;
				long a6 = n+7;
				long a7 = n+8;
				long a8 = n+9;
				long a9 = n+10;
				long a99 = n+99;
				long a999 = n+999;
				long a9999 = n+9999;
				long a99999 = n+99999;



				if (n*S(m) <= m*S(n)
						&& n*S(a1) <= a1*S(n)
						&& n*S(a2) <= a2*S(n)
						&& n*S(a3) <= a3*S(n)
						&& n*S(a4) <= a4*S(n)
						&& n*S(a5) <= a5*S(n)
						&& n*S(a6) <= a6*S(n)
						&& n*S(a7) <= a7*S(n)
						&& n*S(a8) <= a8*S(n)
						&& n*S(a9) <= a9*S(n)

						&& n*S(a99) <= a99*S(n)
						&& n*S(a999) <= a999*S(n)
						&& n*S(a9999) <= a9999*S(n)
						&& n*S(a99999) <= a99999*S(n)

						) {
					if (++count <= k) {
						out.println(n);
					} else {
						break;
					}
				}
			}

		}

		long S(long num) {
			long ret = 0;
			while (num > 0) {
				ret += num % 10;
				num /= 10;
			}
			return ret;
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
