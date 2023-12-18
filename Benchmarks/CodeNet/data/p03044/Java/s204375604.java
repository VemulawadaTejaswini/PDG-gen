import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < g.length; i++) {
			g[i] = new ArrayList<>();
		}

		int[][] ws = new int[n][n];
		for (int i = 0; i < ws.length; i++) {
			Arrays.fill(ws[i], Integer.MAX_VALUE);
		}

		for (int i = 0; i < n - 1; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			int w = (int) (sc.nextLong() % 2);

			if (u < 0 || u >= g.length || v < 0 || v >= g.length) {
				for (int x = 0; x < n; x++) {
					System.out.println(1);
				}
				return;
			}

			g[u].add(v);
			g[v].add(u);
			ws[u][v] = w;
			ws[v][u] = w;
		}

		int[] a = new int[n];
		boolean[] visited = new boolean[n];
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> r = new LinkedList<>();
		q.offer(0);

		while (!q.isEmpty()) {
			while (!q.isEmpty()) {
				Integer p = q.poll();
				if (p == null || p < 0 || p >= visited.length) {
					for (int i = 0; i < n; i++) {
						System.out.println(1);
					}
					return;
				}
				if (visited[p]) continue;
				visited[p] = true;
				a[p] = 0;
				for (Integer x : g[p]) {
					if (!visited[x]) {
						if (ws[p][x] == 0) {
							q.offer(x);
						} else {
							r.offer(x);
						}
					}
				}
			}

			while (!r.isEmpty()) {
				Integer p = r.poll();
				if (p == null || p < 0 || p >= visited.length) {
					for (int i = 0; i < n; i++) {
						System.out.println(1);
					}
					return;
				}
				if (visited[p]) continue;
				visited[p] = true;

				a[p] = 1;
				for (Integer x : g[p]) {
					if (!visited[x]) {
						if (ws[p][x] == 0) {
							r.offer(x);
						} else {
							q.offer(x);
						}
					}
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
