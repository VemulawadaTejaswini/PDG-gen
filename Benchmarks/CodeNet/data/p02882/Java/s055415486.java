import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		double angle = 0.0;
		if (a * a * b >= 2 * x) {
			angle = Math.atan((a * b * b) / (2 * x));
		} else {
			angle = Math.atan((2 * b / a) - (2 * x / (a * a * a)));
		}
		System.out.println(angle);
		sc.close();
	}
}
