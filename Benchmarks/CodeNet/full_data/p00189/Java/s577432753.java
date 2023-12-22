import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int INF = 1 << 27;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[][] cs = new int[10][10];
			for (int i = 0; i < 10; i++) {
				Arrays.fill(cs[i], INF);
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				cs[a][b] = c;
				cs[b][a] = c;
				max = Math.max(Math.max(a, b), max);
			}
			for (int i = 0; i < 10; i++)
				cs[i][i] = 0;
			for (int k = 0; k < 10; k++) {
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						cs[i][j] = Math.min(cs[i][j], cs[i][k] + cs[k][j]);
					}
				}
			}
			int min_idx = -1;
			int min = INF;
			for (int i = 0; i <= max; i++) {
				int sum = 0;
				for (int j = 0; j <= max; j++) {
					sum += cs[i][j];
				}
				if (sum < min) {
					min_idx = i;
					min = sum;
				}
			}
			System.out.println(min_idx + " " + min);
		}
	}
}