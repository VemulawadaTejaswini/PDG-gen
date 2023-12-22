import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextLong();
		double B = scan.nextDouble();
		
		BigDecimal a = new BigDecimal(String.valueOf(A));
		BigDecimal b = new BigDecimal(String.valueOf(B));
		BigDecimal multi =a.multiply(b);
		BigDecimal multi1 = multi.setScale(0, BigDecimal.ROUND_DOWN);
		
		System.out.println(multi1);

	}

}
