import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 1000000007;
	static long inf = (long) 1e14;
	static int n, q;
	static ArrayList<Integer>[] ad;
	static long[][] memo;
	static boolean f;
	static boolean vis[];
	static int[] size, pa;
	static double[] x, y;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int idmin = 0;
		int idmax = 0;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if (x[i] + y[i] < min) {
				min = x[i] + y[i];
				idmin = i;
			}
			if (x[i] + y[i] > max) {
				max = x[i] + y[i];
				idmax = i;
			}
		}
		int dist = max - min;
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		idmin = 0;
		idmax = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] - y[i] < min) {
				min = x[i] + y[i];
				idmin = i;
			}
			if (x[i] - y[i] > max) {
				max = x[i] + y[i];
				idmax = i;
			}
		}
		dist = Math.max(max - min, dist);
		System.out.println(dist);
		out.close();
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

	static int[] si;
	static ArrayList<Integer> primes;

	static void seive(int N) {
		si = new int[N];
		primes = new ArrayList<>();
		si[1] = 1;
		for (int i = 2; i < N; i++) {
			if (si[i] == 0) {
				si[i] = i;
				primes.add(i);
			}
			for (int j = 0; j < primes.size() && primes.get(j) <= si[i] && (i * primes.get(j)) < N; j++)
				si[primes.get(j) * i] = primes.get(j);
		}
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