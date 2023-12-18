import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

class Main {
	static final String YES = "Yes";
	static final String NO = "No";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		//double a = sc.nextDouble();
		//double b = sc.nextDouble();
		//double c = sc.nextDouble();

		MathContext mc = new MathContext(10);
		BigDecimal a = BigDecimal.valueOf(sc.nextDouble());
		BigDecimal b = BigDecimal.valueOf(sc.nextDouble());
		BigDecimal c = BigDecimal.valueOf(sc.nextDouble());
		BigDecimal x = sqrt(a, mc);
		BigDecimal y = sqrt(b, mc);
		BigDecimal z = sqrt(c, mc);

		if (Math.abs(x.add(y).subtract(z).doubleValue()) < 0.001) {
			System.out.println(NO);
			return;
		}

		if (x.add(y).compareTo(z) < 0) {
			System.out.println(YES);
		} else {
			System.out.println(NO);
		}
	}

	private static final BigDecimal TWO = BigDecimal.valueOf(2L);

	public static BigDecimal sqrt(BigDecimal x, MathContext mc) {
		BigDecimal g = x.divide(TWO, mc);
		boolean done = false;
		final int maxIterations = mc.getPrecision() + 1;
		for (int i = 0; !done && i < maxIterations; i++) {
			// r = (x/g + g) / 2
			BigDecimal r = x.divide(g, mc);
			r = r.add(g);
			r = r.divide(TWO, mc);
			done = r.equals(g);
			g = r;
		}
		return g;
	}
}
