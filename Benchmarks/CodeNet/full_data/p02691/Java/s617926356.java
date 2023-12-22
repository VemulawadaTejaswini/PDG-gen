import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        long[] x = new long[N + 1];
        long[] y = new long[N + 1];
        // long xmax = 0;
        for (int i = 0; i < N; i++) {
            A[i + 1] = sc.nextInt();
            if (A[i + 1] + (i + 1) <= N) {
                x[A[i + 1] + (i + 1)]++;
            }
            // if (A[i + 1] + (i + 1) > xmax) {
            //     xmax = A[i + 1] + (i + 1);
            // }
            if ((i + 1) - A[i + 1] >= 0) {
                y[(i + 1) - A[i + 1]]++;
            }
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += x[i] * y[i];
        }

        System.out.println(ans);

        sc.close();

    }

}