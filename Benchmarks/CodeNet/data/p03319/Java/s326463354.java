import java.util.*;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[]$) {
		long k = scanner.nextLong();
		long n = 1;
		for (int i = 0; i <= k;) {
          	System.out.println("i: " + i);
			for (int j = 2; i < k && j <= 10; i++, j++) {
				System.out.println(n * j - 1);
			}
			n *= 10;
		}
	}
}