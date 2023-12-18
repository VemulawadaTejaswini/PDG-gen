import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		int max = (int) Math.sqrt(n);
		for (int i = max; true; i--) {
			if (n % i == 0) {
				System.out.println(n / i + i - 2);
				return;
			}
		}
	}
}