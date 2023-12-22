
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//int INF = 1L << 62;
	double EPS = 1e-10;
	static int D = 200;
	int n, m, c, s, g;
	int[][] cost;
	int[][][] map;
	G graph[][];

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			c = sc.nextInt();
			s = sc.nextInt()-1;
			g = sc.nextInt()-1;
			if(n==0) break;

			graph = new G[c][n];
			for(int i=0;i<n;i++)for(int j=0;j<c;j++) graph[j][i] = new G();
			for(int i=0;i<m;i++) {
				int x = sc.nextInt()-1, y = sc.nextInt()-1, d = sc.nextInt(), c = sc.nextInt()-1;
				graph[c][x].add(new E(y, d)); graph[c][y].add(new E(x, d));
			}
			cost = new int[c][n * D + 1];

			int[] p = new int[c];
			for(int i=0;i<c;i++) p[i] = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<c;i++) {
				int[] q = new int[p[i]-1];
				int[] r = new int[p[i]];
				for(int j=0;j<p[i]-1;j++)if(p[i]!=1) q[j] = sc.nextInt();
				for(int j=0;j<p[i];j++) r[j] = sc.nextInt();
				int crv = 0;
				for(int dist=1;dist<n*D+1;dist++) {
					if(crv != p[i]-1 && dist > q[crv]) crv++;
					cost[i][dist] = cost[i][dist-1] + r[crv];
				}
			}

			map = new int[c][n][n];
			for(int[][] a: map) for(int[] b: a) fill(b, INF);
			for(int i=0;i<c;i++) {
				for(int f=0;f<n;f++) {
					int[] dist = dijkstra(i, f);
					for(int t=0;t<n;t++)
						map[i][f][t] = min(dist[t], map[i][f][t]);
				}
			}
			System.out.println(solve());
		}
	}

	int solve() {
		int[][] mem = new int[c][n];
		for(int[] a: mem) fill(a, INF);
		PriorityQueue<S> q = new PriorityQueue<S>();
		q.add(new S(s, -1, 0));

		for(;!q.isEmpty();) {
			S cur = q.remove();
			if( cur.r != -1 && mem[cur.r][cur.p] != cur.c ) continue;
			if(cur.p == g) return cur.c;

			for(int i=0;i<c;i++) if(i!=cur.r) {
				for(int j=0;j<n;j++) if(mem[i][j] > cur.c + map[i][cur.p][j]) {
					mem[i][j] = cur.c + map[i][cur.p][j];
					q.add(new S(j, i, cur.c + map[i][cur.p][j]));
				}
			}
		}
		return -1;
	}

	int[] dijkstra(int c, int s) {
		int[] ret  = new int[n]; fill(ret, INF);
		ret[s] = 0;

		PriorityQueue<E> q = new PriorityQueue<E>();
		q.add(new E(s, 0));
		for(;!q.isEmpty();) {
			E cur = q.remove();
			if(ret[cur.to] != cost[c][cur.d]) continue;

			for(E e: graph[c][cur.to].es) {
				if(ret[e.to] > cost[c][cur.d + e.d]) {
					ret[e.to] = cost[c][cur.d + e.d];
					q.add(new E(e.to, cur.d + e.d));
				}
			}
		}
		return ret;
	}

	class G {
		ArrayList<E> es = new ArrayList<E>();
		void add(E e) {es.add(e);}
	}

	class E implements Comparable<E>{
		int to, d;
		E(int to, int d) {
			this.to = to;
			this.d = d;
		}

		public int compareTo(E o) {
			// TODO Auto-generated method stub
			return d - o.d;
		}
	}

	class S implements Comparable<S>{
		int p, r, c;

		S(int p, int r, int c) {
			this.p = p;
			this.r = r;
			this.c = c;
		}

		public int compareTo(S o) {
			// TODO Auto-generated method stub
			return c - o.c;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}