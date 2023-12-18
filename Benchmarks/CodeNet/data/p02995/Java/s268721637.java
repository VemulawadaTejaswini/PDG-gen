import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		BigInteger one = new BigInteger("1");
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();
		BigInteger d = sc.nextBigInteger();
		BigInteger gcd = Main.gcd(c, d);
		BigInteger lgd = c.divide(gcd).multiply(d);
		BigInteger ac = a.divide(c).add(one);
		BigInteger bc = b.divide(c);
		BigInteger ad = a.divide(d).add(one);
		BigInteger bd = b.divide(d);
		BigInteger algd = a.divide(lgd).add(one);
		BigInteger blgd = b.divide(lgd);
		out.println(b.subtract(a).add(one).subtract((bc.subtract(ac).add(one)).add(bd.subtract(ad).add(one)).subtract(blgd.subtract(algd).add(one))).toString());
	}
	static BigInteger gcd(BigInteger a, BigInteger b) {
		BigInteger zero = new BigInteger("0");
		BigInteger r = a.abs();
		BigInteger tmp = b.abs();
		while (tmp.compareTo(zero) == 1) {
			BigInteger t = r.remainder(tmp);
			r = tmp;
			tmp = t;
		}
		return r;
	}
}