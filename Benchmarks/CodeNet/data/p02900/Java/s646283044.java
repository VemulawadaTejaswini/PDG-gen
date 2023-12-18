import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] ab = scanner.nextLine().split(" ");
		long a = Long.parseLong(ab[0]);
		long b = Long.parseLong(ab[1]);

		
		long c = 0;

		long cmpA = a, cmpB = b, max;
		while (cmpA == cmpB) {
			if (cmpA > cmpB) {
				cmpA = cmpA - cmpB;
			} else {
				cmpB = cmpB - cmpA;
			}
		}
		max = cmpA;

		for (long i = 1; i <= max; i++) {
			if (a % i == 0 && b % i == 0) {

				boolean ok = true;
				for (long j = 2; j < i; j++) {
					if (i % j == 0) {
						ok = false;
						break;
					}
				}
				if (ok) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
}