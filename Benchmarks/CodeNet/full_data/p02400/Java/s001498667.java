import java.lang.Math;
import java.util.Scanner;
class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		double r = Double.parseDouble(s);
		System.out.println(r);
		System.out.println(String.format("%f %f", r * r * Math.PI, 2 * r * Math.PI));
    }
}