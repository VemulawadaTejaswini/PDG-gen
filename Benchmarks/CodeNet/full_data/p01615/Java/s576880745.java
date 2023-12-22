import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 *
	 */
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int dir[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dir[i], -1);
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			dir[a][b] = c;
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (dir[i][k] < 0 || dir[k][j] < 0)
						continue;
					dir[i][j] = Math.max(dir[i][j], dir[i][k] + dir[k][j]);
				}
			}
		}
		System.out.println(dir[0][n-1]);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();

	}
}