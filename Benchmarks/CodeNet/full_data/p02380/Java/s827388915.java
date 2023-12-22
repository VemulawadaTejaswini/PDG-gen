
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double b = scn.nextDouble();
		double e = scn.nextDouble();
		double C = Math.sin(Math.toRadians(e));
		double S = a * b * C / 2;
		double d = (a * a) + (b * b) - (2 * a * b * Math.cos(Math.toRadians(e)));
		double L = a + b + Math.sqrt(d);
		double h = b * C;
		System.out.println(S + " " + L + " " + h);
	}
}
