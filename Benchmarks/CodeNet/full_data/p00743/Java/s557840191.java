
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	double EPS = 1e-5;
	
	int n, m;
	LinkedList<E>[] edges;
	double[][][] map;

	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			if( (n|m) == 0 ) break;
			
			short s = (short)(sc.nextInt()-1);
			short g = (short)(sc.nextInt()-1);
			
			edges = new LinkedList[n];
			for(int i=0;i<n;i++) edges[i] = new LinkedList<E>();
			
			for(int i=0;i<m;i++) {
				short a = (short)(sc.nextShort()-1);
				short b = (short)(sc.nextShort()-1);
				short d = sc.nextShort();
				short c = sc.nextShort();
				
				edges[a].add( new E(b, c, d));
				edges[b].add( new E(a, c, d));
			}
			
//			for(LinkedList<E> es: edges) for(E e: es) debug(e.to, e.c, e.d);
			
			double d = dijkstra(s, g);
			
			System.out.println((d<-EPS? "unreachable": d));
		}
		
	}
	
	double dijkstra(short s, short g) {
		PriorityQueue<V> que = new PriorityQueue<V>();
		
		que.add(new V(s, (short)0, s, 0.0));
		
		map = new double[n][31][n];
		for(double[][] a: map) for(double[] b: a) fill(b, INF);
		
		map[s][0][s] = 0.0;
		
		while(!que.isEmpty()) {
			V now = que.poll();
			
			debug(now.u, now.v, now.p, now.t, map[now.u][now.p]);
			
			if( now.u == g && now.v == 1 ) return now.t;
			if( abs( map[now.u][now.v][now.p] -now.t ) > EPS ) continue;

			for(E edge: edges[now.u]) if( edge.to != now.p ) {
				for(int dv = 1;dv>=-1;dv--) if( 0 < now.v+dv && now.v + dv<=edge.c ) {
				debug("a");
					double t = now.t + 1.0 * edge.d / (now.v+dv);
					if( t - map[edge.to][now.v+dv][now.u] < EPS ) {
						map[edge.to][now.v+dv][now.u] = t;
						que.add(new V(edge.to, (short)(now.v+dv), now.u, t));
					}
				}
			}
		}
		
		return -1;
	}
	
	class E {
		short to, c, d;
		E ( short to, short c, short d) {
			this.to = to;
			this.c = c;
			this.d = d;
		}
	}
	
	class V implements Comparable<V>{
		short u, v, p;
		double t;
		V(short u, short v, short p, double t) {
			this.u = u;
			this.v = v;
			this.p = p;
			this.t = t;
		}
		@Override
		public int compareTo(V o) {
			// TODO Auto-generated method stub
			if(t - o.t > EPS ) return 1;
			else if( o.t - t > EPS ) return -1;
			return o.v - v;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}