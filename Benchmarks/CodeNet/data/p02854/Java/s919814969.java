import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		long tot = 0;
		for (int i = 0; i < n; i++) {
			tot += a[i];
		}
		long ans = 0;
		long half = tot / 2;

		long left = 0;
		long right = 0;
		for (int i = 0; i < n; i++) {
			if (left < half) {
				left += a[i];
				if (left == half) {
					ans = 0;
					break;
				}
			} else {
				ans = a[i];
				break;
			}

		}

		System.out.println(ans);

	}
}