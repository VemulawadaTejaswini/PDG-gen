
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	V[] G; int size, cap;
	ArrayList<Integer> gas;
	int[][] dist;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt(), m = sc.nextInt(); cap = sc.nextInt();
			if((n|m|cap) == 0 )  break;

			HashMap<String, Integer> str2ind = new HashMap<String, Integer>();
			size = 2;
			str2ind.put(sc.next(), 0); str2ind.put(sc.next(), 1);
			ArrayList<E> es = new ArrayList<E>();

			for(int i=0;i<n;i++) {
				String from = sc.next(), to = sc.next(); int c = sc.nextInt(), f = size, t = size;
				if(str2ind.containsKey(from)) f = str2ind.get(from);
				else {
					f = size; str2ind.put(from, size++);
				}
				if(str2ind.containsKey(to)) t = str2ind.get(to);
				else {
					t = size; str2ind.put(to, size++);
				}

				es.add(new E(f, t, c));
			}

			G = new V[size];
			for(int i=0;i<size;i++) G[i] = new V();

			for(E e: es) {
				G[e.f].add(new E(e.f, e.t, e.c));
				G[e.t].add(new E(e.t, e.f, e.c));
			}
			gas = new ArrayList<Integer>();
			gas.add(0); gas.add(1);
			for(int i=0;i<m;i++) {
				String p = sc.next();
				if(str2ind.containsKey(p)) gas.add(str2ind.get(p));
			}

			str2ind.clear();
			es.clear();

			dist = new int[gas.size()][];
			for(int i=0;i<gas.size();i++) dist[i] = dijkstra(gas.get(i));
			size = gas.size();
			gas.clear();
			for(V v: G) v.clear();
			G = new V[]{};
			
			System.out.println(dijkstra());
		}
	}

	int dijkstra() {
		int[] d = new int[size]; fill(d, INF); d[0] = 0;
		PriorityQueue<P> que = new PriorityQueue<P>();
		que.add(new P(0, 0));

		for(;!que.isEmpty();) {
			P cur = que.remove();
			if(d[cur.p] != cur.d) continue;
			if(cur.p == 1) return cur.d;

			for(int i=0;i<size;i++) if(dist[cur.p][i] <= cap * 10 && d[i] > cur.d + dist[cur.p][i]) {
				que.add(new P(i, cur.d + dist[cur.p][i]));
				d[i] = cur.d + dist[cur.p][i];
			}
		}

		return -1;
	}

	int[] dijkstra(int s) {
		int[] d = new int[size];
		fill(d, INF); d[s] = 0;
		PriorityQueue<P> que = new PriorityQueue<P>();
		que.add(new P(s, 0));

		for(;!que.isEmpty();) {
			P cur = que.remove();
			if(d[cur.p] != cur.d) continue;

			for(E next: G[cur.p]) if(d[next.t] > next.c + cur.d) {
				d[next.t] = next.c + cur.d;
				que.add(new P(next.t, next.c + cur.d));
			}
		}

		int[] ret = new int[gas.size()];
		for(int i=0;i<gas.size();i++) ret[i] = d[gas.get(i)];
		return ret;
	}

	class P implements Comparable<P> {
		int p, d;
		P(int p, int d) {
			this.p = p;
			this.d = d;
		}

		public int compareTo(P o) {
			// TODO Auto-generated method stub
			return d-o.d;
		}
	}

	class V extends ArrayList<E>{}

	class E {
		int f, t, c;
		E(int f, int t, int c) {
			this.t = t;this.f = f;this.c = c;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}