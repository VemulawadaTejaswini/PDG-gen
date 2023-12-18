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

		t: while (f) {

			for (int i = 0; i < num; i++) {
				long n = arr[i];

				if ((n % 2) != 0) {
					if (tc != num - 1) {
						tc++;
					} else {
						f = false;
						break t;
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
			for (long l : arr) {
				System.out.print(l + " ");
			}
			System.out.println();
			tc = 0;
			s = true;
			count++;
		}

		System.out.println(count);
	}
}