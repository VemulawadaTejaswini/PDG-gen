import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
	static int n;
	static int h;
	static int w;

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		h = Integer.parseInt(str[0]);
		w = Integer.parseInt(str[1]);

		String matrix[][] = new String[h][w];

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				matrix[i][j] = str[j];
			}
		}

		int max = 0;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int dist[][] = new int[h][w];
				if (matrix[i][j].equals(".")) {
					dist = bfs(matrix, j, i);
				}
				for (int k = 0; k < h; k++) {
					for (int l = 0; l < w; l++) {
						max = Math.max(max, dist[k][l]);
					}
				}
			}
		}
		System.out.println(max);
	}

	static int[][] bfs(String matrix[][], int sx, int sy) {
		int dist[][] = new int[h][w];
		boolean used[][] = new boolean[h][w];

		Queue<Integer> qX = new ArrayDeque<>();
		Queue<Integer> qY = new ArrayDeque<>();
		qX.add(sx);
		qY.add(sy);
		used[sy][sx] = true;
		dist[sy][sx] = 0;

		while (!qX.isEmpty() && !qY.isEmpty()) {
			int x = qX.poll();
			int y = qY.poll();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < w && ny >= 0 && ny < h && matrix[ny][nx].equals(".")) {
					if (!used[ny][nx]) {
						used[ny][nx] = true;
						dist[ny][nx] = dist[y][x] + 1;
						qX.add(nx);
						qY.add(ny);
					}
				}
			}
		}
		return dist;
	}
}