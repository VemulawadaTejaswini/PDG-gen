import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int C = in.nextInt();

		double h = b * Math.sin(Math.toRadians(C));
		double S = a * h / 2.0;
		double L = a + b + Math.sqrt((a*a + b*b - 2*a*b*Math.cos(Math.toRadians(C))));

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}