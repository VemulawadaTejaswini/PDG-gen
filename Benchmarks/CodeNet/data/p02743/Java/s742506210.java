import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		// √a + √b < √c
		// a + 2√ab + b < c
		// 2ab < (c -a -b)^2
		double result = 2 * a * b - Math.pow((c - a -b), 2);

		if (result < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}