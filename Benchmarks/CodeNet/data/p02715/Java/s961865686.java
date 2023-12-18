import java.io.*;
import java.math.BigInteger;
import java.util.*;

import javax.transaction.xa.Xid;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int n, k;
	static long mod = 1000000007;
	static int[][] memo;
	static String s;
	static HashSet<Integer> nodes;
	static HashSet<Integer>[] ad, tree;
	static boolean[] vis, taken;
	static int[] a;
	static TreeSet<Long> al;
	static long[] val;
	static ArrayList<String> aa;
	static char[] b;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		k = sc.nextInt();
		long ans = modPow(k, n);
		// System.out.println(ans);
		long[] ol = new long[k+1];
		for (int i = k; i >= 2; i--) {
			long ti = modPow(k / i, n);
            for(int j=i+i;j<=k;j+=i)
            	ti=(ti-ol[j]+mod)%mod;
			ans = (ans - ti + mod) % mod;
			long l = ti * i % mod;
			ans = (ans + l) % mod;
			ol[i]=ti;
		}
		System.out.println(ans);
		out.flush();
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

	static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
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
				a[i] = nextInt();
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