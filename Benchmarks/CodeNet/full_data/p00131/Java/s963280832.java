
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[][] dxy = { { -1, 0 }, { 0, -1 }, { 0, 0 }, { 0, 1 }, { 1, 0 } };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int MAX = 10;
		while (n-- > 0) {
			boolean[][] map = new boolean[MAX][MAX];
			for (int i = 0; i < MAX; i++) {
				for (int j = 0; j < MAX; j++) {
					map[i][j] = scanner.nextInt() == 0;
				}
			}
			boolean[][] fld = new boolean[MAX][MAX];
			for (int i = 0; i < 1 << 10; i++) {
				for (boolean[] b : fld) {
					Arrays.fill(b, false);
				}
				boolean[][] tmp = new boolean[MAX][MAX];
				for (int j = 0; j < MAX; j++) {
					tmp[j] = Arrays.copyOf(map[j], MAX);
				}
				for (int j = 0; j < MAX; j++) {
					if (((i >> j) & 1) == 1) {
						slove(0, j, tmp);
						fld[0][j] = true;
					}
				}
				for (int j = 1; j < MAX; j++) {
					for (int k = 0; k < MAX; k++) {
						if (!tmp[j - 1][k]) {
							slove(j, k, tmp);
							fld[j][k] = true;
						}
					}
				}
				boolean flag = true;
				for (int j = 0; j < MAX; j++) {
					if (!tmp[MAX - 1][j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
			for (int i = 0; i < MAX; i++) {
				for (int j = 0; j < MAX; j++) {
					System.out.print(fld[i][j] ? '1' : '0');
					System.out.print(j == MAX - 1 ? '\n' : ' ');
				}
			}
		}
	}

	private static void slove(int y, int x, boolean[][] tmp) {
		for (int i = 0; i < 5; i++) {
			int dy = y + dxy[i][0];
			int dx = x + dxy[i][1];
			if (0 <= dy && dy < 10 && 0 <= dx && dx < 10) {
				tmp[dy][dx] = !tmp[dy][dx];
			}
		}
	}
}