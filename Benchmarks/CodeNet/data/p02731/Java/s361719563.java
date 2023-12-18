import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal L = new BigDecimal(sc.next());
		BigDecimal a= L.multiply(L).multiply(L);
		a.setScale(12);
		BigDecimal b = new BigDecimal("27");
		b.setScale(12);
		System.out.println(a.divide(b,12,BigDecimal.ROUND_UP));
	}
}