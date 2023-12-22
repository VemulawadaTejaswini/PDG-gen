import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			long b = sc.nextLong();

			if (b == 0) {
				break;
			}

			long ans1 = b;
			long ans2 = 1;

			for (int i = 2;; i++) {
				long sum = i * (i + 1) / 2;

				if (b < sum)
					break;

				long n = b - sum;
				if (n % i == 0) {
					ans1 = n / i + 1;
					ans2 = i;
				}
			}
			System.out.println(ans1 + " " + ans2);
		}
	}
}
