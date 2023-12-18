import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a * c < b * d) {

			System.out.println(b * d);

		} else if (a * c > b * d) {

			System.out.println(a * c);

		} else if (a * c == b * d) {

			System.out.println(a * c);

		}

	}
}
