import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();
		double l = (h / 6 + m / 360);
		double s = (m / 30);
		double kakudo = Math.abs(s-l) * Math.PI;
		double ans = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(kakudo));
		System.out.println(ans);
	}
}
