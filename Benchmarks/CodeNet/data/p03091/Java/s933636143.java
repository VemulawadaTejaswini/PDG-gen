import java.util.*;

public class Main {
	static class MaxFlow {
		//dinic
		public class Edge {
			int to, rev;
			int cap;

			public Edge(int to, int cap, int rev) {
				this.to = to;
				this.cap = cap;
				this.rev = rev;
			}
		}
		double delta = 1e-15;

		int V;
		ArrayList<ArrayList<Edge>> G;
		int[] level;
		int[] iter;
		public final int INF = 1000000000;
		
		public MaxFlow(int V) {
			this.V = V;
			G = new ArrayList<ArrayList<Edge>>();
			for(int i=0; i<V; i++)
				G.add(new ArrayList<Edge>());
			level = new int[V];
			iter = new int[V];
		}
		
		public void addEdge(int from, int to, int cap) {
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
		
		int dfs(int v, int t, int f) {
			if(v==t) return f;
			for(; iter[v]<G.get(v).size(); iter[v]++) {
				Edge e = G.get(v).get(iter[v]);
				if(e.cap>0 && level[v] < level[e.to]) {
					int d = dfs(e.to, t, Math.min(f, e.cap));
					if(d>delta) {
						e.cap -= d;
						G.get(e.to).get(e.rev).cap += d;
						return d;
					}
				}
			}
			return 0;
		}
		
		int getMaxFlow(int s, int t) {
			int flow = 0;
			while(true) {
				bfs(s);
				if(level[t]<0)
					return flow;
				
				Arrays.fill(iter, 0);
				int f;
				while((f = dfs(s, t, INF)) > delta) {
					flow += f;
				}
			}
		}
	}

	static class Counter{
		int index;
		int count;
		public Counter(int index, int count) {
			this.index = index;
			this.count = count;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		MaxFlow mf = new MaxFlow(N);
		
		for(int i=0; i<M; i++) {
			mf.addEdge(sc.nextInt()-1, sc.nextInt()-1, 1);
		}
		
		System.out.println(couldCreateThreeCircuits(mf) ? "Yes" : "No");
		sc.close();
	}
	
	static boolean couldCreateThreeCircuits(MaxFlow mf) {
		int N = mf.V;
		Counter[] c = new Counter[N];
		for(int i=0; i<N; i++) {
			c[i] = new Counter(i, mf.G.get(i).size());
		}
		
		Arrays.sort(c, new Comparator<Counter>() {
			public int compare(Counter c1, Counter c2) {
				return - (c1.count - c2.count);
			}
		});
		
		for(int i=0; i<N; i++)
			if(c[i].count%2!=0)
				return false;
		
		if(c[0].count>=6)
			return true;
		if(N>=3 && c[2].count>=4)
			return true;
		if(N>=2 && c[1].count>=4)
			return false;
		return false;
	}
}
