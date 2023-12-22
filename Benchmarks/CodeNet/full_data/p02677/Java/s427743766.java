import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		double h_angle = h * 30 + (m * 0.5);
		double m_angle = m * 6;

		double diff_angle = Math.abs(h_angle - m_angle);
		if (diff_angle == 180.0) {
			System.out.println(a + b);
		} else if (diff_angle == 0.0) {
			System.out.println(Math.abs(a - b));
		} else {
			double cosC = Math.cos(Math.toRadians(diff_angle));
			double length = Math.sqrt(a * a + b * b - 2 * a * b * cosC);
			System.out.println(length);
		}
	}

}
