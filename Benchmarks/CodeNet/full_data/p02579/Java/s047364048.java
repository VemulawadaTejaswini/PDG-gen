import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static int[][] maze;

	public static int h;

	public static int w;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		maze = new int[h][w];
		// start
		int ch = sc.nextInt() - 1;
		int cw = sc.nextInt() - 1;
		maze[ch][cw] = 1;
		// goal
		int dh = sc.nextInt() - 1;
		int dw = sc.nextInt() - 1;
		for (int i = 0; i < w; i++) {
			String row = sc.next();
			for (int j = 0; j < h; j++) {
				if (row.charAt(j) == '#') {
					maze[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		sc.close();

		int count = 1;
		while (!isGoaled(dh, dw)) {
			walk(count);
			if (isGoaled(dh, dw)) {
				break;
			}
			warp(count);
			count++;
		}
		print(maze[dh][dw] - 1);
	}

	public static void walk(int count) {
		Stack<Point> stack = new Stack<>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (maze[i][j] == count) {
					Point p = new Point(i, j);
					stack.push(p);
				}
			}
		}
		while (!stack.isEmpty()) {
			Point p = stack.pop();
			int h = p.getHeight();
			int w = p.getWidth();
			try {
				if (maze[h - 1][w] == 0) {
					maze[h - 1][w] = count;
					stack.push(new Point(h - 1, w));
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 1][w] == 0) {
					maze[h + 1][w] = count;
					Point point = new Point(h + 1, w);
					stack.push(point);
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h][w - 1] == 0) {
					maze[h][w - 1] = count;
					stack.push(new Point(h, w - 1));
				}
			} catch (Exception e) {
			}
			try {

				if (maze[h][w + 1] == 0) {
					maze[h][w + 1] = count;
					stack.push(new Point(h, w + 1));
				}
			} catch (Exception e) {
			}
		}
	}

	public static void warp(int count) {
		int warpCount = 0;
		Stack<Point> stack = new Stack<>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (maze[i][j] == count) {
					Point p = new Point(i, j);
					stack.push(p);
				}
			}
		}

		while (!stack.isEmpty()) {
			Point p = stack.pop();
			int h = p.getHeight();
			int w = p.getWidth();
			try {
				if (maze[h - 2][w - 2] == 0) {
					maze[h - 2][w - 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h - 2][w - 1] == 0) {
					maze[h - 2][w - 1] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h - 2][w] == 0) {
					maze[h - 2][w] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h - 2][w + 1] == 0) {
					maze[h - 2][w + 1] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h - 2][w + 2] == 0) {
					maze[h - 2][w + 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h - 1][w - 2] == 0) {
					maze[h - 1][w - 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h - 1][w - 1] == 0) {
					maze[h - 1][w - 1] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h - 1][w + 1] == 0) {
					maze[h - 1][w + 1] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h - 1][w + 2] == 0) {
					maze[h - 1][w + 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h][w - 2] == 0) {
					maze[h][w - 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h][w + 2] == 0) {
					maze[h][w + 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 1][w - 2] == 0) {
					maze[h + 1][w - 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 1][w - 1] == 0) {
					maze[h + 1][w - 1] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 1][w + 1] == 0) {
					maze[h + 1][w + 1] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 1][w + 2] == 0) {
					maze[h + 1][w + 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 2][w - 2] == 0) {
					maze[h + 2][w - 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 2][w - 1] == 0) {
					maze[h + 2][w - 1] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 2][w] == 0) {
					maze[h + 2][w] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 2][w + 1] == 0) {
					maze[h + 2][w + 1] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}
			try {
				if (maze[h + 2][w + 2] == 0) {
					maze[h + 2][w + 2] = count + 1;
					warpCount++;
				}
			} catch (Exception e) {
			}

		}
		if (warpCount == 0) {
			print(-1);
			System.exit(0);
		}
	}

	public static boolean isGoaled(int h, int w) {
		return maze[h][w] != 0;
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}

class Point {

	public int height;
	public int width;

	public Point(int h, int w) {
		height = h;
		width = w;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
}
