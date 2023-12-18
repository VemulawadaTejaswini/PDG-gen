

import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		long[] pow2 = new long[31];

		for (int i = 0; i < 31; i++) {
			pow2[i] = (long) Math.pow(2, i);
		}

		Arrays.sort(a);

		int ans = 0;
		boolean[] used = new boolean[n];

		for (int i = n - 1; i >= 0; i--) {
			if (used[i])
				continue;

			int left = 0;
			int right = i;
			long limit = pow2(a[i], pow2);

			for (int k = 0; k < 8; k++) {
				if (a[i] + a[(left + right) / 2] < limit) {
					left = (left + right) / 2;
				} else if (a[i] + a[(left + right) / 2] > limit) {
					right = (left + right) / 2 + 1;
				} else {
					left = (left + right) / 2;
					break;
				}
			}

			while (left > 0) {
				if (a[left - 1] < a[left])
					break;
				if (!used[left])
					break;
				left--;
			}
			while (right < i) {
				if (a[right] < a[right + 1])
					break;
				if (!used[right])
					break;
				right++;
			}

			for (int j = left; j < right; j++) {
				if (used[j])
					continue;

				if (judge(a[i] + a[j])) {
					ans++;
					used[j] = true;
					break;
				}
			}
		}

		System.out.println(ans);

	}

	static long pow2(long l, long[] pow) {
		for (int i = 0; i < 31; i++) {
			if (l < pow[i])
				return pow[i];
		}
		return -1;
	}

	static boolean judge(long sum) {
		long right = sum - 1;
		if ((sum & right) == 0)
			return true;
		else
			return false;

	}

}
