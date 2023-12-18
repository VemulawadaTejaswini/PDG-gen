import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] A = new long[N + 2];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextLong();
        }
        A[N + 1] = 0;

        long sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += Math.abs(A[i] - A[i + 1]);
        }

        for (int i = 1; i <= N; i++) {
            long diffCost = Math.abs(A[i - 1] - A[i + 1]) - Math.abs(A[i - 1] - A[i]) - Math.abs(A[i] - A[i + 1]);
            out.println(sum + diffCost);
        }
    }
}