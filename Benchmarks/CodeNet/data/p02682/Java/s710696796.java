
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();

		long count = 0;
		long sum = 0;

		if (k <= a) {
			sum += k;
			System.out.println(sum);
			return;
		}

		if (k > a) {
			count += a;
			sum += a;
			k -= a;
		}

		if (k <= b) {
			System.out.println(sum);
			return;
		}

		if (k > b) {
			count += b;
			k -= b;
		}

		if (k <= c) {
			sum -= k;
			System.out.println(sum);
			return;
		}

	}
}
