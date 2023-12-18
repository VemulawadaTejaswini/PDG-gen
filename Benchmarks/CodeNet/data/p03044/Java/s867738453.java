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

		int n = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Edge>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			String str[] = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]) - 1;
			int v = Integer.parseInt(str[1]) - 1;
			int w = Integer.parseInt(str[2]);

			list.get(u).add(new Edge(v, w));
			list.get(v).add(new Edge(u, w));
		}

		int dist[] = dijkstra(n, list, 0, n);
		int color[] = new int[n];
		color[0] = 0;
		System.out.println("0");

		for (int i = 1; i < n; i++) {
			if (dist[i] % 2 == 0) {
				System.out.println(color[0]);
			} else {
				System.out.println(1 - color[0]);
			}
		}
	}

	static int[] dijkstra(int n, ArrayList<ArrayList<Edge>> edges, int s, int g) {
		int[] distance = new int[n]; // 始点からの最短距離

		Arrays.fill(distance, Integer.MAX_VALUE); // 各頂点までの距離を初期化(INF 値)
		distance[s] = 0; // 始点の距離は０

		Queue<Edge> q = new PriorityQueue<Edge>();
		q.add(new Edge(s, 0)); // 始点を入れる

		while (!q.isEmpty()) {
			Edge e = q.poll(); // 最小距離(cost)の頂点を取り出す
			if (distance[e.to] < e.cost) {
				continue;
			}

			// 隣接している頂点の最短距離を更新する
			for (Edge v : edges.get(e.to)) {
				if (distance[v.to] > distance[e.to] + v.cost) { // (始点～)接続元＋接続先までの距離
					distance[v.to] = distance[e.to] + v.cost; // 現在記録されている距離より小さければ更新
					q.add(new Edge(e.to, distance[v.to])); // 始点～接続先までの距離
				}

			}
		}

		return distance; // 到達できなかったときは、INF となる
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
