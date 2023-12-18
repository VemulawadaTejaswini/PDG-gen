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
        long K = sc.nextLong();

        long sum = 0;
            for (int i = 1; i <= K; i++)         {
                for (int j = 1; j <= K; j++)     {
                    for (int k = 1; k <= K; k++)         {
                    sum += gcd(i, j, k);
                }
            }

        }

        System.out.println(sum);
    }

}
