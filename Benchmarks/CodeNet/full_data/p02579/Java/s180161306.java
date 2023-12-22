import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int Ch = sc.nextInt();
		int Cw = sc.nextInt();
		int Dh = sc.nextInt();
		int Dw = sc.nextInt();
		Main main = new Main();
		int map[][] = new int[H][W];
		int result = Integer.MAX_VALUE;
		char c[][] = new char[H][W];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			char temp[] = s.toCharArray();
			for (int j = 0; j < W; j++) {
				c[i][j] = temp[j];
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				map[i][j] = -1;
			}
		}
		Queue<Point> queue = new ArrayDeque<Point>();
		List<Point> accessList = new ArrayList<Point>();
		Point p = main.new Point();
		p.x = Ch - 1;
		p.y = Cw - 1;
		queue.add(p);
		accessList.add(p);
		map[Ch - 1][Cw - 1] = 0;
		while (queue.size() > 0 || accessList.size() > 0) {
			if (queue.size() > 0) {
				Point t = queue.poll();
				Point temp = main.new Point();
				if (t.x - 1 >= 0 && map[t.x - 1][t.y] == -1 && c[t.x - 1][t.y] != '#') {
					temp.x = t.x - 1;
					temp.y = t.y;
					map[t.x - 1][t.y] = map[t.x][t.y];
					queue.add(temp);
					accessList.add(temp);
				}
				temp = main.new Point();
				if (t.y - 1 >= 0 && map[t.x][t.y - 1] == -1 && c[t.x][t.y - 1] != '#') {
					temp.x = t.x;
					temp.y = t.y - 1;
					map[t.x][t.y - 1] = map[t.x][t.y];
					queue.add(temp);
					accessList.add(temp);
				}
				temp = main.new Point();
				if (t.x + 1 < H && map[t.x + 1][t.y] == -1 && c[t.x + 1][t.y] != '#') {
					temp.x = t.x + 1;
					temp.y = t.y;
					map[t.x + 1][t.y] = map[t.x][t.y];
					queue.add(temp);
					accessList.add(temp);
				}
				temp = main.new Point();
				if (t.y + 1 < W && map[t.x][t.y + 1] == -1 && c[t.x][t.y + 1] != '#') {
					temp.x = t.x;
					temp.y = t.y + 1;
					map[t.x][t.y + 1] = map[t.x][t.y];
					queue.add(temp);
					accessList.add(temp);
				}
			} else {
				List<Point> aList = new ArrayList<Point>();
				for (Point t : accessList) {
					for (int i = -2; i <= 2; i++) {
						for (int j = -2; j <= 2; j++) {
							Point temp = main.new Point();
							if (i == 0 || j == 0) {
								continue;
							}
							if ((i == -1 && j == 0) || (i == 1 && j == 0) || (i == 0 && j == 1)
									|| (i == 0 && j == -1)) {
								continue;
							}
							if (t.x + i >= 0 && t.x + i < H && t.y + j >= 0 && t.y + j < W
									&& map[t.x + i][t.y + j] == -1 && c[t.x + i][t.y + j] != '#') {
								temp.x = t.x + i;
								temp.y = t.y + j;
								queue.add(temp);
								map[t.x + i][t.y + j] = map[t.x][t.y] + 1;
								aList.add(temp);
							}
						}
					}
				}
				accessList = aList;
			}
		}
		System.out.println(map[Dh - 1][Dw - 1]);
	}

	public class Point extends Object {
		int x;
		int y;

		public int hashCode() {
			return x * 100 + y;
		}

		public boolean equals(Object o) {
			Point temp = (Point) o;
			if (temp.x == x && temp.y == y) {
				return true;
			}
			return false;
		}
	}
}