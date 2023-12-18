import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	static String matrix[][];
	static int dist[][];
	static boolean used[][];

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	static int w;
	static int h;

	static int min = Integer.MAX_VALUE;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		h = Integer.parseInt(str[0]);
		w = Integer.parseInt(str[1]);

		matrix = new String[h][w];
		dist = new int[h][w];
		used = new boolean[h][w];

		int whiteSize = 0;

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				matrix[i][j] = str[j];
				dist[i][j] = Integer.MAX_VALUE;
				used[i][j] = false;

				if (matrix[i][j].equals("."))
					whiteSize++;
			}
		}
		bfs(0, 0);
		if (dist[h - 1][w - 1] == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(whiteSize - (dist[h - 1][w - 1] + 1));
	}

	static void bfs(int x, int y) {
		Queue<Integer> queueX = new ArrayDeque<>();
		Queue<Integer> queueY = new ArrayDeque<>();

		dist[y][x] = 0;
		used[y][x] = true;

		queueX.add(x);
		queueY.add(y);

		while (!queueX.isEmpty() && !queueY.isEmpty()) {
			int sx = queueX.poll();
			int sy = queueY.poll();

			for (int i = 0; i < 4; i++) {
				int nx = sx + dx[i];
				int ny = sy + dy[i];
				if (nx >= 0 && nx < w && ny >= 0 && ny < h) {
					if (matrix[ny][nx].equals(".") && !used[ny][nx]) {
						dist[ny][nx] = dist[sy][sx] + 1;
						used[ny][nx] = true;
						queueX.add(nx);
						queueY.add(ny);
					}
				}
			}
		}
	}
}