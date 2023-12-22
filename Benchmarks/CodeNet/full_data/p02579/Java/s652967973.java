import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int h, w;
	static char[][] board;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		h = in.nextInt();
		w = in.nextInt();
		int sy = in.nextInt() - 1;
		int sx = in.nextInt() - 1;
		int ey = in.nextInt() - 1;
		int ex = in.nextInt() - 1;

		board = new char[h][w];
		for (int y = 0; y < h; y++) {
			String line = in.next();
			for (int x = 0; x < w; x++) {
				board[x][y] = line.charAt(x);
			}
		}

		Queue<Integer> xs = new LinkedList<Integer>();
		Queue<Integer> ys = new LinkedList<Integer>();
		int[][] dist = new int[w][h];
		for (int x = 0; x < w; x++) {
			Arrays.fill(dist[x], 1000000);
		}
		dist[sx][sy] = 0;
		
		xs.add(sx);
		ys.add(sy);

		while (!xs.isEmpty()) {
			int cx = xs.remove(), cy = ys.remove();
			int[] dirx0 = { -1, 1, 0, 0 };
			int[] diry0 = { 0, 0, -1, 1 };
			for (int i = 0; i < 4; i++) {
				int nx = cx + dirx0[i], ny = cy + diry0[i];
				if (!isLegal(nx, ny))
					continue;
				if (dist[nx][ny] > dist[cx][cy]) {
					dist[nx][ny] = dist[cx][cy];
					xs.add(nx);
					ys.add(ny);
				}
			}
			for (int dx = -2; dx <= 2; dx++) {
				for (int dy = -2; dy <= 2; dy++) {
					int nx = cx + dx, ny = cy + dy;
					if (!isLegal(nx, ny))
						continue;
					if (dist[nx][ny] > dist[cx][cy] + 1) {
						dist[nx][ny] = dist[cx][cy] + 1;
						xs.add(nx);
						ys.add(ny);
					}
				}
			}
		}
		System.out.println(dist[ex][ey] >= 1000000 ? -1 : dist[ex][ey]);

		in.close();
	}

	static boolean isLegal(int x, int y) {
		return x >= 0 && x < w && y >= 0 && y < h && board[x][y] == '.';
	}
}
