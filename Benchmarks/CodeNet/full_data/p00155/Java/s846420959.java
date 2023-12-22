
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	double EPS = 1e-10;
	int[] x, y, id;
	int n;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if( n == 0 ) break;
			
			x = new int[n];
			y = new int[n];
			id = new int[n];
			
			for(int i=0;i<n;i++) {
				id[i] = sc.nextInt();
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			int m = sc.nextInt();
			for(int i=0;i<m;i++) {
				int s = sc.nextInt();
				int g = sc.nextInt();
				for(int j=0;j<n;j++) if( id[j] == s ) {
					s = j; break;
				}
				for(int j=0;j<n;j++) if( id[j] == g ) {
					g = j; break;
				}

				int[] path = dijkstra(s, g);
				int[] rev = new int[n];
				if(path[0] == -1) {
					System.out.println("NA");
					continue;
				}
				int c = 0;
				int p = id[g]-1;
				rev[c++] = p;
				while( path[p] != p ) {
					p = path[p]; rev[c++] = p;
				}

				System.out.print(id[ rev[--c] ]);
				for(;c>0;) {
					System.out.print(" " + id[ rev[--c] ]);
				}
				System.out.println();
			}
		}
	}
	
	int[] dijkstra(int s, int g) {
		double d[] = new double[n];
		int[] path = new int[n];
		boolean[] visited = new boolean[n];
		fill(d, INF);
		d[s] = 0;
		for (int i = 0; i < n; i++) path[i] = i;
		
		for(;;) {
			int v = -1;
			for(int u=0;u<n;u++) if(!visited[u]) {
				if(v == -1 || d[v] > d[u]) v = u;
			}
			
			if( v == g ) {
				if( d[g] == INF ) return new int[] {-1};
				return path;
			}
			visited[v] = true;
			
			for(int u=0;u<n;u++) {
				int dist = d(u, v);
				if( dist == INF ) continue;
				if( d[u] > d[v] + sqrt( dist ) ) {
					d[u] = d[v] + sqrt( dist );
					path[u] = v;
				}
			}
		}
	}
	
	int d(int u, int v) {
		int dx = x[u] - x[v];
		int dy = y[u] - y[v];
		return (dx*dx + dy*dy > 50*50? INF: dx*dx+dy*dy);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}