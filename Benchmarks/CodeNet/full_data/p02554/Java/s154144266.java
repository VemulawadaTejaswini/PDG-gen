import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		// 整数の入力
		BigDecimal a = sc.nextBigDecimal();

		BigDecimal b = new BigDecimal(10).pow(a.intValue());
		BigDecimal c = new BigDecimal(9).pow(a.intValue());
		BigDecimal d = new BigDecimal(8).pow(a.intValue());

		System.out.println(b.subtract(c).subtract(c).add(d).remainder(new BigDecimal(1000000007)));
	}
}