import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		String s = sc.next();
		BigDecimal a= new BigDecimal(A);
		BigDecimal b = new BigDecimal(s);
		a = a.multiply(b);
		System.out.println(a.longValue());
	}
}