import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Graph g = new Graph(n);
		for(int i=0;i<m;i++) {
			String[] s = sc.next().split(",");
			int a = Integer.valueOf(s[0]) - 1;
			int b = Integer.valueOf(s[1]) - 1;
			int c = Integer.valueOf(s[2]);
			int d = Integer.valueOf(s[3]);
			g.addEdge(a, b, c);
			g.addEdge(b, a, d);
		}
		String[] s = sc.next().split(",");
		int x1 = Integer.valueOf(s[0]) - 1;
		int x2 = Integer.valueOf(s[1]) - 1;
		int y1 = Integer.valueOf(s[2]);
		int y2  = Integer.valueOf(s[3]);
		System.out.println(y1-y2-g.minDistDijkstra(x1)[x2]-g.minDistDijkstra(x2)[x1]);
	}

}
class Graph {
	public static final int INF = 1<<29;
	int n;
	ArrayList<Edge>[] graph;

	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		this.graph = new ArrayList[n];
		for(int i=0;i<n;i++) {
			graph[i] = new ArrayList<Edge>();
		}
	}

	public void addBidirectionalEdge(int from,int to,int cost) {
		addEdge(from,to,cost);
		addEdge(to,from,cost);
	}
	public void addEdge(int from,int to,int cost) {
		graph[from].add(new Edge(to, cost));
	}

	//dijkstra O(ElogV)
	public int[] minDistDijkstra(int s) {
		int[] dist = new int[n];
		Arrays.fill(dist, INF);
		dist[s] = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.offer(new Node(0, s));
		while(!q.isEmpty()) {
			Node node = q.poll();
			int v = node.id;
			if (dist[v] < node.dist) {
				continue;
			}
			for(Edge e:graph[v]) {
				if (dist[e.to] > dist[v] + e.cost) {
					dist[e.to] = dist[v] + e.cost;
					q.add(new Node(dist[e.to], e.to));
				}
			}
		}
		return dist;
	}

	class Edge {
		int to;
		int cost;
		public Edge(int to,int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	class Node implements Comparable<Node>{
		int dist;
		int id;
		public Node(int dist,int i) {
			this.dist = dist;
			this.id = i;
		}
		public int compareTo(Node o) {
			return (this.dist < o.dist) ? -1 : ((this.dist == o.dist) ? 0 : 1);
		}
	}
}