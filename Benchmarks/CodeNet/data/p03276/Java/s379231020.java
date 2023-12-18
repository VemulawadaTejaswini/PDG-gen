import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n + 1];
		int[] y = new int[n + 1];
		int t, xidx = 1, yidx = 1;
		x[0] = 0;
		y[0] = 0;
		for (int i = 1; i < n + 1; i++) {
			t = sc.nextInt();
			if (t == 0) {
				k--;
			} else if (t > 0) {
				x[xidx] = t;
				xidx++;
			} else if (t < 0) {
				y[yidx] = t;
				yidx++;
			}
		}

		long xcost, ycost, min = Long.MAX_VALUE;
		for (int i = 0; i <= k; i++) {
			if (k - i < xidx && 0 < yidx - i) {
				xcost = x[k - i];
				ycost = Math.abs(y[yidx - i]);
				if (xcost >= ycost) {
					ycost = 2 * ycost;
				} else {
					xcost = 2 * xcost;
				}
				min = Math.min(min, xcost + ycost);
			}
		}
		System.out.println(min);
	}
}