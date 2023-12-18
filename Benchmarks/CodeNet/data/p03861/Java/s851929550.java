import java.util.*;
import java.math.BigInteger;
// warm-up
// Always check the bounds
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		BigInteger a=sc.nextBigInteger(), b=sc.nextBigInteger(), x=sc.nextBigInteger();
		if (b.divide(x).equals(a.divide(x))) System.out.println(0);
		else System.out.println(b.divide(x).subtract(a.divide(x)).add(BigInteger.ONE));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}