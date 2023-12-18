import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (m == 1) {
			System.out.println(n);
			return;
		}
		int[][] all = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				all[i][j] = sc.nextInt();
			}
		}
		int[] idxes = new int[n];
		int min = Integer.MAX_VALUE;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < m - 1; i++) {
			int[] counts = new int[m + 1];
			int max = 0;
			int maxSport = 0;
			for (int j = 0; j < n; j++) {
				int x = all[j][idxes[j]];
				counts[x]++;
				if (max < counts[x]) {
					max = counts[x];
					maxSport = x;
				}
			}
			if (min > max) {
				min = max;
			}
			set.add(maxSport);
			for (int j = 0; j < n; j++) {
				while (set.contains(all[j][idxes[j]])) {
					idxes[j]++;
				}
			}
		}
		System.out.println(min);
	}
}
