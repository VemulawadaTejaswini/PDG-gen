import java.util.*;
import java.math.BigDecimal;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		if (a > 100 && c > 100) {
			int aa = (int)Math.sqrt(a) / 10;
			int bb = (int)Math.sqrt(b) / 10;
			int cc = (int)Math.sqrt(c) / 10;
			if (aa+bb<cc) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if (Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}