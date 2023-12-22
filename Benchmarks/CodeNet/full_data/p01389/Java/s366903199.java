import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] f = new int[H][W];
		for (int i = 0; i < H; ++i) {
			String line = sc.next();
			for (int j = 0; j < W; ++j) {
				f[i][j] = line.charAt(j) - '0';
			}
		}
		int[][] min = new int[H][W];
		for (int i = 1; i < W; ++i) {
			min[0][i] = min[0][i - 1] + f[0][i];
		}
		for (int i = 1; i < H; ++i) {
			min[i][0] = min[i - 1][0] + f[i][0];
		}
		for (int i = 1; i < H; ++i) {
			for (int j = 1; j < W; ++j) {
				min[i][j] = Math.min(min[i - 1][j], min[i][j - 1]) + f[i][j];
			}
		}
		System.out.println(min[H - 1][W - 1]);
	}
}