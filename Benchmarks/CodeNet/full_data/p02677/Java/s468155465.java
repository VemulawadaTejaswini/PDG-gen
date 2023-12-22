import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double kakudo = Math.abs((m * 360 / 60) - ((h + (double)m / 60) * 360 / 12));
		double x = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(kakudo)); 
		System.out.println(Math.sqrt(x));
	}
}
