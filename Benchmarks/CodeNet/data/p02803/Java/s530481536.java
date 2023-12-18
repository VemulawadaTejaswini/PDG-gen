import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.Point;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		String[][] map = new String[h][w];
		String[][] copy = new String[h][w];
		for (int i = 0; i < map.length; i++) {
			map[i] = in.next().split("");
			copy[i] = Arrays.copyOf(map[i], map[i].length);
		}
		int max = 0;
		for (int l = 0; l < w; l++) {
			for (int m = 0; m < h; m++) {
				for (int n = 0; n < w; n++) {
					for (int o = 0; o < h; o++) {
						Point start = new Point(l, m);
						Point goal = new Point(n, o);
						int move = bfs(h, w, start, goal, map);
						if (max < move) {
							max = move;
						}
						for (int i = 0; i < map.length; i++) {
							map[i] = Arrays.copyOf(copy[i], copy[i].length);
						}
					}
				}
			}
		}
		System.out.println(max);
	}

	static int bfs(int h, int w, Point start, Point goal, String[][] map) {
		ArrayDeque<Point> dq = new ArrayDeque<>();
		dq.add(start);
		int[][] moves = new int[h][w];
		map[(int) start.getY()][(int) start.getX()] = "#";
		Point[] D4 = { new Point(0, -1), new Point(1, 0), new Point(0, 1), new Point(-1, 0) };
		while (dq.size() > 0) {
			Point p = dq.removeFirst();
			for (int i = 0; i < 4; i++) {
				int x = (int) p.getX() + (int) D4[i].getX();
				int y = (int) p.getY() + (int) D4[i].getY();
				if (x > -1 && x < w && y > -1 && y < h && map[y][x].equals(".")) {
					dq.addLast(new Point(x, y));
					map[y][x] = "#";
					moves[y][x] = moves[(int) p.getY()][(int) p.getX()] + 1;
				}
			}
		}
		return moves[(int) goal.getY()][(int) goal.getX()];
	}
}
