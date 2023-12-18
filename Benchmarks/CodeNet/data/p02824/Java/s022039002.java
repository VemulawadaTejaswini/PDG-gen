import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		int p = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a, Collections.reverseOrder());

		boolean flag = true;

		int l = 0;
		int r = n;
		while (l < r) {
//			System.out.printf("Checking l=%d r=%d \n", l, r);
			int mid = (l + r) >>> 1;
			if (mid < p) {
				flag = true;
			} else if (a[mid] + m < a[p - 1]) {
				flag = false;
			} else {
				long sum = (p - 1) * m + (n - mid - 1) * m + m;

				for (int i = p - 1; i < mid; i++) {
					sum += a[mid] + m - a[i];
				}
//				System.out.println(sum);
				flag = sum >= m * v;
			}

			if (flag) {
				l = mid + 1;
			} else {
				r = mid;
			}
		}
		System.out.println(l);
	}
}
