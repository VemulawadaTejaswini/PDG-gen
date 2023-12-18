
import java.util.Arrays;
import java.util.Scanner;

class Main {

	public void run() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[][] d = new int[A][B];
		for (int i = 0; i < A; ++i) {
			for (int j = 0; j < B; ++j) {
				d[i][j] = sc.nextInt();
			}
		}

		//dij=min(Xi+Yj+cXY)
		//dij<=Xi+Yj+cij
		//cXY>=d[i][j]-Xi-Yj;

		int[][] c = new int[101][101];
		for (int i = 0; i < A; ++i) {
			for (int j = 0; j < B; ++j) {
				for (int x = 0; x <= 100; ++x) {
					for (int y = 0; y <= 100; ++y) {
						c[x][y] = Math.max(c[x][y], d[i][j] - x * i - y * j);
					}
				}
			}
		}
		int[][] d_now = new int[A][B];
		for (int i = 0; i < A; ++i) {
			for (int j = 0; j < B; ++j) {
				d_now[i][j] = Integer.MAX_VALUE / 3;
			}
		}

		for (int i = 0; i < A; ++i) {
			for (int j = 0; j < B; ++j) {
				for (int x = 0; x <= 100; ++x) {
					for (int y = 0; y <= 100; ++y) {
						d_now[i][j] = Math.min(d_now[i][j], c[x][y] + x * i + y * j);
					}
				}
			}
		}
		for (int i = 0; i < A; ++i) {
			for (int j = 0; j < B; ++j) {
				if (d[i][j] != d_now[i][j]) {
					System.out.println("Impossible");
					return;
				}
			}
		}
		System.out.println("Possible");
		System.out.println(300 + " " + (100 + 100 + 10000 + 4));
		for (int i = 1; i <= 100; ++i) {
			System.out.println(i + " " + (i + 1) + " X");
		}
		for (int i = 101; i <= 200; ++i) {
			System.out.println(i + " " + (i + 1) + " Y");
		}
		for (int i = 0; i < 100; ++i) {
			for (int j = 0; j < 100; ++j) {
				System.out.println((i + 1) + " " + (j + 1 + 100) + " " + c[i][j]);
			}
		}
		int s = 299;
		int t = 300;
		System.out.println(s + " " + 1 + " " + 0);
		System.out.println(s + " " + 101 + " " + 0);
		System.out.println(100 + " " + t + " " + 0);
		System.out.println(200 + " " + t + " " + 0);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
