import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		double a = in.nextDouble();
		double b = in.nextDouble();
		double C = Math.toRadians(in.nextDouble());

		double S = 0.5 * a * b * Math.sin(C);
		double L = a
				+ b
				+ Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b
						* Math.cos(C));
		double h = b * Math.sin(C);

		System.out.println(String.format("%f", S));
		System.out.println(String.format("%f", L));
		System.out.println(String.format("%f", h));
	}
}