
import java.io.*;
import java.util.*;

 class Main {

	static long sx = 0, sy = 0, m = (long) (1e8);

	static ArrayList<Integer>[] a;
	static long[][][][] dp;
	static int[] size;
	static long[] farr;
	// static boolean b = true;

	// static TreeMap<Integer, Integer> hm = new TreeMap<>();
	public static PrintWriter out;
	// static ArrayList<pair> p = new ArrayList<>();
	static long[] fact = new long[(int) 1e6];
	static boolean b = false;
	static StringBuilder sb = new StringBuilder();
	static boolean cycle = false;
	static long mod = 998244353;
	static long[] no, col;
	static String s;
	static int ans = 0;
	static HashSet<Long>[] hm;
	static int[] dis;

	public static void main(String[] args) throws IOException {

		// Scanner scn = new Scanner(new BufferedReader(new
		// InputStreamReader(System.in)));

		out = new PrintWriter(System.out);
		Reader scn = new Reader();

		int n = scn.nextInt(), x = scn.nextInt(), y = scn.nextInt();

		a = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++)
			a[i] = new ArrayList<>();

		for (int i = 1; i <= n - 1; i++){
			a[i].add(i + 1);
			a[i+1].add(i);
		}

		a[x].add(y);
		a[y].add(x);

		int[] ans = new int[n];

		for (int i = 1; i <= n - 1; i++) {

			LinkedList<pair> q = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();

			q.add(new pair(i, 0));
			visited.add(i);

			while (q.size() != 0) {

				pair rp = q.removeFirst();

				if(rp.v>i)
				ans[rp.d]++;

				for (int nbr : a[rp.v])

					if (!visited.contains(nbr)) {
						q.add(new pair(nbr, rp.d + 1));
						visited.add(nbr);
					}
			}
		}

		for (int i = 1; i <= n - 1; i++)
			System.out.println(ans[i]);

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

	// static class comp implements Comparator<Integer> {
	//
	// @Override
	// public int compare(Integer o1, Integer o2) {
	// return depth[o2] - depth[o1];
	// }
	//
	// }

	// public static long pow(long a, long b) {
	//
	// if(b<0)return 0;
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

		int v, d;

		pair(int a, int b) {

			v = a;
			d = b;
		}

		@Override
		public int compareTo(pair o) {

			return 1;
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