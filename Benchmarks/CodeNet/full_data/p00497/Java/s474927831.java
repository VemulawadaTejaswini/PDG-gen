import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * ???(Nails)
 * --------------------
 * JOI 11th, Fin.4
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));

		int[][] grid = new int[N + 3][N + 3];

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a, b, x;
			a = parseInt(st.nextToken());
			b = parseInt(st.nextToken());
			x = parseInt(st.nextToken());

			grid[a][b] += 1;
			grid[a][b + 1] -= 1;

			grid[a + x + 1][b] -= 1;
			grid[a + x + 1][b + x + 2] += 1;

			grid[a + x + 2][b + 1] += 1;
			grid[a + x + 2][b + x + 2] -= 1;
		}

//		Arrays.stream(grid).forEach(x -> System.out.println(Arrays.toString(x)));
//		System.out.println();

		for (int i = 1; i < N + 3; i++) {
			for (int j = 1; j < N + 3; j++) {
				grid[i][j] += grid[i][j - 1];
			}
		}

		for (int i = 1; i < N + 3; i++) {
			for (int j = 1; j < N + 3; j++) {
				grid[i][j] += grid[i - 1][j];
			}
		}

		for (int i = 1; i < N + 3; i++) {
			for (int j = 1; j < N + 3; j++) {
				grid[i][j] += grid[i - 1][j - 1];
			}
		}

//		Arrays.stream(grid).forEach(x -> System.out.println(Arrays.toString(x)));
//		System.out.println();

		int count = 0;

		for (int i = 0; i < N + 3; i++) {
			for (int j = 0; j < N + 3; j++) {
				if (grid[i][j] > 0) count++;
			}
		}

		System.out.println(count);
	}
}