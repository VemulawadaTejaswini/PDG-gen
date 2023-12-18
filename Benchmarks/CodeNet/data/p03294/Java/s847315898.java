import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        long m = 1;
        for (int i = 0; i < N; i++) {
            m = lcm(m, a[i]);
        }
        m--;

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += m % a[i];
        }

        out.println(ans);
    }

    //参考: https://www.suzushin7.jp/entry/2016/11/05/calculate-least-common-multiple-in-java/
    //最大公約数 ユークリッドの互除法 O(logN)
    public static long gcd(long m, long n) {
        if (m < n) return gcd(n, m);
        if (n == 0) return m;
        return gcd(n, m % n);
    }

    //最小公倍数lcm ユークリッドの互除法 O(logN)
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n));  //m*nでlong型のオーバフローを発生させないため、先に割り算から行う
    }
}