import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.math.BigInteger.*;

class AOJ10003 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d %d %.5f%n", a / b, a % b, 1. * a / b);
	}
}
public class Main {
	public static void main(String... args) {
		new AOJ10003().run();
	}
	static void debug(Object...os) {
		System.err.println(java.util.Arrays.deepToString(os));
	}
}