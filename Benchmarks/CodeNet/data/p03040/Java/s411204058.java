/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;
import java.awt.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Long> pribig = new PriorityQueue<>(Comparator.naturalOrder());
        PriorityQueue<Long> prismall = new PriorityQueue<>(Comparator.reverseOrder());
        long big = 0;
        long small = 0;
        long b = 0;
        long ans;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1) {
                // koushin
                long a = sc.nextLong();
                long bb = sc.nextLong();
                b += bb;
                if (prismall.isEmpty() || prismall.peek() >= a) {
                    // prismall.peek -> pribig, a -> prismall
                    prismall.add(a);
                    small+=a;
                    if (!prismall.isEmpty() && prismall.size() > pribig.size() + 1 ) {
                        long change = prismall.poll();
                        pribig.add(change);
                        small -= change;
                        big += change;
                    }
                }
            }else if(tmp == 2){
                // hanbetsu
                // small = big or small = big + 1
                if (prismall.size() == pribig.size()){
                    ans = prismall.peek();
                    System.out.println(ans + " " + (big-small+b));
                }else{
                    ans = prismall.peek();
                    System.out.println(ans + " " + (big+b-(small-prismall.peek())) );
                }
            }
            
        }

        sc.close();
    }

    
static class Mathalgo{
    static int n;
    static long MOD = 1000000007;
    static int MAX = 510000;
    static long[] finv = new long[MAX];
    static long[] inv = new long[MAX];
    static long[] fac = new long[MAX];

    public static String make_bi_nari(int nbit, int num_to_binary) {
        String res = Integer.toBinaryString(num_to_binary);
        while(res.length() != nbit){
            res = "0" + res;
        }
        return res;
    }


    public static long fib(int x) {
        long[] fib = new long[x+1];
        fib[0] = 0; fib[1] = 1;
        for (int i = 2; i <= x; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[x];
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

    public static long RepSquareMethod(long a, long n) { // a^n
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
}
}


