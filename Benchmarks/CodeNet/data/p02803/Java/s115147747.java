import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	private static int[][] delta = new int[][]{
			{1, 0}, {-1, 0}, {0, 1}, {0, -1}
	};

	private static class P {
		public int x;
		public int y;
		public int d;

		public P(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}

		int answer = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') continue;
				boolean[][] visited = new boolean[h][w];
				//Queue<int[]> q = new LinkedList<>();
				Queue<P> q = new LinkedList<>();
				//q.offer(new int[]{i, j, 0});
				q.offer(new P(j, i, 0));
				while (!q.isEmpty()) {
					P p = q.poll();
					//visited[p[0]][p[1]] = true;
					visited[p.y][p.x] = true;
					for (int k = 0; k < delta.length; k++) {
						int ny = delta[k][0] + p.y;
						int nx = delta[k][1] + p.x;
						if (nx >= 0 && nx < w && ny >= 0 && ny < h && s[ny][nx] == '.' && !visited[ny][nx]) {
							q.offer(new P(nx, ny, p.d + 1));
						}
					}
					if (q.isEmpty()) answer = Math.max(answer, p.d);
				}
			}
		}
		System.out.println(answer);
	}
}
