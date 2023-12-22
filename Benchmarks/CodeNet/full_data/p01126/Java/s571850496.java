
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int a = scanner.nextInt();
			if ((n | m | a) == 0)
				break;
			int max = 0;
			int[][] map = new int[n+1][1001];
			for (int i = 0; i < m; i++) {
				int h = scanner.nextInt();
				int p = scanner.nextInt();
				int q = scanner.nextInt();
				max = Math.max(max, h);
				map[p][h] = q;
				map[q][h] = p;
			}
			for (int i = max + 1; i > 0; i--) {
				if (map[a][i] != 0)
					a = map[a][i];
			}
			System.out.println(a);
		}
	}
}