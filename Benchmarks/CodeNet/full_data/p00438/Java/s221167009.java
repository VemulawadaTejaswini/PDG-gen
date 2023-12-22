
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			int[][] map = new int[h+1][w+1];
			boolean[][] b = new boolean[h+1][w+1];
			int n = scanner.nextInt();
			while (n-- > 0) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				b[y][x] = true;
			}
			map[0][1] = 1;
			for (int i = 1; i <= h; i++)
				for (int j = 1; j <= w; j++) {
					if (b[i][j])
						continue;
					map[i][j] = map[i - 1][j] + map[i][j - 1];
				}

			System.out.println(map[h][w]);
		}
	}
}