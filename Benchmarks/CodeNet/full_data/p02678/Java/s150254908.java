import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

//候補クラス
class Candidate implements Comparable<Candidate> {
	int d; // 距離
	int v; // 頂点

	Candidate(int v, int d) {
		this.d = d;
		this.v = v;
	}

	// 距離が短いほど優先する
	@Override
	public int compareTo(Candidate o) {
		return d - o.d;
	}
}

//辺クラス
class Edge {
	int to; // どの頂点へ伸びているか
	int cost; // 距離

	Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
}

public class Main {
	static List<List<Edge>> G; // 隣接リストで表現したグラフ
	static int[] dist; // 最短距離（仮定も含む）
	static int[] prev; // 最短距離（仮定も含む）
	static int INF = Integer.MAX_VALUE / 2;

	static void dijkstra(int sv) {
		Arrays.fill(dist, INF);
		dist[sv] = 0;
		Queue<Candidate> candidates = new PriorityQueue<Candidate>();
		candidates.offer(new Candidate(sv, 0)); // 最初に始点と距離0の候補を入れておく
		while (!candidates.isEmpty()) {
			Candidate c = candidates.poll();
			int v = c.v;
			int d = c.d;
			if (dist[v] < d) {
				continue;
			}
			List<Edge> edges = G.get(v);
			for (Edge e : edges) {
				if (dist[e.to] > dist[v] + e.cost) {
					dist[e.to] = dist[v] + e.cost;
					prev[e.to] = v;
					candidates.offer(new Candidate(e.to, dist[e.to]));
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		G = new ArrayList<List<Edge>>();
		for (int i = 0; i < N; i++) {
			G.add(new ArrayList<Edge>());
		}

		for (int j = 0; j < M; j++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			G.get(a).add(new Edge(b, 1));
			G.get(b).add(new Edge(a, 1));

		}
		dist = new int[N];
		prev = new int[N];
		dijkstra(0);
//		for (int i = 0; i < N; i++) {
//			System.out.print(dist[i] + " ");
//		}
//		System.out.println();
		System.out.println("Yes");
		for (int i = 1; i < N; i++) {
			System.out.println((prev[i] + 1));
		}
//		System.out.println();
	}
}
