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
		n = sc.nextInt();
		m = sc.nextInt();
		int q = sc.nextInt();
		val = new int[q][4];
		for (int i = 0; i < q; i++) {
			val[i][0] = sc.nextInt();
			val[i][1] = sc.nextInt();
			val[i][2] = sc.nextInt();
			val[i][3] = sc.nextInt();
		}
		b = new int[n];
		rec(0, 1);
		System.out.println(ans);
		out.flush();
	}

	static void rec(int i, int l) {
		if (i == n) {
			int tem = 0;
			for (int j = 0; j < val.length; j++) {
                   if(b[val[j][1]-1]-b[val[j][0]-1]==val[j][2])
                	   tem+=val[j][3];
			}
			ans = Math.max(ans, tem);
			return;
		}
		for (int j = l; j <= m; j++) {
			b[i] = j;
			rec(i + 1, j);
		}
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