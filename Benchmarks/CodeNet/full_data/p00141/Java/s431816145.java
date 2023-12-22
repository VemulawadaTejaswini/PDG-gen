import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Spiral Pattern
 */
public class Main {

	static final int[][] DIR = {
			{-1, 0},
			{0, 1},
			{1, 0},
			{0, -1},
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int d = parseInt(line);

			for (int i = 0; i < d; i++) {

				int n = parseInt(br.readLine());
				char[][] grid = new char[n][n];
				int[] path = new int[n];

				for (int j = 0; j < grid.length; j++) {
					Arrays.fill(grid[j], ' ');
				}

				for (int j = 0; j < n; j++) {
					path[j] = n - j;
					if (j > 0 && (j & 1) == 0) path[j]++;
				}

				int y = n, x = 0;

				for (int j = 0; j < path.length; j++) {
					for (int k = 0; k < path[j]; k++) {
						y += DIR[j % 4][0];
						x += DIR[j % 4][1];
						grid[y][x] = '#';
					}
				}

				//
				for (int j = 0; j < grid.length; j++) {
					System.out.println(grid[j]);
				}
				if (i < d - 1) System.out.println();
			}
		}
	}
}