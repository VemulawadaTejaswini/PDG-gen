
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			for (long i = (long)Math.sqrt(n); i > 0; i--) {
				if (n % i == 0) {
					System.out.println(i + (n / i) - 2);
					return;
				}
			}
		}
	}
}
