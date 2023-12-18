
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[][] map = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = (i == j) ? 0 : -1;
				}
			}

			for (int i = 0; i < n - 1; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int c = sc.nextInt();
				map[a][b] = c;
				map[b][a] = c;
			}

			int q = sc.nextInt();
			int k = sc.nextInt() - 1;
			long[] distance = new long[n];
			dijkstra(map, k, distance);

			for (int i = 0; i < q; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				System.out.println(distance[x] + distance[y]);
			}
		}
	}

	public static void dijkstra(int[][] map, int src, long[] distance) {
		int nTown = distance.length;
		boolean[] fixed = new boolean[nTown];
		for (int i = 0; i < nTown; i++) {
			distance[i] = Long.MAX_VALUE;
			fixed[i] = false;
		}
		distance[src] = 0;
		while (true) {
			int marked = minIndex(distance, fixed);
			if (marked < 0)
				return;
			if (distance[marked] == Integer.MAX_VALUE)
				return;
			fixed[marked] = true;
			for (int j = 0; j < nTown; j++) {
				if (map[marked][j] > 0 && !fixed[j]) {
					long newDistance = distance[marked] + map[marked][j];
					if (newDistance < distance[j])
						distance[j] = newDistance;
				}
			}
		}
	}

	static int minIndex(long[] distance, boolean[] fixed) {
		int idx = 0;
		for (; idx < fixed.length; idx++)
			if (!fixed[idx])
				break;
		if (idx == fixed.length)
			return -1;
		for (int i = idx + 1; i < fixed.length; i++)
			if (!fixed[i] && distance[i] < distance[idx])
				idx = i;
		return idx;
	}
}
