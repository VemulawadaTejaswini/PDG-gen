import java.io.*;
import java.util.*;

class Vertex{
	int id;
	long dist;
	public Vertex(int id, long dist) {
		super();
		this.id = id;
		this.dist = dist;
	}
}

class Edge{
	int to;
	int cost;
	public Edge(int to, int cost) {
		super();
		this.to = to;
		this.cost = cost;
	}
}

class Town{
	int id;
	long maxCoin;
	public Town(int id, long maxCoin) {
		super();
		this.id = id;
		this.maxCoin = maxCoin;
	}
}

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	static final long mod = (long) 1e9 + 7;
	static final int dx[] = { -1, 0, 1, 0 }, dy[] = { 0, -1, 0, 1 };
	static final int[] dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int inf = Integer.MAX_VALUE / 3;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final double eps = 1e-10;
	static final double pi = Math.PI;
	static StringBuilder sb = new StringBuilder();

	static void dijkstra(int v, long dist[], List<Edge> graph[]) {
		fill(dist, linf);
		dist[v] = 0;
		PriorityQueue<Vertex> q = new PriorityQueue<>((v1, v2)->v1.dist - v2.dist>0?1:-1);
		q.add(new Vertex(v, 0));
		while(!q.isEmpty()) {
			Vertex now = q.poll();
			if(dist[now.id]<now.dist)continue;
			for(Edge e:graph[now.id]) {
				if(dist[e.to]>dist[now.id] + e.cost) {
					dist[e.to] = dist[now.id] + e.cost;
					q.add(new Vertex(e.to, dist[e.to]));
				}
			}
		}
	}
		
	static void solve() {
		int n = ni(), m = ni(), s = ni()-1, t = ni()-1;
		long coin = (long)1e15;
		List<Edge> graphA[] = new ArrayList[n];
		List<Edge> graphB[] = new ArrayList[n];
		for(int i=0;i<n;i++) {
			graphA[i] = new ArrayList<>();
			graphB[i] = new ArrayList<>();
		}
		for(int i=0;i<m;i++) {
			int u = ni()-1, v = ni()-1, a = ni(), b = ni();
			graphA[u].add(new Edge(v, a));
			graphA[v].add(new Edge(u, a));
			graphB[u].add(new Edge(v, b));
			graphB[v].add(new Edge(u, b));
		}
		long distA[] = new long[n];
		long rdistB[] = new long[n];
		
		dijkstra(s, distA, graphA);
		dijkstra(t, rdistB, graphB);
		
		long max[] = new long[n];//街iで両替した場合の最大スヌーク金額
		
		for(int i=0;i<n;i++) {
			long cost = distA[i] + rdistB[i];
			max[i] = coin - cost;
		}
		
		PriorityQueue<Town> q = new PriorityQueue<>((t1,t2)->t2.maxCoin - t1.maxCoin>0?1:-1);  
		for(int i=0;i<n;i++) {
			q.add(new Town(i, max[i]));
		}
		
		for(int i=0;i<n;i++) {
			while(q.peek().id<i) {
				q.poll();
			}
			out.println(q.peek().maxCoin);
		}
		
	}

	//libraries		
	static void sbnl() {//StringBuilderに改行文字をappendする
		sb.append("\n");
	}

	static int lowerBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {//昇順の配列
				//if (a[c] > x) {//降順の配列
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int upperBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int lowerBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int upperBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int lowerBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int upperBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static <T> int lowerBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) >= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) >= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) >= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int upperBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) > 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) > 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) > 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int rupperBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) < 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) < 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) < 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int rlowerBound(List<T> ls, T x) {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) <= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) <= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) <= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static int[] concat(int x, int arr[]) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}

	static int[] concat(int arr[], int x) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}

	static long[] concat(long x, long arr[]) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}

	static long[] concat(long arr[], long x) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}

	static int max(int x, int y) {
		return Math.max(x, y);
	}

	static int min(int x, int y) {
		return Math.min(x, y);
	}

	static int max(int x, int y, int z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}

	static int min(int x, int y, int z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}

	static long max(long x, long y) {
		return Math.max(x, y);
	}

	static long min(long x, long y) {
		return Math.min(x, y);
	}

	static long max(long x, long y, long z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}

	static long min(long x, long y, long z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}

	static double max(double x, double y) {
		return Math.max(x, y);
	}

	static double min(double x, double y) {
		return Math.min(x, y);
	}

	static double max(double x, double y, double z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}

	static double min(double x, double y, double z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}

	static void sort(int[] ar) {
		Arrays.sort(ar);
	}

	static void sort(long[] ar) {
		Arrays.sort(ar);
	}

	static void sort(double[] ar) {
		Arrays.sort(ar);
	}

	static void rsort(int[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}

	static void rsort(long[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}

	static void rsort(double[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}

	static void fill(int arr[], int x) {
		Arrays.fill(arr, x);
	}

	static void fill(long arr[], long x) {
		Arrays.fill(arr, x);
	}

	static void fill(double arr[], double x) {
		Arrays.fill(arr, x);
	}

	static void fill(int arr[][], int x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}

	static void fill(long arr[][], long x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}

	static void fill(double arr[][], double x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}

	//MOD culc
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}

	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	//input
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;

	private static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	@SuppressWarnings("unused")
	private static double nd() {
		return Double.parseDouble(ns());
	}

	@SuppressWarnings("unused")
	private static char nc() {
		return (char) skip();
	}

	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	@SuppressWarnings("unused")
	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	@SuppressWarnings("unused")
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	@SuppressWarnings("unused")
	private static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

}
