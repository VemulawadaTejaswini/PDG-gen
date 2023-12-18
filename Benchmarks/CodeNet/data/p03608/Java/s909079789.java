import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int R = Integer.parseInt(str[2]);

		int r[] = new int[R];
		str = br.readLine().split(" ");
		for (int i = 0; i < R; i++) {
			r[i] = Integer.parseInt(str[i]);
		}

		ArrayList<ArrayList<Edge>> edges = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			edges.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			int c = Integer.parseInt(str[2]);

			edges.get(a).add(new Edge(b, c));
			edges.get(b).add(new Edge(a, c));
		}

		int ans = 0;

		for (int i = 0; i < R; i++) {
			int dist[] = dijkstra(edges, N, r[i] - 1);
			int max = 0;
			for (int j = 0; j < dist.length; j++) {
				max = Math.max(max, dist[j]);
			}
			ans = Math.max(max, ans);
		}
		System.out.println(ans);
	}

	static int[] dijkstra(ArrayList<ArrayList<Edge>> edgeList, int n, int s) {
		int dist[] = new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE);

		boolean[] fixed = new boolean[n];
		Arrays.fill(fixed, false);

		dist[s] = 0;

		Queue<Edge> queue = new PriorityQueue<>();
		queue.add(new Edge(s, 0));

		while (!queue.isEmpty()) {
			int now = queue.poll().to;

			if (!fixed[now])
				fixed[now] = true;

			for (Edge e : edgeList.get(now)) {
				int w = e.cost;
				int newLen = dist[now] + w;
				if (newLen < dist[e.to]) {
					dist[e.to] = newLen;
					queue.add(new Edge(e.to, dist[e.to]));
				}
			}
		}
		return dist;
	}
}

class Edge implements Comparable<Edge> {
	int to;
	int cost;

	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge e) {
		return this.cost - e.cost;
	}
}