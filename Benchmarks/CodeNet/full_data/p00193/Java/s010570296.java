
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			m = scanner.nextInt();
			if (m == 0)
				break;
			n = scanner.nextInt();
			s = scanner.nextInt();
			int[][][] a = new int[s][m][n];
			for (int i = 0; i < s; i++) {
				a[i] = bfs(scanner.nextInt() - 1, scanner.nextInt() - 1);
			}
			int max = 0;
			int t = scanner.nextInt();
			while (t-- > 0) {
				int[][] r = bfs(scanner.nextInt() - 1, scanner.nextInt() - 1);
				int c = 0;
				for (int x = 0; x < m; x++) {
					for (int y = 0; y < n; y++) {
						boolean f = true;
						for (int k = 0; k < s; k++) {
							if (r[x][y] >= a[k][x][y]) {
								f = false;
								break;
							}
						}
						if (f)
							c++;
					}
				}
				max = Math.max(max, c);
			}
			System.out.println(max);
		}
	}

	private int[][] bfs(int x, int y) {
		int[][] r = new int[m][n];
		boolean[][] v = new boolean[m][n];
		int step = 1;
		Deque<List<Integer>> deque = new ArrayDeque<List<Integer>>();
		v[x][y] = true;
		deque.offer(Arrays.asList(x, y));
		while (!deque.isEmpty()) {
			int size = deque.size();
			for (int i = 0; i < size; i++) {
				List<Integer> a = deque.poll();
				for (int j = 0; j < 6; j++) {
					int nx = a.get(0)
							+ (a.get(1) % 2 == 1 ? move[j][0] : move2[j][0]);
					int ny = a.get(1)
							+ (a.get(1) % 2 == 1 ? move[j][1] : move2[j][1]);
					if (0 <= nx && nx < m && 0 <= ny && ny < n && !v[nx][ny]) {
						v[nx][ny] = true;
						r[nx][ny] = step;
						deque.offer(Arrays.asList(nx, ny));
					}
				}
			}
			step++;
		}
		return r;
	}

	int[][] move = { { 0, -1 }, { 1, -1 }, { -1, 0 }, { 1, 0 }, { 0, 1 },
			{ 1, 1 } };
	int[][] move2 = { { -1, -1 }, { 0, -1 }, { -1, 0 }, { 1, 0 }, { -1, 1 },
			{ 0, 1 } };
	int m, n, s;
}