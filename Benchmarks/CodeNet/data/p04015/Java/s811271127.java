
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int N = in.nextInt();
			int A = in.nextInt();
			int[] xn = in.nextIntArray(N);

			List<P> s1 = new ArrayList<>();
			List<P> s2 = new ArrayList<>();

			int[] x1 = new int[N/2];
			int[] x2 = new int[N-(N/2)];
			for (int i = 0; i < N/2; i++) {
				x1[i] = xn[i];
			}

			for (int i = 0; i < N-(N/2); i++) {
				 x2[i] = xn[i+(N/2)];
			}

			int x1Len = x1.length;
			for (int i = 0; i < 1 << x1Len; i++) {
				int tmpNum = 0;
				int tmpCount = 0;
				for (int j = 0; j < x1Len; j++) {
					if ((i >> j & 1) == 1) {
						tmpNum += x1[j];
						tmpCount++;
					}
				}
				s1.add(new P(tmpNum, tmpCount));
			}

			int x2Len = x2.length;
			for (int i = 0; i < 1 << x2Len; i++) {
				int tmpNum = 0;
				int tmpCount = 0;
				for (int j = 0; j < x2Len; j++) {
					if ((i >> j & 1) == 1) {
						tmpNum += x2[j];
						tmpCount++;
					}
				}
				s2.add(new P(tmpNum, tmpCount));
			}

			long ans = 0;
			for (P p1 : s1) {
				for (P p2 : s2) {
					if ((p1.count + p2.count) != 0
						&&(p1.num + p2.num) % (p1.count + p2.count) == 0
						&& (p1.num + p2.num) / (p1.count + p2.count) == A) {
						ans++;
					}
				}
			}
			out.println(ans);


		}
	}
	static class P {
		int num, count;
		P (int num, int count) {
			this.num = num;
			this.count = count;
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
