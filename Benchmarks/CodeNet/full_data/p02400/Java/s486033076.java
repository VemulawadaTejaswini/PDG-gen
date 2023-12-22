import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double x = Math.PI;
		double s = 0;
		double l = 0;
		s = r * r * x;
		l = 2 * r * x;

		String ss = String.format("%1$.6f", s);
		String ls = String.format("%1$.6f", l);
		System.out.println (ss + " " + ls);
	}
}

