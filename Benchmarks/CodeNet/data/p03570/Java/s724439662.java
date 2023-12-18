import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		char[] c = in.nextToken().toCharArray();
		int n = c.length;
		for (int i = 0; i < c.length; i++) {
			c[i] = (char) (c[i] - 'a');
		}
		
		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE / 2);
		Map<Integer, Integer> best = new HashMap<>();
		best.put(0, 0);
		int mask = 0;
		for (int i = 0; i < c.length; i++) {
			mask ^= 1 << c[i];
			int ans = best.containsKey(mask) ? best.get(mask) : Integer.MAX_VALUE / 2;
			for (int j = 0; j < 26; j++) {
				if (best.containsKey(mask ^ (1 << j))) {
					ans = Math.min(ans, best.get(mask ^ (1 << j)) + 1);
				}
			}
			best.put(mask, ans);
		}
		out.println(mask == 0 ? 1 : best.get(mask));
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
