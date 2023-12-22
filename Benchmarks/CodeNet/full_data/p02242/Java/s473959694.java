import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

	static class State { // →bの辺の重さw
		int b, w;
		public State(int b, int w) {
			this.b = b;
			this.w = w;
		}
	}
	static class PQ implements Comparable<PQ>{
		int now, d;
		public PQ(int now, int d) {
			this.now = now;
			this.d = d;
		}
		public int compareTo(PQ p) { // →大小→
			return this.d - p.d;
		}
	}

	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int V = sc.nextInt(); // 頂点数
			int INF = Integer.MAX_VALUE;

			@SuppressWarnings("unchecked")
			List<State>[] edge = new ArrayList[V];
			for(int i=0; i<V; i++) {
				edge[i] = new ArrayList<State>();
			}
			for(int i=0; i<V; i++) {
				int u = sc.nextInt();
				int k = sc.nextInt();
				for(int j=0; j<k; j++) {
					int v = sc.nextInt();
					int c = sc.nextInt();
					edge[u].add(new State(v, c));
				}
			}
			PriorityQueue<PQ> pq = new PriorityQueue<>();
			int[] dis = new int[V];
			boolean[] processed = new boolean[V];
			for(int i=0; i<V; i++) {
				dis[i] = INF;
				processed[i] = false;
			}

			dis[0] = 0;
			pq.add(new PQ(0, 0));
			while(! pq.isEmpty()) {
				PQ p = pq.poll();
				if(processed[p.now]) {
					continue;
				}
				processed[p.now] = true;
				for(State s : edge[p.now]) {
					if(p.d+s.w < dis[s.b]) {
						dis[s.b] = p.d + s.w;
						pq.add(new PQ(s.b, dis[s.b]));
					}
				}
			}
			for(int i=0; i<V; i++){
				System.out.println(i+" "+dis[i]);
			}
		}
	}

}
