
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();

			long tmp = a - b;
			if (tmp % 2 == 0) {
				System.out.println((tmp < 0 ? tmp * -1 : tmp) / 2);
				return;
			}

			long x;
			long y;
			if (a < b) {
				x = a;
				y = b;
			} else {
				x = b;
				y = a;
			}
			if (n - x < y - 1) {
				System.out.println(n - x);
			} else {
				System.out.println(y - 1);
			}
		}
	}
}
