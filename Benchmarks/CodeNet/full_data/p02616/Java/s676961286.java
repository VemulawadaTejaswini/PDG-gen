package atcoder173;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int p = 1000000007;
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			int k = Integer.parseInt(sc.next());
			Integer[] a = new Integer[n];
			boolean isAllMinus = true;
			boolean containsZero = false;
			for (int i = 0; i < n; i++) {
				int tmp = Integer.parseInt(sc.next());
				if (tmp > 0 && isAllMinus) {
					isAllMinus = false;
				}
				if (tmp == 0 && !containsZero) {
					containsZero = true;
				}
				a[i] = tmp;
			}
			Arrays.sort(a, new Comparator<Integer>() {
				@Override
				public int compare(Integer a, Integer b) {
					return Math.abs(b) - Math.abs(a);
				}
			});
			if (isAllMinus) {
				if (containsZero) {
					System.out.print(0);
					return;
				}
				long ans = 1;
				for (int i = 0; i < k; i++) {
					ans = ans * Math.abs(a[n - i - 1]) % p;
				}
				System.out.print(ans);
				return;
			}
			long ans = 1;
			boolean isMinus = false;
			int last = 0;
			for (int i = 0; i < k; i++) {
				if (a[i] < 0) {
					isMinus = !isMinus;
					last = i;
				}
			}
			if (!isMinus) {
				for (int i = 0; i < k; i++) {
					ans = ans * Math.abs(a[i]) % p;
				}
				System.out.print(ans);
			} else {
				for (int i = 0; i < k; i++) {
					if (i == last) {
						continue;
					}
					ans = ans * Math.abs(a[i]) % p;
				}
				for (int i = k; i < n; i++) {
					if (a[i] > 0) {
						ans = ans * Math.abs(a[i]) % p;
						return;
					}
				}
			}
		}
	}
}
