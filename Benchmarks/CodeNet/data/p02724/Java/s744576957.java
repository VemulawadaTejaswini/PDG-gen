import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		long count500;
		long count5;

		count500 = x / 500;
		x -= count500 * 500;
		count5 = x /5;

		System.out.println((count500 * 1000) + (count5 * 5));
	}
}