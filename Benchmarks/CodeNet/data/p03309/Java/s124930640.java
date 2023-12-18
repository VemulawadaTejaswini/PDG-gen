import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt() - i;
        }

        int[] idx_median = new int[2];
        if (N % 2 == 0) {
            idx_median[0] = N / 2;
            idx_median[1] = N / 2 - 1;
        } else {
            idx_median[0] = N / 2;
            idx_median[1] = N / 2;
        }

        Arrays.sort(A);

        int minimum = Integer.MAX_VALUE;
        for (int i_idx = 0; i_idx < 2; i_idx++) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                count += Math.abs(A[idx_median[i_idx]] - A[i]);
            }
            if (count < minimum) {
                minimum = count;
            }
        }

        System.out.println(minimum);
    }
}