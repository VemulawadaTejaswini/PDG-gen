import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long m = Long.parseLong(sc.next());
		for (int i = 1; i < n; i++)
			m = lcm(m, Long.parseLong(sc.next()));
		System.out.println(m);
	}
	public static long lcm(long m, long n) {
		BigInteger M = new BigInteger(String.valueOf(m));
		BigInteger N = new BigInteger(String.valueOf(n));
		BigInteger G = new BigInteger(String.valueOf(gcd(m, n)));
		return M.multiply(N).divide(G).longValue();
	}
	public static long gcd(long m, long n) {
		if (m < n) {
			long tem = m;
			m = n;
			n = tem;
		}
		long r = -1;
		while (r != 0) {
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
}