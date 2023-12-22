
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int s = scanner.nextInt();
			int g1 = scanner.nextInt();
			int g2 = scanner.nextInt();
			if ((n | m | s | g1 | g2) == 0)
				break;
			s--;
			g1--;
			g2--;
			int[][] g = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					g[i][j] = i == j ? 0 : INF;

			while (m-- > 0) {
				int b1 = scanner.nextInt() - 1;
				int b2 = scanner.nextInt() - 1;
				int c = scanner.nextInt();
				g[b1][b2] = c;
			}

			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					for (int k = 0; k < n; k++)
						g[j][k] = Math.min(g[j][k], g[j][i] + g[i][k]);

			int ans = INF;
			for (int i = 0; i < n; i++)
				ans = Math.min(ans, g[s][i] + g[i][g1] + g[i][g2]);
			System.out.println(ans);
		}
	}

	int INF = 1 << 29;
}