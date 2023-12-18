import java.util.Scanner;

public class Main {
	static int[][] grid;
	static int H, W;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] line = sc.nextLine().split(" ");
			H = Integer.parseInt(line[0]);
			W = Integer.parseInt(line[1]);
			grid = new int[H][W];
			for (int i = 0; i < H; i++) {
				line = sc.nextLine().split("");
				for (int j = 0; j < W; j++) {
					if ("#".equals(line[j])) {
						grid[i][j] = -1;
					}
				}
			}
			int max = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (grid[i][j] > -1) {
						max = Math.max(max, calc(i, j) + 1);
					}
				}
			}
			System.out.println(max);
		}
	}

	static int calc(int si, int sj) {
		int res = 0;
		for (int i = 0; i < sj; i++) {
			if (grid[i][sj] > -1) res++;
			else break;
		}
		for (int i = sj + 1; i < H; i++) {
			if (grid[i][sj] > -1) res++;
			else break;
		}
		for (int i = 0; i < si; i++) {
			if (grid[si][i] > -1) res++;
			else break;
		}
		for (int i = si + 1; i < W; i++) {
			if (grid[si][i] > -1) res++;
			else break;
		}
		return res;
	}
}