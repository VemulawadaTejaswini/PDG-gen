import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final long a = sc.nextLong();
		final long b = sc.nextLong();
		final long c = sc.nextLong();
		final long d = sc.nextLong();

		long count = 0;
		for (long i = a; i <= b; i++) {
			if (i % c > 0 && i % d > 0) {
				count++;
			}
		}

		System.out.print(count);

	}

}