import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 1000000007;
	static long inf = (long) 1e16;
	static ArrayList<Integer>[] ad;
	static int n, g;
	static long[][][] memo;
	static HashSet<Integer> h;
	static long[] a;
	static HashSet<Integer> leaves;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		g = 1 + n % 2;
		a = sc.nextArrLong(n);
		memo = new long[n][g + 1][2];
		for (long[][] h : memo)
			for (long[] k : h)
				Arrays.fill(k, -1);
		System.out.println(dp(0, g, 0));
		out.close();
	}

	static long dp(int i, int lg, int l) {
		if (i == n && lg != 3)
			return 0;
		if (i == n)
			return -inf;
		if (memo[i][lg][l] != -1)
			return memo[i][lg][l];
		long ans = 0;
		if (l == 1)
			ans = dp(i + 1, lg, 0);
		else {
			ans = dp(i + 1, lg, 1) + a[i];
			if (lg > 0)
				ans = Math.max(ans, dp(i + 1, lg - 1, 0));
		}
		return memo[i][lg][l] = ans;
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