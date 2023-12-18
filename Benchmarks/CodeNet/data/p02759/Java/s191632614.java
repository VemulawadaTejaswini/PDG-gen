import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int par1, int par2) {
			x = par1;
			y = par2;
		}

		@Override
		public int compareTo(pair p) {
			return x - p.x;
		}

		@Override
		public String toString() {
			return +x + " " + y;
		}

	}

	static long mod = (long) (1e9 + 7);

	public static long facn(long n, long x) {
		long ans = 1;
		for (int i = 1; i <= x; i++) {
			ans *= n;
			ans %= mod;
			n--;
		}
		long k = 1;
		long t = x;
		for (int i = 1; i <= t; i++) {
			k *= x;
			k %= mod;
			x--;
		}
//		BigInteger b = BigInteger.valueOf((k)).modInverse(BigInteger.valueOf((mod)));
		long b = modPow(k, mod - 2, mod);
		return ((b % mod) * ans) % mod;

	}

	public static long modInverse(long a, long m) {
		a = a % m;
		for (int x = 1; x < m; x++)
			if ((a * x) % m == 1)
				return x;
		return 1;
	}

	static long modPow(long a, long e, long mod) // O(log e)
	{
		a %= mod;
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res % mod;
	}

	public static void bb(Serializable s) {
		System.out.println(55);
	}

	public static int dfs(int u) {
		vis[u] = true;
		rank[u] = rnk;
		int ans = 1;
		for (int v : adj[u])
			if (!vis[v])
				ans += dfs(v);

		return ans;
	}

	public static void dfsD(int u) {
		dist[u] = dst;
		for (int v : adj[u])
			if (dist[v] == -1)
				dfsD(v);
	}

	static ArrayList<Integer>[] adj, adj2;
	static int n, m, k, rnk, dst;
	static boolean[] vis;
	static int[] dist, rank;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		pw.println((n+1)/2);
		pw.close();
	}

	public static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException, IOException {
			return br.ready();
		}

	}
}