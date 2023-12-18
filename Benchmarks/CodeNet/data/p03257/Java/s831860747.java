import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * AtCoder Grand Contest 027 D "Modulo Matrix"
 *   https://agc027.contest.atcoder.jp/tasks/agc027_d/
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
			long[][] a = new long[N][N];

			a[0][0] = 2;
			long tmpA = 2;
			for (int i = 1; i <= 2 * N - 2 ; i++) {
				tmpA++;
				if (i <= N - 1) {
					int tmpI = i;
					for (int j = 0; tmpI >= 0; j++) {
						a[tmpI][j] = tmpA;
						tmpI--;
					}
				} else {
					int tmpI = N - 1;
					int tmpJ = i - (N - 1);
					for (int j = tmpJ; j < N; j++) {
						a[tmpI][j] = tmpA;
						tmpI--;
					}
				}
			}

//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					a[i][j] = -1;
//				}
//			}
//
//			int m = 1;
//			int start = N / 2;
//			a[start][start] = 2;
//
//			for (int i = 0; i < N / 2; i++) {
//
//
//
//				if (i % 2 == 0) {
//					for (int j = 0; j < N; j++) {
//						if (j == 0) {
//							a[i][j] = a[i - 1][j] + 1;
//						} else {
//							a[i][j] = lcm(a[i - 1][j], a[i][j - 1]) + 1;
//						}
//					}
//				} else {
//					for (int j = N - 1; j >= 0; j--) {
//						if (j == N - 1) {
//							a[i][j] = a[i - 1][j] + 1;
//						} else {
//						}
//					}
//				}
//			}
//
//
//

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					out.print(a[i][j]);
					if (j != N - 1) {
						out.print(" ");
					} else {
						out.println();
					}
				}
			}

		}
	}

	private static void spand(long[][] a, int x, int y) {

		int len = a[0].length;

		if (x - 1 >= 0) {
			a[x - 1][y] = a[x][y] + 1;
		}

	}

	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
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
