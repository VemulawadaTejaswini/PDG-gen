import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	static int dx[] = { 1, 0, 1, -1, 0, -1 };
	static int dy[] = { 0, 1, 1, 0, -1, -1 };

	static int matrix[][];
	static int color[][];
	static int dist[][];

	static Queue<Integer> queueX = new ArrayDeque<>();
	static Queue<Integer> queueY = new ArrayDeque<>();

	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;

	static final int MATRIX = 200;

	static int count = 0;
	static int t;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			t = Integer.parseInt(str[0]);
			int n = Integer.parseInt(str[1]);

			if (t == 0 && n == 0)
				break;

			matrix = new int[MATRIX][MATRIX];
			color = new int[MATRIX][MATRIX];
			dist = new int[MATRIX][MATRIX];

			queueX = new ArrayDeque<>();
			queueY = new ArrayDeque<>();

			for (int i = 0; i < n; i++) {
				str = br.readLine().split(" ");
				int x = Integer.parseInt(str[0]) + 100;
				int y = Integer.parseInt(str[1]) + 100;
				matrix[y][x] = -1;
			}
			str = br.readLine().split(" ");
			int sx = Integer.parseInt(str[0]) + 100;
			int sy = Integer.parseInt(str[1]) + 100;
			count = 1;
			bfs(sx, sy);
			System.out.println(count);
		}
	}

	static void bfs(int x, int y) {
		queueX.add(x);
		queueY.add(y);
		for (int i = 0; i < MATRIX; i++) {
			for (int j = 0; j < MATRIX; j++) {
				dist[i][j] = Integer.MAX_VALUE;
				color[i][j] = WHITE;
			}
		}
		color[y][x] = GRAY;
		dist[y][x] = 0;

		int a, b;

		while (!queueX.isEmpty() && !queueY.isEmpty()) {
			a = queueX.poll();
			b = queueY.poll();

			for (int i = 0; i < 6; i++) {
				int nx = a + dx[i];
				int ny = b + dy[i];

				if (nx >= 0 && nx < MATRIX && ny >= 0 && ny < MATRIX) {
					if (matrix[ny][nx] == -1)
						continue;
					if (color[ny][nx] == WHITE) {
						dist[ny][nx] = dist[b][a] + 1;
						if (dist[ny][nx] <= t) {
							color[ny][nx] = GRAY;
							queueX.add(nx);
							queueY.add(ny);
							count++;
						}
					}
				}
			}
			color[b][a] = BLACK;
		}
	}
}
