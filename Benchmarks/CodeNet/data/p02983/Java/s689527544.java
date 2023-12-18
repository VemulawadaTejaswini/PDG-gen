import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		//		long min = Long.MAX_VALUE;
		//
		//		for (long i = l; i < r; i++) {
		//			for (long j = i + 1; j <= r; j++) {
		//				long calc = (i * j) % 2019;
		//				min = Math.min(min, calc);
		//			}
		//		}

		long ans = 0;
		if (r < 2019) {
			ans =  (l * (l + 1)) % 2019;

		} else if (r - l >= 4038) {
			ans = 0;

		} else if (r - l >= 2019) {
			for (long i = r; i <= l; i++) {
				if (i % 2019 == 1) {
					if (i + 2019 < l) {
						ans = 0;
						break;

					} else {
						ans = 1;
						break;
					}
				}
			}

		} else {
			ans =  (l * (l + 1)) % 2019;
		}

		System.out.println(ans);

	}

}
