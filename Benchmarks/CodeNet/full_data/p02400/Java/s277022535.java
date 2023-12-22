import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		BigDecimal r = new BigDecimal(line);
		BigDecimal p = new BigDecimal(Math.PI);
		BigDecimal c = r.multiply(r);
		BigDecimal m = c.multiply(p);

		BigDecimal two = new BigDecimal("2");
		BigDecimal d = r.multiply(two);
		BigDecimal s= d.multiply(p);

		m.setScale(7, BigDecimal.ROUND_DOWN);
		s.setScale(7, BigDecimal.ROUND_DOWN);
		System.out.print(m);System.out.println(" "+s);
	}
}