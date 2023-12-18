import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

//            Arrays.sort(A);
//            int M = (int) Math.sqrt(N);
//            int[] gcds = new int[M];
//            for (int i = 0; i < N; i++) {
//
//            }

            int max = 0;
            for (int k = 0; k < N; k++) {
                int gcd = A[k == 0 ? 1 : (k - 1)];
                for (int i = 0; i < N; i++) {
                    if (i == k) {
                        continue;
                    }
                    gcd = gcd(gcd, A[i]);
                }
                max = Math.max(max, gcd);
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
