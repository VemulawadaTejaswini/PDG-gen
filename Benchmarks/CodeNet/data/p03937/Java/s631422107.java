import java.awt.Point;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int w = input.nextInt();
		input.nextLine();
		char[][] grid = new char[h][];
		for (int y = 0; y < h; y++) {
			grid[y] = input.nextLine().toCharArray();
		}
		if (grid[0][0] != '#') {
			System.out.println("Impossible");
			return;
		}
		boolean valid = false;
		Stack<Point> stack = new Stack<Point>();
		boolean[][] used = new boolean[h][w];
		boolean[][] visited = new boolean[h][w];
		stack.push(new Point(0, 0));
		visited[0][0] = true;
		while (!stack.isEmpty()) {
			Point p = stack.pop();
			int x = p.x;
			int y = p.y;
			used[y][x] = true;
			if (x == w-1 && y == h-1) {
				valid = true;
				break;
			}
			if (x < w-1 && grid[y][x+1] == '#' && !visited[y][x+1]) {
				stack.push(new Point(x+1, y));
				visited[y][x+1] = true;
			}
			if (y < h-1 && grid[y+1][x] == '#' && !visited[y+1][x]) {
				stack.push(new Point(x, y+1));
				visited[y+1][x] = true;
			}
		}
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				if (!used[y][x] && grid[y][x] == '#') {
					valid = false;
					break;
				}
			}
		}
		System.out.println(valid ? "Possible" : "Impossible");
	}
}
