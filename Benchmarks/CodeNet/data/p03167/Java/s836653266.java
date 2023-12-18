

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	static int H;
	static int W;
	static int[][]memo;
	static int dp(char[][] grid, int i, int j) {
		if(memo[i][j]!=-1)
			return memo[i][j];
		if (i == H - 1 && j == W - 1) {
			return 1;
		}
		if(grid[i][j]=='#')
			return 0;
		if (i == H - 1)
			if (grid[i][j + 1] == '#')
				return memo[i][j] = 0;
			else
				return memo[i][j] = dp(grid, i, j + 1);
		if (j == W - 1)
			if (grid[i + 1][j] == '#')
				return memo[i][j] = 0;
			else
				return memo[i][j] = dp(grid, i + 1, j);
		if (grid[i + 1][j] == '#' && grid[i][j + 1] == '#')
			return 0;
		return memo[i][j] = dp(grid, i + 1, j) + dp(grid, i, j + 1);

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		char[][] grid = new char[H][W];
		memo = new int[H][W];
		for(int[]arr : memo)
			Arrays.fill(arr, -1);
		for (int i = 0; i < H; i++) {
			String str = sc.next();
			for (int j = 0; j < W; j++) {
				grid[i][j] = str.charAt(j);
			}
		}
		System.out.println((int)((dp(grid, 0, 0))%(Math.pow(10,9)+7)));
	}
}
