import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	static final int INF = -1;
	static char[][] maze;
	static int h;
	static int w;
	static int sx, sy;
	static int[][] d;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	static int bfs() {
		if (maze[sx][sy] == '#') {
			return 0;
		}
		Deque<int[]> que = new ArrayDeque<>();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				d[i][j] = INF;
			}
		}

		int[] pair = {sx, sy};
		que.add(pair);

		d[sx][sy] = 0;

		while (que.size() > 0) {
			int[] p = que.pop();

			for (int i = 0; i < 4; i++) {
				int nx = p[0] + dx[i];
				int ny = p[1] + dy[i];

				if (0 <= nx
					&& nx < h
					&& 0 <= ny
					&& ny < w
					&& maze[nx][ny] != '#'
					&& d[nx][ny] == INF) {
					int[] arr = {nx, ny};
					que.add(arr);
					d[nx][ny] = d[p[0]][p[1]] + 1;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
//				System.out.printf("%3d", d[i][j]);
				if (d[i][j] > max) {
					max = d[i][j];
				}
			}
//			System.out.println();
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		maze = new char[h][w];
		d = new int[h][w];
		for (int i = 0; i < h; i++) {
			maze[i] = sc.next().toCharArray();
		}

		int max = 0;
		for (int i = 0; i < h; i++) {
			sx = i;
			for (int j = 0; j < w; j++) {
				sy = j;
				int dis = bfs();
				if (dis > max) {
					max = dis;
				}
			}
		}

		System.out.println(max);

		sc.close();
	}


}

