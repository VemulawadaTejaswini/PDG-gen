
import java.util.Arrays;
import java.util.HashSet;
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

		boolean[][][] ok = new boolean[H][W][80 * 80 + 10];
		ok[0][0][Math.abs(A[0][0] - B[0][0])] = true;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				for (int k = 0; k < ok[i][j].length; ++k) {
					if (!ok[i][j][k])
						continue;
					for (int di = 0; di <= 1; ++di) {
						for (int dj = 0; dj <= 1; ++dj) {
							if ((di ^ dj) != 1)
								continue;
							if (i + di < H && j + dj < W) {
								int add = Math.abs(A[i + di][j + dj] - B[i + di][j + dj]);
								for (int sign = -1; sign <= 1; sign += 2) {
									if (Math.abs(k + sign * add) < ok[i][j].length)
										ok[i + di][j + dj][Math.abs(k + sign * add)] |= ok[i][j][k];
								}
							}
						}
					}
				}
			}
		}

		int ans = Integer.MAX_VALUE / 3;
		for (int i = 0; i < ok[H - 1][W - 1].length; ++i) {
			if (ok[H - 1][W - 1][i])
				ans = Math.min(ans, i);
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
