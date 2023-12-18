

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static long sx = 0, sy = 0, mod = (long) (1e9 + 7);

	static ArrayList<Integer>[] a;
	// static ArrayList<pair> p;
	static int[][] dp;
	static long[] fa;
	static int[] farr;
	public static PrintWriter out = new PrintWriter(System.out);
	static ArrayList<pair> pa = new ArrayList<>();
	static long[] fact = new long[(int) 1e6];
	static StringBuilder sb = new StringBuilder();
	static boolean cycle = false;
	// static long m = 998244353;
	static int[] no, col;
	static int m = 0, n = 0, q;
	static int[] ans;
	static long[] p;
	static int[] time;
	static TreeMap<Long, Integer> hm = new TreeMap<>();
	static segment_array s;

	public static void main(String[] args) throws IOException {

		// Scanner scn = new Scanner(new BufferedReader(new
		// InputStreamReader(System.in)));

		Reader scn = new Reader();

		int n = scn.nextInt();
		ans = new int[n + 1];

		s = new segment_array();
		s.preprocess(new int[(int) 4e5]);

		p = new long[n + 1];

		TreeMap<Long, Integer> hm = new TreeMap<>();

		for (int i = 1; i <= n; i++) {
			p[i] = scn.nextLong();
			hm.put(p[i], 1);
		}

		int cnt = 1;

		for (long k : hm.keySet()) {

			hm.put(k, cnt++);
		}

		for (int i = 1; i <= n; i++) {
			p[i] = hm.get(p[i]);
		}

		a = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++)
			a[i] = new ArrayList<Integer>();

		for (int i = 1; i <= n - 1; i++) {
			int x = scn.nextInt(), y = scn.nextInt();
			a[x].add(y);
			a[y].add(x);
		}

		dfs(1, -1);

		dfs1(1, -1, 0);

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			sb.append(ans[i] + " ");
			sb.append("\n");
		}

		out.println(sb);

		out.close();
	}

	public static void dfs1(int v, int par, int max) {

		ans[v] = Math.max(ans[v], max);

		for (int nbr : a[v])
			if (nbr != par)
				dfs1(nbr, v, Math.max(ans[v], max));
		;
	}

	private static void dfs(int v, int par) {

		ans[v] = 1;
		ans[v] = Math.max(ans[v], s.query(0, (int) (p[v] - 1)) + 1);

		// update(p[v], ans[v]);
		int prev = s.query((int) p[v], (int) p[v]);
		s.update((int) p[v], ans[v]);

		for (int nbr : a[v])
			if (nbr != par)
				dfs(nbr, v);

		s.update((int) p[v], prev);
	}

	private static class segment_array {

		static int[] sa;
		static int[] oba;

		public static void preprocess(int[] ba) {
			oba = ba;
			int h = getlog(ba.length);
			int size = (1 << (h + 1)) - 1;

			sa = new int[size];

//			construct(0, 0, ba.length - 1);
		}

		private static void construct(int si, int ssi, int sei) {

			if (ssi == sei) {
				sa[si] = oba[ssi];
				return;
			}

			int mid = (ssi + sei) / 2;

			construct(2 * si + 1, ssi, mid);
			construct(2 * si + 2, mid + 1, sei);

			sa[si] = Math.max(sa[2 * si + 1], sa[2 * si + 2]);

		}

		public static int query(int qsi, int qei) {
			return query(0, 0, oba.length - 1, qsi, qei);
		}

		private static int query(int si, int ssi, int sei, int qsi, int qei) {

			if (ssi >= qsi && sei <= qei)
				return sa[si];

			else if (ssi > qei || sei < qsi)
				return 0;

			else {
				int mid = (ssi + sei) / 2;
				return Math.max(query(2 * si + 1, ssi, mid, qsi, qei), query(2 * si + 2, mid + 1, sei, qsi, qei));
			}

		}

		public static void update(int i, int val) {
			update(0, 0, oba.length - 1, i, val);
		}

		private static void update(int si, int ssi, int sei, int idx, int val) {

			if (ssi == idx && sei == idx) {
				sa[si] = val;
				oba[idx] = val;
				return;
			}

			int mid = (ssi + sei) / 2;

			if (idx <= mid)
				update(2 * si + 1, ssi, mid, idx, val);
			else
				update(2 * si + 2, mid + 1, sei, idx, val);

			sa[si] = Math.max(sa[2 * si + 1], sa[2 * si + 2]);

		}

		public static int getlog(int n) {
			int log = 0;

			while ((1 << log) < n)
				log++;

			return log;
		}

	}
	// _________________________TEMPLATE_____________________________________________________________

	// public static long lcm(long x, long y) {
	//
	// return (x * y) / gcd(x, y);
	// }
	//
	// private static long gcd(long x, long y) {
	// if (x == 0)
	// return y;
	//
	// return gcd(y % x, x);
	// }
	//
	// static class comp implements Comparator<Integer> {
	//
	// @Override
	// public int compare(Integer p1, Integer p2) {
	//
	// return p2 - p1;
	//
	// }
	// }
	//
	// }
	//
	// public static long pow(long a, long b) {
	//
	// if (b < 0)
	// return 0;
	// if (b == 0 || b == 1)
	// return (long) Math.pow(a, b);
	//
	// if (b % 2 == 0) {
	//
	// long ret = pow(a, b / 2);
	// ret = (ret % mod * ret % mod) % mod;
	// return ret;
	// }
	//
	// else {
	// return ((pow(a, b - 1) % mod) * a % mod) % mod;
	// }
	// }

	private static class pair implements Comparable<pair> {

		int a, b, c, d;

		pair(int p, int q, int r, int s) {

			a = p;
			b = q;
			c = r;
			d = s;

		}

		@Override
		public int compareTo(pair o) {

			return 1;

		}

		// @Override
		//
		// public int hashCode() {
		// return i;
		// }
		//
		// @Override
		//
		// public boolean equals(Object o) {
		//
		// pair p = (pair) o;
		// return this.i == p.i;
		// }

	}

	private static class pair1 {

		int c, t;

		pair1(int a, int b) {
			c = a;
			t = b;
		}
	}

	private static String reverse(String s) {

		return new StringBuilder(s).reverse().toString();
	}

	public static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[1000000 + 1]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) throws IOException {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		public int[][] nextInt2DArray(int m, int n) throws IOException {
			int[][] arr = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++)
					arr[i][j] = nextInt();
			}
			return arr;
		}

		public long[][] nextInt2DArrayL(int m, int n) throws IOException {
			long[][] arr = new long[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++)
					arr[i][j] = nextInt();
			}
			return arr;
		}
		// kickstart - Solution
		// atcoder - Main
	}

}