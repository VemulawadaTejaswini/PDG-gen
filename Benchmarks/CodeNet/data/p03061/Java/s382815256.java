
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int[] f = new int[N];
            int[] b = new int[N];
            int gcd = A[N - 1];
            for (int i = N - 1; i >= 0; i--) {
                gcd = gcd(gcd, A[i]);
                b[i] = gcd;
            }
            gcd = A[0];
            for (int i = 0; i < N; i++) {
                gcd = gcd(gcd, A[i]);
                f[i] = gcd;
            }

            int max = 0;
            for (int i = 0; i < N; i++) {
                int a = i - 1 >= 0 ? f[i - 1] : 0;
                int c = i + 1 < N ? b[i + 1] : 0;
                max = Math.max(max, gcd(a > 0 ? a : c, c > 0 ? c : a));
            }

            System.out.println(max);
        }
    }

    public static final int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static final ArrayList<Integer> divisor(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                if (n / i != i) {
                    res.add(n / i);
                }
            }
        }
        return res;
    }
}
