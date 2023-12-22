import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		long t = 0L;
		for ( int a=1; a<=n; a++ ) {
			long first = n/2;
			long b = nibutan((long)a, first, n, 0L, n);

			t += b;
		}

		System.out.println(t);
	}

	private static long nibutan(long a, long b, long n, long mi, long mx) {
		if ( mi>=b ) return mi;

		long ok = (b+mx)/2;
		long ng = (b+mi)/2;
		if ( a*b<n )	return nibutan(a, ok, n, b, mx);
		else		return nibutan(a, ng, n, mi, b);
	}
}