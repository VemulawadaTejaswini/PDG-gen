
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	//author: Nagabhushan S Baddi
	private static class Edge {
		private int u, v;
		private long p, q;

		public Edge(int a, int b, int c, int d) {
			u = a;
			v = b;
			p = c;
			q = d;
		}

		public int other(int x) {
			return (x == u ? v : u);
		}

//		public int compareTo(Edge edge) {
//			return Long.compare(w, edge.w);
//		}
	}
	
	private static class Node implements Comparable<Node> {
		private int u;
		private long coin;
		private long dist;
		private int flag;

		public Node(int a, long b, long c, int d) {
			u = a;
			coin = b;
			dist = c;
			flag = d;
		}

		public int compareTo(Node node) {
			return Long.compare(dist, node.dist);
		}
	}

	private static int n, m;
	private static long[] a;
	private static long d;
	private static String s;
	private static HashMap<Integer, ArrayList<Edge>> g;

	public static void main(String[] args) {
		n = ini();
		m = ini();
		int S = ini();
		g = inweightedgraph(n, m);

		int coins = Math.min(S, 5000);
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0, coins, 0, 0));
		
		int[][] get = new int[n][2];
		
		for(int i=0; i<n; i++) {
			get[i][0] = ini();
			get[i][1] = ini();
		}
		
		long[] ans = new long[n];
		Arrays.fill(ans, (long)1e15);
		
		
		boolean[][][] mark = new boolean[n][5001][2];
		
		int count = 0;
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			
			int u = node.u;
			int flag = node.flag;
			long cLeft = node.coin;

			count++;
//			if (count%1000==0)
//				println(count+" "+u);	
			
			if (mark[u][(int)cLeft][flag]) continue;
			mark[u][(int)cLeft][flag] = true;
			ans[u] = Math.min(ans[u], node.dist);
			
			if (flag==1) {
				for(Edge edge: g.get(u)) {
					int v = edge.other(u);
					
					if (cLeft-edge.p>=0) {
						pq.add(new Node(v, cLeft-edge.p, node.dist+edge.q, 0));
					}
					
				}
			} else {
				for(int k=0; cLeft+k*get[u][0]<100; k++) {
					pq.add(new Node(u, cLeft+k*get[u][0], node.dist+k*get[u][1], 1));
				}
			}
			
			
		}
		
		for(int i=1; i<n; i++) {
			println(ans[i]);
		}
		println();
		
		out.flush();
		out.close();

	}

	//CONSTANTS
	private static final int MOD = (int) 1e9 + 7;

	//NONPROBLEM CODE

	private static InputReader in = new InputReader(System.in);
	private static PrintWriter out = new PrintWriter(System.out);

	private static class InputReader {

		private final InputStream stream;
		private final byte[] buf = new byte[8192];
		private int curChar, snumChars;

		public InputReader(InputStream st) {
			this.stream = st;
		}

		public int read() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public String readString() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

	}

	//SORT SHORTCUTS

	private static void sort(int[] a) {
		int n = a.length;
		Integer[] b = new Integer[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}

		Arrays.sort(b);

		for (int i = 0; i < n; i++) {
			a[i] = b[i];
		}
	}

	private static void sort(long[] a) {
		int n = a.length;
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}

		Arrays.sort(b);

		for (int i = 0; i < n; i++) {
			a[i] = b[i];
		}
	}

	//INPUT SHORTCUTS

	private static int[] ina(int n) {
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = in.nextInt();
		}
		return temp;
	}

	private static int ini() {
		return in.nextInt();
	}

	private static long inl() {
		return in.nextLong();
	}

	private static String ins() {
		return in.readString();
	}

	//PRINT SHORTCUTS

	private static void println(Object... o) {
		for (Object x : o) {
			out.write(x + "");
		}
		out.write("\n");
	}

	private static void pd(Object... o) {
		for (Object x : o) {
			out.write(x + "");
		}
		out.flush();
		out.write("\n");
	}

	private static void print(Object... o) {
		for (Object x : o) {
			out.write(x + "");
		}
	}

	//GRAPH SHORTCUTS

	private static HashMap<Integer, ArrayList<Integer>> intree(int n) {

		HashMap<Integer, ArrayList<Integer>> g = new HashMap<>();
		for (int i = 0; i < n; i++) {
			g.put(i, new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			int u = ini() - 1;
			int v = ini() - 1;
			g.get(u).add(v);
			g.get(v).add(u);
		}

		return g;
	}

	private static HashMap<Integer, ArrayList<Integer>> ingraph(int n, int m) {
		HashMap<Integer, ArrayList<Integer>> g = new HashMap<>();

		for (int i = 0; i < n; i++) {
			g.put(i, new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int u = ini() - 1;
			int v = ini() - 1;
			g.get(u).add(v);
			g.get(v).add(u);
		}

		return g;

	}

	private static HashMap<Integer, ArrayList<Edge>> inweightedgraph(int n, int m) {
		HashMap<Integer, ArrayList<Edge>> g = new HashMap<>();

		for (int i = 0; i < n; i++) {
			g.put(i, new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int u = ini() - 1;
			int v = ini() - 1;
			int p = ini();
			int q = ini();
			Edge edge = new Edge(u, v, p, q);
			g.get(u).add(edge);
			g.get(v).add(edge);
		}

		return g;

	}

	

	private static class Pair {
		private int u, v;

		public Pair(int a, int b) {
			u = a;
			v = b;
		}

		public int hashCode() {
			return u + v + u * v;
		}

		public boolean equals(Object object) {
			Pair pair = (Pair) object;
			return u == pair.u && v == pair.v;
		}
	}

	

	//MATHS AND NUMBER THEORY SHORTCUTS

	private static int gcd(int a, int b) {
		//O(log(min(a,b)))
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

	private static long modExp(long a, long b) {
		if (b == 0)
			return 1;

		a %= MOD;

		long exp = modExp(a, b / 2);

		if (b % 2 == 0) {
			return (exp * exp) % MOD;
		} else {
			return (a * ((exp * exp) % MOD)) % MOD;
		}
	}
}
