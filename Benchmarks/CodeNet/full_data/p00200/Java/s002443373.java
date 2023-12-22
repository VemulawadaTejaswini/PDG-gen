import java.util.*;
import static java.lang.Math.*;  
import static java.util.Arrays.*; 
public class P0200 {
	Scanner sc;
	long[][] time;
	long[][] cost;
	int n,m;
	int INF=1<<28;
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0)break;
			time = new long[m][m];
			cost = new long[m][m];
			
			for(int j=0; j<m; j++){  
					fill(cost[j], INF);  
					fill(time[j], INF);  
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
				else if(r==1) System.out.println(time[p-1][q-1]);
				else System.out.println(cost[p-1][q-1]);
			}
		}
	}
	
	void dijkstra () {
		for (int i=0;i<m;i++){
			for (int j=0;j<m;j++) {
				for (int k=0;k<m;k++) {
					cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j]);
					time[i][j] = min(time[i][j], time[i][k] + time[k][j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new P0200().run();
	}
}