import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	final int INF = Integer.MAX_VALUE/2;
	int[][] cost = new int[10][10];
	int[][] d = new int[10][10];
	
	void warshall_floyd() {
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				d[i][j] = cost[i][j];
		for (int i = 0; i < 10; i++)
			d[i][i] = 0;
		
		for (int k = 0; k < 10; k++)
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++)
					d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
	}
	
	void run() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++)
					cost[i][j] = INF;
			
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
				cost[a][b] = c;
				cost[b][a] = c;
			}
			warshall_floyd();
			int res = INF, num = 0;
			for (int i = 0; i < 10; i++) {
				if (d[i][0] == INF) break;
				int sum = 0;
				for (int j = 0; j < 10; j++) {
					if (d[i][j] == INF) break;
					sum += d[i][j];
				}
				if (res > sum) {
					res = sum;
					num = i;
				}
			}
			out.printf("%d %d\n", num, res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}