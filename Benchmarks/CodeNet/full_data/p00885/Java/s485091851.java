
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int INF = 100000000;
	public void run() {
		int[][][] time = new int[41][101][4];
		int[][][] dist = new int[41][101][4];
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			
			for (int i = 0; i <= n; i++) 
				for (int j = 0; j <= 100; j++) {
					Arrays.fill(time[i][j], INF);
					Arrays.fill(dist[i][j], INF);
				}
			
			time[0][0][0] = 0;
			dist[0][0][0] = 0;
			
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				b[i] = in.nextInt();
			}
			
			int ng = -1;
			int res = INF;
			for (int i = 0; i < n; i++) {
				int p = a[i], t = b[i];
				boolean ok = false;
				for (int k = 3; k >= 0; k--) {
					for (int j = 0; j <= 100; j++) {
						if (time[i][j][k] == INF) continue;
						
						int tt = time[i][j][k] + j * (k + 1);
						int dd = dist[i][j][k] + j;
						if (dist[i][0][0] > dd && tt + p <= t) {
							time[i][0][0] = tt;
							dist[i][0][0] = dd;
//							System.out.println("b : " + dist[i][j][k] + " " + time[i][j][k] + " " + " -> " + dist[i][0][0] + " " + time[i][0][0]);
						}
						
						tt = time[i][j][k] + Math.abs(j - p) * (k + 1);
						dd = dist[i][j][k] + Math.abs(j - p);
						if (k != 3 && dist[i+1][p][k+1] > dd && tt <= t) {
							time[i+1][p][k+1] = t;
							dist[i+1][p][k+1] = dist[i][j][k] + Math.abs(j - p);
//							System.out.println(i + " " + j + " " + k + " " + dist[i][j][k] + " " + time[i][j][k] + " " + " -> " + (i+1) + " " + p + " " + (k+1) + " " + " " + dist[i+1][p][k+1] + " " + tt);
							ok = true;	
							if (i == n - 1)
								res = Math.min(res, dist[i+1][p][k+1] + p);
						}
					}
				}
				if (!ok) {
					ng = i + 1;
					break;
				}
			}
		
			System.out.println(ng == -1 ? "OK " + res : "NG " + ng);
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