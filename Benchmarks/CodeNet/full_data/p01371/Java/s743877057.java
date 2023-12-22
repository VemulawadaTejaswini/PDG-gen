import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	int n, mask;
	int[] time;
	int[][] item;
	int[] dp;

	int dp(int bit) {
		if (bit == mask) {
			return 0;
		}
		if (0 <= dp[bit]) {
			return dp[bit];
		}
		int[] opt = new int[n];
		for (int i = 0; i < n; i++) {
			opt[i] = time[i];
		}
		for (int i = 0; i < n; i++) {
			if ((bit & (1 << i)) == 0) continue;
			for (int j = 0; j < n; j++) {
				opt[j] = Math.min(opt[j], item[i][j]);
			}
		}

		int res = 1 << 20;
		for (int i = 0; i < n; i++) {
			if (0 < (bit & (1 << i))) continue;
			res = Math.min(res, dp(bit | (1 << i)) + opt[i]);
		}

		return dp[bit] = res;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			time = new int[n];
			item = new int[n][n];
			dp = new int[1 << n];
			Arrays.fill(dp, -1);
			mask = (1 << n) - 1;
			for (int i = 0; i < n; i++) {
				time[i] = sc.nextInt();
				for (int j = 0; j < n; j++) {
					item[j][i] = sc.nextInt();
				}
			}

			System.out.println(dp(0));
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