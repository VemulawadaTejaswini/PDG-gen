import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long gcd = Main.gcd(c, d);
		long lgd = c / gcd * d;
		long ac = a / c + 1;
		long bc = b / c;
		long ad = a / d + 1;
		long bd = b / d;
		long algd = a / lgd + 1;
		long blgd = b / lgd;
		out.println(b - a + 1 - ((bc - ac + 1) + (bd - ad + 1) - (blgd - algd + 1)));
	}
	static long gcd(long a, long b) {
		if (a == 0 || b == 0) {
			return 0;
		}
		long r = Math.abs(a);
		long tmp = Math.abs(b);
		while (tmp > 0) {
			long t = r % tmp;
			r = tmp;
			tmp = t;
		}
		return r;
	}
}
