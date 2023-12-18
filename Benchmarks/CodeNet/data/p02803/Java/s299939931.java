import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] delta = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] g = new char[h][w];
		for (int i = 0; i < h; i++) {
			g[i] = sc.next().toCharArray();
		}

		int answer = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (g[i][j] != '.') continue;
				boolean[][] visited = new boolean[h][w];
				int[][] d = new int[h][w];
				for (int l = 0; l < h; l++) {
					Arrays.fill(d[l], 10000);
				}

				Queue<int[]> q = new LinkedList<>();
				q.offer(new int[]{i, j, 0});
				//d[i][j] = 0;
				visited[i][j] = true;
				while (!q.isEmpty()) {
					int[] p = q.poll();
					visited[p[0]][p[1]] = true;
					for (int k = 0; k < 4; k++) {
						int ny = delta[k][0] + p[0];
						int nx = delta[k][1] + p[1];
						if (nx < 0 || nx >= w || ny < 0 || ny >= h) continue;
						//if (g[ny][nx] != '.' || d[ny][nx] != 10000) continue;
						if (g[ny][nx] != '.' || visited[ny][nx]) continue;
						d[ny][nx] = p[2] + 1;
						q.offer(new int[]{ny, nx, p[2] + 1});
					}

					//if (q.isEmpty()) answer = Math.max(answer, p[2]);
				}

				for (int k = 0; k < h; k++) {
					for (int l = 0; l < w; l++) {
						if (d[k][l] < 10000) answer = Math.max(answer, d[k][l]);
					}
				}
			}
		}
		System.out.println(answer);
	}
}
