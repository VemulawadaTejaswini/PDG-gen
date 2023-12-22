import java.util.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m[][] = new int[n][n];
		boolean fixed[] = new boolean[n];
		int d[] = new int[n];
		
		for (int i = 0; i < n; i ++) {
			int u = scanner.nextInt();
			for (int j = 0; j < n; j ++) {
				m[u][j] = 100000 * n + 1;
			}
			int k = scanner.nextInt();
			for (int j = 0; j < k; j ++) {
				m[u][scanner.nextInt()] = scanner.nextInt();
			}
			d[i] = Integer.MAX_VALUE;
		}
		
		scanner.close();
		
		d[0] = 0;
		int u = 0;
		
		for(int i = 0; i < n; i ++) {
			fixed[u] = true;
			for (int j = 0; j < n; j ++) {
				if (fixed[j] == false && d[u] + m[u][j] < d[j]) {
					d[j] = d[u] + m[u][j];
				}
			}
			
			int mincost = Integer.MAX_VALUE;
			for (int j = 0; j < n; j ++) {
				if (fixed[j] == false && d[j] < mincost) {
					mincost = d[j];
					u = j;
				}
			}
		}
		
		for (int i = 0; i < n; i ++) {
			System.out.println(i + " " + d[i]);
		}
	}
} 

