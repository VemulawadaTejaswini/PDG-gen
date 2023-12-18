import java.util.Scanner;

public class Main {

	public static void main(String... args) {

		try (Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();
			long m = sc.nextLong();

			long c = 0;

			for (long i = 0; i < n; i++) {
				for (long j = 0; j < m; j++) {

					long a = (Math.min(n - 1, i + 1) - Math.max(0, i - 1) + 1) % 2;
					long b = (Math.min(m - 1, j + 1) - Math.max(0, j - 1) + 1) % 2;

					if (a * b == 1) {
						c++;
					}

				}
			}

			System.out.println(c);

		}

	}

}
