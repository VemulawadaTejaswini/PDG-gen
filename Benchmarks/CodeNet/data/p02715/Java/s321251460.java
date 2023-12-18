import java.util.Scanner;

public class Main {
    final static long mod = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        long[] d = new long[k + 1];
        for(int i = 1; i < k + 1; i++) {
            //d[i] = (long)Math.pow(k / i, n);
            d[i] = powmod(k / i , n);
        }
        for(int i = k; 0 < i; i--) {
            for(int j = 2 * i; j < k + 1; j += i) {
                d[i] -= d[j];
                d[i] %= mod;
            }
        }
        long ans = 0;
        for(int i = 1; i < k + 1; i++) {
            ans += d[i] * i;
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static long powmod(long a, long n){
        long ans = 1;
        while(n > 0){
            if((n & 1) == 1){
                ans *= a;
            }
            n >>= 1;
            a *= a;
            a %= mod;
            ans %= mod;
        }
        return ans;
    }
}