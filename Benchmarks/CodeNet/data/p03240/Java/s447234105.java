import java.util.Scanner;

public class Main {

	static int NUM = 2000000001;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[101][101];

		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				c[i][j] = NUM;
			}
		}

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();

			if(h == 0) continue;

			inputFactor(x, y, h, c);
			// System.out.println("");

		}

		int[] ans = new int[3];

		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {

				if (c[i][j] > ans[2]) {
					ans[0] = i;
					ans[1] = j;
					ans[2] = c[i][j];
				}
			}
		}

		System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);

		sc.close();

	}

	private static void inputFactor(int x, int y, int h, int[][] c) {

		c[x][y] = h;

		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {

				int tmp = h + Math.abs(i - x) + Math.abs(j - y);

				if (c[i][j] == NUM) {
					c[i][j] = tmp;
				} else {
					if (c[i][j] != tmp)
						c[i][j] = 0;
				}

				// System.out.print("["+c[i][j]+"]");

			}
			// System.out.println("");
		}

	}

}