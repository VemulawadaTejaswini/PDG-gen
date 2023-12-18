//--- pE ---//
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}


class Solution {
	Scanner scanner;

	int[] dir_row = new int[]{1, 0};
	int[] dir_col = new int[]{0, 1};
	int[][] a_grid;
	int[][] b_grid;

	int min_diff;

	int inf = (int)1e9;

	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();
		int row = Integer.parseInt(line.split("\\s+")[0]);
		int col = Integer.parseInt(line.split("\\s+")[1]);

		a_grid = new int[row][col];
		b_grid = new int[row][col];

		for (int i=0; i<row; i++) {
			a_grid[i] = strToIntArray(scanner.nextLine());
		}
		for (int i=0; i<row; i++) {
			b_grid[i] = strToIntArray(scanner.nextLine());
		}

		// dfs
		boolean[][] vis = new boolean[row][col];
		for (int i=0; i<row; i++) Arrays.fill(vis[i], false);

		min_diff = inf;

		dfs(0, 0, row, col, a_grid[0][0], b_grid[0][0], vis, 1);
		dfs(0, 0, row, col, b_grid[0][0], a_grid[0][0], vis, 1);

		System.out.println(min_diff);

		return;
	}

	private void dfs(int r, int c, int row, int col, int sum_a, int sum_b, boolean[][] vis, int cnt) {
		if (r == row-1 && c == col-1) {
			int cur_diff = Math.abs(sum_a - sum_b);
			min_diff = Math.min(min_diff, cur_diff);
			return;
		}

		// if (r < 0 || c < 0 || r >= row || c >= col || vis[r][c]) return;

		// System.out.println("cnt = " + cnt);

		vis[r][c] = true;
		for (int i=0; i<dir_row.length; i++) {
			int tr = r + dir_row[i];
			int tc = c + dir_col[i];
			if (tr < 0 || tc < 0 || tr >= row || tc >= col || vis[tr][tc]) continue;

			dfs(tr, tc, row, col, sum_a + a_grid[tr][tc], sum_b + b_grid[tr][tc], vis, cnt + 1);
			dfs(tr, tc, row, col, sum_a + b_grid[tr][tc], sum_b + a_grid[tr][tc], vis, cnt + 1);
		}
		vis[r][c] = false;

		return;
	}
	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}
