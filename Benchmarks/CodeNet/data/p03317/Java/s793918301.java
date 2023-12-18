import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];

        int idx_1 = -1;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] == 1) {
                idx_1 = i;
            }
        }

        int count = 0;
        if (idx_1 <= K - 1) {
            count += 1;
            N -= K;
            if (N % (K - 1) == 0) {
                count += N / (K - 1);
            } else {
                count += N / (K - 1) + 1;
            }
        } else {
            int g = idx_1 / (K - 1);
            int r = N - (g * (K - 1) + K);

            if (r < 0) {
                r = 0;
            }

            int n_r = r / (K - 1);
            if (r % (K - 1) != 0) {
                n_r++;
            }

            count = g + 1 + n_r;

        }

        System.out.println(count);
    }
}