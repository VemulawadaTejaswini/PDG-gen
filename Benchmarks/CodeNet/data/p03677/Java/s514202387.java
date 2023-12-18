
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			--a[i];
		}
		int right = m - 1;
		int left = 0;
		while (right - left > 2) {
			int ml = (2 * left + right) / 3;
			int mr = (left + 2 * right) / 3;
			if (calc(ml, m, a) > calc(mr, m, a)) {
				left = ml;
			} else {
				right = mr;
			}
		}
		long ans = Long.MAX_VALUE;
		for (int i = left; i <= right; ++i) {
			ans = Math.min(ans, calc(i, m, a));
		}
		System.out.println(ans);
	}

	long calc(int x, int m, int[] a) {
		int n = a.length;
		long ret = 0;
		for (int i = 0; i + 1 < n; ++i) {
			ret = (ret + Math.min((a[i + 1] - a[i] + m) % m, (a[i + 1] - x + m) % m + 1));
		}
		return ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
