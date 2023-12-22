package aoj.p0531;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	int w, h;
	void run() {
		for (;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) break;

			int n = sc.nextInt();

			int[] x = new int[2 * n + 2];
			int[] y = new int[2 * n + 2];
			for (int i = 0; i < n; i++) {
				x[2 * i] = sc.nextInt();
				y[2 * i] = sc.nextInt();
				x[2 * i + 1] = sc.nextInt();
				y[2 * i + 1] = sc.nextInt();
			}
			x[2 * n] = 0;
			x[2 * n + 1] = w;
			y[2 * n] = 0;
			y[2 * n + 1] = h;

			x = normalize(x);
			y = normalize(y);

			int[][] table = new int[4 * n + 10][4 * n + 10];
			int[][] acc = new int[4 * n + 10][4 * n + 10];
			for (int i = 0; i < n; i++) {
				int x1 = x[2 * i + 0];
				int y1 = y[2 * i + 0];
				int x2 = x[2 * i + 1];
				int y2 = y[2 * i + 1];
				table[x1][y1]++;
				table[x1][y2]--;
				table[x2][y1]--;
				table[x2][y2]++;
			}

			acc[0][0] = table[0][0];
			for (int i = 1; i < table.length; i++) {
				acc[i][0] = acc[i-1][0] + table[i][0];
				acc[0][i] = acc[0][i-1] + table[0][i];
			}
			for (int i = 1; i < table.length; i++) {
				for (int j = 1; j < table.length; j++) {
					acc[i][j] = table[i][j] + acc[i-1][j] + acc[i][j-1] - acc[i-1][j-1];
				}
			}

			w = x[2 * n + 1];
			h = y[2 * n + 1];

			int ans = 0;
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					if (acc[i][j] == 0) {
						ans++;
						dfs(i, j, acc);
					}
				}
			}
			System.out.println(ans);

		}
	}

	void dfs(int x, int y, int[][] acc) {
		if (0 <= x && x < w && 0 <= y && y < h) {
			if (acc[x][y] != 0) return;
			acc[x][y] = 2;
			dfs(x + 1, y, acc);
			dfs(x - 1, y, acc);
			dfs(x, y + 1, acc);
			dfs(x, y - 1, acc);
		}

	}

	int[] normalize(int[] v) {
		int[] res = new int[v.length];
		long[][] t = new long[v.length][2];
		for (int i = 0; i < v.length; i++) {
			t[i][0] = v[i];
			t[i][1] = i;
		}
		Arrays.sort(t, 0, t.length, new Comparator<long[]>(){
			public int compare(long[] a, long[] b){
				if (a[0] != b[0]) return a[0] < b[0] ? -1 : 1;
				return 0;
			}
		});

		int r = 0;
		for (int i = 0; i < v.length; i++) {
			r += (i > 0 && t[i - 1][0] != t[i][0]) ? 1 : 0;
			res[(int)t[i][1]] = r;
		}
		return res;
	}


}