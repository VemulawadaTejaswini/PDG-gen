import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> setX = new HashSet<Integer>();
		Set<Integer> setY = new HashSet<Integer>();
		for (int i = 0; i <= 100; i++) {
			setX.add(i);
			setY.add(i);
		}

		int[][] hArray = new int[101][101];
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				hArray[i][j] = -1;
			}
		}
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			points[i] = new Point(sc.nextInt(), sc.nextInt(), sc.nextInt());
			hArray[points[i].x][points[i].y] = points[i].h;
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int minX = Math.min(points[i].x, points[j].x);
				int maxX = Math.max(points[i].x, points[j].x);
				int minY = Math.min(points[i].y, points[j].y);
				int maxY = Math.max(points[i].y, points[j].y);
				int dis = maxX - minX + maxY - minY;
				int dh = Math.abs(points[i].h - points[j].h);
				if (dis == dh) {
					int startX = -1;
					int startY = -1;
					if (points[i].h > points[j].h) {
						startX = points[i].x;
						startY = points[i].y;
					} else {
						startX = points[j].x;
						startY = points[j].y;
					}
					if (minX != maxX) {
						if (startX == maxX) {
							for (int dx = 0; dx < startX; dx++) {
								setX.remove(dx);
							}
						} else {
							for (int dx = startX + 1; dx <= 100; dx++) {
								setX.remove(dx);
							}
						}
					}
					if (minY != maxY) {
						if (startY == maxY) {
							for (int dy = 0; dy < startY; dy++) {
								setY.remove(dy);
							}
						} else {
							for (int dy = startY + 1; dy <= 100; dy++) {
								setY.remove(dy);
							}
						}
					}
				} else {
					for (int dx = 0; dx < minX; dx++) {
						setX.remove(dx);
					}
					for (int dx = maxX + 1; dx <= 100; dx++) {
						setX.remove(dx);
					}
					for (int dy = 0; dy < minY; dy++) {
						setY.remove(dy);
					}
					for (int dy = maxY + 1; dy <= 100; dy++) {
						setY.remove(dy);
					}
				}
			}
		}

		int ansX = -1;
		int ansY = -1;
		int ansH = -1;
		for (int x : setX) {
			for (int y : setY) {
				int h = -1;
				if (hArray[x][y] == -1) {
					h = points[0].h + Math.abs(points[0].x - x) + Math.abs(points[0].y - y);
				} else {
					h = hArray[x][y];
				}
				if (h > ansH) {
					ansX = x;
					ansY = y;
					ansH = h;
				}
			}
		}
		System.out.println(ansX + " " + ansY + " " + ansH);
	}

	static class Point {
		int x;
		int y;
		int h;
		public Point(int x, int y, int h) {
			this.x = x;
			this.y = y;
			this.h = h;
		}
	}
}
