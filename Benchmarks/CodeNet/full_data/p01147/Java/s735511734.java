
import java.io.*;
import java.util.*;

import org.omg.PortableServer.POAManagerPackage.State;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	int INF = 100000000;
		
	public void run() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			String[] str = in.nextStringArray(n);
			
			int[][] same = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) continue;
					
					int start = Math.max(0, str[i].length() - str[j].length());
					for (int from = start; from < str[i].length(); from++) {
						boolean ok = true;
						for (int idx1 = from, idx2 = 0; idx1 < str[i].length(); idx1++, idx2++) {
							if (str[i].charAt(idx1) != str[j].charAt(idx2)) ok = false;
						}
						if (ok) {
							same[i][j] = str[i].length() - from;
							break;
						}
					}
				}
			}
			
			int[][] dp = new int[1<<n][n];
			String[][] s = new String[1<<n][n];
			
			for (int i = 0; i < 1<<n; i++) {
				Arrays.fill(dp[i], INF);
			}
			for (int i = 0; i < n; i++) {
				dp[1<<i][i] = str[i].length();
				s[1<<i][i] = str[i].toString();
			}
			for (int i = 1; i < 1<<n; i++) {
				for (int j = 0; j < n; j++) {
					if (s[i][j] == null) continue;
					
					for (int k = 0; k < n; k++) {
						if (((1 << k) & i) != 0) continue;
						
						int ni = i | (1 << k);
						int nextVal = dp[i][j] + str[k].length() - same[j][k];
						if (dp[ni][k] > nextVal) {
							dp[ni][k] = nextVal;
							s[ni][k] = s[i][j] + str[k].substring(same[j][k]);
						}
					}
				}
			}
			
			int min = INF;
			String res = "";
			for (int i = 0; i < n; i++) {
				if (min > dp[(1 << n) - 1][i]) {
					min = dp[(1 << n) - 1][i];
					res = s[(1 << n) - 1][i];
				}
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

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
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

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
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

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
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