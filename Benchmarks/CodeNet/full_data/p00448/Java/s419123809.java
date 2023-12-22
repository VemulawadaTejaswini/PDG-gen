import java.util.Scanner;

/**
 * 
 * @author DemonSong
 * 
 *         0525. Oscenbei
 * 
 * 
 *
 */
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int row = in.nextInt();
			int col = in.nextInt();
			if (row == 0 && col == 0)
				break;

			int[][] grid = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					grid[i][j] = in.nextInt();
				}
			}
			System.out.println(solve(grid));
		}
		in.close();
	}

	private static int solve(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;

		int nn = 1 << n;

		int max = Integer.MIN_VALUE;
		while (nn-- != 0) {
			int[][] clone1 = clone(grid);
			String nns = Integer.toBinaryString(nn);
			char[] nnc = nns.toCharArray();
			for (int i = nns.length() - 1; i >= 0; i--) {
				if (nnc[i] == '1') {
					rotate(clone1, i, true);
				}
			}
			int nm = 1 << m;
			while (nm-- != 0) {
				int[][] clone2 = clone(clone1);
				String nms = Integer.toBinaryString(nm);
				char[] nmc = nms.toCharArray();
				for (int i = nms.length() - 1; i >= 0; i--) {
					if (nmc[i] == '1') {
						rotate(clone2, i, false);
					}
				}
				max = Math.max(max, total(clone2));
			}
		}
		return max;
	}

	private static int[][] clone(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		int[][] clone = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				clone[i][j] = grid[i][j];
			}
		}
		return clone;
	}

	private static void rotate(int[][] grid, int x, boolean isRow) {
		int n = grid.length;
		int m = grid[0].length;
		if (isRow) {
			for (int i = 0; i < m; i++) {
				grid[x][i] = grid[x][i] == 1 ? 0 : 1;
			}
		} else {
			for (int i = 0; i < n; i++) {
				grid[i][x] = grid[i][x] == 1 ? 0 : 1;
			}
		}
	}

	private static int total(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;

		int total = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 1)
					total++;
			}
		}
		return total;
	}

}