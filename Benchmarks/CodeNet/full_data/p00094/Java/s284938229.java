import java.math.BigDecimal;

public class Main {


	public static void main(String[] args) {

		double tsubo = 3.305785;

		int a  = Integer.parseInt(args[0]);

		int b  = Integer.parseInt(args[1]);

		double s = (a * b) / tsubo;

		BigDecimal land = new BigDecimal(s);
		BigDecimal land1 = land.setScale(6,BigDecimal.ROUND_HALF_UP);

		System.out.println(land1);

	}

}