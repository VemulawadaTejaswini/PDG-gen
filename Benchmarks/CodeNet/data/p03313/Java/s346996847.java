import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 998244353;
	static long inf = (long) 1e16;
	static int[] l, r;
	static int n, m, id;
	static long all, ans;
	static ArrayList<Integer>[] ad;
	static long[][][] memo;
	static long[] a;
	static ArrayList<Integer> h;
	static boolean vis[];

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		n = 1 << n;
		int[] a = sc.nextArrInt(n);
		pair[] dp = new pair[n];
		int[] ans = new int[n];
		for (int i = 0; i < n; i++)
			dp[i] = new pair(i, -1);
//		System.out.println(Arrays.toString(dp));
		for (int i = 1; i < n; i++) {
			for (int b = 0; b < 19; b++) {
				if ((i & (1 << b)) != 0) {
					int id = (i ^ (1 << b));
					PriorityQueue<Integer> ts = new PriorityQueue<>((x, y) -> a[y] - a[x]);
					ts.add(dp[id].x);
					ts.add(dp[i].x);
					if (dp[i].y != -1)
						ts.add(dp[i].y);
					if (dp[id].y != -1)
						ts.add(dp[id].y);
					dp[i].x = ts.poll();
					if(ts.peek()==dp[i].x)
						ts.poll();
					dp[i].y = ts.poll();
				}
			}
	//		System.err.println(i + " " + Arrays.toString(dp));
		}
		int max = 0;
		for (int i = 1; i < n; i++) {
			max = Math.max(max, a[dp[i].x] + a[dp[i].y]);
			ans[i] = max;
		}
		for (int i = 1; i < n; i++)
			out.println(ans[i]);
		out.flush();
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return x + " " + y;
		}

		@Override
		public int compareTo(pair o) {
			return x - o.x;
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