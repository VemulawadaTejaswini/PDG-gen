import java.util.Scanner;


public class Main {

	public static boolean eq(double a, double b) {
		return Math.abs(b-a) < 1e-10;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double v = sc.nextDouble();
			double t = v / 9.8;
			double y = 4.9 * t * t;
			double n = (y / 5.0) + 1.0;
			System.out.println((int)Math.ceil(n));
		}


	}
}