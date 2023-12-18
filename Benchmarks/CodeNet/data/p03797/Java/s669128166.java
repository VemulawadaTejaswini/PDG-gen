import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		BigInteger n=sc.nextBigInteger(), m=sc.nextBigInteger(), t=BigInteger.ZERO;
		if (m.doubleValue() < n.doubleValue()) t=m.divide(new BigInteger("2"));
		else {
			t=t.add(n); m=m.subtract(n.multiply(new BigInteger("2")));
			t=t.add(m.divide(new BigInteger("4")));
		}
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}
