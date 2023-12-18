import java.util.*;

public class Main {

    static long mod = 1_000_000_007l;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[k+1];
        long ans = 0L;
        for (int i = k; i > 0; i--) {
            long c = (long)(k / i);
            long p = modPow(c, n);
            if(1 < c){
                int b = 2;
                while(b * i <= k){
                    p = (p + mod - a[b*i]) % mod;
                    b++;
                }
            }
            a[i] = p;
            ans = (ans + (p*i%mod)) %mod;
        }
        System.out.println(ans);
        sc.close();

    }

    private static long modPow(long base, int exp) {
        long ret = 1;
        while(exp > 0){
            if((exp & 1) == 1){
                ret = ret * base %mod;
            }
            base = base * base %mod;
            exp >>= 1;
        }
        return ret;
    }

}
