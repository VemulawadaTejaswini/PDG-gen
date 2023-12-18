import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int h = scanner.nextInt();
		final int w = scanner.nextInt();

		boolean[][] cell = new boolean[h][w];
		List<int[]>[][] adj = new List[h][w];

		String s;
		for (int i = 0; i < h; i++) {
			s = scanner.next();
			for (int j = 0; j < w; j++) {
				if (s.charAt(j) == '.') {
					cell[i][j] = true;
					adj[i][j] = new ArrayList<int[]>();
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (cell[i][j]) {
					if (i + 1 < h && cell[i + 1][j]) {
						adj[i][j].add(new int[] { i + 1, j });
						adj[i + 1][j].add(new int[] { i, j });
					}
					if (j + 1 < w && cell[i][j + 1]) {
						adj[i][j].add(new int[] { i, j + 1 });
						adj[i][j + 1].add(new int[] { i, j });
					}
				}
			}

		}

		int result = 0;

		distances = new int[h][w];
		int d;
		int[] v;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (!cell[i][j])
					continue;
				reset();
				distances[i][j] = 0;
				queue.add(new int[] { i, j });
				while (!queue.isEmpty()) {
					v = queue.poll();
					d = distances[v[0]][v[1]];
					for (int[] nv : adj[v[0]][v[1]]) {
						if (distances[nv[0]][nv[1]] > 0)
							continue;
						queue.add(nv);

						distances[nv[0]][nv[1]] = d + 1;
						if (result < d + 1)
							result = d + 1;
					}
					;
				}
			}
		}

		System.out.println(result);

	}

	static Queue<int[]> queue = new ArrayDeque<int[]>();
	static int[][] distances;

	static void reset() {
		queue.clear();
		for (int i = 0; i < distances.length; i++) {
			for (int j = 0; j < distances[i].length; j++) {
				distances[i][j] = -1;
			}
		}
	}

}
