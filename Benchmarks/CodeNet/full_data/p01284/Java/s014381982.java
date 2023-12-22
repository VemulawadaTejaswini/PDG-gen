
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int MAX = 1001;
	int INF = 1000000000;
	public void run() {
		while (true) {
			int T = in.nextInt();
			if (T == 0) break;
			
			int[] t = in.nextIntArray(T);
			int N = in.nextInt();
			int[] D = new int[N];
			int[] M = new int[N];
			for (int i = 0; i < N; i++) {
				D[i] = in.nextInt();
				M[i] = in.nextInt();
			}
			
			int[][] dp = new int[MAX+1][T];
			for (int i = 0; i <= MAX; i++) Arrays.fill(dp[i], INF);
			dp[0][0] = 0;
			
			int cur = 0;
			for (int i = 0; i <= MAX && cur < N; i++) {
				for (int j = 0; j < T; j++) {
					int next = (j + 1) % T;
					if (i == D[cur] && t[j] <= M[cur]) {
						dp[i+1][next] = Math.min(dp[i+1][next], dp[i][j]);
					} else if (i != D[cur]) {
						dp[i+1][next] = Math.min(dp[i+1][next], dp[i][j]);
					}
					dp[i+1][1] = Math.min(dp[i][j] + 1, dp[i+1][1]);					
				}
				if (i == D[cur]) cur++;
			}
			
			cur--;
			int res = INF;
			for (int i = 0; i < T; i++) 
				res = Math.min(res, dp[D[cur]][i]);
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