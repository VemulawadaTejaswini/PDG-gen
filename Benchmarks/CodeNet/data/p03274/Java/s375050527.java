import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 107 C "Candles"
 *   https://abc107.contest.atcoder.jp/tasks/arc101_a/
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		Task task = new Task();
		task.run(in, out);

		in.close();
		out.close();
	}

	static class Task {

		public void run(InputScanner in, PrintWriter out) {

			int N = in.nextInt();
			int K = in.nextInt();
			int[] x = in.nextIntArray(N);

			int zeroPoint = Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				if (x[i] > 0) {
					zeroPoint = i;
					break;
				}
			}

			long ans = Long.MAX_VALUE;
			if (zeroPoint == Integer.MIN_VALUE) {
				ans = -x[N - K];
			} else if (zeroPoint == 0 || x[0] == 0) {
				ans = x[K - 1];
			} else {
				for (int i = 0; i + K < N; i++) {
					if (x[i] * x[i + K - 1] > 0) {
						ans = Math.min(ans, Math.min(Math.abs(x[i]), Math.abs(x[i + K - 1])));
					} else {
						if (-x[i] > x[i + K - 1]) {
							ans = Math.min(ans, -x[i] + 2 * x[i + K - 1]);
						} else {
							ans = Math.min(ans, -2 * x[i] + x[i + K - 1]);
						}
					}
				}
			}

			out.println(ans);
		}
	}

	/*
	 * extends java.util.Scanner
	 */
	static class InputScanner {

		Scanner scanner;

		public InputScanner(InputStream inputStream) {
			this.scanner = new Scanner(inputStream);
		}

		public boolean hasNext() {
			return scanner.hasNext();
		}

		public int nextInt() {
			return Integer.parseInt(scanner.next());
		}

		public long nextLong() {
			return Long.parseLong(scanner.next());
		}

		public double nextDouble() {
			return Double.parseDouble(scanner.next());
		}
		public String next() {
			return scanner.next();
		}

		public int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextInt();
			}
			return ret;
		}

		public int[][] nextIntArray(int h, int w) {
			int[][] ret = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextInt();
				}
			}
			return ret;
		}

		public long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextLong();
			}
			return ret;
		}

		public long[][] nextlongArray(int h, int w) {
			long[][] ret = new long[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public double[] nextDoubleArray(int n) {
			double[] ret = new double[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextDouble();
			}
			return ret;
		}

		public double[][] nextDoubleArray(int h, int w) {
			double[][] ret = new double[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public String[] nextStringArray(int n) {
			String[] ret = new String[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.next();
			}
			return ret;
		}

		public String[] nextStringArray(String split) {
			String[] ret = scanner.next().split(split);
			return ret;
		}

		public String[][] nextStringArray(int h, int w) {
			String[][] ret = new String[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.next();
				}
			}
			return ret;
		}

		public String[][] nextStringArray(int h, String split) {
			String[][] ret = new String[h][];
			for (int i = 0; i < h; i++) {
				ret[i] = scanner.next().split(split);
			}
			return ret;
		}

		public void close() {
			scanner.close();
		}

	}

}
