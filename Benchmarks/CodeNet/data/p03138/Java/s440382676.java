import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();

		long[] a = new long[n];
		long[] b = new long[n];

		int[] countOne = new int[50];
		int[] countZero = new int[50];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();

			long tmp = a[i];
			double log = Math.log(k) / Math.log(2);

			for (int j = 0; j <= log; j++) {
				int mask = 1;

				long w = mask & tmp;

				if (w == 1) {
					countOne[j]++;
				} else if (w == 0) {
					countZero[j]++;
				}

				tmp = tmp >> 1;

			}

		}


		long ans = 0;

		for (int i = 49; i > 0; i--) {
			if (countZero[i] > countOne[i]) {
				ans = ans | 1;
			}

			ans = ans << 1;

		}

		long sum = 0;

		for (long num : a) {
			sum += num ^ans;
		}

		System.out.println(sum);

		sc.close();
	}

}
