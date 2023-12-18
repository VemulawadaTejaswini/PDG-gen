import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigDecimal L = sc.nextBigDecimal();
		BigDecimal three = BigDecimal.valueOf(3);

		BigDecimal tmp =  L.divide(three, 10,BigDecimal.ROUND_HALF_EVEN);
		tmp = tmp.multiply(tmp).multiply(tmp);
		System.out.println(tmp);
	}
}