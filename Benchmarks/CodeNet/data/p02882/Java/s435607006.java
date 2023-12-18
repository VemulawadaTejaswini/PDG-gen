import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		sc.close();
		BigDecimal res = new BigDecimal(0.0);

		//桁数指定
		DecimalFormat format =new DecimalFormat("#.#");
		format.setMinimumFractionDigits(10);

		if(a*a*b/2.0 <= x) {
			res = res.add(new BigDecimal(Math.atan(2*(a*a*b-x)/(a*a*a))));
		}else {
			res = res.add(new BigDecimal(Math.PI / 2.0 - Math.atan(2 * x / (a*b*b))));
		}
		System.out.println(format.format
				(res.multiply(new BigDecimal(180.0))
						.divide(new BigDecimal(Math.PI),10,RoundingMode.HALF_UP)));
	}
}