/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String onetwo = s.substring(0,2);
        String sansi = s.substring(2);
        int hoge = Integer.parseInt(onetwo);
        int fuga = Integer.parseInt(sansi);
        if (hoge <= 12 && hoge >= 1) { // MM
            if (fuga <= 12 && fuga >= 1) { 
                System.out.println("AMBIGUOUS");
            }else{
                System.out.println("MMYY");
            }
        }else{
            if (fuga <= 12 && fuga >= 1) { 
                System.out.println("YYMM");
            }else{
                System.out.println("NA");
            }
        }

        sc.close();
    }

   

}


class Algorithm{

    static long MOD = 1000000007;
    static int MAX = 510000;
    static long[] finv = new long[MAX];
    static long[] inv = new long[MAX];
    static long[] fac = new long[MAX];
    static int[] segtree;
    static int[] num;
    static int size;

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int ManhattanDist(int x, int y, int xx, int yy) {
        return(Math.abs(xx-x) + Math.abs(yy-y));
    }

    static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) res = res * a % mod;
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }
    
    static long modinv(long a, long mod) {
        return modpow(a, mod - 2, mod);
    }

    static void nCkmake() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[(int)MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
    
    static long nCk(int n, int k){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    public static long gcd_long(long a, long b) {
        if (a < b) {
            long x = a;
            a = b;
            b = x;
        }
        if (b == 0) {
            return a;
        }else{
            return gcd_long(b, a%b);
        }
    }

    public static long lcm_long(long a, long b) {
        long gcd = gcd_long(a,b);
        return a/gcd*b;
    }

    public static long GyakuGenMOD(long a) {
        return RepSquareMethod(a, MOD-2);
    }
    
    public static long factmod(int a) {
        long[] fact = new long[a+1];
        fact[0] = fact[1] = 1;
        for (int i = 2; i <= a; i++) {
            fact[i] = (fact[i-1]*i)%MOD;
        }
        return fact[a];
    }

    public static long RepSquareMethod(long a, long n) { 
        long ans = 1;
        while (n > 0) {
            if ( n % 2 == 1) {
                ans = (ans * a) % MOD;
            }
            a = (a*a)%MOD;
            n/=2;
        }
        return ans;
    }

    public static void SegmentTree_Initialization(int size, int monoid) {
        for (int i = 0; i < size; i++) {
            set(i, monoid);
        }
    }

    public static void SegmentTree_Substitution(int[] nums) {
        for (int i = 0; i < size; i++) {
            set(size - 1 + i, num[i]);
        }
    }
  
    public static void set(int k, int x) {
        segtree[k] = x;
    }

    public static void update(int i, int x) {
        i += size-1;
        set(i, x);
        while (i > 0) {
            i = (i-1)/2;
            set(i, func(segtree[i*2+1], segtree[i*2+2]));
        }
    }

    public static int func(int a, int b) {
        int ans = 0;
        return ans;
    }

}