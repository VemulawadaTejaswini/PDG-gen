
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int to;
		int cost;
		Edge(int to, int cost){
			this.to=to;
			this.cost=cost;
		}
	}

	class P implements Comparable<P>{
		int v;
		long dist;
		P(int v, long dist){
			this.v=v;
			this.dist=dist;
		}
		@Override
		public int compareTo(P arg0) {
			return Long.compare(this.dist, arg0.dist);
		}
	}

	long d[];
	long INF = 1001001001001001L;
	ArrayList<ArrayList<Edge>> g = new ArrayList<>();
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		d = new long[n];
		for(int i=0; i<n; i++) {
			g.add(new ArrayList<>());
		}
		for(int i=0; i<n-1; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			a--;b--;
			int c=sc.nextInt();
			g.get(a).add(new Edge(b,c));
			g.get(b).add(new Edge(a,c));
		}

		int q=sc.nextInt();
		int k=sc.nextInt();
		k--;

		PriorityQueue<P> pq = new PriorityQueue<>();
		for(int i=0; i<n; i++) {
			d[i]=INF;
		}
		d[k]=0;
		pq.add(new P(k,0));
		while(!pq.isEmpty()) {
			P p = pq.poll();
			if(d[p.v]<p.dist) continue;
			for(Edge e : g.get(p.v)) {
				if(d[e.to] > d[p.v] + e.cost) {
					d[e.to] = d[p.v] + e.cost;
					pq.add(new P(e.to, d[e.to]));
				}
			}
		}
		for(int i=0; i<q; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			x--; y--;
			System.out.println(d[x]+d[y]);
		}
		sc.close();
	}





}
