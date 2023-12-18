import java.util.*;

import static java.lang.System.*;

public class Main {
    public static final long mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 猿/犬/猿/犬... or 犬/猿/犬/猿 ...
        int maxNum = Math.max(N, M);
        int minNum = Math.min(N, M);

        long ans = 0;
        if (maxNum - minNum > 1) {
            ans = 0;
        } else if (maxNum == minNum) {
            // 猿/犬...と犬/猿の組み合わせがある
            ans = factorial(N);
            ans = (ans * factorial(M)) % mod;
            ans = (ans * 2) % mod;
        } else {
            ans = factorial(N);
            ans = (ans * factorial(M)) % mod;
        }

        out.println(ans);
    }

    static long factorial(long n){
        return recfact(1, n);
    }

    // http://www.luschny.de/math/factorial/FastFactorialFunctions.htm
    static long recfact(long start, long n) {
        long i;
        if (n <= 16) {
            long r = start;
            for (i = start + 1; i < start + n; i++) {
                r = r * i % mod;
            }
            return r;
        }
        i = n / 2;
        return (recfact(start, i) * recfact(start + i, n - i)) %  mod;
    }
}