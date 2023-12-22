
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long c = sc.nextInt();
			long d = sc.nextInt();

			long result = Long.MIN_VALUE;
			if (result < a * c) {
				result = a * c;
			}
			if (result < a * d) {
				result = a * d;
			}
			if (result < b * c ) {
				result = b * c;
			}
			if (result < b * d) {
				result = b * d;
			}
			System.out.println(result);
		}
	}
}
