import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		
		BigDecimal culc = a.multiply(b);
		long ans = culc.longValue();
		System.out.println(ans);
		sc.close();
	}

}