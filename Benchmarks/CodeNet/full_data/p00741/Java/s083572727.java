import java.util.*;

public class Main {
	
	public static void dfs(int[][] map, int w, int h, int x, int y) {
		map[y][x] = 0;
		for (int dy = -1; dy <= 1; dy++) {
			for (int dx = -1; dx <= 1; dx++) {
				int nx = x + dx;
				int ny = y + dy;
				if (0 <= nx && nx < w && 0 <= ny && ny < h && map[ny][nx] == 1) {
					dfs(map, w, h, nx, ny);
				}
			}
		}
		return;
	}
	
	public static int solve(int[][] map, int w, int h) {
		int count = 0;
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				if (map[y][x] == 1) {
					dfs(map, w, h, x, y);
					count++;
				}
			}
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while (sc.hasNext()) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			int[][] map = new int[h][w];
			if (w == 0 && h == 0) {
				break;
			} else {
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						map[i][j] = sc.nextInt();
					}
				}
				output += solve(map, w, h) + "\n";
			}
		}
		sc.close();
		
		System.out.print(output);

	}

}