import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int cost[][];
		int time[][];

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}

			cost = new int[m][m];
			time = new int[m][m];
			for (int i = 0; i < m; i++) {
				Arrays.fill(cost[i], 1 << 29);
				Arrays.fill(time[i], 1 << 29);
			}
			for (int i = 0; i < m; i++) {
				cost[i][i] = 0;
				time[i][i] = 0;
			}
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				cost[a][b] = Math.min(cost[a][b], sc.nextInt());
				cost[b][a] = Math.min(cost[a][b], cost[b][a]);
				time[a][b] = Math.min(time[a][b], sc.nextInt());
				time[b][a] = Math.min(time[a][b], time[b][a]);
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					for (int k = 0; k < m; k++) {
						cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
						cost[j][i] = cost[i][j];
					}
				}
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					for (int k = 0; k < m; k++) {
						time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
						time[j][i] = time[i][j];
					}
				}
			}

			int k = sc.nextInt();
			while (k-- != 0) {
				int p = sc.nextInt() - 1;
				int q = sc.nextInt() - 1;
				int r = sc.nextInt();
				if (r == 0) {
					System.out.println(cost[p][q]);
				} else if (r == 1) {
					System.out.println(time[p][q]);
				}
			}
		}
	}
}