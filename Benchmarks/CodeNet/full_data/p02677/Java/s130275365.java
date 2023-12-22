import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		double shortHand = m * 6;
		double longHand = h * 30 + m * 0.5;
		double angle = Math.max(longHand, shortHand) -
				Math.min(longHand, shortHand);
		double distance = Math.sqrt(
				b * b + a * a - 2 * a * b * Math.cos(Math.toRadians(angle)));
		System.out.println(distance);
	}

}
