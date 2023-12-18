import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();

		double v = a + b - c;
		if (v >= 0) {
			System.out.println("No");
			return;
		}
		v = v * v / 4;
		if (v > a * b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
