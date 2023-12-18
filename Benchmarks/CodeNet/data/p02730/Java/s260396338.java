import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = 998244353;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] ad;
	static int n, k;
	static long[][] memo;
	static char[][] g;
	static boolean[] vis;
	static long ans, tem;
	static long[] a;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		String s = sc.nextLine();
		String s1 = s.substring(0, s.length() / 2);
		for (int i = 0, j = s1.length() - 1; i < s1.length(); i++, j--)
			if (s1.charAt(i) != s1.charAt(j)) {
				System.out.println("No");
				return;
			}
		s1 = s.substring(((s.length() + 3) / 2)-1, s.length());
		for (int i = 0, j = s1.length() - 1; i < s1.length(); i++, j--)
			if (s1.charAt(i) != s1.charAt(j)) {
				System.out.println("No");
				return;
			}
		s1 = s.substring(0,s.length());
		for (int i = 0, j = s1.length() - 1; i < s1.length(); i++, j--)
			if (s1.charAt(i) != s1.charAt(j)) {
				System.out.println("No");
				return;
			}
		System.out.println("Yes");
		out.close();
	}

	static long cal(int i, int u, int p) {
		if (memo[i][u] != -1)
			return memo[i][u];
		long ans = 1;
		for (int v : ad[i]) {
			if (v == p)
				continue;
			if (u == 0) {
				long tem = 0;
				tem = (2 * cal(v, 0, i)) % mod;
				tem = (tem + 2 * cal(v, 1, i)) % mod;
				tem = (tem - cal(v, 2, i) + mod) % mod;
				ans = ans * tem % mod;
			} else if (u == 1) {
				long tem = 0;
				tem = (2 * cal(v, 0, i)) % mod;
				tem = (tem + cal(v, 1, i)) % mod;
				tem = (tem - cal(v, 2, i) + mod) % mod;
				ans = ans * tem % mod;
			} else {
				long tem = 0;
				tem = cal(v, 0, i) % mod;
				tem = (tem + cal(v, 1, i)) % mod;
				tem = (tem - cal(v, 2, i) + mod) % mod;
				ans = ans * tem % mod;
			}
		}
		return memo[i][u] = ans;
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
