
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			map = new int[h][w + 2];
			for (int[] a : map)
				Arrays.fill(a, 1);
			for (int i = 0; i < h; i++) {
				for (int j = 1; j <= w; j++) {
					map[i][j] = scanner.nextInt();
				}
			}
			int[][] dp = new int[h][w + 2];
			for (int i = 1; i <= w; i++) {
				if (map[0][i] == 0)
					dp[0][i] = 1;
			}
			for (int i = 1; i < h; i++) {
				for (int j = 1; j <= w; j++) {
					if (map[i][j] == 1)
						continue;
					if (map[i][j] == 0) {
						for (int k = -1; k < 2; k++) {
							if (map[i - 1][j + k] == 0)
								dp[i][j] += dp[i - 1][j + k];
						}

					} else if (map[i][j] == 2) {
						if (map[i - 1][j] == 0)
							dp[i][j] += dp[i - 1][j];
					}
					if (i > 1 && map[i - 2][j] == 2)
						dp[i][j] += dp[i - 2][j];
				}
			}
			int sum = 0;
			for (int i = 1; i <= w; i++) {
				sum += dp[h - 1][i];
				if (h > 1 && map[h - 2][i] == 2)
					sum += dp[h - 2][i];
			}
			System.out.println(sum);
		}
	}

	int count;
	int w;
	int h;
	int[][] map;
}