import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double s = a * b * Math.sin(Math.PI / 180 * c) / 2;
		System.out.println(s);
		System.out.println(a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.PI / 180 * c)));
		System.out.println(2 * s / a);
	}
}