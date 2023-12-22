import java.util.*;
public class Main {

	public static void main(String[] args) {
		int[] dx = { 0, 1,1,1,0,-1,-1,-1};
		int[] dy = {-1,-1,0,1,1, 1, 0,-1};
		Scanner sc = new Scanner(System.in);

		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if ((w | h) == 0) break;
			int[][] map = new int[h][w];
			boolean[][] check = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int ans = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {

					if (map[i][j] == 0 || check[i][j]) continue;

					check[i][j] = true;
					ans++;
					Queue<Integer> queueX = new LinkedList<Integer>();
					Queue<Integer> queueY = new LinkedList<Integer>();

					queueX.add(j);
					queueY.add(i);

					while (!queueX.isEmpty()) {

						int x = queueX.poll();
						int y = queueY.poll();

						for (int k = 0; k < dx.length; k++) {
							int nextX = x + dx[k];
							int nextY = y + dy[k];

							if (0 <= nextY && nextY < h &&
								0 <= nextX && nextX < w &&
								!check[nextY][nextX] &&
								map[nextY][nextX] == 1) {

								check[nextY][nextX] = true;
								queueX.add(nextX);
								queueY.add(nextY);

							}

						}

					}

				}
			}
			System.out.println(ans);
		}
	}
}