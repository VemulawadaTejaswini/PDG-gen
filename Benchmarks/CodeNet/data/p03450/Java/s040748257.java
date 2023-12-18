
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

		// solve
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
		Queue<List<Vertex>> q = new ArrayDeque<>();

		for (int from = 1; from <= n; from++) {
			if (visited[from]) {
				continue;
			}
			visited[from] = true;
			dist[from] = 0;
			q.add(G.get(from));

			while (!q.isEmpty()) {
				List<Vertex> toList = q.remove();
				int fromNode = G.indexOf(toList);
				for (Vertex vertex : toList) {
					int v = vertex.nodeNumber;
					int d = vertex.weight;

					if (!visited[v]) {
						visited[v] = true;
						dist[v] = dist[fromNode] + d;
						q.add(G.get(v));
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
