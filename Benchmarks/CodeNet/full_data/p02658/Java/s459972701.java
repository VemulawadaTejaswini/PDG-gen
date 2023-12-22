import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final long MAX = (long) 1e18;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger bi = BigInteger.ONE;
		for (int i = n - 1; i >= 0; --i) {
			bi = bi.multiply(sc.nextBigInteger());
		}
		
		try {
			long res = bi.longValueExact();
			if (res <= MAX) {
				System.out.println(res);
			} else {
				System.out.println(-1l);
			}
		} catch (Exception e) {
			System.out.println(-1l);
		}
	}
}
