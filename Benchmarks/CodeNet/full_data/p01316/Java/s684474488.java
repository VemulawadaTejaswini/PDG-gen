
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	long[][] dp = new long[20001][256];

	public void run() {
		while (true) {
			int N = in.nextInt(), M = in.nextInt();
			if (N == 0 && M == 0) break;
			int[] C = new int[M], x = new int[N];
			
			for (int i = 0; i < M; i++)
				C[i] = in.nextInt();
			for (int i = 0; i < N; i++)
				x[i] = in.nextInt();
			
			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], Long.MAX_VALUE);
			}
			
			
			dp[0][128] = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= 255; j++) {
					for (int k = 0; k < M; k++) {
						int idx = j + C[k];
						idx = Math.max(idx, 0);
						idx = Math.min(idx, 255);
						dp[i+1][idx] = (long) Math.min(dp[i+1][idx], dp[i][j] + Math.pow(idx - x[i], 2));
					}
				}
			}
			
			long res = Long.MAX_VALUE;
			for (int i = 0; i <= 255; i++) {
				res = Math.min(res, dp[N][i]);
			}
			System.out.println(res);
			
		}
		out.close();
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

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
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

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
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