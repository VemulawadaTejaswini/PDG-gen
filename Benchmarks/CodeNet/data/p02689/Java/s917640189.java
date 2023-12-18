import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n; // 展望台数
		int m; // 道の数

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		int[] h = new int[n]; // 展望台の高さ
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
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (path[i][j] != 0) {
					if (h[i] <= h[j]) {
						result[i]++;
					}
				}
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (result[i] == 0) {
				count++;
			}
		}

		sc.close();
		System.out.println(count);
		return;
	}

}