import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] c = new int[n];
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int ans = Integer.MAX_VALUE;
		int end = 1 << n;
		for (int i = 0; i < end; i++) {
			int[] r = new int[m];
			int sum = 0;
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					for (int j2 = 0; j2 < m; j2++) {
						r[j2] += a[j][j2];
					}
					sum += c[j];
				}
			}
			boolean ok = true;
			for (int j2 = 0; j2 < m; j2++) {
				if (r[j2] < x) {
					ok = false;
					break;
				}
			}
			if (ok) {
				ans = Math.min(ans, sum);
			}
		}
		if (ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}
