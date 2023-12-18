import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x, y;
		int r[][] = new int[2 * n][2];
		int b[][] = new int[2 * n][2];
		for (int i = 0; i < n; ++i) {
			x = sc.nextInt();
			y = sc.nextInt();
			r[x][0] = y + 1;
			r[y][1] = x + 1;
		}
		for (int i = 0; i < n; ++i) {
			x = sc.nextInt();
			y = sc.nextInt();
			b[x][0] = y + 1;
			b[y][1] = x + 1;
		}

		sc.close();
		int ans = 0, t = 0;
		for (int k = 0; k < 2; ++k) {
			t = 0;
			for (int i = 1; i < 2 * n; ++i) {
				if (b[i][k] != 0) {
					int max = 0, maxnum = -1;
					for (int j = 0; j < i; ++j) {
						if (r[j][k] != 0) {
							int tmp = b[i][k] - r[j][k];
							if(tmp > 0) {
								if(r[j][k] > max) {
									max = r[j][k];
									maxnum = j;
								}
							}
						}
					}
					if(maxnum >= 0) {
						r[maxnum][k] = 0;
						++t;
					}
				}
			}
			ans = Math.max(ans,  t);
		}
		System.out.println(ans);
	}

}
