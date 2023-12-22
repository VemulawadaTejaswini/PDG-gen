import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextBigInteger();

		System.out.println(
				BigInteger.ZERO.equals(n.mod(BigInteger.valueOf(9))) ? "Yes" : "No");
	}
}
