import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		double a = Double.parseDouble(std.next());
		double b = Double.parseDouble(std.next());
		double c = Math.toRadians(Double.parseDouble(std.next()));

		double s = 0.5 * a * b * Math.sin(c);
		double l = Math.pow(a*a + b*b + 2*a*b*Math.cos(c),0.5) + a + b;
		double h = 2 * s / a;

		System.out.println(String.format("%.5f", s));
		System.out.println(String.format("%.5f", l));
		System.out.println(String.format("%.5f", h));
	}
}