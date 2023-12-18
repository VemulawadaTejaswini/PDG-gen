import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		Integer[][] item = new Integer[N + 1][2];
		for (int i = 0; i < N; i++) {
			item[i][0] = sc.nextInt();
			item[i][1] = sc.nextInt();
		}
		item[N][0] = 0;
		item[N][1] = 0;
		Arrays.sort(item, new ArrayComparator(1, true));
		int[][] dp = new int[N + 1][T + 1];
		for (int i = 0; i < N + 1; i++) {
			for (int j = 0; j < T + 1; j++) {
				dp[i][j] = 0;
			}
		}
		for (int i = 0; i < N; i++) {
			int wi = item[i][0];
			int vi = item[i][1];
			for (int j = 0; j < T; j++) {
				if (0 <= j - wi) {
					dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - wi] + vi);
				} else {
					dp[i + 1][j] = dp[i][j];
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < T; j++) {
				ans = Math.max(ans, dp[i + 1][j] + item[i + 1][1]);
			}
		}
		System.out.println(ans);
	}

	@SuppressWarnings("rawtypes")
	public static class ArrayComparator implements Comparator<Comparable[]> {
		private final int columnToSort;
		private final boolean ascending;

		public ArrayComparator(int columnToSort, boolean ascending) {
			this.columnToSort = columnToSort;
			this.ascending = ascending;
		}

		@SuppressWarnings("unchecked")
		public int compare(Comparable[] c1, Comparable[] c2) {
			int cmp = c1[columnToSort].compareTo(c2[columnToSort]);
			if (cmp == 0) {
				cmp = c1[columnToSort == 1 ? 0 : 1].compareTo(c2[columnToSort == 1 ? 0 : 1]);
			}
			return ascending ? cmp : -cmp;
		}
	}
}