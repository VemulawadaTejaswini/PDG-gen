import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n | m) == 0) break;
			int [][] cost = new int[m][m];
			int [][] time = new int[m][m];
			int INF = 1 << 24;
			for(int i = 0; i < m; i++){
				Arrays.fill(cost[i], INF);
				Arrays.fill(time[i], INF);
				cost[i][i] = 0;
				time[i][i] = 0;
			}
			for(int i = 0; i < n; i++){
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int c = sc.nextInt();
				int t = sc.nextInt();
				cost[a][b] = c;
				cost[b][a] = c;
				time[a][b] = t;
				time[b][a] = t;
			}
			for(int j = 0; j < m; j++){
				for(int i = 0; i < m; i++){
					for(int k = 0; k < m; k++){
						cost[i][k] = Math.min(cost[i][k], cost[i][j] + cost[j][k]);
					}
				}
			}
			
			for(int j = 0; j < m; j++){
				for(int i = 0; i < m; i++){
					for(int k = 0; k < m; k++){
						time[i][k] = Math.min(time[i][k], time[i][j] + time[j][k]);
					}
				}
			}
			
			int q = sc.nextInt();
			while(q-- > 0){
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int digit = sc.nextInt();
				System.out.println(digit == 0 ? cost[a][b] : time[a][b]);
			}
		}
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}