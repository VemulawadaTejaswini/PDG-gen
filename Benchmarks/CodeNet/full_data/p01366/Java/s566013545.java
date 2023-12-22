import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class Edge {
		int to, dis, cost;
		Edge(int to, int dis, int cost) {
			this.to = to;
			this.dis = dis;
			this.cost = cost;
		}
	}
	
	class Pair implements Comparable<Pair>{
		int index;
		int distance;
		int cost;
		Pair(int i, int d, int c) {
			this.index = i;
			this.distance = d;
			this.cost = c;
		}
		@Override
		public int compareTo(Pair o) {
			return (distance != o.distance) ? distance - o.distance : cost - o.cost;
		}
	}
	
	final int INF = Integer.MAX_VALUE/2;
	List<Edge>[] list;
	int[] d;
	
	int res;
	
	void dijkstra(int s) {
		res = 0;
		int n = list.length;
		d = new int[n];
		boolean[] used = new boolean[n];
		Arrays.fill(d, INF);
		d[s] = 0;
		
		PriorityQueue<Pair> queue = new PriorityQueue<Pair>();
		queue.add(new Pair(s, 0, 0));
		
		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			int v = p.index, c = p.cost;
			if (used[v]) continue;
			used[v] = true;
			res += c;
			for (Edge e : list[v]) {
				if (d[v]+e.dis <= d[e.to]) {
					d[e.to] = d[v] + e.dis;
					queue.add(new Pair(e.to, d[e.to], e.cost));
				}
			}
		}
	}
	
	void addEdge(int u, int v, int d, int c) {
		list[u].add(new Edge(v, d, c));
		list[v].add(new Edge(u, d, c));
	}
	
	@SuppressWarnings("unchecked")
	void run() {
		while (true) {
			int n = sc.nextInt(), m = sc.nextInt();
			if (n == 0 && m == 0) break;
			list = new ArrayList[n];
			for (int i = 0; i < n; i++)
				list[i] = new ArrayList<Edge>();
			
			for (int i = 0; i < m; i++) {
				addEdge(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt(), sc.nextInt());
			}
			dijkstra(0);
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}