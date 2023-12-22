import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	double EPS = 1E-10;

	boolean check(int[][] a, int[][] b) {
		int n = a.length;
		if (n != b.length) return false;

		for (int i = 0; i < n - 1; i++) {
			int len1 = length(a[i], a[i + 1]);
			int len2 = length(b[i], b[i + 1]);
			if (len1 != len2) return false;
		}

		for (int i = 0; i < n - 2; i++) {
			int[] vecA1 = new int[]{a[i][0] - a[i + 1][0], a[i][1] - a[i + 1][1]};
			int[] vecA2 = new int[]{a[i + 2][0] - a[i + 1][0], a[i + 2][1] - a[i + 1][1]};
			int[] vecB1 = new int[]{b[i][0] - b[i + 1][0], b[i][1] - b[i + 1][1]};
			int[] vecB2 = new int[]{b[i + 2][0] - b[i + 1][0], b[i + 2][1] - b[i + 1][1]};
			//			int dot1 = dot(vecA1, vecA2);
			//			int dot2 = dot(vecB1, vecB2);
			//			if (dot1 != dot2) return false;
			int cross1 = cross(vecA1, vecA2);
			int cross2 = cross(vecB1, vecB2);
			if(cross1 != cross2) return false;
		}

		return true;
	}

	int dot(int[] a, int[] b){
		return a[0]*b[0]+a[1]*b[1];
	}

	int cross(int[] a, int[] b){
		return a[0]*b[1]-a[1]*b[0];
	}

	int length(int[] a1, int[] a2) {
		int dx = a2[0] - a1[0];
		int dy = a2[1] - a1[1];
		return dx*dx + dy*dy;
	}

	int[][] reverse(int[][] a) {
		int n = a.length;
		for (int i = 0; i < n / 2; i++) {
			int[] tmp = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = tmp;
		}
		return a;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int m = sc.nextInt();
			int[][] ori = new int[m][2];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < 2; j++) {
					ori[i][j] = sc.nextInt();
				}
			}
			int[][][] l = new int[n][][];
			for (int i = 0; i < n; i++) {
				m = sc.nextInt();
				l[i] = new int[m][2];
				for (int j = 0; j < m; j++) {
					for (int k = 0; k < 2; k++) {
						l[i][j][k] = sc.nextInt();
					}
				}
			}

			for (int i = 0; i < n; i++) {
				if (check(ori, l[i])) {
					System.out.println((i + 1));
				} else if (check(ori, reverse(l[i]))) {
					System.out.println((i + 1));
				}
			}
			System.out.println("+++++");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}

}