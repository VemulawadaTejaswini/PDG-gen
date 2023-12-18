import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		BigDecimal x = a.add(b) ;
		BigDecimal c = new BigDecimal("2");
		x = x.divide(c,0,BigDecimal.ROUND_UP) ;

		System.out.println(x);
	}
}