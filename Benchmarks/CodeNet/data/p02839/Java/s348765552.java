
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);

	void run() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] A = new int[H][W];
		int[][] B = new int[H][W];
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				A[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				B[i][j] = sc.nextInt();
			}
		}
		boolean[][][] diff = new boolean[H][W][80 + 10];
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				for (int k = 0; k < diff[i][j].length; ++k) {
					diff[i][j][k] = false;
				}
			}
		}
		diff[0][0][Math.abs(A[0][0] - B[0][0])] = true;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				for (int cur = 0; cur < diff[i][j].length; ++cur) {
					int[] dx = new int[] { 1, 0 };
					int[] dy = new int[] { 0, 1 };
					for (int k = 0; k < 2; ++k) {
						if (i + dx[k] < H && j + dy[k] < W) {
							int add = Math.abs(A[i + +dx[k]][j + dy[k]] - B[i + dx[k]][j + dy[k]]);
							if (diff[0][0].length > Math.abs(cur + add))
								diff[i + dx[k]][j + dy[k]][Math.abs(cur + add)] |= diff[i][j][cur];
							if (diff[0][0].length > Math.abs(cur - add))
								diff[i + dx[k]][j + dy[k]][Math.abs(cur - add)] |= diff[i][j][cur];
						}
					}
				}
			}
		}
		int ans = Integer.MAX_VALUE / 3;
		for (int i = 0; i < diff[H - 1][W - 1].length; ++i) {
			if (diff[H - 1][W - 1][i])
				ans = Math.min(ans, i);
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
