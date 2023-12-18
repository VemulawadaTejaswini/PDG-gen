import java.util.*;
import java.math.BigInteger;
// warm-up
// Answer ripped off from editorial
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger(), M = sc.nextBigInteger();
		if (N.equals(BigInteger.ONE) && M.equals(BigInteger.ONE)) System.out.println(1);
		else if (N.equals(BigInteger.ONE) && !M.equals(BigInteger.ONE)) System.out.println(M.subtract(new BigInteger("2")));
		else System.out.println(N.subtract(new BigInteger("2")).multiply(M.subtract(new BigInteger("2"))));			
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}