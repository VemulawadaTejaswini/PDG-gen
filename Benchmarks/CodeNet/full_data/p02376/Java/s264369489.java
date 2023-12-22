import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		Dinic mf = new Dinic(v);
		for(int i=0;i<e;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			mf.addEdge(a, b, c);
		}
		System.out.println(mf.maximumFlow(0, v-1));
	}
}


//O(V E^2)
class Dinic {
	public static final int INF = 1 << 29;
	private ArrayList<Edge>[] g;
	private int[] it;
	private int[] level;
	@SuppressWarnings("unchecked")
	public Dinic(int n) {
		g = new ArrayList[n];
		for(int i=0;i<n;i++) {
			g[i] = new ArrayList<>();
		}
		it = new int[n];
		level = new int[n];
	}
	public void addEdge(int from,int to,int cap) {
		g[from].add(new Edge(to,cap,g[to].size()));
		g[to].add(new Edge(from,0,g[from].size()-1));
	}
	public void addBidirectionalEdge(int from,int to,int cap) {
		addEdge(from,to,cap);
		addEdge(to,from,cap);
	}
	private void bfs(int s) {
		Arrays.fill(level, -1);
		Queue<Integer> q = new ArrayDeque<>();
		level[s] = 0;
		q.offer(s);
		while(!q.isEmpty()) {
			int v = q.poll();
			for(Edge e: g[v]) {
				if (e.cap > 0 && level[e.to] < 0) {
					level[e.to] = level[v] + 1;
					q.offer(e.to);
				}
			}
		}
	}
	private int dfs(int v,int t,int f) {
		if (v == t) {
			return f;
		}
		for(;it[v]<g[v].size();it[v]++) {
			Edge e = g[v].get(it[v]);
			if (e.cap <= 0 || level[v] >= level[e.to]) {
				continue;
			}
			int d = dfs(e.to,t,Math.min(f,e.cap));
			if (d <= 0) {
				continue;
			}
			e.cap -= d;
			g[e.to].get(e.rev).cap += d;
			return d;
		}
		return 0;
	}
	public int maximumFlow(int s,int t) {
		int flow = 0;
		while(true) {
			bfs(s);
			if (level[t] < 0) {
				return flow;
			}
			Arrays.fill(it, 0);
			int f;
			while((f = dfs(s,t,INF)) > 0) {
				flow += f;
			}
		}
	}
	class Edge {
		int to,cap,rev;
		public Edge(int to,int cap,int rev) {
			this.to = to;
			this.cap = cap;
			this.rev = rev;
		}
	}
}