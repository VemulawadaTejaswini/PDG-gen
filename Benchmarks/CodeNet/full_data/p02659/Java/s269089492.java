import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal a = new BigDecimal(sc.nextDouble());
		BigDecimal b = new BigDecimal(sc.nextDouble());

		System.out.println((long)Math.floor(a.multiply(b).doubleValue()));

		sc.close();

	}

}