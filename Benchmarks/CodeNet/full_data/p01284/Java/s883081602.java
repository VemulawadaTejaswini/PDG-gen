import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int T = sc.nextInt();
			if (T == 0) break;
			int[] t = new int[T];
			for (int i = 0; i < T; ++i) {
				t[i] = sc.nextInt();
			}
			int N = sc.nextInt();
			Event[] ev = new Event[N];
			for (int i = 0; i < N; ++i) {
				int d = sc.nextInt();
				int m = sc.nextInt();
				ev[i] = new Event(d, m);
			}
			Arrays.sort(ev);
			final int INF = 1 << 30;
			int[][] dp = new int[101][T];
			for (int[] a : dp) {
				Arrays.fill(a, INF);
			}
			dp[0][T - 1] = 0;
			int ep = 0;
			for (int i = 1; i <= 100; ++i) {
				if (ep < N && ev[ep].d == i) {
					int m = ev[ep].m;
					for (int j = 0; j < T; ++j) {
						if (t[(j + 1) % T] <= m) dp[i][(j + 1) % T] = Math.min(dp[i][(j + 1) % T], dp[i - 1][j]);
						dp[i][0] = Math.min(dp[i][0], dp[i - 1][j] + 1);
					}
					++ep;
				} else {
					for (int j = 0; j < T; ++j) {
						dp[i][(j + 1) % T] = Math.min(dp[i][(j + 1) % T], dp[i - 1][j]);
						dp[i][0] = Math.min(dp[i][0], dp[i - 1][j] + 1);
					}
				}
			}
			int ans = INF;
			for (int i = 0; i < T; ++i) {
				ans = Math.min(ans, dp[100][i]);
			}
			System.out.println(ans);
		}
	}

	static class Event implements Comparable<Event> {
		int d, m;

		public Event(int d, int m) {
			this.d = d;
			this.m = m;
		}

		public int compareTo(Event o) {
			return this.d - o.d;
		}
	}

}