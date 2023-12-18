import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    final long MOD = (long)1e9+7;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] num = new long[k+1];

        for (int i=k; i>=1; i--) {
            num[i] = modpow(k/i, n);
            for (int j=2; j*i<k+1; j++) {
                num[i] = (num[i]-num[j*i]+MOD)%MOD;
            }
        }

        long ans = 0;

        for (int i=1; i<=k; i++) {
            ans += i*num[i];
            ans %= MOD;
        }

        System.out.println(ans%MOD);

    }

    long modpow(long x, long n) {
        long sum = 1;
        while (n>0) {
            if ((n&1)==1) {
                sum *= x;
                sum %= MOD;
            }
            x *= x;
            x %= MOD;
            n >>= 1;
        }
        return sum%MOD;
    }

}
