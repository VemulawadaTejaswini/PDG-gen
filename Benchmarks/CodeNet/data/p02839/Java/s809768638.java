import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int[][] b = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int x = 160 * 80;
		boolean[][][] dp = new boolean[h][w][x];
		dp[0][0][Math.abs(a[0][0] - b[0][0])] = true;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (i == 0 && j == 0) {
					continue;
				}
				int abs = Math.abs(a[i][j] - b[i][j]);
				if (i > 0) {
					for (int k = 0; k < x; k++) {
						dp[i][j][k] |= dp[i - 1][j][Math.abs(k - abs)];
						if (k + abs < x) {
							dp[i][j][k] |= dp[i - 1][j][k + abs];
						}
					}
				}
				if (j > 0) {
					for (int k = 0; k < x; k++) {
						dp[i][j][k] |= dp[i][j - 1][Math.abs(k - abs)];
						if (k + abs < x) {
							dp[i][j][k] |= dp[i][j - 1][k + abs];
						}
					}
				}
			}
		}
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j < w; j++) {
//				StringBuilder sb = new StringBuilder();
//				sb.append(i).append(':').append(j).append('\t');
//				for (int k = 0; k < x; k++) {
//					if (dp[i][j][k]) {
//						sb.append(k).append(',');
//					}
//				}
//				System.out.println(sb);
//			}
//		}
		for (int k = 0; k < x; k++) {
			if (dp[h - 1][w - 1][k]) {
				System.out.println(k);
				return;
			}
		}
	}
}
