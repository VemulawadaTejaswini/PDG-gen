import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] ab = scanner.nextLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);

		int c = 0;

		int min = a > b ? b : a;

		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {

				boolean ok = true;
				for (int j = 2; j < i; j++) {
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