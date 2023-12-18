import java.util.*;

public class Main {

	static final int mod = 998244353;

	static class Point {
		int x, d;

		public Point(int x, int d) {
			this.x = x;
			this.d = d;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			int d = sc.nextInt();
			map.put(x, d);
		}
		sc.close();
		Point robot[] = new Point[n];
		int i = 0;
		for (int key : map.keySet())
			robot[i++] = new Point(key, map.get(key));
		int r[] = new int[n];
		r[n - 1] = n - 1;
		for (i = n - 2; i >= 0; --i) {
			int rr = i;
			int x = robot[i].x + robot[i].d;
			while (rr + 1 < n && x > robot[rr + 1].x) {
				rr = r[rr + 1];
			}
			r[i] = rr;
		}
		int dp[] = new int[n + 1];
		dp[n] = 1 % mod;
		for (i = n - 1; i >= 0; --i) {
			int rr = r[i];
			int next = dp[i + 1] + dp[rr + 1];
			dp[i] = next % mod;
		}
		int ans = dp[0];
		System.out.println(ans);
	}
}
