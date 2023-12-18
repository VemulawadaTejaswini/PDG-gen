import java.io.*;
import java.util.*;

public class A {
	static int n;
	static int w;
	static int[] val;
	static int[] wei;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		n = sc.nextInt();
		w = sc.nextInt();
		val = new int[n];
		wei = new int[n];

		for (int i = 0; i < n; i++) {
			wei[i] = sc.nextInt();
			val[i] = sc.nextInt();
		}
		out.println(dp(0, 0));

		out.flush();
	}

	public static int dp(int idx, int totW) {
		if (totW > w) {
			return -999999999;
		}
		if (idx >= n) {
			return 0;
		}
		if (totW == w) {
			return 0;
		}
	
		int take = val[idx] + dp(idx + 1, totW + wei[idx]);
		int leave = dp(idx + 1, totW);
		return Math.max(take, leave);
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

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}