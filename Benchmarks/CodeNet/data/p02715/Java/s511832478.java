import java.util.*;
 
class Main{
    final static long mod = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        long ans = 0;
        long[] a = new long[k + 1];
        for(int i = k; i >= 1; i--){
            a[i] = modpow(k / i , n);
            for(int j = 2; j <= k / i; j++){
                a[i] = (a[i] - a[i * j] + mod) % mod;
            }
            ans = (ans + (a[i] * i)) % mod;
        }
        System.out.println(ans);
    }
    public static long modpow(long a, long n){
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