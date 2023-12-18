import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] XL = new int[N][2];
		for (int i = 0; i < N; i++) {
			XL[i][0] = sc.nextInt();
			XL[i][1] = sc.nextInt();
		}

		long min = Long.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			min = Math.min(min, solve(N, i, XL));
		}
		System.out.println(min);
	}

	static long solve(int n, int s, int[][] x) {
		Arrays.sort(x, (a, b) -> Integer.compare(a[0], b[0]));

		long a = 1;
		int l = s;
		int r = s;

		while (true) {
			int ll = -1;
			int rr = l;
			while (rr - ll > 1) {
				int m = (ll + rr) / 2;
				if (x[m][0] >= x[r][0] - x[r][1]) {
					rr = m;
				} else {
					ll = m;
				}
			}

			if (ll == -1) break;
			a++;
			l = ll;
		}

		while (true) {
			int ll = r;
			int rr = n;
			while (rr - ll > 1) {
				int m = (ll + rr) / 2;
				if (x[m][0] <= x[r][0] + x[r][1]) {
					ll = m;
				} else {
					rr = m;
				}
			}

			if (rr == n) break;
			a++;
			r = rr;
		}

		return a;
	}
}
