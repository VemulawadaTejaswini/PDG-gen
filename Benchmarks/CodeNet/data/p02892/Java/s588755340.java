import java.util.*;

public class Main {

	private static int[][] a;
	private static int[] color;
	private static int dist[];
	private static boolean visited[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n][n];
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

		color = new int[n];
		for (int i = 0; i < n; i++) {
			if (color[i] == 0) {
				if (!isBipartite(i, 1)) {
					System.out.println(-1);
					return;
				}
			}
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

		//for (int i = 0; i < n; i++) {
		//	for (int j = 0; j < n; j++) {
		//		System.out.print(a[i][j]);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) continue;
				if (a[i][j] < 1000000) {
					answer = Math.max(answer, a[i][j]);
				}

			}
		}

		System.out.println(answer + 1);
	}


	private static boolean isBipartite(int v, int c) {
		color[v] = c;
		for (int i = 0; i < a[v].length; i++) {
			if (a[v][i] != 1000000) {
				if (color[i] == c) return false;
				if (color[i] == 0 && !isBipartite(i, -c)) return false;
			}
		}

		return true;
	}
}
