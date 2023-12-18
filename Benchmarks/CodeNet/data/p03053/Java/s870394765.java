import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Darker {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstLine = in.readLine().split(" ");
		int H = Integer.parseInt(firstLine[0]);
		int W = Integer.parseInt(firstLine[1]);
		boolean[][] grid = new boolean[H][W];
		Queue<Point> bfs = new LinkedList<Point>();
		
		for (int i = 0; i < H; i++) {
			String nextLine = in.readLine();
			for (int j = 0; j < nextLine.length(); j++) {
				if (nextLine.charAt(j) == '#') {
					grid[i][j] = true;
					bfs.add(new Point(i, j, 0));
				}
			}
		}
		
		int currentGeneration = 0;
		
		while (!bfs.isEmpty()) {
			Point next = bfs.poll();
			grid[next.x][next.y] = true;
			currentGeneration = next.generation;
			
			Point left = new Point(next.x - 1, next.y, next.generation + 1);
			if (inBounds(left, H, W) && !grid[left.x][left.y]) {
				bfs.add(left);
			}
			
			Point right = new Point(next.x + 1, next.y, next.generation + 1);
			if (inBounds(right, H, W) && !grid[right.x][right.y]) {
				bfs.add(right);
			}
			
			Point up = new Point(next.x, next.y - 1, next.generation + 1);
			if (inBounds(up, H, W) && !grid[up.x][up.y]) {
				bfs.add(up);
			}
			
			Point down = new Point(next.x, next.y + 1, next.generation + 1);
			if (inBounds(down, H, W) && !grid[down.x][down.y]) {
				bfs.add(down);
			}
		}
		
		System.out.println(currentGeneration);
	}
	
	static boolean inBounds(Point point, int H, int W) {
		return point.x >= 0 && point.y >= 0 && point.x < H && point.y < W;
	}
	
	static class Point {
		int x, y;
		int generation;
		
		public Point (int x, int y, int generation) {
			this.x = x;
			this.y = y;
			this.generation = generation;
		}
	}
}
