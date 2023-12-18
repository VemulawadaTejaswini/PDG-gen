import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		if (year == 1) {
			System.out.println("Hello World");
		} else {
			int first = scan.nextInt();
			int second = scan.nextInt();
			System.out.println(first + second);
		}
	}
}