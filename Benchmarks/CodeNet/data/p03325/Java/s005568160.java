import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		sc.close();

		solve(arr, n);

	}

	static void solve(long[] arr, int num) {

		boolean f = true;
		boolean s = true;
		int tc = 0;
		int count = 0;

		while (f) {

			if (!check(arr, num)) {
				break;
			}

			for (int i = 0; i < num; i++) {
				long n = arr[i];

				if ((n % 2) != 0) {
					if (tc != num - 1) {
						tc++;
					} else {
						f = false;
						break;
					}
				} else {
					if ((n / 2) < 1) {
						tc++;
					} else {
						if (s) {
							arr[i] = n / 2;
							s = false;
						}
					}
				}
			}
			tc = 0;
			s = true;
			count++;
		}

		System.out.println(count);
	}

	static boolean check(long[] arr, int num) {

		int c = 0;
		for (int i = 0; i < num; i++) {
			long n = arr[i];
			if ((n % 2) != 0) {
				c++;
			}
		}
		if (c == arr.length) {
			return false;
		}
		return true;
	}
}