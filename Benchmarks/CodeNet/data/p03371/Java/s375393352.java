import java.util.Scanner;

public class Main {
	static int chocoAmount;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();

		int AandB = a * x + b * y;
		int AB = c * 2;
		if (x < y) {
			if (c * x * 2 + y < AandB) {
				System.out.println(c * x * 2 + b);
			} else {
				System.out.println(AandB);
			}
		} else {
			if (c * y * 2 + x < AandB) {
				System.out.println(c * y * 2 + a );
			} else {
				System.out.println(AandB);
			}
		}
	}
}