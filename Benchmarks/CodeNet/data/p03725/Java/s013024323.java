import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int h = in.nextInt(), w = in.nextInt(), k = in.nextInt();

		String[] mazes = new String[h];

		for (int i = 0; i < mazes.length; i++) {
			mazes[i] = in.next();
		}
		in.close();

		char[][] maze = new char[h][w];
		for (int i = 0; i < mazes.length; i++) {
			for (int j = 0; j < mazes[0].length(); j++) {
				maze[i][j] = mazes[i].charAt(j);
			}
		}

		int[] dx = { -1, 0, 1, 0 }, dy = { 0, -1, 0, 1 };

		int sx = -1, sy = -1;
		for (int i = 1; i < maze.length - 1; ++i) {
			for (int j = 0; j < maze[0].length - 1; j++) {
				if (maze[i][j] == 'S') {
					sy = i;
					sx = j;
				}

			}
		}
		int x1, x2, y1, y2, min;
		x1 = sx;
		y1 = sy;
		x2 = w - 1 - sx;
		y2 = h - 1 - sy;

		min = Math.min(x1, Math.min(y1, Math.min(x2, y2)));

		int maxAns = min / k;
		if (min % k > 0)
			++maxAns;
		++maxAns;

		Queue<Pair> que = new LinkedList<>();
		Queue<Pair> que2 = new LinkedList<>();
		Queue<Pair> queAns = new LinkedList<>();
		que.add(new Pair(sy, sx));
		for (int i = 0; i <= k && !que.isEmpty();) {
			while (!que.isEmpty()) {
				Pair p = que.poll();
				que2.add(p);
				queAns.add(p);
			}
			while (!que2.isEmpty()) {
				Pair p = que2.poll();
				int px = p.x, py = p.y;
				for (int j = 0; j < dy.length; j++) {
					if (0 <= py + dy[j] && py + dy[j] < h && 0 <= px + dx[j] && px + dx[j] < w
							&& maze[py + dy[j]][px + dx[j]] != '#') {
						que.add(new Pair(py + dy[j], px + dy[j]));
						maze[py + dy[j]][px + dx[j]] = '#';
					}
				}
			}
			++i;
		}
		while(!queAns.isEmpty()) {
			Pair p = queAns.poll();
			sx = p.x;
			sy = p.y;
			x1 = sx;
			y1 = sy;
			x2 = w - 1 - sx;
			y2 = h - 1 - sy;

			min = Math.min(maxAns, Math.min(x1, Math.min(y1, Math.min(x2, y2))));
		}
		System.out.println(min);
	}

}

class Pair {
	int x, y;

	public Pair(int y, int x) {
		this.y = y;
		this.x = x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}