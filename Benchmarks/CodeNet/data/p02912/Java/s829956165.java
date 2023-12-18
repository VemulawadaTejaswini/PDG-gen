import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		Integer[] a = new Integer[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());

		}
		Arrays.sort(a, Collections.reverseOrder());
		long ans = 0;
		int cnt = 0;

		if (n > 1) {
			while (cnt < m) {
				int num = 0;
				num = Math.max(1, (int) Math.ceil(Math.log(a[0]) / Math.log(2) - Math.log(a[1]) / Math.log(2)));
				cnt += num;
				if (cnt > m) {
					num -= num - m;
				}
				a[0] /= (int) Math.pow(2, num);

				Arrays.sort(a, Collections.reverseOrder());
			}
		} else {
			a[0] /= (int) Math.pow(2, m);
		}

		for (int i = 0; i < n; i++) {
			ans += a[i];
		}

		System.out.println(ans);
		sc.close();
	}
}