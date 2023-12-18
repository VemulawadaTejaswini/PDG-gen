
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int to;
		int color;
		int cost;
		public Edge(int to, int color, int cost) {
			this.to=to;
			this.color=color;
			this.cost=cost;
		}
	}

	ArrayList<ArrayList<Edge>> es = new ArrayList<>();
	class Lca{
		int l;
		int n;
		int parent[][];
		int dist[];
		int cost[];
		public Lca() {
			n = es.size();
			l = 0;
			while((1<<l) < n) {
				l++;
			}
			parent = new int[n][l];
			dist = new int[n];
			cost = new int[n];
		}
		public void dfs(int r, int p, int di, int co) {
			if(p != -1) {
				parent[r][0] = p;
			}
			dist[r] = di;
			cost[r] = co;
			for(Edge e : es.get(r)) {
				if(e.to == p) continue;
				dfs(e.to, r, di+1, co + e.cost);
			}
		}
		public void init() {
			dfs(0, -1, 0, 0);
			for(int i=0; i<l-1; i++) {
				for(int v = 0; v<n; v++) {
					parent[v][i+1] = parent[parent[v][i]][i];
				}
			}
		}
		public int get(int a, int b) {
			if(dist[a]>dist[b]) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			int gap = dist[b]-dist[a];
			for(int i=l-1; i>=0; i--) {
				int len = 1<<i;
				if(gap>=len) {
					gap -= len;
					b = parent[b][i];
				}
			}
			if(a==b) return a;
			for(int i=l-1; i>=0; i--) {
				int na = parent[a][i];
				int nb = parent[b][i];
				if(na != nb) {
					a = na;
					b = nb;
				}
			}
			return parent[a][0];
		}
		public int dist(int a, int b) {
			int c = get(a,b);
			return dist[a] + dist[b] - 2 * dist[c];
		}
		public int cost(int a, int b) {
			int c = get(a,b);
			return cost[a] + cost[b] - 2 * cost[c];
		}
	}

	class Query{
		int color;
		int qid;
		int y;
		int coeff;

		Query(int color, int qid, int coeff, int y){
			this.color=color;
			this.qid=qid;
			this.coeff=coeff;
			this.y=y;
		}
	}

	ArrayList<ArrayList<Query>> qs = new ArrayList<>();
	long ans[];
	int sum[];
	int cnt[];
	public void dfs2(int r, int p) {
		for(Query q : qs.get(r)) {
			long x = 0;
			x -= sum[q.color];
			x += (long)q.y*cnt[q.color];
			ans[q.qid] += x * q.coeff;
		}
		for(Edge e : es.get(r)) {
			if(e.to == p) continue;
			cnt[e.color]++;
			sum[e.color]+=e.cost;
			dfs2(e.to, r);
			cnt[e.color]--;
			sum[e.color]-=e.cost;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		sum = new int[n];
		cnt = new int[n];
		for(int i=0; i<n; i++) {
			es.add(new ArrayList<>());
		}
		for(int i=0; i<n-1; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			a--; b--;
			int color = sc.nextInt();
			int cost = sc.nextInt();
			es.get(a).add(new Edge(b, color, cost));
			es.get(b).add(new Edge(a, color, cost));
		}
		Lca lca = new Lca();
		lca.init();

		ans = new long[q];
		for(int i=0; i<n; i++) {
			qs.add(new ArrayList<>());
		}


		for(int i=0; i<q; i++) {
			int col = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--; b--;
			int c = lca.get(a,b);
			ans[i] = lca.cost(a, b);
			qs.get(a).add(new Query(col, i, 1, y));
			qs.get(b).add(new Query(col, i, 1, y));
			qs.get(c).add(new Query(col, i, -2, y));
		}

		dfs2(0,-1);

		for(int i=0; i<q; i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}
