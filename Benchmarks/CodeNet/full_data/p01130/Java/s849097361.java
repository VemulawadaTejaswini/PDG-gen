import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = 0;
		int m = 0;
		int s = 0;
		int g1 = 0;
		int g2 = 0;

		int last_cost = 100000;

		while (true) {
			n = scan.nextInt();
			m = scan.nextInt();
			s = scan.nextInt();
			g1 = scan.nextInt();
			g2 = scan.nextInt();

			if (n == 0 && m == 0 && s == 0 && g1 == 0 && g2 == 0)
				break;
			s--;
			g1--;
			g2--;

			int kithi1[] = new int[m];
			int kithi2[] = new int[m];
			int cost[][] = new int[n][n];

			for (int i = 0; i < m; i++) {
				kithi1[i] = scan.nextInt();
				kithi2[i] = scan.nextInt();
				cost[kithi1[i] - 1][kithi2[i] - 1] = scan.nextInt();
				cost[kithi2[i] - 1][kithi1[i] - 1] = cost[kithi1[i] - 1][kithi2[i] - 1];
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i!=j&&cost[i][j] == 0)
						cost[i][j] = 1000000;
				}
			}

			for (int k = 0; k < n; k++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (cost[i][j] > cost[i][k] + cost[k][j]) {
							cost[i][j] = cost[i][k] + cost[k][j];
						}
					}
				}
			}

			for (int i = 0; i < n; i++) {
				if (last_cost > cost[s][i] + cost[i][g1]+cost[i][g2])
					last_cost = cost[s][i] + cost[i][g1]+cost[i][g2];
			}

			System.out.println(last_cost);
		}
		scan.close();
	}

}