import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int h, w;
	static char[][] fruitFarm;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static Deque<int[]> stack;
	
	public static void main(String args[]){
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (h == 0 && w == 0) break;
			fruitFarm = new char[h][w];
			for (int i = 0; i < h; i++) {
				String s = sc.next();
				for (int j = 0; j < w; j++) {
					fruitFarm[i][j] = s.charAt(j);
				}
			}
			int answer = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (fruitFarm[i][j] != '.') {
						stack = new ArrayDeque<int[]>();
						stack.offer(new int[]{i, j});
						while (!stack.isEmpty()) {
							int xy[] = stack.poll();
							int x = xy[0];
							int y = xy[1];
							dfs(x, y);
						}
						answer++;
					}
				}
			}
			System.out.println(answer);
		}
	}
	
	static void dfs(int x, int y) {
		char target = fruitFarm[x][y];
		fruitFarm[x][y] = '.';
		for (int k = 0; k < 4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			if (target != '.' && nx >= 0 && nx <= h - 1 && ny >= 0 && ny <= w - 1 && fruitFarm[nx][ny] == target) {
				stack.offer(new int[]{nx, ny});
			}
		}
	}
}
