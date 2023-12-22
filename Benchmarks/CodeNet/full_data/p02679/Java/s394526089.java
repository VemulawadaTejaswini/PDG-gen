import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = (int) 1e9 + 7;
	static long inf = (long) 1e16;
	static int[] col;
	static int n, m;
	static ArrayList<Integer>[] ad;
	static int[][][] memo;
	static ArrayList<Integer> h;
	static int[][] grid;
	static char[] a;
	static boolean[] tak;
	static boolean f;
	static int N1, P1, M1;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		int zeros = 0;
		int rr = 0;
		int ll = 0;
		long ans = 1;
		TreeMap<pair, Integer> pos = new TreeMap<>();
		TreeMap<pair, Integer> neg = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if ((a > 0 && b > 0) || (b < 0 && a < 0)) {
				a = Math.max(a, -a);
				b = Math.max(b, -b);
				long d = gcd(a, b);
				a /= d;
				b /= d;
				pos.put(new pair(a, b), pos.getOrDefault(new pair(a, b), 0) + 1);
			} else if (a == b && b == 0) {
				zeros++;
			} else if (b == 0 && a != 0) {
				rr++;
			} else if (b != 0 && a == 0) {
				ll++;
			} else {
				a = Math.max(a, -a);
				b = Math.max(b, -b);
				long d = gcd(a, b);
				a /= d;
				b /= d;
				neg.put(new pair(a, b), neg.getOrDefault(new pair(a, b), 0) + 1);
			}
		}
		n -= zeros;
		if (rr > 0 && ll > 0) {
			n -= rr;
			n -= ll;
		}
		for (pair t : pos.keySet()) {
			if (neg.containsKey(new pair(t.number, t.to))) {
				int p = pos.get(t);
				int ne = neg.get(new pair(t.number, t.to));
				ans = (ans * ((modPow(2, p) + modPow(2, ne) - 1 + mod) % mod)) % mod;
				n -= p;
				n -= ne;
			}
		}
		ans=ans*modPow(2, n)%mod;
		System.out.println((ans - 1 + mod) % mod);
		out.flush();
	}

	static class pair implements Comparable<pair> {
		long to;
		long number;

		pair(long t, long n) {
			number = n;
			to = t;
		}

		public String toString() {
			return to + " " + number;
		}

		@Override
		public int compareTo(pair o) {
			if (to == o.to)
				return Long.compare(o.number, number);
			return Long.compare(to, o.to);
		}

	}

	static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static long modPow(long a, long e)

	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res;
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}