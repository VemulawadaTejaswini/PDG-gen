
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int d = sc.nextInt();
		final int n = sc.nextInt();

		if (d == 0) {
			System.out.println(n);
		} else if (d == 1) {
			System.out.println(n * 100);
		} else if (d == 2) {
			System.out.println(n * 100 * 100);
		}

	}

}
