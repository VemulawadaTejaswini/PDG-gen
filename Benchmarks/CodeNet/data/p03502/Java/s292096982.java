import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final long n = sc.nextInt();

		final String[] list = String.valueOf(n).split("");

		long total = 0;
		for (final String num : list) {
			total = total + Integer.parseInt(num);
		}

		if (n % total == 0) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}

	}

}