import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		BigInteger[] T = new BigInteger[N];

		for (int i = 0; i < N; i++) {
			T[i] = new BigInteger(Long.toString(sc.nextLong()));
		}

		BigInteger gcd = T[0].gcd(T[1]);
		BigInteger mul = T[0].multiply(T[1]);
		BigInteger lcm = mul.divide(gcd);

		for (int i = 2; i < N; i++) {
			gcd = lcm.gcd(T[i]);
			mul = lcm.multiply(T[i]);
			lcm = mul.divide(gcd);
		}

		System.out.println(lcm);
	}
}