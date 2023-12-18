import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        Arrays.sort(A);

        long ans = 0;
        if (N % 2 == 0) {
           for (int i = 0; i < N/2 - 1; i++) {
               ans = ans + A[N/2 + i] + A[N/2 + i + 1] - 2*A[i];
           }
           ans = ans + A[N-1] - A[N/2 -1];
        } else {
            for (int i = 0; i < N/2 - 1; i++) {
                ans = ans + A[N/2 + i + 1] + A[N/2 + i + 2] - 2*A[i];
            }
            ans = ans + A[N-1] - A[N/2 -1];
            ans += Math.max(A[N/2 + 1] - A[N/2], A[N/2] - A[N/2 - 1]);
        }

        System.out.println(ans);
    }
}