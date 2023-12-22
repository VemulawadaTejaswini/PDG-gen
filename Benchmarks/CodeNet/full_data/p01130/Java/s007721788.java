import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int[][] cost = new int[100][100];
		int INF = Integer.MAX_VALUE/3;
		while (true) {
			int n = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt()-1, g1 = sc.nextInt()-1, g2 = sc.nextInt()-1;
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					cost[i][j] = INF;
				cost[i][i] = 0;
			}
			
			for (int i = 0; i < m; i++) {
				int b1 = sc.nextInt()-1, b2 = sc.nextInt()-1, c = sc.nextInt();
				cost[b1][b2] = c;
			}
			
			for (int k = 0; k < n; k++)
				for (int i = 0; i < n; i++)
					for (int j = 0; j < n; j++)
						cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j]);
			
			int res = INF;
			for (int i = 0; i < n; i++) {
				res = min(res, cost[s][i]+cost[i][g1]+cost[i][g2]);
			}
			
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}