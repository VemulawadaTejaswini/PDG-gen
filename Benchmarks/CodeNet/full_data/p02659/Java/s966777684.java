import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		double result = a*b;
		BigDecimal bd = new BigDecimal(String.valueOf(result));
		BigDecimal bd1 = bd.setScale(0, RoundingMode.DOWN);
		System.out.println(bd1.toPlainString());
	}
}