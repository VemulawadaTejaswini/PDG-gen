import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 103 C "Modulo Summation"
 *   https://abc103.contest.atcoder.jp/tasks/abc103_c/
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt();
		long[] a = in.nextLongArray(N);

		long lcm = a[0];
		for (int i = 1; i < a.length; i++) {
			lcm = lcm(lcm, a[i]);
		}

		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += (lcm - 1) % a[i];
		}

		out.println(ans);

		in.close();
		out.close();
	}

	static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}

	static long gcd(long a, long b) {

		long x = a;
		long y = b;

		if (x < y) {
			x = x ^ y;
			y = x ^ y;
			x = x ^ y;
		}

		long r = x % y;
		while (r != 0) {
		    x = y;
		    y = r;
		    r = x % y;
		}

		return y;
	}

	/*
	 * extends java.util.Scanner
	 */
	static class InputScanner {

		Scanner scanner;

		public InputScanner(InputStream inputStream) {
			this.scanner = new Scanner(inputStream);
		}

		public int nextInt() {
			return scanner.nextInt();
		}

		public long nextLong() {
			return scanner.nextLong();
		}

		public double nextDouble() {
			return scanner.nextDouble();
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
