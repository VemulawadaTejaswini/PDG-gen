import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		HashSet<Long> set = new HashSet<>();
		boolean zero = true;
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
			zero &= a[i] == 0;
			set.add(a[i]);
		}
		if (zero) {// 00000000...
			System.out.println("Yes");
			return;
		}
		if (set.size() == 2 && n % 3 == 0) {
			long[] v = new long[2];
			int[] cnt = new int[2];
			int p = 0;
			for (long val : set) {
				v[p] = val;
				++p;
			}
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < v.length; ++j) {
					if (v[j] == a[i])
						++cnt[j];
				}
			}
			if (cnt[0] == cnt[1] * 2) {
				if (v[1] == 0) {
					System.out.println("Yes");
					return;
				}
			} else if (cnt[1] == cnt[0] * 2) {
				if (v[0] == 0) {
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
			return;

		} else if (set.size() != 3 || n % 3 != 0) {
			System.out.println("No");
			return;
		} else {
			long[] v = new long[3];
			int[] cnt = new int[3];
			int p = 0;
			for (long val : set) {
				v[p] = val;
				++p;
			}
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < v.length; ++j) {
					if (v[j] == a[i])
						++cnt[j];
				}
			}
			if ((v[0] ^ v[1] ^ v[2]) != 0) {
				System.out.println("No");
				return;
			}
			if (cnt[0] != cnt[1] || cnt[1] != cnt[2] || cnt[2] != cnt[0]) {
				System.out.println("No");
				return;
			}
			System.out.println("Yes");
		}
	}

	static int gcd(int a, int b) {
		if (a > b)
			return gcd(b, a);
		if (a == 0)
			return b;
		return gcd(a, b % a);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
