import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		BigDecimal A =  new BigDecimal(scan.nextLong());
		BigDecimal B = new BigDecimal(scan.nextDouble());

		System.out.println(A.multiply(B).longValue());
	}
}