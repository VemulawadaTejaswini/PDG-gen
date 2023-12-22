import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int a = sc.nextInt();
		final int b = sc.nextInt();
		final int C = sc.nextInt();
		
		final double h = Math.sin(Math.toRadians(C)) * b;
		final double rest_a = a - Math.cos(Math.toRadians(C)) * b;
		
		final double c = C >= 90 ? Math.sqrt(a * a + b * b) : Math.sqrt(h * h + rest_a * rest_a);
		
		System.out.printf("%.7f\n%.7f\n%.7f\n", a * h / 2, a + b + c, h);
		
	}
}