import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] d = new int[c][c];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		int[][][] a = new int[n][n][c];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int b = sc.nextInt() - 1;
				for (int k = 0; k < c; k++) {
					a[i][j][k] = d[b][k];
				}
			}
		}
		sc.close();

		if (n == 1) {
			System.out.println(0);
			return;
		}

		Obj[][] sum = new Obj[3][c];
		for (int k = 0; k < c; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					Obj o = sum[(i + j) % 3][k];
					if (o == null) {
						o = new Obj();
						o.col = k;
						sum[(i + j) % 3][k] = o;
					}
					o.val += a[i][j][k];
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			Arrays.sort(sum[i], new Comparator<Obj>() {
				public int compare(Obj o1, Obj o2) {
					return o1.val - o2.val;
				}
			});
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (sum[0][i].col != sum[1][j].col
							&& sum[0][i].col != sum[2][k].col
							&& sum[1][j].col != sum[2][k].col) {
						ans = Math.min(ans, sum[0][i].val + sum[1][j].val + sum[2][k].val);
					}
				}
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int col, val;
	}
}
