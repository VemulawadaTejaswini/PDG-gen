import java.util.Arrays;
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

		Queue<int[]> q = new LinkedList<>();
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = sc.nextLine().toCharArray();
			if (!q.isEmpty()) continue;
			for (int j = 0; j < s[i].length; j++) {
				if (s[i][j] == '.') {
					q.offer(new int[]{i, j});
					break;
				}
			}
		}

		boolean[][] visited = new boolean[h][w];

		int[] last = new int[3];
		while (!q.isEmpty()) {
			int[] p = q.poll();
			visited[p[0]][p[1]] = true;
			for (int i = 0; i < delta.length; i++) {
				int y = delta[i][0] + p[0];
				int x = delta[i][1] + p[1];
				if (y >= h || y < 0) continue;
				if (x >= w || x < 0) continue;
				if (s[y][x] != '.') continue;
				if (visited[y][x]) continue;
				q.offer(new int[]{y, x});
			}
			if (q.isEmpty()) {
				last[0] = p[0];
				last[1] = p[1];
			}
		}

		for (int i = 0; i < h; i++) {
			Arrays.fill(visited[i], false);
		}

		int answer = 0;
		q.offer(last);
		while (!q.isEmpty()) {
			int[] p = q.poll();
			visited[p[0]][p[1]] = true;
			for (int i = 0; i < delta.length; i++) {
				int y = delta[i][0] + p[0];
				int x = delta[i][1] + p[1];
				if (y >= h || y < 0) continue;
				if (x >= w || x < 0) continue;
				if (visited[y][x]) continue;
				if (s[y][x] != '.') continue;
				q.offer(new int[]{y, x, p[2] + 1});
			}
			if (q.isEmpty()) answer = Math.max(answer, p[2]);
		}
		System.out.println(answer);
	}
}