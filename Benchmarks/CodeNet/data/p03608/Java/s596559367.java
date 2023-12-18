import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	static int[][] d;
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		int[] t = new int[r];
		for (int i = 0; i < r; i++) {
			t[i] = sc.nextInt() - 1;
		}
		d = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					d[i][j] = 1000000000;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			d[a][b] = c;
			d[b][a] = c;
		}
		sc.close();

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}

		permutation(t, new LinkedHashSet<>());
		System.out.println(ans);
	}

	static void permutation(int[] target, LinkedHashSet<Integer> set) {
		if (set.size() == target.length) {
			Integer[] arr = set.toArray(new Integer[0]);
			int sum = 0;
			for (int i = 1; i < arr.length; i++) {
				sum += d[target[arr[i - 1]]][target[arr[i]]];
			}
			ans = Math.min(ans, sum);
			return;
		}

		for (int i = 0; i < target.length; i++) {
			if (!set.contains(i)) {
				set.add(i);
				permutation(target, set);
				set.remove(i);
			}
		}
	}
}
