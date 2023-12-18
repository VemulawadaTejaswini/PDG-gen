import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char maze[][] = new char[H][W];
		for (int i = 0; i < H; i++) {
			char temp[] = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				maze[i][j] = temp[j];
			}
		}
		int max = 0;
		Main main = new Main();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (maze[i][j] == '.') {
					int m[][] = new int[H][W];
					m[i][j] = -1;
					Queue<Point> q = new ArrayDeque<Point>();
					Point p = main.new Point();
					p.x = i;
					p.y = j;
					q.add(p);
					while (q.isEmpty() != true) {
						Queue<Point> t = new ArrayDeque<Point>();
						while (q.isEmpty() != true) {
							p = q.poll();
							if (p.x - 1 >= 0) {
								if (maze[p.x - 1][p.y] == '.' && m[p.x - 1][p.y] == 0) {
									m[p.x - 1][p.y] = m[p.x][p.y] + 1;
									if (m[p.x - 1][p.y] == 0) {
										m[p.x - 1][p.y] = 1;
									}
									if (m[p.x - 1][p.y] > max) {
										max = m[p.x - 1][p.y];
									}
									Point po = main.new Point();
									po.x = p.x - 1;
									po.y = p.y;
									t.add(po);
								}
							}
							if (p.x + 1 < H) {
								if (maze[p.x + 1][p.y] == '.' && m[p.x + 1][p.y] == 0) {
									m[p.x + 1][p.y] = m[p.x][p.y] + 1;
									if (m[p.x + 1][p.y] == 0) {
										m[p.x + 1][p.y] = 1;
									}
									if (m[p.x + 1][p.y] > max) {
										max = m[p.x + 1][p.y];
									}
									Point po = main.new Point();
									po.x = p.x + 1;
									po.y = p.y;
									t.add(po);
								}
							}
							if (p.y - 1 >= 0) {
								if (maze[p.x][p.y - 1] == '.' && m[p.x][p.y - 1] == 0) {
									m[p.x][p.y - 1] = m[p.x][p.y] + 1;
									if (m[p.x][p.y - 1] == 0) {
										m[p.x][p.y - 1] = 1;
									}
									if (m[p.x][p.y - 1] > max) {
										max = m[p.x][p.y - 1];
									}
									Point po = main.new Point();
									po.x = p.x;
									po.y = p.y - 1;
									t.add(po);
								}
							}
							if (p.y + 1 < W) {
								if (maze[p.x][p.y + 1] == '.' && m[p.x][p.y + 1] == 0) {
									m[p.x][p.y + 1] = m[p.x][p.y] + 1;
									if (m[p.x][p.y + 1] == 0) {
										m[p.x][p.y + 1] = 1;
									}
									if (m[p.x][p.y + 1] > max) {
										max = m[p.x][p.y + 1];
									}
									Point po = main.new Point();
									po.x = p.x;
									po.y = p.y + 1;
									t.add(po);
								}
							}
						}
						q = t;
					}
				}
			}
		}
		System.out.println(max);
	}

	public class Point {
		int x;
		int y;
	}
}