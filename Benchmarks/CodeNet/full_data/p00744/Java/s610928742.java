
import java.io.*;
import java.util.*;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;
	

	/* ----------Bipartile Matching--------- */
	/* g : The graph which has elements of (n + m).*/
	class BipartileMatching {
		int V;
		boolean[] used;
		int[] match;
		ArrayList<Integer>[] g;
		
		BipartileMatching(ArrayList<Integer>[] g) {
			V = g.length;
			used = new boolean[V];
			match = new int[V];
			this.g = g;
		}
		
		boolean dfs(int u) {
			used[u] = true;
			for (int v : g[u]) {
				int w = match[v];
				if (w < 0 || (!used[w] && dfs(w))) {
					match[v] = u;
					match[u] = v;
					return true;
				}
			}
			return false;
		}
		
		int doit() {
			int res = 0;
			Arrays.fill(match, -1);
			for (int v = 0; v < V; v++) {
				if (match[v] < 0) {
					Arrays.fill(used, false);
					if (dfs(v)) res++;
				}
			}
			return res;
		}
	}	
	/* ----------------------------- */
	
	long gcd(long x, long y) {
		if (x == 0 || y == 0) return x + y;
		return gcd(y, x % y);
	}
	
	public void solve() {
		while (true) {
			int n = in.nextInt(), m = in.nextInt();
			if (n == 0) break;
			
			ArrayList<Integer>[] g = new ArrayList[n+m];
			for (int i = 0; i < n + m; i++) {
				g[i] = new ArrayList<Integer>();
			}
			
			int[] a = in.nextIntArray(n);
			int[] b = in.nextIntArray(m);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (gcd(a[i], b[j]) != 1) {
						g[i].add(j+n);
						g[j+n].add(i);
					}
				}
			}
			
			BipartileMatching bm = new BipartileMatching(g);
			System.out.println(bm.doit());
		}		
	}	

	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
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