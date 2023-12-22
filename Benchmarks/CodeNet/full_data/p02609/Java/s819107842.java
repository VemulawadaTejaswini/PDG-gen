import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String s = in.next();

		BigInteger x = BigInteger.ZERO;
		for (int i=0; i<n; i++)
			if (s.charAt(i) == '1')
				x = (x.multiply(BigInteger.TWO)).add(BigInteger.ONE);
			else
				x = x.multiply(BigInteger.TWO);

		for (int i=0; i<n; i++) {
			BigInteger y = x.xor(BigInteger.TWO.pow(n-1-i));

			int count = 0;
			while (y.compareTo(BigInteger.ZERO) != 0) {
				//System.out.println(y);
				y = y.remainder(new BigInteger("" + y.bitCount()));
				count++;
			}
			System.out.println(count);
		}
	}
}
