
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

import org.omg.PortableServer.POAManagerPackage.State;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int INF = 100000000;
	
	public void run() {
		while (true) {
			int N = in.nextInt(), M = in.nextInt();
			if (N == 0 && M == 0) break;
			
			int[][][] edge = new int[2][N][N];

			for (int i = 0; i < 2; i++) for (int j = 0; j < N; j++)
				Arrays.fill(edge[i][j], INF);
			
			for (int i = 0; i < N; i++) {
				edge[0][i][i] = edge[1][i][i] = 0;
			}
			
			for (int i = 0; i < M; i++) {
				int x = in.nextInt() - 1, y = in.nextInt() - 1, t = in.nextInt();
				int sl = in.next().matches("L") ? 0 : 1;
				edge[sl][x][y] = edge[sl][y][x] = Math.min(edge[sl][x][y], t);
			}
			
			int R = in.nextInt();
			int[] z = new int[R];
			for (int i = 0; i < R; i++)
				z[i] = in.nextInt() - 1;
			
			
			for (int k = 0; k < N; k++) for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) {
				edge[0][i][j] = Math.min(edge[0][i][j], edge[0][i][k] + edge[0][k][j]);
				edge[1][i][j] = Math.min(edge[1][i][j], edge[1][i][k] + edge[1][k][j]);
			}
			
			int[][] dp = new int[R][N];
			for (int i = 0; i < R; i++) Arrays.fill(dp[i], INF);
			
			dp[0][z[0]] = 0;
			for (int i = 1; i < R; i++) for (int j = 0; j < N; j++) {
				dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + edge[0][z[i-1]][z[i]]);
				for (int k = 0; k < N; k++)
					dp[i][j] = Math.min(dp[i][j], dp[i-1][k] + edge[0][z[i-1]][k] + edge[1][k][j] + edge[0][j][z[i]]);
			}
			
			int res = INF;
			for (int i = 0; i < N; i++) 
				res = Math.min(res, dp[R-1][i]);
			
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