import java.util.Scanner;

/**
 * Second Sum
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }

            int[] Q = new int[N];
            for (int i = 0; i < N; i++) {
                Q[P[i] - 1] = i;
            }

            long sum = 0;
            for (int i = 0; i < N - 1; i++) {
                int p = Q[i];

                int a1 = -1, a2 = -1;
                for (int j = p - 1; j >= 0; j--) {
                    if (P[j] > i) {
                        if (a1 == -1) {
                            a1 = j;
                        } else {
                            a2 = j;
                            break;
                        }
                    }
                }

                int b1 = N, b2 = N;
                for (int j = p + 1; j < N; j++) {
                    if (P[j] > i) {
                        if (b1 == N) {
                            b1 = j;
                        } else {
                            b2 = j;
                            break;
                        }
                    }
                }

                if (a1 != -1) {
                    sum += (long) (i + 1) * (a1 - a2) * (b1 - p);
                }

                if (b1 != N) {
                    sum += (long) (i + 1) * (p - a1) * (b2 - b1);
                }
            }

            System.out.println(sum);
        }
    }

}
