
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();
			int result = Integer.MAX_VALUE;

			for (int i = 2; i <= 3000; i++) {
				int tmp = calc(k * i);
				if (tmp < result) {
					result = tmp;
				}
			}

			System.out.println(result);
		}
	}

	private static int calc(int num) {
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
