import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        long MOD = 1000000007;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long modAll = modPow(2, n, MOD);
        long modChooseA = modChoose(n, a, MOD);
        long modChooseB = modChoose(n, b, MOD);

        long res = modAll - 1 - modChooseA - modChooseB;
        if (res < 0) {
            res = MOD + res;
        }
        System.out.println(res);
    }

    // 繰り返し二乗法
    public static long modPow(long a, long n, long mod) {
        if (n == 1) return a % mod;
        if (n % 2 == 1) return (a * modPow(a, n-1, mod)) % mod;
        long t = modPow(a, n/2, mod);
        return (t * t) % mod;
    }

    // nCa mod
    public static long modChoose(long n, long a, long mod) {
        long x = 1;
        long y = 1;
        for (long i = 0; i < a; i++) {
            x = (x % mod) * (n - i) % mod;
            y = (y % mod) * (a - i) % mod;
        }
        long modChoose = (x % mod) * modPow(y, mod-2, mod);
        modChoose %= mod;
        return modChoose;
    }    
}