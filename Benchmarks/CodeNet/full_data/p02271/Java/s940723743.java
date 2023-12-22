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

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static class TaskX {

		static int n;
		static int[] an;
		static boolean[][] memo;
		static boolean[][] isDone;

		public void solve(int testNumber, InputReader in, PrintWriter out) {

			n = in.nextInt();
			an = in.nextIntArray(n);
			int q = in.nextInt();
			int[] qn = in.nextIntArray(q);

			memo = new boolean[n+1][40001];
			isDone = new boolean[n+1][40001];

			for (int i = 0; i < q; i++) {
			if (f(0, qn[i], 0)) {
				out.println("yes");
			} else {
				out.println("no");
			}
		}


		}
		boolean f(int i, int target, int sum) {
			if (target == sum) {
				return true;
			}
			if (i >= n) {
				return false;
			}
			return f(i+1, target, sum+an[i]) || f(i+1, target, sum);
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

