import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            if (Math.abs(N - M) >= 2) {
                System.out.println(0);
                return;
            }

            long mod = (long) (1e9 + 7);

            if (N < M) {
                int swap = N;
                N = M;
                M = swap;
            }

            long res = 1;
            if (N == M) {
                res = 2;
            }
            int NM = N + M;
            for (int i = 0; i < NM; i++) {
                if (i % 2 == 0) {
                    res *= N;
                    res %= mod;
                    N--;
                } else {
                    res *= M;
                    res %= mod;
                    M--;
                }
            }

            System.out.println(res);
        }
    }
}
