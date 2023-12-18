import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		double height = scan.nextDouble();
		double width = scan.nextDouble();
		int x = scan.nextInt();
		int y = scan.nextInt();

		if(height / y == 2 && width / x == 2) {
			System.out.println(height * width / 2.0 + " " + 1);
		} else {
			System.out.println(height * width / 2.0 + " " + 0);
		}

	}
}
