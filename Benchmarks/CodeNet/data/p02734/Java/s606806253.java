import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 998244353;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] ad;
	static int n, s;
	static int[][][] memo;
	static int[] a;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		// System.out.println(998244353*3);
		n = sc.nextInt();
		s = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		memo = new int[n][s + 1][3];
		for (int[][] u : memo)
			for (int[] j : u)
				Arrays.fill(j, -1);
		System.out.println(dp(0, s, 0));
		out.close();
	}

	static int dp(int i, int sum, int st) {
		if (i == n) {
			if (sum != 0)
				return 0;
			if (st != 0)
				return 1;

		}
		if (sum < 0)
			return 0;
		if (memo[i][sum][st] != -1)
			return memo[i][sum][st];
		int ans = dp(i + 1, sum, st);
		if (st == 0) {
			ans = ans + dp(i + 1, sum, 2);
			if (ans >= mod)
				ans -= mod;
			ans = (ans + dp(i + 1, sum, 1));
			if (ans >= mod)
				ans -= mod;
			ans = ans + dp(i + 1, (sum - a[i]), 1);
			if (ans >= mod)
				ans -= mod;
		} else if (st == 1) {
			ans = (ans + dp(i + 1, (sum - a[i]), 1));
			if (ans >= mod)
				ans -= mod;
			ans = (ans + dp(i + 1, sum, 2));
			if (ans >= mod)
				ans -= mod;
		}
		return memo[i][sum][st] = ans;
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
