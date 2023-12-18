// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int[] oo; int[][] oj;
	void link(int i, int j) {
		int o = oo[i];
		if (o >= 2 && (o & o - 1) == 0)
			oj[i] = Arrays.copyOf(oj[i], o << 1);
		oj[i][oo[i]++] = j;
	}
	void init(int n, int m) {
		oo = new int[n]; oj = new int[n][2];
	}
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		init(n, m);
		while (m-- > 0) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			link(i, j);
		}
		int s = sc.nextInt() - 1;
		int t = sc.nextInt() - 1;
		int u = s * 3 + 0;
		int v = t * 3 + 0;
		int inf = n * 3;
		int[] qu = new int[n * 3]; int head = 0, cnt = 0;
		int[] dd = new int[n * 3]; Arrays.fill(dd, inf);
		dd[u] = 0; qu[head + cnt++] = u;
		while (cnt > 0) {
			u = qu[head++]; cnt--;
			int d = dd[u] + 1, i = u / 3, r = (u + 1) % 3;
			for (int o = 0; o < oo[i]; o++) {
				int j = oj[i][o];
				u = j * 3 + r;
				if (dd[u] == inf) {
					dd[u] = d;
					if (u == v) {
						println(d / 3);
						return;
					}
					qu[head + cnt++] = u;
				}
			}
		}
		println(-1);
	}
}
