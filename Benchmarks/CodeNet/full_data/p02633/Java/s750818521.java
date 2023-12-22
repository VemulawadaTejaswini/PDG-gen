import java.util.*;
import java.awt.print.Book;
import java.io.*;
import java.math.BigInteger;

public class A {

	static BufferedReader br;
	static PrintWriter pw;
	static int inf = (int) 1e9;
	static long mod = (long) 1e9 + 7;

	static int n, m;

	static ArrayList<Integer> primes;
	static int[] isComposite;

	// O(N log log N) this func for prime number
	static void sieve(int N) {
		isComposite = new int[N + 1];
		isComposite[0] = isComposite[1] = 1; // 0 indicates a prime number
		primes = new ArrayList<Integer>();

		for (int i = 2; i <= N; ++i) // can loop till i*i <= N if primes array is not needed O(N log log sqrt(N))
			if (isComposite[i] == 0) // can loop in 2 and odd integers for slightly better performance
			{
				primes.add(i);
				if (1l * i * i <= N)
					for (int j = i * i; j <= N; j += i) // j = i * 2 will not affect performance too much, may alter in
														// modified sieve
						isComposite[j] = 1;
			}
	}

	static ArrayList<Integer> primeFactors(int N) // O(sqrt(N) / ln sqrt(N))
	{
		ArrayList<Integer> factors = new ArrayList<Integer>(); // take abs(N) in case of -ve integers
		int idx = 0, p = primes.get(idx);

		while (p * p <= N) {
			while (N % p == 0) {
				factors.add(p);
				N /= p;
			}
			p = primes.get(++idx);
		}

		if (N != 1) // last prime factor may be > sqrt(N)
			factors.add(N); // for integers whose largest prime factor has a power of 1
		return factors;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		int x = 360;
		int ans = 0;
		while (true) {
			if (x % t == 0) {
				ans = x / t;
				break;
			}
			x += 360;
		}
		pw.println(ans);
		pw.flush();
		pw.close();

	}

	void sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	static boolean[] vis;
	static Edge[] edgeList;
	static int V;
	static int min;

	public static boolean dfs(pair p, int t) {
		vis[p.x] = true;
		if (p.x == t)
			return true;
		for (pair v : g[p.x]) {
			if (!vis[v.x]) {
				if (dfs(v, t)) {
					min = Math.min(min, v.y);
					return true;
				}
			}
		}
		return false;
	}

	static int kruskal() // O(E log E)
	{
		int mst = 0;
		Arrays.sort(edgeList);
		UnionFind uf = new UnionFind(n);

		for (Edge e : edgeList)
			if (uf.union(e.u, e.v)) {
				mst += e.w;
				g[e.u].add(new pair(e.v, e.w));
				g[e.v].add(new pair(e.u, e.w));
			}
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
			return e.w - w;
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

	static ArrayList<pair>[] g;

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
	}

	static int[] nxtarr() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[st.countTokens()];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		return a;
	}

	static long pow(long a, long e) // O(log e)
	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res *= a;
			a *= a;
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
