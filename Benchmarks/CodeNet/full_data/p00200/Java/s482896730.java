
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n, m;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt(); m = sc.nextInt();
			if( (n|m) == 0) break;
			
			int[][] cost, time;
			cost = new int[m][m]; time = new int[m][m];
			for(int[] a: cost) fill(a, INF);
			for(int[] a: time) fill(a, INF);
			
			
			for(int i=0;i<n;i++) {
				int x = sc.nextInt()-1, y = sc.nextInt() -1,
					c = sc.nextInt(), t = sc.nextInt();
				cost[x][y] = cost[y][x] = min(cost[x][y], c);
				time[x][y] = time[y][x] = min(time[x][y], t);
			}
			
			int k = sc.nextInt();
			for(int i=0;i<k;i++) {
				int p = sc.nextInt()-1, q = sc.nextInt()-1, r = sc.nextInt();
				if(r == 0) 
					System.out.println(dijkstra(p, cost)[q]);
				else 
					System.out.println(dijkstra(p, time)[q]);
			}
		}
	}
	
	int[] dijkstra(int s, int[][] data ) {
		int d[] = new int[m];
		fill(d, INF); d[s] = 0;
		boolean[] used = new boolean[m];
		for(;;) {
			int v = -1;
			for(int i=0;i<m;i++) if(!used[i] && ( v==-1 || d[i] < d[v] )) {
				v = i;
			}
			
			if(v == -1) break;
			used[v] = true;
			
			for(int u=0;u<m;u++) {
				d[u] = min(d[u], d[v] + data[v][u]);
			}
		}
		return d;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}