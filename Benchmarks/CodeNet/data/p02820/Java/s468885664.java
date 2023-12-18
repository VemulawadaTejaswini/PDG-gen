import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) { new Main(); }
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);

	int n, k, r, s, p;
	char[] str;
	int[][] dp;
	
	Main() {
		n = in.nextInt();
		k = in.nextInt();
		r = in.nextInt();
		s = in.nextInt();
		p = in.nextInt();

		str = in.next().toCharArray();
		ArrayList<Character>[] round = new ArrayList[k];
		for (int i = 0; i < k; i++)
			round[i] = new ArrayList<>();
		for (int i = 0; i < n; i++)
			round[i % k].add(str[i]);

		int ans = 0;
		dp = new int[4][n];
		for (int i = 0; i < 4; i++)
			Arrays.fill(dp[i], -1);
		for (int i = 0; i < k; i++)
			ans += dp(0, i);

		out.println(ans);
		out.close();
	}

	int dp(int last, int idx) {
		if (idx + k >= n) {
			if (str[idx] == 'r') {
				if (last != 3)
					return p;
				return 0;
			}
			else if (str[idx] == 's') {
				if (last != 1)
					return r;
				return 0;
			}
			else if (str[idx] == 'p') {
				if (last != 2)
					return s;
				return 0;
			}
		}
		if (dp[last][idx] != -1)
			return dp[last][idx];

		int max = -1;
		if (str[idx] == 'r') {
			if (last != 3)
				max = max(max, p + dp(3, idx + k));
			max = max(max, dp(1, idx + k));
			max = max(max, dp(2, idx + k));
		}
		else if (str[idx] == 's') {
			if (last != 1)
				max = max(max, r + dp(1, idx + k));
			max = max(max, dp(2, idx + k));
			max = max(max, dp(3, idx + k));
		}
		else if (str[idx] == 'p') {
			if (last != 2)
				max = max(max, s + dp(2, idx + k));
			max = max(max, dp(1, idx + k));
			max = max(max, dp(3, idx + k));
		}
		
		return dp[last][idx] = max;
	}
	
	int abs(int x) { if (x < 0) return -x; return x; }
	long abs(long x) { if (x < 0) return -x; return x; }
	int max(int x, int y) { if (x < y) return y; return x; }
	int min(int x, int y) { if (x > y) return y; return x; }
	long max(long x, long y) { if (x < y) return y; return x; }
	long min(long x, long y) { if (x > y) return y; return x; }

	class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }

		void intArr(int sz, int[] x) { for (int i = 0; i < sz; i++) x[i] = nextInt(); }
		void longArr(int sz, long[] x) { for (int i = 0; i < sz; i++) x[i] = nextLong(); }
		void doubleArr(int sz, double[] x) { for (int i = 0; i < sz; i++) x[i] = nextDouble(); }
	}
}

