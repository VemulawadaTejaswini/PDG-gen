import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Collections;

class Main {

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    public static final long gcd(final long... param) {
        final long len = param.length;
        long g = gcd(param[0], param[1]);
        for (int i = 1; i < len - 1; i++) {
            g = gcd(g, param[i + 1]);
        }
        return g;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        A[0] = 0;
        for (int i = 1; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] ans = new int[N + 1];

        for (int i = 1; i < N; i++) {
            ans[A[i]]++;
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(ans[i]);
        }

    }

}
