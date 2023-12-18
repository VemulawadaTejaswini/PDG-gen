import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		double ab = a + b + 2.0 * Math.sqrt(a * b);

		System.out.println(ab < c ? "Yes" : "No");
		scan.close();
	}
}
