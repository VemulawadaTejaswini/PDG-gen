import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Edge {
	int from, to, cost;

	public Edge(int from, int to, int cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}
}

public class Main {
	static final int SIZE = 2505;
	static final int INF = Integer.MAX_VALUE / 2;
	static List<List<Integer>> to = new ArrayList<>();
	static List<List<Integer>> rto = new ArrayList<>();
	static boolean[] reachableFromI = new boolean[SIZE];
	static boolean[] reachableToN = new boolean[SIZE];
	static boolean[] ok = new boolean[SIZE];

	static void dfs(int v) {
		if (reachableFromI[v]) return;
		reachableFromI[v] = true;
		for (int u : to.get(v)) {
			dfs(u);
		}
	}

	static void rdfs(int v) {
		if (reachableToN[v]) return;
		reachableToN[v] = true;
		for (int u : rto.get(v)) {
			rdfs(u);
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			ArrayList<Edge> edges = new ArrayList<>();
			for (int i = 0; i < SIZE; i++) {
				to.add(new ArrayList<>());
				rto.add(new ArrayList<>());
			}
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int c = -(sc.nextInt() - p);
				edges.add(new Edge(a, b, c));
				to.get(a).add(b);
				rto.get(b).add(a);
			}
			dfs(0);
			rdfs(n - 1);
			for (int i = 0; i < n; i++) {
				ok[i] = reachableFromI[i] && reachableToN[i];
			}

			int[] d = new int[n];
			Arrays.fill(d, INF);
			d[0] = 0;
			boolean upd = true;
			int step = 0;
			while (upd) {
				upd = false;
				for (int i = 0; i < m; i++) {
					Edge edge = edges.get(i);
					int c = edge.cost;
					if (!ok[edge.from] || !ok[edge.to]) continue;
					int newD = d[edge.from] + c;
					if (newD < d[edge.to]) {
						upd = true;
						d[edge.to] = newD;
					}
				}
				step++;
				if (step > n) {
					System.out.println("-1");
					return;
				}
			}
			int ans = -d[n - 1];
			System.out.println(Math.max(0, ans));
		}
	}
}