import java.util.*;

public class Main {

	public static int[][] setColor (int[][] board, int c, int d, int x, int y) {
		int w = d == 0 ? 4 : 2;
		int h = d == 1 ? 4 : 2;
		for (int i = y; i <= y + h - 1; i++) {
			for (int j = x; j <= x + w - 1; j++)
				board[i][j] = c;
		}
		return board;
	}

	public static boolean bfs (int[][] board, int xs, int ys, int xg, int yg, boolean[][] check) {

		int[] dx = {0,0,-1,1}, dy = {-1,1,0,0};
		int startColor = board[ys][xs];

		Queue<Integer> queueX = new LinkedList<Integer>();
		Queue<Integer> queueY = new LinkedList<Integer>();

		queueX.add(xs);
		queueY.add(ys);
		check[ys][xs] = true;

		while (!queueX.isEmpty()) {

			int x = queueX.poll();
			int y = queueY.poll();

			for (int i = 0; i < dx.length; i++) {

				int nextX = x + dx[i];
				int nextY = y + dy[i];

				if (0 <= nextY && nextY < board.length &&
					0 <= nextX && nextX < board[0].length &&
					board[nextY][nextX] == startColor &&
					!check[nextY][nextX]) {

					check[nextY][nextX] = true;
					queueX.add(nextX);
					queueY.add(nextY);

				}

			}

		}

		return check[yg][xg];

	}

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0 && h == 0) break;

			int[][] board = new int[h][w];
			boolean[][] check = new boolean[h][w];

			int xs = sc.nextInt() - 1;
			int ys = sc.nextInt() - 1;
			int xg = sc.nextInt() - 1;
			int yg = sc.nextInt() - 1;
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				int c = sc.nextInt();
				int d = sc.nextInt();
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				board = setColor(board,c,d,x,y);
			}

			System.out.println(bfs(board,xs,ys,xg,yg,check) ? "OK" : "NG");

		}

	}

}