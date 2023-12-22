import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n, m, k;
	static int[][] c,t,query;
	static final int INF = 999999999;
	
	static boolean read() {
		n = sc.nextInt(); m = sc.nextInt();
		if(n == 0 && m == 0) return false;
		c = new int[m+1][m+1];
		t = new int[m+1][m+1];
		
		for(int i = 0; i <= m; i++) {
			for(int j = 0; j <= m; j++) {
				if(i == j) {
					c[i][j] = 0;
					t[i][j] = 0;
				} else {
					c[i][j] = INF;
					t[i][j] = INF;
				}
			}
		}
		
		int a,b,time,cost;
		for(int i = 0; i < n; i++) {
			a = sc.nextInt(); b = sc.nextInt(); cost = sc.nextInt(); time = sc.nextInt();
			c[a][b] = c[b][a] = cost;
			t[a][b] = t[b][a] = time;
		}
		
		k = sc.nextInt();
		query = new int[k][3];
		int p,q,r;
		for(int i = 0; i < k; i++) {
			p = sc.nextInt(); q = sc.nextInt(); r = sc.nextInt();

			query[i][0] = p; query[i][1] = q; query[i][2] = r;
		}
		
		return true;
	}
	
	static void solve() {
		int start, goal, type;
		for(int from = 1; from <= m; from++) {
			for(int to = 1; to <= m; to++) {
				for(int d = 1; d <= m; d++) {
					c[from][to] = min(c[from][to], c[from][d] + c[d][to]);
					t[from][to] = min(t[from][to], t[from][d] + t[d][to]);
				}
			}
		}

		for(int i = 0; i < k; i++) {
			start = query[i][0];
			goal = query[i][1];
			type = query[i][2];
			
			if(type == 0) {
				//cost
				System.out.println(c[start][goal]);
			} else {
				//time
				System.out.println(t[start][goal]);
			}
		}
	}
	
	public static void main(String[] args) {
		while(read()) solve();
	}

}

class State implements Comparable<State> {
	int n,c;
	State(int n, int c) {
		this.n = n; this.c = c;
	}
	
	public int compareTo(State s) {
		return this.c - s.c;
	}
}