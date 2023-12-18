import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal A = new BigDecimal(sc.next());
		BigDecimal B = new BigDecimal(sc.next());
		BigDecimal N = new BigDecimal(sc.next());
		BigDecimal n = BigDecimal.ZERO;
		BigDecimal E = N.multiply(A).divide(B);
		BigDecimal MAX = BigDecimal.ZERO;
		while (n.compareTo(E) != 1) {
			BigDecimal R = n.subtract(n.divide(A, 0, RoundingMode.DOWN).multiply(A));
			if (R.compareTo(MAX) == 1) {
				MAX = R;
			}
			n = n.add(BigDecimal.ONE);
		}
		System.out.println(MAX);
	}

}
