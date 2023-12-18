import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 1; i < n; i++) {
			if (a[i - 1] == a[i]) {
				System.out.println(0);
				return;
			}
		}
		for (int i = 1; i < m; i++) {
			if (b[i - 1] == b[i]) {
				System.out.println(0);
				return;
			}
		}

		int mod = 1000000007;
		int nm = n * m;
		long ans = 1;
		for (int i = nm; i > 0; i--) {
			boolean fa = true;
			int ia = Arrays.binarySearch(a, i);
			if (ia < 0) {
				ia = ~ia;
				fa = false;
			}
			boolean fb = true;
			int ib = Arrays.binarySearch(b, i);
			if (ib < 0) {
				ib = ~ib;
				fb = false;
			}

			int na = n - ia;
			int nb = m - ib;
			int fix = nm - i;
			if (fa) {
				if (fb) {
					if (na * nb < fix + 1) {
						System.out.println(0);
						return;
					}
				} else {
					int val = nb - Math.max(fix - (na - 1) * nb, 0);
					if (val <= 0) {
						System.out.println(0);
						return;
					}
					ans *= val;
					ans %= mod;
				}
			} else {
				if (fb) {
					int val = na - Math.max(fix - (nb - 1) * na, 0);
					if (val <= 0) {
						System.out.println(0);
						return;
					}
					ans *= val;
					ans %= mod;
				} else {
					int val = na * nb - fix;
					if (val <= 0) {
						System.out.println(0);
						return;
					}
					ans *= val;
					ans %= mod;
				}
			}
		}
		System.out.println(ans);
	}
}
