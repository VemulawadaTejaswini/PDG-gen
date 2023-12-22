import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double s = 0.5 * a * b * Math.sin(Math.toRadians(c));
		double l = a + b + Math.sqrt((a*a) + (b*b) - (2*a*b*Math.cos(Math.toRadians(c))));
		double h = b * Math.sin(Math.toRadians(c));
		System.out.printf("%f %f %f", s, l, h);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}