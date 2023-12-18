import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(arr[i], -1);
			int a = sc.nextInt();
			for (int j = 0; j < a; j++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt();
				arr[i][x] = y;
			}
		}
		sc.close();

		int ans = 0;
		int end = 1 << n;
		for (int i = 0; i < end; i++) {
			int[] c = new int[n];
			Arrays.fill(c, -1);
			boolean flg = true;
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					cnt++;
					c[j] = 1;
				}
			}
			label:
			for (int j = 0; j < n; j++) {
				if (c[j] == 1) {
					for (int k = 0; k < n; k++) {
						int y = arr[j][k];
						if (y == 1 && c[k] != 1) {
							flg = false;
							break label;
						}
						if (y == 0 && c[k] == 1) {
							flg = false;
							break label;
						}
					}
				}
			}
			if (flg) {
				ans = Math.max(ans, cnt);
			}
		}
		System.out.println(ans);
	}
}
