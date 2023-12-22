import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Refreshment Area
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		words = br.readLine().split(" ");

		int N, M, D;
		N = parseInt(words[0]);
		M = parseInt(words[1]);
		D = parseInt(words[2]);

		int[][] map = new int[N][M];
		int[][] mapH = new int[N][M];
		int[][] mapV = new int[N][M];

		for (int i = 0; i < N; i++) {
			line = br.readLine();
			for (int j = 0; j < M; j++) {
				if (line.charAt(j) == '.') {
					mapH[i][j] = mapV[i][j] = map[i][j] = 1;
				}
			}
		}

		//sum
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < M; j++) {
				if (map[i][j] != 0) mapH[i][j] += mapH[i][j - 1];
			}
		}

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] != 0) mapV[i][j] += mapV[i - 1][j];
			}
		}

		//solve
		int count = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0, _j = j + D - 1; _j < M; j++, _j++) {
				if (map[i][j] != 0 && mapH[i][_j] - mapH[i][j] == D - 1) count++;
			}
		}

		for (int i = 0, _i = i + D - 1; _i < N; i++, _i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] != 0 && mapV[_i][j] - mapV[i][j] == D - 1) count++;
			}
		}

		System.out.println(count);

	}
}