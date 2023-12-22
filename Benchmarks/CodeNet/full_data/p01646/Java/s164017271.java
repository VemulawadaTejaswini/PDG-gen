
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	int YET = -1;
	int CON = 1;
	int NOT_CON = 2;
	int MAX_STR_LEN = 10;
	int[][] g = new int[26][26];

	public void run() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			String[] str = in.nextStringArray(n);
			
			boolean[] ok = new boolean[n];
			for (int i = 0; i < 26; i++) {
				Arrays.fill(g[i], YET);
				g[i][i] = CON;
			}
			
			boolean res = true;
			main : 
			for (int j = 0; j < MAX_STR_LEN; j++) {
				for (int i = 0; i < n - 1; i++) {
					if (ok[i]) continue;
					if (str[i].length() == j) {
						if (str[i+1].length() >= j) {
							ok[i] = true;
							continue;
						} else {
							res = false;
							break main;
						}
					}
					if (str[i+1].length() == j) {
						res = false;
						break main;
					}
					
					int c1 = str[i].charAt(j) - 'a', c2 = str[i+1].charAt(j) - 'a';
					if (g[c1][c2] == YET) {
						for (int u = 0; u < 26; u++) if (c1 != u && c2 != u) {
							if (g[c2][u] == CON && g[u][c1] == CON) {
								res = false;
								break;
							}
						}
//						System.out.println("con : " + str[i].charAt(j) + " " + str[i+1].charAt(j));
						g[c1][c2] = CON;
						g[c2][c1] = NOT_CON;
						for (int u = 0; u < 26; u++) if (c1 != u && c2 != u) {
							if (g[u][c1] == CON) {
//								System.out.println("con1 : " + (char)(u + 'a') + " " + (char)(c2 + 'a'));
								g[u][c2] = CON;
								g[c2][u] = NOT_CON;
							}
							if (g[c2][u] == CON) {
//								System.out.println("con2 : " + (char)(c1 + 'a') + " " + (char)(u + 'a'));
								g[c1][u] = CON;			
								g[u][c1] = NOT_CON;
							}
						}
					} else if (g[c1][c2] == NOT_CON) {
						res = false;
						break main;
					}
					
					if (c1 != c2) ok[i] = true;
				}
			}
			System.out.println(res ? "yes" : "no");
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