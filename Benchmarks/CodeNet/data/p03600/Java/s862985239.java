// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int INF = 0x3f3f3f3f;
	static class E {
		int i, j, w;
		E(int i, int j, int w) {
			this.i = i; this.j = j; this.w = w;
		}
	}
	void main() {
		int n = sc.nextInt();
		int[][] aa = new int[n][n];
		int[][] dd = new int[n][n];
		int m = n * n;
		E[] ee = new E[m];
		m = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				int w = sc.nextInt();
				aa[i][j] = w;
				dd[i][j] = INF;
				ee[m++] = new E(i, j, w);
			}
		Arrays.sort(ee, (e, f) -> e.w - f.w);
		long ans = 0;
		for (int h = 0; h < m; h++) {
			E e = ee[h];
			int i = e.i, j = e.j, w = e.w;
			int d = dd[i][j];
			for (int k = 0; k < n; k++)
				d = Math.min(d, dd[i][k] + dd[k][j]);
			if (d > w) {
				d = w;
				ans += w;
			}
			dd[i][j] = dd[j][i] = d;
			for (int k = 0; k < n; k++) {
				dd[i][k] = dd[k][i] = Math.min(dd[i][k], d + dd[j][k]);
				dd[j][k] = dd[k][j] = Math.min(dd[j][k], d + dd[i][k]);
			}
		}
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (dd[i][j] != aa[i][j]) {
					println(-1);
					return;
				}
		println(ans);
	}
}
