import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

		System.out.println(BigDecimal.valueOf(d).toPlainString());
	}

}