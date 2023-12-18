import java.math.BigDecimal;
import java.util.Scanner;

//AtCoder Beginner Contest 159
//C	Maximum Volume
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String L = sc.next();
		sc.close();

		BigDecimal v1 = new BigDecimal(L + ".0");
		v1 = v1.divide(new BigDecimal(3.0),6,BigDecimal.ROUND_HALF_UP);
		BigDecimal v3 = new BigDecimal(L).subtract(v1).subtract(v1);

		System.out.println(v1.multiply(v1).multiply(v3).toString());
	}
}
