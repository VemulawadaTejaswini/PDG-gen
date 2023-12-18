
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();
			int result = Integer.MAX_VALUE;

			for (long i = 2; i <= 300000; i++) {
				int tmp = calc(i * k);
				if (tmp < result) {
					result = tmp;
				}
			}

			System.out.println(result);
		}
	}

	private static int calc(long num) {
		int result = 0;

		for (;;) {
			result += num % 10;
			num /= 10;
			if (num <= 0) {
				return result;
			}
		}
	}
}
