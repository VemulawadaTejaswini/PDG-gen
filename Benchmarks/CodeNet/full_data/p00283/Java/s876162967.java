
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			d = scanner.nextInt();
			n = scanner.nextInt();
			if ((d | n) == 0)
				break;
			a = new int[n];
			e = new int[n];
			r = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				e[i] = scanner.nextInt();
				r[i] = scanner.nextInt();
			}
			memo = new int[d + 1][101];
			for (int[] m : memo)
				Arrays.fill(m, -1);
			int ans = rec(d, 0);
			System.out.println(ans == INF ? "NA" : ans);
		}

	}

	private int rec(int hp, int exp) {
		if (hp == 0)
			return 0;
		if (memo[hp][exp] >= 0)
			return memo[hp][exp];
		int res = INF;
		for (int i = 0; i < n; i++) {
			if (exp >= r[i]) {
				int nhp = Math.max(0, hp - a[i]);
				int nexp = Math.min(100, exp + e[i]);
				if (hp == nhp && exp == nexp)
					continue;
				res = Math.min(res, rec(nhp, nexp) + 1);
			}
		}

		return memo[hp][exp] = res;
	}

	int d, n;
	int[] a, e, r;
	int[][] memo;
	int INF = 1 << 30;
}