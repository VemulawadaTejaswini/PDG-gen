import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int m;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int[][] path = new int[n][n];
		int start, end;
		for (int j = 0; j < m; j++) {
			start = sc.nextInt();
			end = sc.nextInt();
			path[start - 1][end - 1]++;
			path[end - 1][start - 1]++;
		}

		int[] result = new int[n];
		for (int k = 0; k < n; k++) {
			for (int l = 0; l < n; l++) {
				if (path[k][l] != 0) {
					if (h[k] <= h[l]) {
						result[k]++;
					}
				}
			}
		}

		int count = 0;
		for (int p = 0; p < n; p++) {
			if (result[p] == 0) {
				count++;
			}
		}

		sc.close();
		System.out.println(count);
		return;
	}

}
