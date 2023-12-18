import java.util.*;

public class Main {
	static class MaxFlow {
		//dinic
		public class Edge {
			int to, rev;
			long cap;

			public Edge(int to, long cap, int rev) {
				this.to = to;
				this.cap = cap;
				this.rev = rev;
			}
		}

		int V;
		ArrayList<ArrayList<Edge>> G;
		int[] level;
		int[] iter;
		public final long INF = 100000000000000l;
		
		public MaxFlow(int V) {
			this.V = V;
			G = new ArrayList<ArrayList<Edge>>();
			for(int i=0; i<V; i++)
				G.add(new ArrayList<Edge>());
			level = new int[V];
			iter = new int[V];
		}
		
		public void addEdge(int from, int to, long cap) {
			G.get(from).add(new Edge(to, cap, G.get(to).size()));
			G.get(to).add(new Edge(from, 0, G.get(from).size()-1));
		}
		
		void bfs(int s) {
			Arrays.fill(level, -1);
			Queue<Integer> que = new LinkedList<Integer>();
			level[s] = 0;
			que.add(s);
			while(!que.isEmpty()) {
				int v = que.remove();
				for(int i=0; i<G.get(v).size(); i++) {
					Edge e = G.get(v).get(i);
					if(e.cap>0 && level[e.to]<0) {
						level[e.to] = level[v] + 1;
						que.add(e.to);
					}
				}
			}
		}
		
		long dfs(int v, int t, long f) {
			if(v==t) return f;
			for(; iter[v]<G.get(v).size(); iter[v]++) {
				Edge e = G.get(v).get(iter[v]);
				if(e.cap>0 && level[v] < level[e.to]) {
					long d = dfs(e.to, t, Math.min(f, e.cap));
					if(d>0) {
						e.cap -= d;
						G.get(e.to).get(e.rev).cap += d;
						return d;
					}
				}
			}
			return 0;
		}
		
		long getMaxFlow(int s, int t) {
			long flow = 0;
			while(true) {
				bfs(s);
				if(level[t]<0)
					return flow;
				
				Arrays.fill(iter, 0);
				long f;
				while((f = dfs(s, t, INF)) > 0) {
					flow += f;
				}
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final long INF = 100000000000000l;
		
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();
		
		MaxFlow mf = new MaxFlow(N+2);
		int s = N;
		int t = s+1;
		long sum = 0;
		for(int i=0; i<N; i++) {
			if(a[i]>0) {
				sum += a[i];
				mf.addEdge(i, t, a[i]);
			} else {
				mf.addEdge(s, i, -a[i]);
			}
			for(int j=i+(i+1); j<N; j+=(i+1)) {
				mf.addEdge(i, j, INF);
			}
		}
		
		System.out.println(sum - mf.getMaxFlow(s, t));
		sc.close();
	}
}
