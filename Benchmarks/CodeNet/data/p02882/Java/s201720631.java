import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		sc.close();

		double y = 2.0 * x / a / b;
		if (y <= a) {
			double r = Math.atan2(b, y);
			System.out.println(180 * r / Math.PI);
		} else {
			double h = 2.0 * x / a / a - b;
			double r = Math.atan2(b - h, a);
			System.out.println(180 * r / Math.PI);
		}
	}
}
