import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int V = Integer.parseInt(str[0]);
		int E = Integer.parseInt(str[1]);

		ArrayList<ArrayList<Edge>> edges = new ArrayList<>();

		for (int i = 0; i < V; i++) {
			edges.add(new ArrayList<>());
		}

		for (int i = 0; i < E; i++) {
			str = br.readLine().split(" ");
			int s = Integer.parseInt(str[0]);
			int t = Integer.parseInt(str[1]);
			int w = Integer.parseInt(str[2]);

			edges.get(s).add(new Edge(t, w));
			edges.get(t).add(new Edge(s, w));
		}

		int sum = prime(edges, V);
		System.out.println(sum);
	}

	static int prime(ArrayList<ArrayList<Edge>> edges, int n) {
		boolean[] done = new boolean[n]; // 訪問フラグ

		Queue<Edge> q = new PriorityQueue<Edge>();
		q.add(new Edge(0, 0)); // ０から(ダミー)

		int totalCost = 0; // 最小全域木の重み
		while (!q.isEmpty()) {
			Edge e = q.poll(); // 最小コストの辺を取り出す
			if (done[e.to]) {
				continue;
			}

			done[e.to] = true; // 訪問済にする
			totalCost += e.cost;
			q.addAll(edges.get(e.to)); // 隣接しているすべての辺を追加
		}

		return totalCost;
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
