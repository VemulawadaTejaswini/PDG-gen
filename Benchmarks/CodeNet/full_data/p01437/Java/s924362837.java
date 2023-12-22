import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] DR = { -1, 0, 1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static int H, W;
	static boolean[][] f;
	static int[][][] visit;

	public static void main(String[] args) {
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			long L = sc.nextLong();
			if (H == 0) break;
			f = new boolean[H + 2][W + 2];
			visit = new int[H + 2][W + 2][4];
			int cr = 0;
			int cc = 0;
			int cd = 0;
			Arrays.fill(f[0], true);
			Arrays.fill(f[H + 1], true);
			for (int i = 0; i < H; ++i) {
				f[i + 1][0] = f[i + 1][W + 1] = true;
				char[] row = sc.next().toCharArray();
				for (int j = 0; j < W; ++j) {
					if (row[j] == '#') {
						f[i + 1][j + 1] = true;
					} else if (row[j] == '.') {
						// nop
					} else {
						cr = i + 1;
						cc = j + 1;
						cd = "NESW".indexOf(row[j]);
					}
				}
			}
			int turn = 0;
			do {
				visit[cr][cc][cd] = turn;
				for (int i = 0; i < 4; ++i) {
					int nr = cr + DR[(cd + i) % 4];
					int nc = cc + DC[(cd + i) % 4];
					if (!f[nr][nc]) {
						cd = (cd + i) % 4;
						break;
					}
				}
				cr += DR[cd];
				cc += DC[cd];
				++turn;
			} while (visit[cr][cc][cd] == 0);
			if (visit[cr][cc][cd] <= L) {
				int loop = turn - visit[cr][cc][cd];
				L = visit[cr][cc][cd] + (L - visit[cr][cc][cd]) % loop;
			}
			for (int i = 1; i <= H; ++i) {
				for (int j = 1; j <= W; ++j) {
					for (int k = 0; k < 4; ++k) {
						if (visit[i][j][k] == L) {
							System.out.println(i + " " + j + " " + "NESW".charAt(k));
						}
					}
				}
			}
		}
	}
}