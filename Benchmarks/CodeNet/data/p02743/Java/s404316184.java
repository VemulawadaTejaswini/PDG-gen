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
		
		double dd = Math.pow(k-m-n, 2);
		if (dd - 4*n*m > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
	}

}
