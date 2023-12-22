
import java.io.*;
import java.util.*;

public class Main {
	InputStream is;

	boolean __FILE_DEBUG_FLAG__ = false;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;

	class Edge implements Comparable<Edge> {
		int f;
		int t;
		int c;

		Edge(int f, int t, int c) {
			this.f = f;
			this.t = t;
			this.c = c;
		}

		public int compareTo(Edge s) {
			return c - s.c;
		}

		public String toString() {
			return getClass().getName() + " : " + f + " " + t + " " + c;
		}
	}

	class UnionFindTree {
		int[] parent;
		int size = 1;
		
		public UnionFindTree(int n) {
			parent = new int[n];
			for (int i = 0; i < parent.length; i++) {
				parent[i] = i;
			}
		}
		
		public int find(int x) {
			if (parent[x] == x) return x;
			return parent[x] = find(parent[x]);
		}
		
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		public void unite(int x, int y) {
			int xx = find(x), yy = find(y);
			if (xx == yy) return;
			parent[xx] = yy;
			size++;
		}
		
		public int getSize() {
			return size;
		}
	}

	boolean can(Edge[] es, int n, int mid) {
		UnionFindTree uft = new UnionFindTree(n);
		int m = es.length;
		int cur = 0;
		for ( ; cur < m; cur++) {
			if (es[cur].c > mid) break;
			uft.unite(es[cur].f, es[cur].t);
		}
		
		if (uft.getSize() <= (n + 1) / 2) return false;
		
		for ( ; cur < m; cur++) {
			uft.unite(es[cur].f, es[cur].t);
		}
		
		return uft.getSize() == n;
	}
	
	public void solve() {
		while (true) {
			int n = in.nextInt(), m = in.nextInt();
			if (n == 0) break;
			Edge[] es = new Edge[m];
			for (int i = 0; i < m; i++) {
				es[i] = new Edge(in.nextInt() - 1, in.nextInt() - 1, in.nextInt());
			}
			Arrays.sort(es);
			
			int lo = 0, hi = 1000000000;
			while (hi - lo > 1) {
				int mid = (lo + hi) / 2;
				if (!can(es, n, mid)) 
					lo = mid;
				else
					hi = mid;
			}
			System.out.println(lo + 1);
		}		
	}	

	public void run() {
		if (__FILE_DEBUG_FLAG__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
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