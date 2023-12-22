
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int[][] dist, enemy;
	int n, m, l;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			l = sc.nextInt();
			if( (n|m|l) == 0 ) break;
			
			dist = new int[n][n]; enemy = new int[n][n];
			for(int[] a: dist) fill(a, INF);
			for(int[] a: enemy) fill(a, INF);
			
			for(int i=0;i<m;i++) {
				int a = sc.nextInt()-1, b = sc.nextInt()-1, d = sc.nextInt(), e = sc.nextInt();
				dist[a][b] = dist[b][a] = d;
				enemy[a][b] = enemy[b][a] = e;
			}
			
			System.out.println(dijkstra());
		}
	}
	
	int dijkstra() {
		int[][] cost = new int[n][l+1];
		for(int[] a: cost) fill(a, INF);
		
		PriorityQueue<E> que = new PriorityQueue<E>();
		que.add(new E(0, l, 0));
		cost[0][l] = 0;
		for(;!que.isEmpty();) {
			E cur = que.remove();
			if(cost[cur.p][cur.l] != cur.c) continue;
			if(cur.p == n-1) return cur.c;
			
			for(int i=0;i<n;i++) {
				if(cost[i][cur.l] > cur.c + enemy[cur.p][i]) {
					cost[i][cur.l] = cur.c + enemy[cur.p][i];
					que.add(new E(i, cur.l, cur.c + enemy[cur.p][i]));
				}
				if(cur.l-dist[cur.p][i]>=0 && cost[i][cur.l-dist[cur.p][i]] > cur.c) {
					cost[i][cur.l - dist[cur.p][i]] = cur.c;
					que.add(new E(i, cur.l-dist[cur.p][i], cur.c));
				}
			}
		}
		return -1;
	}
	
	class E implements Comparable<E> {
		int p, l, c;
		
		E(int p, int l, int c) {
			this.p = p;
			this.l = l;
			this.c = c;
		}
		
		public int compareTo(E o) {
			// TODO Auto-generated method stub
			return c-o.c;
		}
		
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}