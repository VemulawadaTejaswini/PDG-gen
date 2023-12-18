import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal n = BigDecimal.valueOf(sc.nextDouble());
		sc.close();
		BigDecimal x = n.divide(BigDecimal.valueOf(3));

		System.out.println(x.multiply(x).multiply(x).toPlainString());
	}
}
