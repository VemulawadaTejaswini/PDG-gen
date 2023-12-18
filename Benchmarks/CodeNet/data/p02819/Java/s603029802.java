
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();

			if (x == 2) {
				System.out.println(2);
				return;
			}

			if (x % 2 == 0) {
				x++;
			}

			do {
				if (isPrime(x)) {
					System.out.println(x);
					return;
				}
				x += 2;
			} while(true);
		}
	}

	private static boolean isPrime(int n) {
		for (int i = 3; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}