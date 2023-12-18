import java.io.*;
import java.util.*;

class Main {

	private static List<Integer>[] G;

	private static List<Integer> bfs(int v) {
		int n = G.length;
		int[] prev = new int[n];
		int[] dist = new int[n];
		Arrays.fill(prev, -1);
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[v] = 0;

		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		while (!q.isEmpty()) {
			int x = q.poll();
			for (int nx : G[x]) {
				if (dist[nx] != Integer.MAX_VALUE) continue;
				prev[nx] = x;
				dist[nx] = dist[x] + 1;
				q.offer(nx);
			}
		}

		int id = -1, d = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (i == v) continue;
			for (int nx : G[i]) {
				if (nx == v && dist[i] < d) {
					d = dist[i];
					id = i;
				}
			}
		}

		List<Integer> a = new ArrayList<>();

		if (d == Integer.MAX_VALUE) return a;
		for (int i = id; i != -1; i = prev[i]) {
			a.add(i);
		}

		return a;
	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		G = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			G[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			G[a].add(b);
		}

		List<Integer> answer = new ArrayList<>();
		for (int v = 0; v < N; v++) {
			List<Integer> x = bfs(v);
			if (!x.isEmpty()) {
				if (answer.isEmpty()) answer = x;
				else if (x.size() < answer.size()) answer = x;
			}
		}

		if (answer.isEmpty()) {
			System.out.println(-1);
			return;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(answer.size()).append("\n");
		for (Integer a : answer) sb.append(a + 1).append("\n");
		System.out.print(sb.toString());
	}
}
