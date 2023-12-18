
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		assert solve(2, new long[] { 3, 1, 4, 1, 5, 9 }) == 1;
		assert solve(1, new long[] { 1, 2, 3 }) == -1;
		assert solve(3, new long[] { 8, 2, 2, 7, 4, 6, 5, 3, 8 }) == 5;
		int n = cin.nextInt();
		long[] a = new long[3 * n];
		for (int i = 0; i < a.length; i++)
			a[i] = cin.nextLong();
		long ans = solve(n, a);
		cout.println(ans);
	}

	private static long solve(int n, long[] a) {
		long[][] lrs = new long[n + 1][2];
		PriorityQueue<Long> lq = new PriorityQueue<>((x, y) -> Long.compare(x, y));
		PriorityQueue<Long> rq = new PriorityQueue<>((x, y) -> Long.compare(y, x));
		for (int i = 0; i < n; i++) {
			lq.add(a[i]);
			rq.add(a[3 * n - 1 - i]);
		}
		long lfsum = lq.stream().reduce((x, y) -> x + y).get();
		long rtsum = rq.stream().reduce((x, y) -> x + y).get();
		for (int i = 0; i <= n; i++) {
			lrs[i][0] = lfsum;
			long in = a[n + i];
			lq.add(in);
			long out = lq.poll();
			lfsum -= out;
			lfsum += in;
		}
		for (int i = 0; i <= n; i++) {
			lrs[n - i][1] = rtsum;
			long in = a[2 * n - 1 - i];
			rq.add(in);
			long out = rq.poll();
			rtsum -= out;
			rtsum += in;
		}
		long ans = Long.MIN_VALUE;
		for (long[] lr : lrs)
			ans = Math.max(ans, lr[0] - lr[1]);
		return ans;
	}

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
