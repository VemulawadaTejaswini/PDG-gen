import java.util.Scanner;

public class Main {

	public static void main(String... args) {

		try (Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();
			long m = sc.nextLong();

			n = n - 2;
			m = m - 2;

			System.out.println(Math.abs(n * m));

		}

	}

}
