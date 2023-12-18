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

		solve(arr);

	}

	static void solve(long[] arr) {

		Boolean f = true;
		boolean s = true;
		int tc = 0;
		int count = 0;

		while (f) {

			if (!check(arr)) {
				break;
			}

			for (int i = 0; i < arr.length; i++) {
				long n = arr[i];

				if ((n % 2) != 0) {
					if (tc != arr.length - 1) {
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

	static boolean check(long[] arr) {

		long c = 0;
		for (int i = 0; i < arr.length; i++) {
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