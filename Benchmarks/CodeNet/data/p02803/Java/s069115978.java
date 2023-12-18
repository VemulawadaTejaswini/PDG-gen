import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	private static int[][] delta = new int[][]{
			{1, 0}, {-1, 0}, {0, 1}, {0, -1}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();


		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = sc.nextLine().toCharArray();
		}

		int answer = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] != '.') continue;
				boolean[][] visited = new boolean[h][w];
				Queue<int[]> q = new LinkedList<>();
				q.offer(new int[]{i, j, 0});
				while (!q.isEmpty()) {
					int[] p = q.poll();
					visited[p[0]][p[1]] = true;
					for (int k = 0; k < delta.length; k++) {
						int y = delta[k][0] + p[0];
						int x = delta[k][1] + p[1];
						if (y >= h || y < 0) continue;
						if (x >= w || x < 0) continue;
						if (s[y][x] != '.') continue;
						if (visited[y][x]) continue;
						q.offer(new int[]{y, x, p[2] + 1});
					}
					if (q.isEmpty()) answer = Math.max(answer, p[2]);
				}
			}
		}
		System.out.println(answer);
	}
}
