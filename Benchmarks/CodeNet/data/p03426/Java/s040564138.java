import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		Set<Integer>[] hs = new HashSet[h];
		Set<Integer>[] ws = new HashSet[w];
		for (int i = 0; i < h; i++) {
			hs[i] = new HashSet<>();
		}
		for (int i = 0; i < w; i++) {
			ws[i] = new HashSet<>();
		}

		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt() - 1;
				hs[i].add(a[i][j]);
				ws[j].add(a[i][j]);
			}
		}

		int[][] costs = new int[d][(h * w / d) + 1];
		for (int i = 0; i < d; i++) {
			int ihPrev = 0;
			int iwPrev = 0;

			for (int k = 0; k < h; k++) {
				if (hs[k].contains(i)) {
					ihPrev = k;
					break;
				}
			}
			for (int k = 0; k < h; k++) {
				if (ws[k].contains(i)) {
					iwPrev = k;
					break;
				}
			}

			int steps = 1;
			while (steps < (h * w / d) + 1) {
				int ih = 0;
				int iw = 0;

				for (int k = 0; k < h; k++) {
					if (hs[k].contains(i + steps * d)) {
						ih = k;
						break;
					}
				}
				for (int k = 0; k < w; k++) {
					if (ws[k].contains(i + steps * d)) {
						iw = k;
						break;
					}
				}
				costs[i][steps] = Math.abs(ih - ihPrev) + Math.abs(iw - iwPrev) + costs[i][steps - 1];
				ihPrev = ih;
				iwPrev = iw;
				steps++;
			}
		}

		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (q-- > 0) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			sb.append(costs[r % d][r / d] - costs[l % d][l / d]);
			sb.append("\n");
		}

		System.out.print(sb.toString());
	}
}
