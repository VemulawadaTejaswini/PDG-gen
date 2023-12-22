
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;
	
	class Edge implements Comparable<Edge> {
		int from;
		int to;
		int d;
		int c;

		Edge(int from, int to, int d, int c) {
			this.from = from;
			this.to = to;
			this.d = d;
			this.c = c;
		}

		public int compareTo(Edge s) {
			return s.c - c;
		}

		public String toString() {
			return getClass().getName() + " : " + from + " " + to + " " + d + " " + c;
		}
	}
	
	int INF = 1_000_000_000;
	int[] minCost;
	ArrayList<Edge>[] g;
	
	int[][] dijkstra() {
		int n = g.length;
		minCost = new int[n];
		int[] count = new int[n];
		Arrays.fill(minCost, INF);
		minCost[0] = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
			public int compare(Integer x1, Integer x2) {
				return minCost[x1] - minCost[x2];
			}
		});
		
		boolean[] vis = new boolean[n];
		pq.add(0);
		while (!pq.isEmpty()) {
			int u = pq.poll();
			if (vis[u]) continue;
			vis[u] = true;
			for (Edge e : g[u]) {
				if (minCost[u] + e.d < minCost[e.to]) {
					minCost[e.to] = minCost[u] + e.d;
					pq.add(e.to);
					count[e.to] = 1;
				} else if (minCost[u] + e.d == minCost[e.to]) {
					count[e.to]++;
				}
			}
		}
		
		return new int[][]{ minCost, count};
	}
	
	@SuppressWarnings("unchecked")
	public void solve() {
		while (true) {
			int n = in.nextInt(), m = in.nextInt();
			if (n == 0) break;
			
			g = new ArrayList[n];
			for (int i = 0; i < n; i++)
				g[i] = new ArrayList<Edge>();
			
			int totalCost = 0;
			Edge[] es = new Edge[m];
			for (int i = 0; i < m; i++) {
				es[i] = new Edge(in.nextInt() - 1, in.nextInt() - 1, in.nextInt(), in.nextInt());
				g[es[i].from].add(es[i]);
				Edge rev = new Edge(es[i].to, es[i].from, es[i].d, es[i].c);
				g[es[i].to].add(rev);
			}
			Arrays.sort(es);
			int[][] dijk = dijkstra();
			int[] minCost = dijk[0];
			int[] count = dijk[1];
//			System.out.println(Arrays.toString(minCost));
//			System.out.println(Arrays.toString(count));
			for (int i = 0; i < m; i++) {
				Edge e = es[i];
//				System.out.println(es[i].toString());
				if (minCost[es[i].to] + es[i].d == minCost[es[i].from]) {
					if (count[es[i].from] > 1) {
						count[es[i].from]--;
					} else {
						totalCost += es[i].c;
					}
				} else if (minCost[es[i].from] + es[i].d == minCost[es[i].to]) {
					if (count[es[i].to] > 1) {
						count[es[i].to]--;
					} else {
						totalCost += es[i].c;
					}
				}
			}
			System.out.println(totalCost);
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
				map[i] = nextIntArray(m);
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
				map[i] = nextLongArray(m);
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
				map[i] = nextDoubleArray(m);
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