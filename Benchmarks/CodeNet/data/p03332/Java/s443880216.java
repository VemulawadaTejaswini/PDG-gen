
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int N,A,B;
    static long K;
    static final int MOD = 998244353;
    static List<Long> fac;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        K = sc.nextLong();

        fac = new ArrayList<>();
        fac.add(1L);
        for (int n=1; n<N+10; n++) {
            long f = mul(fac.get(n-1),n);
            fac.add(f);
        }

        long ans = 0;
        for (int a = 0; a <= N; a++) {
            if(a*A > K) break;
            long rem = K-a*A;
            if(rem%B > 0) continue;
            int b = (int)(rem/B);
            for (int green = 0; green <= Math.min(a,b); green++) {
                int red = a - green;
                int blue = b - green;
                if(red + green + blue > N) continue;
                long tmp = 1;
                tmp = mul(tmp, ncr(N, red+green+blue));
                tmp = mul(tmp, ncr(red+green+blue, green+blue));
                tmp = mul(tmp, ncr(green+blue, blue));
                ans += tmp;
            }
        }
        System.out.println(ans % MOD);
    }

    static long mul(long a, long b) {
        return (a*b) % MOD;
    }
    static long pow(long a, long n) {
        long ret = 1;
        long mag = a;
        while(n > 0) {
            if(n%2 == 1) {
                ret = mul(ret,mag);
            }
            mag = mul(mag, mag);
            n >>= 1;
        }
        return ret;
    }
    static long inv(long a) {
        return pow(a, MOD-2);
    }
    static long ncr(int n, int r) {
        return mul(mul(fac.get(n), inv(fac.get(n-r))), inv(fac.get(r)));
    }
}