import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();

		int a = S / 1000;
		int b = S % 1000 / 100;
		int c = S % 1000 % 100 / 10;
		int d = S % 1000 % 100 % 10;

		if (a == b || b == c || c == d) {
			System.out.print("Bad");
		} else {
			System.out.print("Good");
		}

	}
}