
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int s;
		int t;
		long cost;
		Edge(int s, int t, long cost){
			this.s=s;
			this.t=t;
			this.cost=cost;
		}
	}

	ArrayList<Edge> g = new ArrayList<Edge>();
	int V;
	int E;
	long INF = 1L<< 50;
	public void run() {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();

		for(int i=0; i<E; i++) {
			int s = sc.nextInt(); s--;
			int t = sc.nextInt(); t--;
			long cost = sc.nextLong(); cost = -cost;
			Edge e = new Edge(s,t,cost);
			g.add(e);
		}

		if(negative()) {
			System.out.println("inf");
		}else {
			long ans = calc();
			System.out.println(ans);
		}
		sc.close();
	}

	private long calc() {
		long d[] = new long[V];
		for(int i=0; i<V; i++) {
			d[i] = INF;
		}
		d[0]=0;

		for(int i=0; i<V-1; i++) {
			for(int j=0; j<E; j++) {
				Edge e = g.get(j);
				if(d[e.s] == INF) continue;
				if(d[e.t] > d[e.s] + e.cost) {
					d[e.t]= d[e.s] + e.cost;
				}
			}
		}
		return -d[V-1];
	}
	private boolean negative() {
		long d[] = new long[V];
		for(int i=0; i<V; i++) {
			d[i] = 0;
		}
		d[0]=0;

		for(int i=0; i<V; i++) {
			for(int j=0; j<E; j++) {
				Edge e = g.get(j);
				if(d[e.s] == INF) continue;
				if(d[e.t] > d[e.s] + e.cost) {
					d[e.t]= d[e.s] + e.cost;
					if(i==V-1) {
						return true;
					}
				}
			}
		}
		return false;
	}

}


