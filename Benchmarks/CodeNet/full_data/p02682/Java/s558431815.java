import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();

		if (k - a <= 0) {
			System.out.println(a);

		} else if (k - (a + b) <= 0) {
			System.out.println(a);
		} else {
			long n = k - a - b;

			System.out.println(a - n);
		}

		sc.close();
	}
}