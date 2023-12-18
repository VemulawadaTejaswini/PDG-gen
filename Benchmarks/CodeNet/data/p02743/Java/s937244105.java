import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author wuyue
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		double k = sc.nextDouble();
		
		BigDecimal nBigDecimal = new BigDecimal(Math.sqrt(n));
		BigDecimal mBigDecimal = new BigDecimal(Math.sqrt(m));
		BigDecimal kBigDecimal = new BigDecimal(Math.sqrt(k));
		
		if (nBigDecimal.add(mBigDecimal).compareTo(kBigDecimal) < 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
	}

}
