
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main{

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt(), m = sc.nextInt();
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
			for(int i=0;i<m;i++) cost[i][i] = time[i][i] = 0;

			for(int k=0;k<m;k++) for(int i=0;i<m;i++) for(int j=0;j<m;j++) {
				cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j]);
				time[i][j] = min(time[i][j], time[i][k] + time[k][j]);
			}
			
			int k = sc.nextInt();
			for(int i=0;i<k;i++) {
				int p = sc.nextInt() - 1, q = sc.nextInt() - 1, r = sc.nextInt();
				if(r == 0) {
					System.out.println(cost[p][q]);
				}
				else {
					System.out.println(time[p][q]);
				}
			}
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}