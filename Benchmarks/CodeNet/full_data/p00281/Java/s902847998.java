
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] num = new int[n][m];
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if ((a | b | c) == 0)
				break;
			num[a - 1][b - 1] = c;
		}
		int r = scanner.nextInt();
		for (int i = 0; i < r; i++) {
			int[][] ans = new int[n][m];
			for (int j = 0; j < 6; j++) {
				int a = scanner.nextInt();
				for (int k = 0; k < n; k++) {
					ans[k][j] = num[k][j] * a;

				}
			}
			for (int j = 0; j < n; j++) {
				int sum = 0;
				for (int k = 0; k < m; k++) {
					sum += ans[j][k];
				}
				System.out.print(sum);
				System.out.print(j == n - 1 ? '\n' : ' ');
			}
		}
	}
}