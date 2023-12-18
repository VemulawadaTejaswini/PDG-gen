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

		System.out.println(solve(N, XL));
	}

	static long solve(int n, int[][] x) {
		Arrays.sort(x, (a, b) -> Integer.compare(a[0], b[0]));
		long a = 1;

		int current = 0;
		while (true) {
			int l = -1;
			int r = n;
			while (r - l > 1) {
				int m = (l + r) / 2;
				if (x[m][0] <= x[current][0] + x[current][1]) {
					l = m;
				} else {
					r = m;
				}
			}

			if (r == n) break;
			a++;
			current = r;
		}

		return a;
	}
}
