import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		double h = b - (x / Math.pow(a, 2));
		double num = a / (h * 2);
		System.out.println(90 - Math.toDegrees(Math.atan(num)));
	}
}
