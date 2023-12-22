import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		try(Scanner scan = new Scanner(System.in)) {
			a = scan.nextInt();
			b = scan.nextInt();

			System.out.println((a * b) + " " + ((a + b) * 2));
		}
	}
}