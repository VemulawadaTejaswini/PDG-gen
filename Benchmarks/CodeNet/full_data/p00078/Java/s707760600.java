import static java.lang.Math.atan2;
import static java.lang.Math.sqrt;
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			int r = n / 2 + 1;
			int c = n / 2;
			for (int k = 1; k <= n * n; k++) {
				for (;;) {
					if (c >= n) {
						c = 0;
					} else if (c < 0) {
						c = n - 1;
					} else if (r >= n) {
						r = 0;
					} else if (a[r][c] != 0) {
						r++;
						c--;
					} else break;
				}
				a[r][c] = k;
				r++;
				c++;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.printf("%4d",a[i][j]);
				}
				System.out.println();
			}
			
		}
	}
	

}