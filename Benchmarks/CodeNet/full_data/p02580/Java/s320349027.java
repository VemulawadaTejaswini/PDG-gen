
import java.io.*;
import java.util.*;

import java.math.*;

 class Main {

	// static long sx = 0, sy = 0, mod = (long) (998244353);

	static ArrayList<Integer>[] a;
	static ArrayList<Long> p;
	static Integer[][] dp;
	static HashMap<ArrayList<Integer>, Long> hm = new HashMap<>();
	static boolean[][] vis;
	static int[] farr;
	static long[] far;
	public static PrintWriter out = new PrintWriter(System.out);
	static ArrayList<pair> pa = new ArrayList<>();
	static long[] fact = new long[(int) 1e6];
	static StringBuilder sb = new StringBuilder();
	static boolean cycle = false;
	static long mo = (long) (1e9 + 7);
	static int[] c, col;
	// static int n = 0, m, x, k;
	static int ans = Integer.MAX_VALUE;
	static boolean b = true;
	static boolean[] reach = new boolean[6000];
	static int[][] par;
	static int[] depth;
	static int[] size;
	static long[] pow;
	static int time = 0;
	static int[] disc;
	static int[] low;
	static char[][] ch;
	// static int cnt = 0;
	static int[][] dirs = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 }, };
	static int n = 0, k = 0, z = 0;
	static long[] val;
	static String s1, s2;
	static long x, y;
	static int m = 0;

	public static void main(String[] args) throws IOException {

		// Scanner scn = new Scanner(new BufferedReader(new
		// InputStreamReader(System.in)));

		Reader scn = new Reader();

		int n = scn.nextInt(), m = scn.nextInt(), h = scn.nextInt();

		a = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++)
			a[i] = new ArrayList<>();

		int[] col = new int[m + 1];
		int mc = 0;

		while (h-- != 0) {

			int x = scn.nextInt(), y = scn.nextInt();
			a[x].add(y);

			col[y]++;
			mc = Math.max(mc, col[y]);
		}

		for (int i = 1; i <= n; i++)
			Collections.sort(a[i]);

		ArrayList<Integer> p = new ArrayList<>();

		for (int i = 1; i <= m; i++)
			if (col[i] == mc)
				p.add(i);

		int ans = 0;

		z: for (int i = 1; i <= n; i++) {

			for (int j = 1; j < a[i].size(); j++) {

				if (count(a[i].get(j - 1) + 1, a[i].get(j) - 1, p) > 0) {
					ans = Math.max(ans, a[i].size() + mc);
					continue z;
				}
			}

			if (a[i].size() != 0 && (count(1, a[i].get(0) - 1, p) > 0
					|| count(a[i].get(a[i].size() - 1) + 1, m, p) > 0)) {
				ans = Math.max(ans, a[i].size() + mc);
				continue z;
			}

			ans = Math.max(ans, a[i].size() + mc - 1);
		}

		System.out.println(ans);
	}

	public static int count(int l, int r, ArrayList<Integer> p) {

		if (l > r)
			return 0;
		return f(r, p) - f(l - 1, p);
	}

	private static int f(int val, ArrayList<Integer> p) {

		if (val < p.get(0))
			return 0;

		if (val >= p.get(p.size() - 1))
			return p.size();

		int idx = -1;
		int lo = 0, hi = p.size() - 1;

		while (lo <= hi) {

			int mid = (lo + hi) >> 1;
		
			if (p.get(mid) <= val) {
				idx = mid;
				lo = mid + 1;
			}

			else
				hi = mid - 1;
		}
		return idx + 1;
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
	// public static long pow(long a, long b, long mod) {
	//
	// if (b < 0)
	// return 0;
	// if (b == 0 || b == 1)
	// return (long) Math.pow(a, b);
	//
	// if (b % 2 == 0) {
	//
	// long ret = pow(a, b / 2, mod);
	// ret = (ret % mod * ret % mod) % mod;
	// return ret;
	// }
	//
	// else {
	// return ((pow(a, b - 1, mod) % mod) * a % mod) % mod;
	// }
	// }

	private static class pair implements Comparable<pair> {

		int i;
		int j;
		int cnt;

		pair(int a, int b, int c) {
			i = a;
			j = b;
			cnt = c;
		}

		@Override
		public int compareTo(pair o) {

			return this.cnt - o.cnt;
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

		int a, b;

		pair1(int a, int b) {
			this.a = a;
			this.b = b;
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