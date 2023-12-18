import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		Integer[][] item = new Integer[N ][2];
		for (int i = 0; i < N; i++) {
			item[i][0] = sc.nextInt();
			item[i][1] = sc.nextInt();
		}
		Arrays.sort(item, new ArrayComparator(1, true));
		int[] dp = new int[10000];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = 0;
		}
		for (int i = 0; i < N; i++) {
			int wi = item[i][0];
			int vi = item[i][1];
			for (int j = T - 1; j >= 0; j--) {
				dp[j + wi] = Math.max(dp[j + wi], dp[j] + vi);
			}
		}
		int ans = 0;
		for (int i = 0; i < dp.length; i++) {
			ans = Math.max(ans, dp[i]);
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