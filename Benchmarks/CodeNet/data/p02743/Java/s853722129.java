import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public static BigDecimal sqrt(BigDecimal a) {
		BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
		BigDecimal b2 = new BigDecimal(2);
		for (int tempScale = 16; tempScale < 100; tempScale *= 2) {
			// x = x - (x * x - a) / (2 * x);
			x = x.subtract(x.multiply(x).subtract(a).divide(x.multiply(b2), 100, BigDecimal.ROUND_HALF_EVEN));
		}
		return x;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		sc.close();

		BigDecimal ra = sqrt(new BigDecimal(a));
		BigDecimal rb = sqrt(new BigDecimal(b));
		BigDecimal rc = sqrt(new BigDecimal(c));

		ra = ra.add(rb);

		if (ra.compareTo(rc) < 0) {
			out.println("Yes");
		} else {
			out.println("No");

		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
