import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int Q = Integer.parseInt(in.next());

            int[] l = new int[Q];
            int[] r = new int[Q];

            for (int i = 0; i < Q; i++) {
                l[i] = Integer.parseInt(in.next());
                r[i] = Integer.parseInt(in.next());
            }

            sieve((int) (1e5 + 100));

            boolean[] like2017 = new boolean[(int) (1e5 + 1)];
            for (int i = 0; i < 1e5 + 1; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                if (isPrime[i] && isPrime[(i + 1) / 2]) {
                    like2017[i] = true;
                }
            }

            int[] countLike2017 = new int[(int) (1e5 + 1)];
            for (int i = 1; i < 1e5 + 1; i++) {
                countLike2017[i] = countLike2017[i - 1];
                if (like2017[i]) {
                    countLike2017[i]++;
                }
            }

            for (int i = 0; i < Q; i++) {
                System.out.println(countLike2017[r[i]] - countLike2017[l[i] - 1]);
            }

        }
    }

    private static final int MAX_N = (int) 1e5 + 200;
    private static final int[] prime = new int[MAX_N];
    private static final boolean[] isPrime = new boolean[MAX_N + 1];

    public static final int sieve(int n) {
        int p = 0;
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                prime[p++] = i;
                for (int j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return p;
    }

}
