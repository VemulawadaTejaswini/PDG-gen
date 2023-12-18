import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {
	FastScanner in;
	PrintWriter out;
	boolean systemIO = true;

	public class Fraction implements Comparable<Fraction> {
		long x;
		long y;

		public Fraction(long x, long y) {
			this.x = x;
			this.y = y;
		}

		public void norm() {
			long gcd = gcd(x, y);
			x /= gcd;
			y /= gcd;
		}

		@Override
		public int compareTo(Fraction o) {
			if (x > o.x) {
				return 1;
			}
			if (x < o.x) {
				return -1;
			}
			if (y > o.y) {
				return 1;
			}
			if (y < o.y) {
				return -1;
			}
			return 0;
		}
	}

	public Fraction sum(Fraction a, Fraction b) {
		Fraction c = new Fraction(a.x * b.y + a.y * b.x, a.y * b.y);
		c.norm();
		return c;
	}

	public long gcd(long x, long y) {
		if (y == 0) {
			return x;
		}
		if (x == 0) {
			return y;
		}
		return gcd(y, x % y);
	}
	
	public class Pair implements Comparable<Pair> {
		long x;
		long y;

		public Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}
		
		public void add(Pair p) {
			x += p.x;
			y += p.y;
		}

		@Override
		public int compareTo(Pair o) {
//			if (x != o.x) {
//				return x - o.x;
//			}
//			return y - o.y;
			return 0;
		}
	}
	
	public class DSU {
		int[] sz;
		int[] p;
		long[] sum;
		
		public DSU(long[] a) {
			sz = new int[a.length];
			p = new int[a.length];
			sum = new long[a.length];
			for (int i = 0; i < p.length; i++) {
				p[i] = i;
				sz[i] = 1;
				sum[i] = a[i];
			}
		}
		
		public int get(int x) {
			if (x == p[x]) {
				return x;
			}
			int par = get(p[x]);
			p[x] = par;
			return par;
		}
		
		public long getSum(int x) {
			return sum[get(x)];
		}
		
		public boolean unite(int a, int b) {
			int pa = get(a);
			int pb = get(b);
			if (pa == pb) {
				return false;
			}
			if (sz[pa] < sz[pb]) {
				p[pa] = pb;
				sz[pb] += sz[pa];
				sum[pb] += sum[pa];
			} else {
				p[pb] = pa;
				sz[pa] += sz[pb];
				sum[pa] += sum[pb];
			}
			return true;
		}
	}
	
	DSU dsu;
	ArrayList<Integer>[] to;
	
	public class Ans {
		long[] dp;
		int flag;
		
		public Ans(long[] dp, int flag) {
			this.dp = dp;
			this.flag = flag;
		}
	}
	
	public Ans dfs(int v, int prev) {
		long[] dp = new long[1];
		dp[0] = dsu.getSum(v);
		int sumf = 0;
		for (int x : to[v]) {
			if (x == prev) {
				continue;
			}
			Ans ans = dfs(x, v);
			sumf += 1 + ans.flag;
			long[] dp1 = new long[dp.length + ans.dp.length + 1];
			for (int i = 0; i < dp1.length; i++) {
				dp1[i] = Long.MAX_VALUE / 2;
			}
			for (int i = 0; i < dp.length; i++) {
				for (int j = 0; j < ans.dp.length; j++) {
					dp1[i + j] = Math.min(dp1[i + j], dp[i] + ans.dp[j]);
				}
				for (int j = ans.flag; j < ans.dp.length; j++) {
					dp1[i + 1 + j] = Math.min(dp1[i + 1 + j], dp[i]);
				}
				long min = Long.MAX_VALUE / 2;
				for (int j = 0; j < dp1.length; j++) {
					min = Math.min(min, dp1[j]);
					dp1[j] = min;
				}
			}
			dp = dp1;
		}
		int flag = Integer.MAX_VALUE;
//		System.out.println(dsu.get(v));
		if (dsu.getSum(v) > 0) {
			flag = sumf;
		}
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] < 0) {
				flag = Math.min(flag, i);
			}
		}
		dp[flag] += 0;
//		System.out.println(v + " " + flag);
//		for (int i = 0; i < dp.length; i++) {
//			System.out.println(dp[i]);
//		}
		return new Ans(dp, flag);
	}
	
	public void solve() {
		int n = in.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextLong();
		}
		dsu = new DSU(a);
		to = new ArrayList[n];
		for (int i = 0; i < to.length; i++) {
			to[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			int x = in.nextInt() - 1;
			int y = in.nextInt() - 1;
			if (a[x] * a[y] < 0) {
				to[x].add(y);
				to[y].add(x);
			} else {
				dsu.unite(x, y);
			}
		}
		for (int i = 0; i < to.length; i++) {
			if (dsu.get(i) != i) {
				for (int j = 0; j < to[i].size(); j++) {
					if (dsu.get(i) != dsu.get(to[i].get(j))) {
						to[dsu.get(i)].add(dsu.get(to[i].get(j)));
					}
				}
				to[i].clear();
			} else {
				for (int j = 0; j < to[i].size(); j++) {
//					System.out.println(to[i].get(j));
					to[i].set(j, dsu.get(to[i].get(j)));
				}
			}
//			for (int x : to[i]) {
//				System.out.println(i + " " + x);
//			}
		}
//		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (dsu.get(i) == i) {
				out.println(dfs(i, -1).flag);
				return;
			}
		}
	}

	public void run() {
		try {
			if (systemIO) {
				in = new FastScanner(System.in);
				out = new PrintWriter(System.out);
			} else {
				in = new FastScanner(new File("input.txt"));
				out = new PrintWriter(new File("output.txt"));
			}
			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	public static void main(String[] arg) {
		new Main().run();
	}
}