import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		double h = sc.nextDouble();
		double m = sc.nextDouble();


		double radH = 360 * ((h * 60 + m) / 720);
		double radM = 360 * (m / 60);

		double rad = Math.abs(radH - radM);

		if (rad > 180) {
			rad = 360 - rad;
		}
		double ans = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (Math.cos(Math.toRadians(rad)) * 2 * a * b));
		System.out.println(ans);
	}


}