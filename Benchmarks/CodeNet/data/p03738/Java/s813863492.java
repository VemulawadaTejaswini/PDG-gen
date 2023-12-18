import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
		System.out.println(a.compareTo(b)<0 ? "LESS" : a.compareTo(b)==0 ? "EQUAL" : "GREATER");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}