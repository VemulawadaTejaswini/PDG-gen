import java.io.*;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int n, m, k;
	static long mod = 998244353;
	static Boolean[][][] memo;
	static String s;
	static HashSet<Integer> nodes;
	static ArrayList<Integer>[] ad;
	static boolean[] vis;
	static TreeSet<Long> al;
	static int[][] val;
	static int[] b;
	static int ans;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int a = sc.nextInt();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long ans =  ((b-1) * a) / b - a * ((b-1) / b);
		for (long i = 0; i <= Math.min(n, 10000000); i++) {
			ans = Math.max(ans, (i * a) / b - a * (i / b));
		}
		for (long i = n; i >= Math.max(0, n - 100000000); i--) {
			ans = Math.max(ans, (i * a) / b - a * (i / b));
		}
		System.out.println(ans);
		out.flush();
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