import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static BufferedReader br;
	static PrintWriter pw;
	static int inf = (int) 1e9;
	static int mod = (int) 1e9 + 7;
	static int[][] memo;
	static int[] a;

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> notpos = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if (x > 0) {
				pos.add(x);
			} else
				notpos.add(x);
		}
		Collections.sort(pos);
		Collections.sort(notpos);
		if (m % 2 == 1 && pos.size() == 0) {
			int ans = 1;
			for (int i = 1; i <= m; i++) {
				ans = (int) ((ans * 1l * notpos.get(n - i)) % mod);
			}
			pw.println((ans + mod) % mod);
		} else {
			int z = pos.size() - 1;
			int x = 0;
			int ans = 1;
			int c = 0;
//			System.out.println(pos);
//			System.out.println(notpos);
			for (int i = 0; i < m; i++) {
				int p1 = 1, p2 = 1;
				if (z >= 0)
					p1 = pos.get(z);
				if (x < notpos.size())
					p2 = -1 * notpos.get(x);
				if (p1 > p2) {
					ans = (int) ((ans * 1l * p1) % mod);
					z--;
				} else {
					ans = (int) ((ans * 1l * p2) % mod);
					x++;
					c++;
				}
//				System.out.println(ans);
			}
			if(c%2==1) {
				ans*=-1;
				ans=(ans+mod)%mod;
			}
			if (c % 2 == 1 && m != n) {
				int p1 = 0, p2 = -1, n1 = 0, n2 = 1;
				if (z >= 0) {
					p2 = pos.get(z);
				}
				if (z + 1 < pos.size()) {
					p1 = pos.get(z + 1);
				}
				if (x < notpos.size()) {
					n2 = -1 * notpos.get(x);
				}
				if (x - 1 >= 0) {
					n1 = -1 * notpos.get(x - 1);
				}
				if(z==pos.size()-1) {
					x--;
					z--;
				}
				else if (z == -1) {
					z++;
					x++;
				} else if (x == notpos.size()) {
					x--;
					z--;
				} else if (p2 - n1 >= n2 - p1) {
					x--;
					z--;
				} else {
					z++;
					x++;
				}
				ans = 1;
				for (int i = z + 1; i < pos.size(); i++) {
					ans = (int) ((ans * 1l * pos.get(i)) % mod);
//					System.out.println(pos.get(i));
				}
				for (int i = 0; i < x; i++) {
					ans = (int) ((ans * 1l * notpos.get(i)) % mod);
//					System.out.println(pos.get(i));
				}
			}
			pw.println(ans);
		}

		pw.flush();
	}
//	7 5
//	35 25 5 -25 -25 -25 -25

	static int[] fac, faci;

	static int nCrModPFermat(int n, int r, int p) {

		if (r == 0)
			return 1;

		return (int) (((fac[n] * 1l * modInverse(fac[r], p)) % p * modInverse(fac[n - r], p) % p) % p);
	}

	static int modPow(int a, int e, int mod) // O(log e)
	{
		a %= mod;
		int res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (int) ((res * 1l * a) % mod);
			a = (int) ((a * 1l * a) % mod);
			e >>= 1;
		}
		return res;
	}

//	static int modInverse(int a, int m) {
//		int g = (int) gcd(a, m);
//		if (g != 1)
//			System.out.println("Inverse doesn't exist");
//		else {
//			// If a and m are relatively prime, then modulo inverse
//			// is a^(m-2) mode m
//			return (int) pow(a, m - 2, m);
//		}
//		return -1;
//	}

	static int modInverse(int n, int p) {
		return modPow(n, p - 2, p);
	}

	static int dp(int idx, int r) {
		if (idx == a.length && r == 0)
			return 1;
		if (r < 0 || idx == a.length)
			return 0;
		if (memo[idx][r] != -1) {
			return memo[idx][r];
		}
		int t = dp(idx + 1, r - a[idx]);
		int l = dp(idx + 1, r);
		return memo[idx][r] = (int) ((t + 2 * 1l * l) % 998244353);
	}

	static int n, m;

	static boolean valid(int x, int y) {
		return x > -1 && x < n && y > -1 && y < m;
	}

	static boolean[][] vis;

	static ArrayList<Edge> edgeList;
	static ArrayList<edge1>[] adj;
	static int V;

	static int kruskal() // O(E log E)
	{
		int mst = 0;
		Collections.sort(edgeList);
		UnionFind uf = new UnionFind(n);
		for (Edge e : edgeList)
			if (uf.union(e.u, e.v))
				mst += e.w;
		return mst;
	}

	static class Edge implements Comparable<Edge> {
		int u, v, w;

		Edge(int a, int b, int c) {
			u = a;
			v = b;
			w = c;
		}

		public int compareTo(Edge e) {
			return w - e.w;
		}
	}

	static class edge1 implements Comparable<edge1> {
		int v, w;

		edge1(int b, int c) {
			v = b;
			w = c;
		}

		public int compareTo(edge1 e) {
			return w - e.w;
		}
	}

	static class UnionFind {
		int[] p, rank;

		UnionFind(int N) {
			p = new int[N];
			rank = new int[N];
			for (int i = 0; i < N; i++)
				p[i] = i;
		}

		int findSet(int x) {
			return p[x] == x ? x : (p[x] = findSet(p[x]));
		}

		boolean union(int x, int y) {
			x = findSet(x);
			y = findSet(y);
			if (x == y)
				return false;

			if (rank[x] > rank[y])
				p[y] = x;
			else {
				p[x] = y;
				if (rank[x] == rank[y])
					++rank[y];
			}
			return true;
		}
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int d, int u) {
			x = d;
			y = u;
		}

		public int compareTo(pair o) {
			return x - o.x;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return x + " " + y;
		}

	}

	static class triple implements Comparable<triple> {
		int x;
		int y;
		int z;

		public triple(int a, int b, int c) {
			x = a;
			y = b;
			z = c;
		}

		public int compareTo(triple o) {
			return x - o.x;
		}

		public String toString() {
			// TODO Auto-generated method stub
			return x + " " + y + " " + z;
		}
	}

	static int[] nxtarr() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[st.countTokens()];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		return a;
	}

	static long pow(long a, long e, int mod) // O(log e)
	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1) {
				res *= a;
				res %= mod;
			}
			a *= a;
			a %= mod;
			e >>= 1;
		}
		return res;
	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}
