

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
	//author: Nagabhushan S Baddi
	
	private static class Trie {
		private class Node {
			HashMap<Integer, Node> child;
			int end;
			
			public Node() {
				child = new HashMap<>();
				end = 0;
			}
		}
		
		private Node root;
		
		public Trie() {
			root = new Node();
		}
		
		public void add(TreeMap<Integer, Integer> map) {
			Node node = root;
			for(Entry<Integer, Integer> e: map.entrySet()) {
				for(int j=0; j<e.getValue(); j++) {
//					System.out.println("HE");
					if (node.child.containsKey(e.getKey())) {
						node = node.child.get(e.getKey());
					} else {
						node.child.put(e.getKey(), new Node());
						node = node.child.get(e.getKey());
					}
				}
			}
//			System.out.println(node==root);
			node.end++;
		}
		
		private int solve() {
			return solve(root, -1);
		}
		
		private int solve(Node node, int xx) {
			if (node==null) return 0;
			if (node.end==1) {
//				println(xx);
				return 1;
			} else if (node.end!=0) return 0;
			
//			System.out.println("L");
			
			int count = 0;
			
			for(Entry<Integer, Node> e: node.child.entrySet()) {
				count += solve(e.getValue(), e.getKey());
			}
			
			return count;
		}
	}

	private static int n;
	private static int[] a;
	private static int d;
	private static String s;
	private static HashMap<Integer, ArrayList<Integer>> g;

	public static void main(String[] args) {
		n = ini();
		a = ina(n);
		
		HashMap<Integer, HashSet<int[]>> g = new HashMap<>(); //alpha,p
		
		for(int x: a) {
			g.put(x, new HashSet<>());
		}
		int MX = (int)1e6+5;
		boolean[] isPrime = new boolean[MX];

		Arrays.fill(isPrime, true);
		
		isPrime[0] = isPrime[1] = false;
		
		for(int i=2; i<MX; i++) {
			if (isPrime[i] && 2*1L*i<MX) {
				if (g.containsKey(i)) {
					g.get(i).add(new int[] {i, 1});
				}
				for(int j=2*i; j<MX; j+=i) {
					isPrime[j] = false;
					if (g.containsKey(j)) {
						int low = 1;
						int high = 22;
						int mid = 0;
						while(low<=high) {
							mid = low+(high-low)/2;
							
							if (Math.abs(Math.pow(i, mid)-j)<1e-7) {
								break;
							} else if (Math.pow(i, mid)>j) {
								high=mid-1;
							} else {
								low=mid+1;
							}
						}
						g.get(j).add(new int[] {i, mid});
					}
				}
			}
		}
		
		Trie tree = new Trie();
		
		for(int i=0; i<n; i++) {
			TreeMap<Integer, Integer> mp = new TreeMap<>();
			for(int[] u: g.get(a[i])) {
				mp.put(u[0], u[1]);
			}
			tree.add(mp);
		}
		
		println(tree.solve());
		
		
		
		
		
//		int[] count = new int[MX];
//		
//		for(int x: a) {
//			for(int v: g.get(x)) {
//				count[v]++;
//			}
//		}
		
//		int ans = 0;
//		out:
//		for(int i=0; i<n; i++) {
//			for(int v: g.get(a[i])) {
//				if (count[v]>1) {
//					continue out;
//				}
//			}
//			System.out.println(a[i]);
//			ans++;
//		}
//		
//		println(ans);
		
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
		Long[] b = new Long[n];
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
			int w = ini();
			Edge edge = new Edge(u, v, w);
			g.get(u).add(edge);
			g.get(v).add(edge);
		}

		return g;

	}

	private static class Edge implements Comparable<Edge> {
		private int u, v;
		private long w;

		public Edge(int a, int b, long c) {
			u = a;
			v = b;
			w = c;
		}

		public int other(int x) {
			return (x == u ? v : u);
		}

		public int compareTo(Edge edge) {
			return Long.compare(w, edge.w);
		}
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

	private static class Node implements Comparable<Node> {
		private int u;
		private long dist;

		public Node(int a, long b) {
			u = a;
			dist = b;
		}

		public int compareTo(Node node) {
			return Long.compare(dist, node.dist);
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
