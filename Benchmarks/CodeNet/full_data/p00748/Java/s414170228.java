import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	int[] tetra;
	int ans;
	int[] dp;

	int dp(int sum, boolean flg) {
		if (sum < 0) {
			return 200;
		}
		if (sum == 0) {
			return 0;
		}
		if (0 <= dp[sum]) {
			return dp[sum];
		}
		int res = 200;
		for (int i = 1; i < 200; i++) {
			if (flg && tetra[i] % 2 == 0) continue;
			res = Math.min(res, dp(sum - tetra[i], flg) + 1);
		}
		return dp[sum] = res;
	}

	void run() {
		MyScanner sc = new MyScanner();

		tetra = new int[200];
		dp = new int[200];
		for (int i = 0; i < 200; i++) {
			tetra[i] = i*(i+1)*(i+2)/6;
		}

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			Arrays.fill(dp, -1);
			System.out.print(dp(n, false) + " ");
			Arrays.fill(dp, -1);
			System.out.println(dp(n, true));
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