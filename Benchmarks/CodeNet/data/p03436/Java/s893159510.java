import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		int blocks = H*W;
		int blacks = 0;
		char[][] c = new char[H][W];
		boolean[][] visited = new boolean[H][W];
		for(int i=0; i<H; i++) {
			c[i] = sc.next().toCharArray();
			for(int j=0; j<W; j++) {
				visited[i][j] = false;
				if(c[i][j] == '#')
					blacks++;
			}
		}

		//座標
		class Point{
			int x;
			int y;

			public Point(int x, int y) {
				this.x = x;
				this.y = y;
			}

			@Override
			public boolean equals(Object obj) {
				if(obj instanceof Point) {
					Point p = (Point)obj;

					if(this.x == p.x && this.y == p.y)
						return true;
					else
						return false;
				}

				return false;
			}

			@Override
			public int hashCode() {
				return Objects.hash(x, y);
			}

		}

		int min_distance = -1;
		int[][] distance = new int[H][W];

		List<Point> direction = new ArrayList<>();
		Point down = new Point(-1, 0);
		Point left = new Point(0, -1);
		Point up = new Point(1, 0);
		Point right = new Point(0, 1);

		Queue<Point> queue = new ArrayDeque<>();
		queue.add(new Point(0, 0));
		while(!queue.isEmpty()) {
			Point p = queue.poll();
			int h = p.x;
			int w = p.y;

			if(h == H-1 && w == W-1) {
				min_distance = distance[h][w];
				break;
			}

			//訪問済み
			visited[h][w] = true;

			direction.clear();
			if(h-1 >= 0)
				direction.add(down);
			if(w-1 >= 0)
				direction.add(left);
			if(h+1 < H)
				direction.add(up);
			if(w+1 < W)
				direction.add(right);

			for(Point dir : direction) {
				int n_h = h + dir.x;
				int n_w = w + dir.y;

				Point n_p = new Point(n_h, n_w);
				if(!queue.contains(n_p) && !visited[n_h][n_w] && c[n_h][n_w] != '#') {
					queue.add(n_p);
					distance[n_h][n_w] = distance[h][w] + 1;
				}
			}
		}

		if(min_distance == -1)
			System.out.println(-1);
		else {
			int ans = blocks - (min_distance+1) - blacks;
			System.out.println(ans);
		}

	}
}
