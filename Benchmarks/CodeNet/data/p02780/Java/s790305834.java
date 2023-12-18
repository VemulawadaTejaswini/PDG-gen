import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] pi = new int[N];
            for (int i = 0; i < N; i++) {
                pi[i] = sc.nextInt();
            }

            double result = 0;
            int start = 0;
            int max = 0;
            int tmp = 0;
            for (int i = 0; i <= N - K; i++) {
                int test = 0;
                if (max == 0) {
                    for (int j = 0; j < K; j++) {
                        test += pi[i + j];
                    }
                } else {
                    test = tmp + pi[i + K - 1];
                }

                if (max < test) {
                    tmp = test - pi[i];
                    max = test;
                    start = i;
                }
            }

            for (int j = start; j < start + K; j++) {
                int p = pi[j];
                result += calc(p, p);
            }

            System.out.println(result);
        }
    }

    private static double calc(int n, int m) {
        if (n == 1) {
            return (double) n * 1 / m;
        }

        return (double) n * 1 / m + calc(n - 1, m);
    }
}