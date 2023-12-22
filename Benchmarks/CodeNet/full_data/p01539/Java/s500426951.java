import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private final int[] DX = { 0, 1, 1, 0, -1, -1 };
	private final int[] EDY = { 1, 0, -1, -1, -1, 0 };// x座標が偶数の時のyの変化量
	private final int[] ODY = { 1, 1, 0, -1, 0, 1 };// x座標が奇数の時のyの変化量
	private final int MAX = 105;
	private final int WIDTH = MAX * 2 + 1;

	public void solve() {
		Scanner scanner = new Scanner(System.in);
		int[] s = new int[2];
		int[] g = new int[2];
		for (int i = 0; i < 2; i++) {
			s[i] = scanner.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			g[i] = scanner.nextInt();
		}

		int n = scanner.nextInt();
		boolean[][] unreachable = new boolean[WIDTH][WIDTH];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt() + MAX;
			int y = scanner.nextInt() + MAX;
			unreachable[x][y] = true;
		}

		int limx = scanner.nextInt();
		int limy = scanner.nextInt();
		scanner.close();

		int N = WIDTH * WIDTH * 6;
		Graph graph = new Graph(N);

		for (int x = -limx; x <= limx; x++) {
			for (int y = -limy; y <= limy; y++) {
				if (unreachable[x + MAX][y + MAX]) {
					continue;// 家具がある場所は調べない
				}
				for (int t = 0; t < 6; t++) {
					int from = getVertex(x, y, t);
					int d = Math.abs(x * y * t) % 6;// 指示された方向

					for (int dir = 0; dir < 6; dir++) {
						// 方向dirで隣接するマス
						int nx = x + DX[dir];
						int ny = y + EDY[dir];
						if (Math.abs(x) % 2 != 0) {
							ny = y + ODY[dir];
						}

						// 領域外には移動できない
						if (Math.abs(nx) > limx || Math.abs(ny) > limy) {
							continue;
						}

						// 家具があったら移動できない
						if (unreachable[nx + MAX][ny + MAX]) {
							continue;
						}

						int to = getVertex(nx, ny, t + 1);
						if (dir == d) {
							graph.addEdge(from, to, 0);// 指示通りならコスト0
						} else {
							graph.addEdge(from, to, 1);// 指示を無視する時はコスト1
						}
					}
					int to = getVertex(x, y, t + 1);
					graph.addEdge(from, to, 1);// 留まる場合はコスト1
				}
			}
		}

		int start = getVertex(s[0], s[1], 0);
		long[] minDists = graph.minDistDijkstra(start);
		long ans = Integer.MAX_VALUE;

		// 各tについて最小のコストを調べる
		for (int t = 0; t < 6; t++) {
			int goal = getVertex(g[0], g[1], t);
			ans = Math.min(ans, minDists[goal]);
		}
		if (ans >= Integer.MAX_VALUE) {
			System.out.println(-1);
			return;
		}
		System.out.println(ans);
	}

	private int getVertex(int x, int y, int t) {
		// 座標を1つにする
		int nx = x + MAX;
		int ny = y + MAX;
		t %= 6;
		return t * WIDTH * WIDTH + nx * WIDTH + ny;
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}

class Graph {
	public static final long INF = Long.MAX_VALUE / 2;
	int n;
	ArrayList<Edge>[] graph;

	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		this.graph = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<Edge>();
		}
	}

	public void addBidirectionalEdge(int from, int to, int cost) {
		addEdge(from, to, cost);
		addEdge(to, from, cost);
	}

	public void addEdge(int from, int to, int cost) {
		graph[from].add(new Edge(to, cost));
	}

	// dijkstra O(ElogV)
	public long[] minDistDijkstra(int start) {
		long[] dist = new long[n];
		Arrays.fill(dist, INF);
		dist[start] = 0;

		PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>();
		priorityQueue.offer(new Node(0, start));

		while (!priorityQueue.isEmpty()) {
			// キューから1番距離の近いノードを取り出す
			Node node = priorityQueue.poll();
			int v = node.id;
			if (dist[v] < node.dist) {
				// 暫定の最短距離よりも遠かったらスルー
				continue;
			}

			for (Edge e : graph[v]) {
				// 取り出したノードから出ている全ての辺について調べ、
				// 暫定の最短距離が更新される場合は更新してキューに入れる
				if (dist[e.to] > dist[v] + e.cost) {
					dist[e.to] = dist[v] + e.cost;
					priorityQueue.add(new Node(dist[e.to], e.to));
				}
			}
		}
		return dist;
	}

}

class Edge {
	int to;
	int cost;

	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
}

class Node implements Comparable<Node> {
	long dist;
	int id;

	public Node(long dist, int i) {
		this.dist = dist;
		this.id = i;
	}

	public int compareTo(Node o) {
		if (this.dist > o.dist) {
			return 1;
		} else if (this.dist < o.dist) {
			return -1;
		} else {
			return 0;
		}
	}
}