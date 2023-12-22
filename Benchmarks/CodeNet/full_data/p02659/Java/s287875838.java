import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		BigDecimal n = stdIn.nextBigDecimal();
		BigDecimal m = stdIn.nextBigDecimal();



		System.out.println(n.multiply(m).setScale(0, BigDecimal.ROUND_DOWN));

		stdIn.close();
	}
}
