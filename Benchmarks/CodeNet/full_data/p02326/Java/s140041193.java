
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
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		int[][] sum;
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int h = in.nextInt();
			int w = in.nextInt();

			int[][] mat = new int[h+1][w+1];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					mat[i][j] = in.nextInt();
				}
			}

			sum = new int[h+1][w+1];
			for (int i = 0; i <= h; i++) {
				for (int j = 0; j <= w; j++) {
					sum[i][j] = mat[i][j];
					if (j - 1 >= 0) sum[i][j] += sum[i][j - 1];
					if (i - 1 >= 0) sum[i][j] += sum[i - 1][j];
					if (i - 1 >= 0 && j - 1 >= 0) sum[i][j] -= sum[i - 1][j - 1];
				}
			}

			int l = -1;
			int r = Math.min(h, w);

			long ans = 0;
			while (r-l > 1) {
				int k = (r+l)/2;
				boolean ok = false;
				for (int i = 0; i+k < h; i++) {
					for (int j = 0; j+k < w; j++) {
						if (get(i, j, i+k, j+k) == 0) {
							ans = Math.max(ans, (k+1)*(k+1));
							ok = true;
						}
					}
				}
				if (ok) {
					l = k;
				} else {
					r = k;
				}
			}

			out.println(ans);

		}

		int get(int x1, int y1, int x2, int y2) {

			int res = sum[x2][y2];
			if (x1 > 0) res -= sum[x1 - 1][y2];
			if (y1 > 0) res -= sum[x2][y1 - 1];
			if (x1 > 0 && y1 > 0) res += sum[x1 - 1][y1 - 1];

			return res;
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

