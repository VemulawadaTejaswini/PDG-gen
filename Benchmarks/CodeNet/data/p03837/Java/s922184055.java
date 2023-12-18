// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static class E {
		int i, j, w;
		E(int i, int j, int w) {
			this.i = i; this.j = j; this.w = w;
		}
	}
	int[] ds;
	int find(int i) {
		return ds[i] < 0 ? i : (ds[i] = find(ds[i]));
	}
	void join(int i, int j) {
		i = find(i);
		j = find(j);
		if (i == j)
			return;
		if (ds[i] > ds[j])
			ds[i] = j;
		else {
			if (ds[i] == ds[j])
				ds[i]--;
			ds[j] = i;
		}
	}
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		E[] ee = new E[m];
		for (int h = 0; h < m; h++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int w = sc.nextInt();
			ee[h] = new E(i, j, w);
		}
		Arrays.sort(ee, (e, f) -> e.w - f.w);
		ds = new int[n]; Arrays.fill(ds, -1);
		int ans = 0;
		for (int h1 = 0, h2; h1 < m; h1 = h2) {
			h2 = h1 + 1;
			while (h2 < m && ee[h2].w == ee[h1].w)
				h2++;
			for (int h = h1; h < h2; h++) {
				E e = ee[h];
				if (find(e.i) == find(e.j))
					ans++;
			}
			for (int h = h1; h < h2; h++) {
				E e = ee[h];
				join(e.i, e.j);
			}
		}
		println(ans);
	}
}
