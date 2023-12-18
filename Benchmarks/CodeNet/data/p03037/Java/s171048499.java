import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int n = s.nextInt();
			final int m = s.nextInt();

			int[][] g = new int[m][];

			int minStart = 10000;
			int maxEnd = 0;

			for (int i = 0; i < m; i++) {
				g[i] = new int[2];
				int start = s.nextInt();
				int end = s.nextInt();
				g[i][0] = start;
				g[i][1] = end;
				if (start < minStart) {
					minStart = start;
				}
				if (end > maxEnd) {
					maxEnd = end;
				}
			}
			Arrays.sort(g, Comparator.comparingInt((int[] a) -> {
				return a[0];
			}).reversed());

			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (i < minStart || maxEnd < i) {
					continue;
				}
				boolean all = true;
				for (int j = m - 1; j >= 0; j--) {
					if (i < g[j][0] || g[j][1] < i) {
						all = false;
						break;
					}
				}
				if (all) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}