import java.util.*;
import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n==k){
            System.out.println(1);
            for(int i = 1;i < k;i++){
                System.out.println(0);
            }
            return;
        }
        for(int i = 0;i < k;i++){
            long ans = nCk(k-1,k-i-1,MOD);//iH(k-i)
            ans *= nCk(n-k+1,i+1,MOD);
            System.out.println(ans%MOD);
        }
    }       
    public static int nCk(int n, int k, int M) {
		long ret = 1;
		int min = Math.min(k, n - k);
		for (int i = 1; i <= min; i++) {
			ret = (ret * pow(i, M - 2, M)) % M;
		}
		for (int i = n - min + 1; i <= n; i++) {
			ret = (ret * i) % M;
		}
		return (int) ret;
    }
    public static long pow(long a, long b, int M) {
		long ret = 1;
		long tmp = a;
		while (b > 0) {
			if ((b & 1) == 1)
				ret = (ret * tmp) % M;
			tmp = (tmp * tmp) % M;
			b = b >> 1;
        }
        
		return ret;
    }
    static long modfact(final long i) {
        if (i == 0)
            return 1;
        return (i % MOD * modfact(i - 1)) % MOD;
    }
    static long modinv(long a, final long m) {
        long b = m;
        long u = 1;
        long v = 0;
        while (b > 0) {
            final long t = a / b;
            a -= t * b;
            long tmp = b;
            b = a;
            a = tmp;
            u -= t * v;
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0)
            u += m;
        return u;
    }
}




