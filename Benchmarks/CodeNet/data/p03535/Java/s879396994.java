import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		new Main().run();
	}

	long MOD = (long) (1e9 + 7);

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] D = new int[N];
		for (int i = 0; i < N; ++i) {
			D[i] = sc.nextInt();
		}
		boolean[][] ok = new boolean[2][1 << 23];
		ok[0][0] = true;
		for (int i = 0; i < N; ++i) {
			int idx = i % 2;
			Arrays.fill(ok[idx ^ 1], false);
			for (int j = 0; j < 1 << 23; ++j) {
				if (!ok[idx][j])
					continue;
				ok[idx ^ 1][j | 1 << D[i]] = true;
				ok[idx ^ 1][j | 1 << ((24 - D[i]) % 24)] = true;
			}
		}
		int cur = N % 2;
		int ans = 0;
		for (int i = 0; i < 1 << 23; ++i) {
			if (ok[cur][i]) {
				int tmp = Integer.MAX_VALUE / 3;
				for (int j = 0; j < 23; ++j) {
					if ((i >> j) % 2 == 0)
						continue;
					int k = j + 1;
					while (k < 23 && (i >> k) % 2 == 0)
						++k;
					if (k == 23) {
						k = 0;
						while ((i >> k) % 2 == 0)
							++k;
						tmp = Math.min(tmp, j - k);
					} else {
						tmp = Math.min(tmp, k - j);
						j = k - 1;
					}
				}
				ans = Math.max(ans, tmp);
			}
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
