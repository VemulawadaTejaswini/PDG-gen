import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		// 整数の入力
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		BigDecimal c = sc.nextBigDecimal();
		BigDecimal d = sc.nextBigDecimal();



		if (b.compareTo(new BigDecimal(0)) > 0 && d.compareTo(new BigDecimal(0)) > 0) {
			System.out.println(b.multiply(d));
		} else if (a.compareTo(new BigDecimal(0)) <= 0 && c.compareTo(new BigDecimal(0)) <= 0) {
			System.out.println(a.multiply(c));
		} else if (b.compareTo(new BigDecimal(0)) > 0 && d.compareTo(new BigDecimal(0)) <= 0) {
			System.out.println(a.multiply(d));
		} else if (b.compareTo(new BigDecimal(0)) <= 0 && d.compareTo(new BigDecimal(0)) > 0) {
			System.out.println(b.multiply(c));
		} 
	}
}