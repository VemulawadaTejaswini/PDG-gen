import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] maze = new char[h][w];
		int[][] distance = new int[h][w];
		Boolean[][] flag = new Boolean[h][w];
		int whiteCount = 0;
		
		for (int i = 0; i < h; i++) {
			String line = sc.next(); 
			for (int j = 0; j < w; j++) {
				char c = line.charAt(j);
				maze[i][j] = c;
				if (c == '.') {
					whiteCount++;
				}
			}
		}
	
		for (int i = 0; i < h; i++) {
			Arrays.fill(distance[i], Integer.MAX_VALUE);
		}
		
		for (int i = 0; i < h; i++) {
			Arrays.fill(flag[i], false);
		}
		
		Deque<Point> queue = new ArrayDeque<>();
		Point start = new Point(0, 0);
		flag[start.y][start.x] = true;
		distance[0][0] = 1;
		queue.addLast(start);
		int dx[] = {1, 0, -1, 0};
		int dy[] = {0, 1, 0, -1};
		
		while (!queue.isEmpty()) {
			Point p = queue.removeFirst();
			
			for (int i = 0; i < 4; i++) {
				int tmpX = p.x + dx[i];
				int tmpY = p.y + dy[i];
				if (tmpX >= 0 && tmpX < w && tmpY >= 0 && tmpY < h && flag[tmpY][tmpX] == false && maze[tmpY][tmpX] == '.') {
					flag[tmpY][tmpX] = true;
					queue.addLast(new Point(tmpX, tmpY));
					//if (distance[tmpY][tmpX] < distance[p.y][p.x] + 1) {
						distance[tmpY][tmpX] = distance[p.y][p.x] + 1;
					//}
				}
			}
		}
		if (flag[h - 1][w - 1]) {
			System.out.println(whiteCount - distance[h - 1][w - 1]);
		} else {
			System.out.println(-1);
		}
		
		/*
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(distance[i][j] + " ");
			}
			System.out.println();
		}
		*/
	}
}

class Point {
	public int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}