import java.util.*;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int maxCheese = sc.nextInt();
		int ans = 0;
		char[][] map = new char[h][w];
		int[][] path = new int[h][w];
		int[] startX = new int[maxCheese + 1];
		int[] startY = new int[maxCheese + 1];
		int[] moveX = {0,0,-1,1};
		int[] moveY = {-1,1,0,0};
		boolean[][] check = new boolean[h][w];
		
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 'S') {
					startX[0] = j;
					startY[0] = i;
				} else if (map[i][j] != '.' && map[i][j] != 'X') {
					startX[map[i][j] - '0'] = j;
					startY[map[i][j] - '0'] = i;
				}
			}
		}
		
		for (int i = 0; i < startX.length - 1; i++) {

			int goalX = startX[i + 1];
			int goalY = startY[i + 1];
			Queue<Integer> queueX = new LinkedList<Integer>();
			Queue<Integer> queueY = new LinkedList<Integer>();

			path = new int[h][w];
			check = new boolean[h][w];
			
			path[startY[i]][startX[i]] = 0;
			check[startY[i]][startX[i]] = true;
			queueX.add(startX[i]);
			queueY.add(startY[i]);

			loop:
			while (!queueX.isEmpty()) {

				int x = queueX.poll();
				int y = queueY.poll();

				for (int j = 0; j < moveX.length; j++) {
					int nextX = x + moveX[j];
					int nextY = y + moveY[j];

					if (0 <= nextX && nextX < w &&
						0 <= nextY && nextY < h &&
						!check[nextY][nextX] &&
						map[nextY][nextX] != 'X') {
						
						check[nextY][nextX] = true;
						path[nextY][nextX] = path[y][x] + 1;
						queueX.add(nextX);
						queueY.add(nextY);
						
						if (nextY == goalY && nextX == goalX) {
							ans += path[nextY][nextX];
							break loop;
						}

					}

				}

			}

		}

		System.out.println(ans);

	}

}