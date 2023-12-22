import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		double s = a * b * Math.sin(Math.toRadians(c));
		double l = a + b + Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2 * a * b * Math.cos(Math.toRadians(c)));
		double h = b * Math.sin(Math.toRadians(c));
		System.out.println(s);
		System.out.println(l);
		System.out.println(h);
	}
}