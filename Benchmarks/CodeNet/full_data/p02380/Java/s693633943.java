import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int C = scan.nextInt();
		scan.close();
		double S = (a * b) / 2 * Math.sin(Math.toRadians(C));
		double c = Math.sqrt(a * a + b * b - (2 * a * b * Math.cos(Math.toRadians(C))));
		double L = a + b + c;
		double h = S * 2 / a;
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}