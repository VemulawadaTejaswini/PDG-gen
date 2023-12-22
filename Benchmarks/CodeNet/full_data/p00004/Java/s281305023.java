import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner stdin = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		double x = 0;
		double y = 0;
		while(stdin.hasNext()) {
			a = stdin.nextDouble();
			b = stdin.nextDouble();
			c = stdin.nextDouble();
			d = stdin.nextDouble();
			e = stdin.nextDouble();
			f = stdin.nextDouble();
			x = (e * c - b * f) / (e * a - b * d);
			y = (a * f - c * d) / (e * a - b * d);
			BigDecimal bdX = new BigDecimal(x);
			BigDecimal bdY = new BigDecimal(y);
			BigDecimal bd1 = bdX.setScale(4, BigDecimal.ROUND_HALF_UP);
			BigDecimal bd2 = bdY.setScale(4, BigDecimal.ROUND_HALF_UP);
			//System.out.printf("%.3f",bd1.doubleValue() + " " + bd2.doubleValue());
			System.out.printf("%.3f %.3f\n",bd1.doubleValue(), bd2.doubleValue());
		}
		
		
	}
}