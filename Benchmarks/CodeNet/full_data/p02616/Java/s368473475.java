import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int K = Integer.valueOf(s.next());
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = Long.valueOf(s.next());
		}
		final long amari = 1000000007;
		Arrays.sort(A);

		if(K == 1) {
			System.out.println(A[N-1]);
			return;
		}
		if(K == 2) {
			if(Long.compare(A[N-1] * A[N - 2], A[0] * A[1]) >= 0) {
				System.out.println((A[N-1] * A[N - 2])%amari);
				return;
			}else {
				System.out.println((A[0] * A[1])%amari);
				return;
			}
		}

		int plus = N-1;
		int minus = 0;
		BigInteger second = BigInteger.ONE;
		BigInteger bigger = BigInteger.ONE;
		for(int i = 0; i < K; i++) {
			bigger = bigger.multiply(BigInteger.valueOf(A[N-i-1]));
			if(Math.abs(A[plus]) > Math.abs(A[minus])) {
				second = second.multiply(BigInteger.valueOf(A[plus]));
				plus--;
			}else {
				second = second.multiply(BigInteger.valueOf(A[minus]));
				minus++;
			}
		}
		if(second.compareTo(BigInteger.ZERO) < 0) {
			second = second
					.divide(BigInteger.valueOf(A[--minus]))
					.multiply(BigInteger.valueOf(A[plus]));
		}
		
		if(second.compareTo(bigger) >= 0) {
			System.out.println(second.mod(BigInteger.valueOf(amari)));
		}else {
			System.out.println(bigger.mod(BigInteger.valueOf(amari)));
		}
	}
}