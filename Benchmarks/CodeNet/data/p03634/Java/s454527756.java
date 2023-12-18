import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

	private static List<long[]>[] g;
	private static long[] cost;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		g = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			long c = sc.nextLong();
			g[a].add(new long[]{b, c});
			g[b].add(new long[]{a, c});
		}

		int Q = sc.nextInt();
		int K = sc.nextInt() - 1;

		cost = new long[N];
		Arrays.fill(cost, Long.MAX_VALUE);
		dfs(K, -1, 0);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Q; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			sb.append(cost[x] + cost[y]).append("\n");
		}

		System.out.print(sb.toString());
	}

	private static void dfs(int v, int from, long c) {
		cost[v] = c;
		for (long[] i : g[v]) {
			if (i[0] == from) continue;
			if (cost[(int) i[0]] != Long.MAX_VALUE) continue;
			dfs((int) i[0], v, c + i[1]);
		}
	}
}
