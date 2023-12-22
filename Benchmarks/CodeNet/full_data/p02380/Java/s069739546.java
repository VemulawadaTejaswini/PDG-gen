import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int C = sc.nextInt();

		double S = (a * b * Math.sin(C)) /2 ;
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(C));
		double L = 2 * S / a;

		System.out.println(BigDecimal.valueOf(S).toPlainString() + " " + BigDecimal.valueOf(c).toPlainString() + " " + BigDecimal.valueOf(L).toPlainString());

	}

}