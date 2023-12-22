import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int d = a / b;
		int r = a % b;
		double f = (double) a / b;
		BigDecimal src = BigDecimal.valueOf(f);
		src = src.setScale(6, BigDecimal.ROUND_DOWN);

		System.out.println(d + " " + r + " " + src);

	}

}

