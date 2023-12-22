import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	boolean[] used;
	int[][] data;

	p[] cnt;
	int sum=0;
	
	boolean dfs() {
		int[] value = new int[data.length];
		int[] value2 = new int[data.length];
		if (sum*8 < data.length * used.length) {
			for (int i = 0; i < used.length; i++) {
				if (!used[cnt[i].b]) {
					used[cnt[i].b] = true;
					sum += cnt[i].a;
					if (dfs()) {
						return true;
					}
					sum -= cnt[i].a;
					used[cnt[i].b] = false;
				}
			}
		}
		if (sum*8 > data.length * used.length * 3) {
			return false;
		}
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < used.length / 2; j++) {
				if (used[data[i][j]]) {
					value[i] += 1;
				} else {
					value2[i] += 1;
				}
			}
			if (value[i] > max) {
				max = value[i];
			}
			if (value[i] < min) {
				min = value[i];
			}
			if (value[i] * 8 > used.length * 3) {
				return false;
			}
		}
		if (max * 8 <= used.length * 3) {
			if (min * 8 >= used.length) {
				return true;
			}

			for (int i = 0; i < used.length; i++) {
				if (!used[cnt[i].b]) {
					used[cnt[i].b] = true;
					sum += cnt[i].a;
					if (dfs()) {
						return true;
					}
					sum -= cnt[i].a;
					used[cnt[i].b] = false;
				}
			}
		}

		return false;
	}

	class p implements Comparable<p> {
		int a;
		int b;

		@Override
		public int compareTo(p arg0) {
			return arg0.a - a;
		}

	}

	void run() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		data = new int[k][n / 2];
		cnt = new p[n];
		for (int i = 0; i < n; i++) {
			cnt[i] = new p();
			cnt[i].b = i;
		}
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n / 2; j++) {
				data[i][j] = sc.nextInt() - 1;
				cnt[data[i][j]].a++;
			}
		}

		Arrays.sort(cnt);

		// System.out.println(Arrays.toString(up));

		used = new boolean[n];
		dfs();
		for (int i = 0; i < n; i++) {
			System.out.print(used[i] ? "1" : "0");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}