import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.math.BigInteger.*;

class AOJ10002 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d %d%n", a * b, (a + b) << 1);
	}
}
public class Main {
	public static void main(String... args) {
		new AOJ10002().run();
	}
	static void debug(Object...os) {
		System.err.println(java.util.Arrays.deepToString(os));
	}
}