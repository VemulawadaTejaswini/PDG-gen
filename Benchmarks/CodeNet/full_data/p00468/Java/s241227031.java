
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			if ((n | m) == 0)
				break;
			invite = new boolean[n];
			friend = new boolean[n][n];
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				friend[a][b] = friend[b][a] = true;
			}
			for (int i = 1; i < n; i++) {
				if (!friend[0][i])
					continue;
				invite[i] = true;
				for (int j = 1; j < n; j++) {
					if (!friend[i][j])
						continue;
					invite[j] = true;
				}
			}
			int count = 0;
			for (int i = 0; i < n; i++)
				if (invite[i])
					count++;
			System.out.println(count);

		}
	}

	int n, m, ans;
	boolean[] invite;
	boolean[][] friend;
}