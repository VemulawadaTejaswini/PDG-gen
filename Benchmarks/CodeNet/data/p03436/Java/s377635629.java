import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static final char WALL = '#';

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();

			scanner.nextLine();

			char[][] map = new char[h][w];
			int[][] scoreMap = new int[h][w];
			int white = 0;
			for (int i = 0; i < h; i++) {
				String line = scanner.nextLine();
				for (int j = 0; j < w; j++) {
					map[i][j] = line.charAt(j);
					scoreMap[i][j] = Integer.MAX_VALUE;
					if (map[i][j] == '.') {
						white++;
					}
				}
			}

			scoreMap[0][0] = 0;

			List<Point> moves = new ArrayList<>(4);
			moves.add(new Point(0, -1));
			moves.add(new Point(1, 0));
			moves.add(new Point(0, 1));
			moves.add(new Point(-1, 0));

			int result = check(0, 0, moves, new Point(w - 1, h - 1), 0, scoreMap, map, Integer.MAX_VALUE, w, h);
			if (result == Integer.MAX_VALUE) {
				System.out.println(-1);
			} else {
				System.out.println(white - result - 1);
			}
		}
	}

	private static int check(int startX, int startY, List<Point> moves, Point end, int cost, int[][] scoreMap, char[][] map, int minPath, int w, int h) {
		int nowMinPath = minPath;

		cost++;
		for (Point move : moves) {
			int x = startX + move.x;
			int y = startY + move.y;
			if (x < 0 || x >= w || y < 0 || y >= h) {
				continue;
			}
			if (map[y][x] == WALL) {
				continue;
			}
			if (end.x == x && end.y == y) {
				if (cost < minPath) {
					nowMinPath = cost;
				}
				continue;
			}
			if (cost < scoreMap[y][x]) {
				scoreMap[y][x] = cost;
				if (cost == nowMinPath) {
					continue;
				}
				int p = check(x, y, moves, end, cost, scoreMap, map, nowMinPath, w, h);
				if (p < nowMinPath) {
					nowMinPath = p;
				}
			}
		}
		return nowMinPath;
	}
}
