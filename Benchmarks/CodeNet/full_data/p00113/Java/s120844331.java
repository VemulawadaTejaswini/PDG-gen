import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	long gcd(long a, long b) {

		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		return a;
	}

	void run() {
		for (; sc.hasNextInt();) {
			long p = sc.nextInt();
			long q = sc.nextInt();
			long u = gcd(p, q);
			p /= u;
			q /= u;
			int zeroLength = 0;
			p %= q;
			long prefix = p / q;

			while (q % 10 == 0) {
				q /= 10;
				prefix *= 10;
				prefix += p / q;
				p %= q;
				zeroLength++;
			}
			while (q % 2 == 0) {
				q /= 2;
				p *= 5;
				prefix *= 10;
				prefix += p / q;
				p %= q;
				zeroLength++;
			}
			while (q % 5 == 0) {
				q /= 5;
				p *= 2;
				prefix *= 10;
				prefix += p / q;
				p %= q;
				zeroLength++;
			}
			prefix += p / q;
			// System.out.println(p + " " + q);
			if (q == 1) {
				System.out.printf("%0" + zeroLength + "d\n", prefix);
				continue;
			}
			p %= q;
			int length = 1;
			BigInteger nine = new BigInteger("9");
			for (;! nine.mod(new BigInteger(String.valueOf(q))).equals(
					BigInteger.ZERO);) {
				nine = nine.multiply(BigInteger.TEN).add(new BigInteger("9"));
				length++;
			}
			BigInteger circ = nine.multiply(new BigInteger(String.valueOf(p)))
					.divide(new BigInteger(String.valueOf(q)));
			if (zeroLength != 0) {
				System.out.printf("%0" + zeroLength + "d", prefix);
			}
			String s = circ.toString();
			for(int k = length-s.length(); k--> 0;){
				System.out.print("0");
			}
			System.out.println(circ);
			for (int z = zeroLength; z-- > 0;)
				System.out.print(' ');
			for (; length-- > 0;)
				System.out.print('^');
			System.out.println();
			/*
			 * 2/12 -> 10/6 -> 1 4/6 -> 1 20/3 -> 16 6666 1/6 -> 5/3 \1 2/3
			 * 0.16666
			 */
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}