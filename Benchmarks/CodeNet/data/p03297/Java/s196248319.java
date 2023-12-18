import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();

		for (long i = 0; i < N; i++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long c = sc.nextInt();
			long d = sc.nextInt();

			long amari = a % b;
			if ((a < b) || ((d + amari) < b)) {
				System.out.println("No");
				continue;
			}

			boolean result = false;
			long max = 0;
			long limit = a * d;

			long counter = 0;
			try {
				while (true) {
					counter++;
					a = a - b;
					if (a < 0) {
						break;
					}
					if (a <= c) {
						a = a + d;
						if (max < a) {
							max = a;
						}
					}

					if (a == max && limit <= counter) {
						result = true;
						break;
					}
				}
			} catch (Exception e) {
				result = false;
			}
			if (result) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}
}
