
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int n, m;

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		List<List<Vertex>> G = new ArrayList<>();
		n = in.nextInt();
		m = in.nextInt();
		for (int i = 0; i <= n; i++) {
			List<Vertex> v = new ArrayList<>();
			G.add(v);
		}

		// グラフを構成
		for (int i = 0; i < m; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			int d = in.nextInt();
			G.get(l).add(new Vertex(r, d));
			G.get(r).add(new Vertex(l, (-1)*d));
		}

		// 各ノードから全探索(bfs)
		int[] dist = new int[n+1];
		boolean[] visited = new boolean[n+1];
		Queue<Integer> q = new ArrayDeque<>();

		for (int from = 1; from <= n; from++) {
			if (visited[from]) {
				continue;
			}
			visited[from] = true;
			dist[from] = 0;
			q.add(from);

			while (!q.isEmpty()) {
				int fromNode = q.remove();
				List<Vertex> toList = G.get(fromNode);
				for (Vertex vertex : toList) {
					int v = vertex.nodeNumber;
					int d = vertex.weight;

					if (!visited[v]) {
						visited[v] = true;
						dist[v] = dist[fromNode] + d;
						q.add(v);
					} else if (dist[v] != dist[fromNode] + d) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}

	static class Vertex {
		int nodeNumber;
		int weight;

		public Vertex(int nodeNumber, int weight) {
			this.nodeNumber = nodeNumber;
			this.weight = weight;
		}
	}

}
