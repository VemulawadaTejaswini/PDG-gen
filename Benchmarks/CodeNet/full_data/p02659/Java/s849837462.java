import java.math.BigDecimal;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		a.multiply(b);
		
		System.out.println(a.toBigInteger());
	}
}
