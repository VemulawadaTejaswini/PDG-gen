import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer>[] g = new ArrayList[n + 1];
		for (int i = 0; i < g.length; i++) {
			g[i] = new ArrayList<>();
		}

		long[][] ws = new long[n + 1][n + 1];
		for (int i = 0; i < ws.length; i++) {
			Arrays.fill(ws[i], Integer.MAX_VALUE);
			ws[i][i] = 0;
		}

		for (int i = 0; i < n - 1; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			long w = sc.nextLong();
			g[u].add(v);
			g[v].add(u);
			ws[u][v] = w;
			ws[v][u] = w;
		}


		//for (int i = 0; i < n; i++) {
		//	for (int j = 0; j < n; j++) {
		//		System.out.print(ws[i][j]);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//}

		int[] a = new int[n];
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> r = new LinkedList<>();
		q.offer(0);

		boolean[] visited = new boolean[n];
		while (!q.isEmpty()) {
			int current = 0;
			while (!q.isEmpty()) {
				int p = q.poll();
				//System.out.print("q ");
				//System.out.println(p);
				if (visited[p]) continue;
				visited[p] = true;

				a[p] = current;
				for (int i = 0; i < g[p].size(); i++) {
					int x = g[p].get(i);
					if (visited[x]) continue;
					if (ws[p][x] % 2L == 0) q.offer(x);
					else r.offer(x);
				}
			}

			current = 1;
			while (!r.isEmpty()) {
				int p = r.poll();
				//System.out.print("r ");
				//System.out.println(p);
				if (visited[p]) continue;
				visited[p] = true;

				a[p] = current;
				for (int i = 0; i < g[p].size(); i++) {
					int x = g[p].get(i);
					if (visited[x]) continue;
					if (ws[p][x] % 2L == 0) r.offer(x);
					else q.offer(x);
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
