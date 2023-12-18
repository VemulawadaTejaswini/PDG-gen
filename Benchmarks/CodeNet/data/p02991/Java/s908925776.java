import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int v = sc.nextInt() - 1;
			int u = sc.nextInt() - 1;
			g[v].add(u);
		}
		int s = sc.nextInt() - 1;
		int t = sc.nextInt() - 1;
		int[][] d = new int[n][3];
		for (int i = 0; i < d.length; i++) {
			Arrays.fill(d[i], Integer.MAX_VALUE);
		}

		d[s][0] = 0;
		d[s][1] = 0;
		d[s][2] = 0;
		boolean[] visited = new boolean[n];
		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		while (!q.isEmpty()) {
			int v = q.poll();
			if (visited[v]) continue;
			visited[v] = true;

			for (int i = 0; i < g[v].size(); i++) {
				int x = g[v].get(i);
				if (d[x][1] == Integer.MAX_VALUE) d[x][1] = d[v][0] + 1;
				if (d[x][2] == Integer.MAX_VALUE) d[x][2] = d[v][1] + 1;
				if (d[x][0] == Integer.MAX_VALUE) d[x][0] = d[v][2] + 1;
				q.offer(x);
			}
		}

		if (!visited[t]) {
			System.out.println(-1);
			return;
		}

		System.out.println(d[t][0]);
	}
}
