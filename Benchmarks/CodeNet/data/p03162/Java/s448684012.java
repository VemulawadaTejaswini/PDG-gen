import java.util.Scanner;

/**
 * https://atcoder.jp/contests/dp/tasks/dp_c
 * Vacation
 */
public class Main {
	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}

			int[] dpa = new int[n];
			int[] dpb = new int[n];
			int[] dpc = new int[n];
			for (int i = 0; i < n; i++) {
				if (i == 0) {
					dpa[i] = a[i];
					dpb[i] = b[i];
					dpc[i] = c[i];
				} else {
					dpa[i] = maxdp(Integer.MIN_VALUE, dpb[i-1]+a[i], dpc[i-1]+a[i]);
					dpb[i] = maxdp(Integer.MIN_VALUE, dpc[i-1]+b[i], dpa[i-1]+b[i]);
					dpc[i] = maxdp(Integer.MIN_VALUE, dpa[i-1]+c[i], dpb[i-1]+c[i]);
				}
			}

			int dp = maxdp(dpa[n-1], dpb[n-1], dpc[n-1]);
			System.out.println(dp);
		}
	}

	public static int maxdp(int a, int b, int c) {
		if (a < b) a = b;
		if (a < c) a = c;
		return a;
	}
}