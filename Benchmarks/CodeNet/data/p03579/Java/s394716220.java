import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		new Main().solve();
	}

	public void run() {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < g.length; ++i)
			g[i] = new ArrayList<>();
		for (int i = 0; i < m; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			--a[i];
			--b[i];
			g[a[i]].add(b[i]);
			g[b[i]].add(a[i]);
		}
		int[] col = new int[n];
		Arrays.fill(col, -1);
		col[0] = 0;
		boolean f = isBibartite(0, col, g);
		if (!f) {
			System.out.println((long) n * (n - 1) / 2 - m);
		} else {
			long u = 0;
			long v = 0;
			for (int i = 0; i < n; ++i) {
				if (col[i] == 0)
					++u;
				else
					++v;
			}
			System.out.println(u * v - m);
		}
	}

	boolean isBibartite(int cur, int[] col, ArrayList<Integer>[] g) {
		boolean ret = true;
		for (int dst : g[cur]) {
			ret &= col[cur] != col[dst];
			if (col[dst] == -1) {
				col[dst] = col[cur] ^ 1;
				isBibartite(dst, col, g);
			}
		}
		return ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
