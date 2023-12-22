

import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//sc.next();
		for(int k = 0; k < n; k++) {
			char[][] c = new char[8][8];
			for(int i = 0; i < 8; i++) {
				String s = sc.next();
				for(int j = 0; j < 8; j++) {
					c[i][j] = s.charAt(j);
				}
			}
			int X = sc.nextInt() - 1;
			int Y = sc.nextInt() - 1;
			//sc.next();
			Deque<Point> q = new ArrayDeque<Point>();
			q.addLast(new Point(X, Y));
			int[] dx = {1, -1, 0, 0};
			int[] dy = {0, 0, 1, -1};
			c[Y][X] = '0';
			while(!q.isEmpty()){
				Point p = q.pollLast();
				for(int i = 0; i < 4; i++) {
					for(int j = 1; j <= 3; j++) {
						int nx = p.x + j * dx[i];
						int ny = p.y + j * dy[i];
						if(nx >= 0 && nx < 8 && ny >= 0 && ny < 8 && c[ny][nx] == '1') {
							c[ny][nx] = '0';
							q.addLast(new Point(nx, ny));
						}
					}
				}
			}
			System.out.println("Data " + (k + 1) + ":");
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					System.out.print(c[i][j]);
				}
				System.out.println();
			}

		}
		sc.close();
	}
}
