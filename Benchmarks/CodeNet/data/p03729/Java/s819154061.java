import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		if (a == b && b == c) {

			System.out.println("Yes");

		} else {
			System.out.println("No");

		}
	}
}