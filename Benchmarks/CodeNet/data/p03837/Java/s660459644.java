import java.*;

public class Main {
	public static final int inf = 1000000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] in = new int[m][3];//from to cost
		int[][] sp = new int[n][n];
		int ans_ = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sp[i][j] = inf;
			}
		}

		for (int i = 0; i < m; i++) {
			in[i][0] = sc.nextInt()-1;
			in[i][1] = sc.nextInt()-1;
			in[i][2] = sc.nextInt();
			sp[in[i][0]][in[i][1]] = in[i][2];
			sp[in[i][1]][in[i][0]] = in[i][2];
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sp[i][j] = Math.min(sp[i][j], sp[i][k]+sp[k][j]);
				}
			}
		}

		Dijkstra d = new Dijkstra(n);
		int[] dist1 = new int[n];
		int[] dist2 = new int[n];
		for (int i = 0; i < m; i++) d.addNode(in[i][0],in[i][1],in[i][2]);
		for (int i = 0; i < m; i++) {
			d.initialize();
			d.dijkstra(in[i][0]);
			dist1 = d.dist.clone();

			d.initialize();
			d.dijkstra(in[i][1]);
			dist2 = d.dist.clone();
			System.out.println();
			OUT:for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if(j != k) {
						if(dist1[j]+in[i][2]+dist2[k] == sp[j][k]) {
							ans_++;
							break OUT;
						}
					}
				}
			}
		}
		System.out.println(m-ans_);
	}

	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

	public static class Dijkstra {

		Node[] list;
		int[] dist;

		public Dijkstra(int n) {
			list = new Node[n];
			dist = new int[n];
			for (int i = 0; i < list.length; i++) {
				list[i] = new Node();
				dist[i] = inf;
			}
		}

		public void dijkstra(int s) {
			dist[s] = 0;
			PriorityQueue<Pair> que = new PriorityQueue<Pair>(
					new Comparator<Pair>(){
						public int compare(Pair a, Pair b) {
							return b.getDist()-a.getDist();
						}
					}
					);
			Pair p = new Pair(s, dist[s]);
			que.add(p);
			while(!que.isEmpty()) {
				p = que.poll();
				int v = p.getVer();
				if(dist[v] < p.getDist()) continue;
				for (int i = 0; i < list[v].size(); i++) {
					Edge e = list[v].get(i);
					if(dist[e.to] > dist[v] + e.cost) {
						dist[e.to] = dist[v] + e.cost;
						que.add(new Pair(e.to, dist[e.to]));
					}
				}
			}
		}

		public void initialize() {
			Arrays.fill(dist, inf);
			return;
		}

		public void addNode(int from, int to, int cost) {//
			Edge e = new Edge(to, cost);
			Edge e_reverse = new Edge(from, cost);
			list[from].addEdge(e);
			list[to].addEdge(e_reverse);
		}

		class Node{
			ArrayList<Edge> edges;
			public Node() {
				edges = new ArrayList<Edge>();
			}
			public void addEdge(Edge e) {
				edges.add(e);
			}
			public int size() {
				return edges.size();
			}
			public Edge get(int i) {
				return edges.get(i);
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

		class Pair{
			private ArrayList<Integer> pair;
			public Pair(int from, int distance) {
				pair = new ArrayList<Integer>();
				pair.add(from);
				pair.add(distance);
			}
			public int getVer() {
				return pair.get(0);
			}
			public int getDist() {
				return pair.get(1);
			}
		}
	}
}