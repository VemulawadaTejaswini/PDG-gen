import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();

		// a >= b にする
		if ( a < b ) {
			long temp = a;
			a = b;
			b = temp;
		}

		long gcd = getGCD(a, b);
		boolean primeNumber[] = new boolean[(int) gcd + 1];
		Arrays.fill(primeNumber, true);
		primeNumber[0] = primeNumber[1] = false;

		int idx = 0;
		while ( idx <= gcd ) {
			while (idx < gcd && primeNumber[idx] == false ) {
				idx++;
			}
			for ( int i = idx * 2; i <= gcd; i += idx ) {
				primeNumber[i] = false;
			}
			idx++;
		}

		HashSet<Long> set = new HashSet<>();
		set.add((Long)1L);
		long div = 1L;
		while ( div <= gcd ) {
			if ( a % div == 0 && b % div == 0 && primeNumber[(int) div] ) {
				a /= div;
				b /= div;
				set.add(div);
				gcd /= div;
			}
			div++;
		}
		System.out.println(set.size());
		in.close();
	}

	private static long getGCD(long a, long b) {
		long r = a % b;
		if ( r == 0 ) {
			return b;
		} else {
			return getGCD(b, r);
		}
	}
}
