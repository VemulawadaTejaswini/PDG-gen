import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		double r = Double.valueOf(line);

		BigDecimal R = BigDecimal.valueOf(r);
		BigDecimal p = BigDecimal.valueOf(Math.PI);
		BigDecimal two = new BigDecimal("2");
		BigDecimal m = R.multiply(R);
		BigDecimal M = m.multiply(p);
		BigDecimal e = R.multiply(two);
		BigDecimal E = e.multiply(p);

		BigDecimal MM = M.setScale(6, BigDecimal.ROUND_HALF_UP);
		BigDecimal EE = E.setScale(6, BigDecimal.ROUND_HALF_UP);

		System.out.println(MM + " " + EE);
	}

}