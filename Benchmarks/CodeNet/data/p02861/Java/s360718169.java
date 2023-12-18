import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	static double ans = 0;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		permutation(x, y, new LinkedHashSet<>());
		for (int i = 2; i <= n; i++) {
			ans /= i;
		}
		System.out.println(ans);
	}

	static void permutation(int[] x, int[] y, LinkedHashSet<Integer> set) {
		if (set.size() == x.length) {
			Integer[] arr = set.toArray(new Integer[0]);
			for (int i = 1; i < arr.length; i++) {
				ans += Math.hypot(x[arr[i]] - x[arr[i - 1]], y[arr[i]] - y[arr[i - 1]]);
			}
			return;
		}

		for (int i = 0; i < x.length; i++) {
			if (!set.contains(i)) {
				set.add(i);
				permutation(x, y, set);
				set.remove(i);
			}
		}
	}
}
