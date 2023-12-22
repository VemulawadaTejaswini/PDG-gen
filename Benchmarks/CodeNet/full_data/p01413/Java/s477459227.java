import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	int INF = 1 << 30;

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();// the number of cities
		int M = sc.nextInt();// the number of goods
		int W = sc.nextInt();
		int T = sc.nextInt();
		String[] s = new String[M];
		int[] v = new int[M];
		int[] p = new int[M];
		Map<String, Integer> ref = new HashMap<>();

		for (int i = 0; i < M; i++) {
			s[i] = sc.next();// name
			ref.put(s[i], i);
			v[i] = sc.nextInt();// weight
			p[i] = sc.nextInt();// price at (0,0)
		}
		int[] x = new int[N + 1];
		int[] y = new int[N + 1];
		int[][] item = new int[N][M];
		for (int i = 0; i < N; i++) {
			Arrays.fill(item[i], INF);
			int L = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			while (L-- != 0) {
				int id = ref.get(sc.next());
				item[i][id] = sc.nextInt();// price
			}
		}
		int[][] adj = new int[N + 1][N + 1];
		for (int i = 0; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				adj[i][j] = adj[j][i] = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
			}
		}
		int[][] dist = new int[(1 << N)][N];
		for (int S = 1; S < (1 << N); S++) {
			for (int last = 0; last < N; last++) {
				if (((S >> last) & 1) == 1) {
					int ns = S - (1 << last);
					if (ns == 0) {
						dist[S][last] = adj[last][N];
					} else {
						int min = INF;
						for (int j = 0; j < N; j++) {
							if (((ns >> j) & 1) == 1) {
								min = Math.min(min, dist[ns][j] + adj[j][last]);
							}
						}
						dist[S][last] = min;
					}
				}
			}
		}
		int[] bestTime = new int[1 << N];
		for (int S = 1; S < 1 << N; S++) {
			int min = INF;
			for (int i = 0; i < N; i++) {
				if (((S >> i) & 1) == 1)
					min = Math.min(min, dist[S][i] + adj[i][N]);
			}
			bestTime[S] = min;
		}
		int[] bestShell = new int[1 << N];
		int[] c = new int[M];
		int[] ws = new int[W + 1];
		for (int V = 1; V < 1 << N; V++) {
			Arrays.fill(ws, 0);
			Arrays.fill(c, INF);
			for (int i = 0; i < N; i++) {
				if (((V >> i) & 1) == 1) {
					for (int j = 0; j < M; j++) {
						c[j] = Math.min(c[j], item[i][j]);
					}
				}
			}
			for (int i = 0; i < M; i++) {
				c[i] = Math.max(0, p[i] - c[i]);
			}
			for (int i = 1; i <= W; i++) {
				for (int j = 0; j < M; j++) {
					if (v[j] <= i) {
						ws[i] = Math.max(ws[i], ws[i - v[j]] + c[j]);
						bestShell[V] = Math.max(bestShell[V], ws[i]);
					}
				}
				// bestShell[V] = ws[V];
			}
		}
		long ans = 0;
		long[] dp = new long[T + 1];
		for (int t = 1; t <= T; t++) {
			for (int V = 1; V < 1 << N; V++) {
				if (bestTime[V] <= t) {
					dp[t] = Math.max(dp[t], dp[t - bestTime[V]] + bestShell[V]);
				}
			}
			ans = Math.max(ans, dp[t]);
		}
		System.out.println(dp[T]);
	}
}