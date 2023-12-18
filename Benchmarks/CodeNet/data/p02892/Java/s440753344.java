import java.util.*;

public class Main {

	private static int dist[];
	private static boolean visited[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			char[] s = sc.nextLine().toCharArray();
			for (int j = 0; j < s.length; j++) {
				if (s[j] == '1') {
					a[i][j] = 1;
				} else {
					a[i][j] = 1000000;
				}
			}
		}

		if (!isBipartite(n, a)) {
			System.out.println(-1);
			return;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (a[i][j] > a[i][k] + a[k][j]) {
						a[i][j] = Math.min(a[i][j], a[i][k] + a[k][j]);
					}
				}
			}
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] < 1000000) {
					answer = Math.max(answer, a[i][j]);
				}

			}
		}
		System.out.println(answer + 1);
	}


	private static boolean isBipartite(int n, int[][] a) {
		int[] color = new int[n];
		Arrays.fill(color, -1);

		for (int i = 0; i < n; i++) {
			if (color[i] >= 0) continue;
			Queue<int[]> q = new LinkedList<>();
			q.offer(new int[]{i, 0});
			while (!q.isEmpty()) {
				int[] x = q.poll();
				if (color[x[0]] == (x[1] + 1) % 2) return false;
				color[x[0]] = x[1];

				for (int j = 0; j < a[x[0]].length; j++) {
					if (a[x[0]][j] != 1) continue;
					if (i == j) continue;
					if (color[j] == x[1]) return false;
					if (color[j] >= 0) continue;
					q.offer(new int[]{j, (x[1] + 1) % 2});
				}
			}
		}

		return true;
	}
}
