import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) throws FileNotFoundException {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	int n, m;
	int[] a, b;
	ArrayList<Integer>[] g;
	final long MODULO = 1000003;

	void solver() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			a = new int[m];
			b = new int[m];
			g = new ArrayList[n];
			for (int i = 0; i < n; ++i) {
				g[i] = new ArrayList<>();
			}
			for (int i = 0; i < m; ++i) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				--a[i];
				--b[i];
				g[Math.min(a[i], b[i])].add(Math.max(a[i], b[i]));
			}
			for (int i = 0; i < n; ++i) {
				g[Math.min(i, (i + 1) % n)].add(Math.max(i, (i + 1) % n));
			}
			for (int i = 0; i < n; ++i) {
				Collections.sort(g[i]);
			}
			System.out.println(f(0, n - 1)[0][0]);
		}
	}

	long[][] f(int src, int dst) {
		long[][] ret = new long[2][2];
		ret[0][0] = 1;
		ret[1][1] = 1;
		for (int i = 0; i + 1 < g[src].size(); ++i) {
			ret = merge(ret, f(g[src].get(i), g[src].get(i + 1)));
			ret[0][0] = (ret[0][0] + ret[1][1]) % MODULO;
		}
		if (g[src].get(g[src].size() - 1) != dst) {
			ret = merge(ret, f(g[src].get(g[src].size() - 1), dst));
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	public void run() {
		try {
			solver();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 0???true???1???false??¨?????????
	long[][] merge(long[][] a, long[][] b) {
		long[][] ret = new long[2][2];
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 2; ++j) {
				ret[i][j] = (a[i][0] * b[1][j] + a[i][1] * b[0][j]) % MODULO;
			}
		}
		return ret;
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}