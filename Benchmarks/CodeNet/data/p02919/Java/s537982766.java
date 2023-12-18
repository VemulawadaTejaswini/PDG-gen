import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

            List<Integer> index = new ArrayList<>();
            index.add(Q[N - 1]);

            for (int i = N - 2; i >= 0; i--) {
                int p = Q[i];

                int c = -(Collections.binarySearch(index, p) + 1);

                int a1 = c - 1 >= 0 ? index.get(c - 1) : -1;
                int a2 = c - 2 >= 0 ? index.get(c - 2) : -1;
                int b1 = c < index.size() ? index.get(c) : N;
                int b2 = c + 1 < index.size() ? index.get(c + 1) : N;

                if (a1 != -1) {
                    sum += (long) (i + 1) * (a1 - a2) * (b1 - p);
                }

                if (b1 != N) {
                    sum += (long) (i + 1) * (p - a1) * (b2 - b1);
                }

                index.add(c, p);
            }

            System.out.println(sum);
        }
    }

}
