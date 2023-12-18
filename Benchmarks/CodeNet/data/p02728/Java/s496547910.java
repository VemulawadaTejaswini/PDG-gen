import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {

	public static final int mod = (int)1e9+7;
	public static final int max = (int)5e5;
	public static long[] facts;
	public static long[] invfacts;
	public static void preCompute() {
		facts = new long[max];
		invfacts = new long[max];
		facts[1] = invfacts[1] = facts[0] = invfacts[0] = 1L;
		for(int i = 2; i < max; i++) {
			facts[i] = (facts[i - 1] * (long)i)%mod;
			invfacts[i] = (invfacts[i - 1] * (long)ModInverse(i, mod))%mod;
		}
	}
	public static long nCr(int n, int r) {
		long ans = (facts[n] * invfacts[r])%mod;
		ans *= invfacts[n - r];
		ans %= mod;
		return ans;
	}
	
	public static LinkedList<Integer>[] adj;
	
	public static long[] dp1;
	public static long[] dp2;
	
	public static void dfs1(int curr, int pr) {
////		if(adj[curr].size() == 1) {
//			dp1[curr] = 1;
//			dp2[curr] = 1;
//			return;
//		}
		long ans = 1;
		long size = 0;
		for(Integer x : adj[curr]) {
			if(x == pr) continue;
			dfs1(x, curr);
			size += dp1[x];
			long size2 = dp1[x];
			ans *= dp2[x];
			ans %= mod;
			ans *= nCr((int)size, (int)size2);
			ans %= mod;
		}
		dp2[curr] = ans;
		dp1[curr] = size + 1L;
	}
	
	public static void dfs2(int curr, int pr) {
		if(curr == 0) {
			for(Integer x : adj[curr]) {
				dfs2(x, curr);
			}
		}else {
			long size_pr = dp1[pr] - dp1[curr] - 1;
			long size_over = dp1[pr] - 1;
			long ans_pr = dp2[pr];
			ans_pr = ans_pr * ModInverse(dp2[curr], mod);
			ans_pr %= mod;
			ans_pr = ans_pr * ModInverse(nCr((int)size_over, (int)size_pr), mod);
			ans_pr %= mod;
			long my_ans = dp2[curr];
			my_ans = my_ans * ans_pr;
			my_ans %= mod;
			my_ans *= (nCr((int)size_over, (int)size_pr+1)% mod);
			my_ans %= mod;
			dp1[curr] = size_over + 1;
			dp2[curr] = my_ans;
			for(Integer x : adj[curr]) {
				if(x == pr) continue;
				dfs2(x, curr);
			}
		}
	}
 	
	public static void solve() {
		preCompute();
		int n = s.nextInt();
		adj = new LinkedList[n];
		for(int i = 0; i < n; i++) {
			adj[i] = new LinkedList<Integer>();
		}
		for(int i = 0; i < n - 1; i++) {
			int a = s.nextInt() - 1;
			int b = s.nextInt() - 1;
			adj[a].add(b);
			adj[b].add(a);
		}
		dp1 = new long[n]; dp2 = new long[n];
		dfs1(0, 0);
		dfs2(0, 0);
		for(int i = 0; i < n; i++) {
			out.println(dp2[i]);
		}
	}

	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}
	
	public static class Triplet {
		long gcd;
		long x;
		long y;

		Triplet(long gcd, long x, long y) {
			this.gcd = gcd;
			this.x = x;
			this.y = y;
		}
	}

	public static Triplet ExtendedEuclideanAlgo(long a, long b) {
		if (a == 0) {
			return new Triplet(b, 0, 1);
		}
		Triplet ans = ExtendedEuclideanAlgo(b % a, a);
		long x = ans.y - (b / a) * ans.x;
		long y = ans.x;
		return new Triplet(ans.gcd, x, y);
	}

	public static long ModInverse(long a, long m) {
		Triplet ans = ExtendedEuclideanAlgo(a, m);
		if (ans.gcd != 1) {
			//System.out.println("Multiplicative inverse doesnot exist");
			return -1;
		} else {
			//m is added to handle negative x
			long result = (ans.x % m + m) % m;
			return result;
		}
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
