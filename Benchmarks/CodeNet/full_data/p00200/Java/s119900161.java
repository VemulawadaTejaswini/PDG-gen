import java.util.*;
public class Main {
	Scanner sc;
	long[][] time;
	long[][] cost;
	int n,m;
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0)break;
			time = new long[m][m];
			cost = new long[m][m];
			
			for (int i=0;i<m;i++) {
				for (int j=0;j<m;j++) {
					time[i][j] = Integer.MAX_VALUE;
					cost[i][j] = Integer.MAX_VALUE;
				}
			}
			for (int i=0;i<n;i++) {
				int s = sc.nextInt();
				int e = sc.nextInt();
				cost[s-1][e-1] = sc.nextInt();
				time[s-1][e-1] = sc.nextInt();
				cost[e-1][s-1] = cost[s-1][e-1];
				time[e-1][s-1] = time[s-1][e-1];
	 		}
			dijkstra();
			int k = sc.nextInt();
			for (int i=0;i<k;i++) {
				int p = sc.nextInt();
				int q = sc.nextInt();
				int r = sc.nextInt();
				if (p == q) System.out.println(0);
				else System.out.println( (r==1)? time[p-1][q-1]:cost[p-1][q-1] );
			}
		}
	}
	
	void dijkstra () {
		for (int i=0;i<m;i++){
			for (int j=0;j<m;j++) {
				for (int k=0;k<m;k++) {
					cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
					time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}