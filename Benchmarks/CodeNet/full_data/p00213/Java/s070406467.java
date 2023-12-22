
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import scala.languageFeature.postfixOps;
import sun.tools.jar.resources.jar;
import lombok.Data;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			n = scanner.nextInt();
			if ((w | h | n) == 0)
				break;
			size = new int[n + 1];
			pos = new int[n + 1][2];
			for (int i = 0; i < n; i++) {
				int b = scanner.nextInt();
				int k = scanner.nextInt();
				size[b] = k;
			}
			m = new int[h][w];
			
			for (int[] a : m)
				Arrays.fill(a, -1);
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					int x = scanner.nextInt();
					m[i][j] = x;
					if (x > 0) {
						pos[x][0] = i;
						pos[x][1] = j;
					}
				}
			}
			assign = new int[n + 1][4];
			c = 0;
			ans = new int[h][w];
			f(1);
			if (c == 1) {
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (j > 0)
							System.out.print(" ");
						System.out.print(ans[i][j]);
					}
					System.out.println();
				}
			} else {
				System.out.println("NA");
			}

		}
	}

	private void f(int k) {
		if (k == n + 1) {
			c++;
			if (c == 2)
				return;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					int a = m[i][j];
					ans[i][j] = a >= 100 ? a / 100 : a;
				}
			}
			return;
		}
		int s = size[k];
		for (int x = 1; x <= s; x++) {
			if (s % x != 0)
				continue;
			for (int lj = pos[k][1] + 1 - x; lj <= pos[k][1]; lj++) {
				if (lj < 0 || lj > w)
					continue;
				loop: for (int li = pos[k][0] + 1 - s / x; li <= pos[k][0]; li++) {
					if (li < 0 || li > h)
						continue;
					int rj = lj + x;
					int ri = li + s / x;
					if (rj > w)
						continue;
					if (ri > h)
						continue;
					for (int i = li; i < ri; i++) {
						for (int j = lj; j < rj; j++) {
							if (m[i][j] != 0 && m[i][j] != k)
								continue loop;

						}
					}
					for (int i = li; i < ri; i++) {
						for (int j = lj; j < rj; j++) {
							if (m[i][j] != k)
								m[i][j] = k * 100;
						}
					}
					f(k + 1);
					if (c == 2)
						return;
					for (int i = li; i < ri; i++) {
						for (int j = lj; j < rj; j++) {
							if (m[i][j] != k)
								m[i][j] = 0;
						}
					}
				}
			}

		}

	}

	int[][] m;
	int[] size;
	int[][] pos;
	int[][] assign;
	int w, h, n, c;
	int[][] ans;
}