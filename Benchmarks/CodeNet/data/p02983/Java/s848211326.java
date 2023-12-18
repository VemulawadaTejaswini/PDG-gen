
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long l = sc.nextLong();
			long r = sc.nextLong();
			long sub = r - l;

			if (2019 < sub) {
				System.out.println(0);
				return;
			}

			for (long i = l; i <= r; i++) {
				if (i % 2019 == 0) {
					System.out.println(0);
					return;
				}
			}

			long tmp = l % 2019;
			System.out.println((tmp * (tmp + 1)) % 2019);
		}
	}
}
