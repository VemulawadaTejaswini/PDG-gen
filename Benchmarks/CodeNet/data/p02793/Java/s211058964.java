import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long alcm = 1;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            alcm = lcm(alcm,a[i]);
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += (alcm / a[i])%mod;
        }
        System.out.println(ans%mod);
    }
    
    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }
    
    private static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }
    
    // a^n mod を計算する
    private static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }
    // a^{-1} mod を計算する
    private static long modinv(long a, long mod) {
        return modpow(a, mod - 2, mod);
    }
    

}