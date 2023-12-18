import java.util.*;
import java.util.function.*;
public class Main {
  	private static final int MAX = 510000;
	private static long[] fac = new long[MAX];
	private static long[] inv = new long[MAX];
	private static long[] finv = new long[MAX];
	private static final int constant = 998244353;
  
  	public Main() {
    	fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			fac[i] = fac[i - 1] * i % constant;
			inv[i] = constant - inv[constant%i] * (constant / i) % constant;
			finv[i] = finv[i - 1] * inv[i] % constant;
		}
    }
  
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int K = s.nextInt();

		final LongBinaryOperator pow = (i, j) -> {
			long result = 1;
			while(j > 0) {
				if((j & 1) == 1)
					result = (result * i) % constant;
				i = (i  * i) % constant;
				j >>= 1;
			}
			return result;
		};

		final IntUnaryOperator function = i -> {
			return (int)(M * getNewCom(N - 1, i) % constant * pow.applyAsLong(M-1, N-i-1) % constant);
		};
		
		long result = 0;
		for(int i = 0; i < K + 1; i++) {
			result = (result + function.applyAsInt(i)) % constant;
		}

		System.out.println(result);
    }
  
  	private static long getNewCom(int n, int k) {
		if( n < k) return 0;
		if (n < 0 || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n - k] % constant) % constant;
	}
}