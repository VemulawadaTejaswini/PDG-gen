import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void solve(int V, int E, int[][] cap, int[][] flow, int s, int t) {
		int tot = 0;
		while (true) {
			int[] pre = new int[V];
			Arrays.fill(pre, -1);
			ArrayDeque<Integer> que = new ArrayDeque<>();
			que.add(s);
			out: while (!que.isEmpty()) {
				int cur = que.poll();
				for (int dst = 0; dst < V; ++dst) {
					if (cap[cur][dst] - flow[cur][dst] <= 0)
						continue;
					if (pre[dst] != -1 && dst != s)
						continue;
					pre[dst] = cur;
					if (dst == t)
						break out;
					que.add(dst);
				}
			}
			if (pre[t] == -1)
				break;
			int inc = Integer.MAX_VALUE / 16;
			for (int i = t; i != s; i = pre[i]) {
				inc = Math.min(inc, cap[pre[i]][i] - flow[pre[i]][i]);
			}
			for (int i = t; i != s; i = pre[i]) {
				flow[pre[i]][i] += inc;
				flow[i][pre[i]] -= inc;
			}
			tot += inc;
		}
		System.out.println(tot);

	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int[][] cap = new int[V][V];
		int[][] flow = new int[V][V];
		for (int i = 0; i < E; ++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int c = sc.nextInt();
			cap[u][v] = c;
		}
		int s = 0;
		int t = V - 1;

		solve(V, E, cap, flow, s, t);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}