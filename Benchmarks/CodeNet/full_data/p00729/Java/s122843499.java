
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int OFS = 540, MAX = 1260 - OFS + 4;

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int N = sc.nextInt(), M = sc.nextInt();
			if ((N|M) == 0) break;
			int[][] use = new int[M][MAX];
			int r = sc.nextInt();
			for (int i = 0; i < r; i++) {
				int t = sc.nextInt() - OFS + 1, n = sc.nextInt(), m = sc.nextInt() - 1, s = sc.nextInt();
//				t += s;
				use[m][t] += s == 1 ? 1 : -1;
			}
			for (int j = 0; j < M; j++) {
				int cnt = use[j][0];
				for (int i = 1; i < MAX; i++) {
//					debug(i, cnt);
					cnt += use[j][i];
//					debug(i, cnt);
					if (cnt > 0) {
						use[j][i] = use[j][i - 1] + 1;
					} else {
						use[j][i] = use[j][i - 1];
					}
				}
			}
//			for (int[] a : use) debug(a);
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int s = sc.nextInt() - OFS, e = sc.nextInt() - OFS, tar = sc.nextInt() - 1;
				System.out.println(use[tar][e] - use[tar][s]);
			}
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}