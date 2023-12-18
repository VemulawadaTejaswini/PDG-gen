import java.util.*;
import java.math.BigDecimal;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		//System.out.println(Math.sqrt(b));
		//System.out.println(Math.sqrt(c));
		if (Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c)+0.1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}