import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int v = sc.nextInt();
		int e = sc.nextInt();

		E[] edges = new E[e * 2];
		for (int i = 0; i < e; i++) {
			E ed = new E();
			ed.from = sc.nextInt();
			ed.to = sc.nextInt();
			ed.cap = sc.nextInt();

			E ed2 = new E();
			ed2.from = ed.to;
			ed2.to = ed.from;
			ed2.cap = 0;

			edges[i] = ed;
			edges[i + e] = ed2;

		}

		long ans = 0;
		int[] depth = new int[v];
		boolean[] visited = new boolean[v];
		for (;;) {
			Arrays.fill(depth, v + 100);
			Arrays.fill(visited, false);
			if (!bfs(edges, depth, visited, 0, v - 1)) {
				break;
			}

			for (;;) {
				Arrays.fill(visited, false);
				visited[0] = true;
				int flow = dfs(10000,edges, depth,visited, 0, v - 1,0);
				if(flow == 0){
					break;
				}
				ans += flow;
			}
		}

		System.out.println(ans);
	}

	int dfs(int flow ,E[] edges, int[]depth,boolean[] visited, int now,int to,int d){
		if(now == to){
			return flow;
		}
		long ans = 0;
		for(int ii = 0 ; ii < edges.length; ii++){
			E e =edges[ii];
			if(e.from == now && !visited[e.to] && depth[e.to] > depth[e.from] && e.cap > 0){
				visited[e.to] = true;
				
				int res = dfs(Math.min(flow,e.cap),edges,depth,visited,e.to,to,d+1);
				if(res > 0 ){
					e.cap -= res;
					edges[(ii+edges.length/2)%edges.length].cap += res;
					return res;
				}
				visited[e.to] = false;
			}
		}
		return 0;
	}
	
	
	boolean bfs(E[] edges, int[] depth, boolean[] visited, int from, int to) {

		PriorityQueue<EE> q = new PriorityQueue<>((ee1, ee2) -> Integer.compare(ee1.depth, ee2.depth));
		EE init = new EE();
		init.depth = 0;
		init.pos = from;
		q.add(init);

		for (; !q.isEmpty();) {

			EE x = q.poll();
			if (x.pos == to) {
				depth[x.pos] = x.depth;
				return true;
			}

			if (depth[x.pos] <= x.depth) {
				continue;
			}
			depth[x.pos] = x.depth;
			visited[x.pos] = true;

			for (E e : edges) {
				if (e.from == x.pos && !visited[e.to] && e.cap > 0) {
					EE ex = new EE();
					ex.depth = x.depth + 1;
					ex.pos = e.to;
					q.add(ex);
				}
			}
		}
		return false;
	}

	class EE {
		int pos;
		int depth;
	}

	class E {
		int from;
		int to;
		int cap;
	}

}
