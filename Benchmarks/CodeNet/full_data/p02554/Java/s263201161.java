import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double d = Math.pow(10, 9) + 7;
		
		BigDecimal a = BigDecimal.valueOf(9).pow(n).multiply(BigDecimal.valueOf(2));
		BigDecimal b =  BigDecimal.valueOf(8).pow(n);
		BigDecimal c = a.subtract(b);
		BigDecimal e = BigDecimal.valueOf(10).pow(n);
		BigDecimal ans = e.subtract(c).remainder(BigDecimal.valueOf(d));
		System.out.println(ans.longValue());
	}

}
