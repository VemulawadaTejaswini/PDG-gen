import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int map[][] = new int[n][n];
		int a, b, c;
		for (int i = 0; i < n - 1; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			c = sc.nextInt();
			map[a][b] = c;
			map[b][a] = c;
		}

		int q = sc.nextInt();
		int k = sc.nextInt() - 1;
		int x, y;
		long sum;
		for (int i = 0; i < q; i++) {
			sum = 0;
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
			sum = solve(map, x, k);
			sum += solve(map, k, y);
			sb.append(sum + "\n");
		}
		System.out.println(sb);
	}

	private static long solve(int[][] map, int start, int goal) {
		boolean[] fixed = new boolean[map.length];
		long[] distance = new long[map.length];
		Arrays.fill(distance, Long.MAX_VALUE);
		distance[start] = 0;
		while (true) {
			int marked = minIndex(distance, fixed);
			if (marked == -1)
				break;
			fixed[marked] = true;
			if (fixed[goal])
				break;
			for (int i = 0; i < map.length; i++) {
				if (map[marked][i] != 0) {
					distance[i] = Math.min(distance[i], map[marked][i] + distance[marked]);
				}
			}
		}
		return distance[goal];
	}

	private static int minIndex(long[] distance, boolean[] fixed) {
		int idx = 0;
		for (; idx < fixed.length; idx++) {
			if (!fixed[idx])
				break;
		}
		if (idx == fixed.length)
			return -1;
		long mindistance = distance[idx];
		for (int i = idx + 1; i < fixed.length; i++) {
			if (mindistance > distance[i] && !fixed[i]) {
				mindistance = distance[i];
				idx = i;
			}
		}
		return idx;
	}
}
