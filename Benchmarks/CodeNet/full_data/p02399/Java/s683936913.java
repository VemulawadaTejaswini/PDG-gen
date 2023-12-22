import java.util.Scanner;
import java.math.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		int d = a / b;
		int r = a & b;
		double f = 1.0 * a / b;

		BigDecimal x = new BigDecimal(f);
		x = x.setScale(5, BigDecimal.ROUND_HALF_UP);

        System.out.printf("%.5f", x);
     
	}
}