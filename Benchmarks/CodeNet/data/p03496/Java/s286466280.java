import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 081 D "Non-decreasing"
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt();
		int[] a = in.nextIntArray(N);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < N; i++) {
			if (max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
			if (min > a[i]) {
				min = a[i];
				minIndex = i;
			}
		}

		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		if (max != min) {

			int index = 0;
			if (Math.abs(max) >= Math.abs(min)) {
				index = maxIndex;
			} else {
				index = minIndex;
			}

			for (int i = 1; i <= N; i++) {
				if (i != index + 1) {
					x.add(index + 1);
					y.add(i);
				}
			}

			for (int i = 1; i <= N - 1; i++) {
				x.add(i);
				y.add(i + 1);
			}
		}

		out.println(x.size());
		if (max != min) {
			for (int i = 0; i < x.size(); i++) {
				out.println(x.get(i) + " " + y.get(i));
			}
		}

		in.close();
		out.close();
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

		public String[] nextStringArray(int n, String split) {
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

		public String[][] nextStringArray(int h, int w, String split) {
			String[][] ret = new String[h][w];
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
