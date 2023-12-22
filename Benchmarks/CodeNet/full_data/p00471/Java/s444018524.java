import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static P[][] f;

	static int dfs(P c, int d) {
		int ret = 0;
		for (int i = 0; i < 4; ++i) {
			P n = c.neib[i];
			P next = n;
			if (n.home) {
				if (d == 0) return 1;
				next = n.neib[i];
			}
			if (next == NIL) continue;
			if (!c.home) {
				c.neib[(i + 2) % 4].neib[i] = c.neib[i];
				c.neib[i].neib[(i + 2) % 4] = c.neib[(i + 2) % 4];
				c.neib[(i + 1) % 4].neib[(i + 3) % 4] = c.neib[(i + 3) % 4];
				c.neib[(i + 3) % 4].neib[(i + 1) % 4] = c.neib[(i + 1) % 4];
			}
			ret += dfs(next, d - 1);
			if (!c.home) {
				c.neib[(i + 2) % 4].neib[i] = c;
				c.neib[i].neib[(i + 2) % 4] = c;
				c.neib[(i + 1) % 4].neib[(i + 3) % 4] = c;
				c.neib[(i + 3) % 4].neib[(i + 1) % 4] = c;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		while (true) {
			M = sc.nextInt();
			N = sc.nextInt();
			if (N == 0) break;
			f = new P[N][M];
			int d = 0;
			P start = null;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < M; ++j) {
					int v = sc.nextInt();
					if (v == 1) {
						++d;
						f[i][j] = new P();
					} else if (v == 2) {
						start = f[i][j] = new P();
						start.home = true;
					}
				}
			}
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < M; ++j) {
					if (f[i][j] != null) {
						for (int k = i + 1; k < N; ++k) {
							if (f[k][j] != null) {
								f[i][j].neib[0] = f[k][j];
								f[k][j].neib[2] = f[i][j];
								break;
							}
						}
						for (int k = j + 1; k < M; ++k) {
							if (f[i][k] != null) {
								f[i][j].neib[1] = f[i][k];
								f[i][k].neib[3] = f[i][j];
								break;
							}
						}
					}
				}
			}
			System.out.println(dfs(start, d));
		}
	}

	static class P {
		P[] neib = new P[4];
		boolean home;

		P() {
			Arrays.fill(neib, NIL);
		}

	}

	static P NIL = new P();

}