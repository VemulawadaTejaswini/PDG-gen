import java.math.*;
import static java.math.BigInteger.*;
import java.util;

static class Split {
	static long N;

	static BigInteger factorial(long n) {
		if (n < 2) {
			return ONE;
		}
		BigInteger p = ONE, r = ONE;
		N = 1;
		long log2n = 31 - Integer.numberOfLeadingZeros(n);
		long h = 0, shift = 0, high = 1;
		while (h != n) {
			shift += h;
			h = n >>> log2n--;
			long len = high;
			high = (h & 1) == 1 ? h : h - 1;
			len = (high - len) >> 1;
			if (len > 0) {
				r = r.multiply((p = p.multiply(bp(len))));
			}
		}
		return r.shiftLeft(shift);
	}

	static BigInteger bp(long n) {
		long m = n >> 1;
		if (m == 0) {
			return valueOf(N += 2)%1000003;
		} else if (n == 2) {
			return valueOf(N += 2).multiply(valueOf(N += 2))%1000003;
		}
		return bp(n - m).multiply(bp(m))%1000003;
	}}
static final long modPow(long x, long n, final long mod) {
    long sum = 1;
    while (n > 0) {
        if ((n & 1) == 1) {      //ビットが立っていたら
            sum = sum * x % mod; //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
        }
        x = x * x % mod;         //((x^2)^2)^2 ・・・
        n >>= 1;
    }
    return sum;
}

    public class Main{
        public static void main(string[]args){
            Scanner sc=new Scanner();
            int Q=sc.nextInt();
            for(int i=0;i<Q;i++){
                long x,d,n;
                x=sc.nextInt();
                d=sc.nextInt();
                n=sc.nextInt();
                System.out.println(Split.factorial(2*n)/Split.factorial(n)/modPow(2,n,1000003));
            }

        }

    }