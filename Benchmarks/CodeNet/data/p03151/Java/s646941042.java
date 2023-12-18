import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static int solve(int N, int[] A, int[] B) {
        Integer[] buf = new Integer[N];
        long required = 0;
        int minus = 0;
        int plus = 0;

        for(int i = 0; i < N; i++) {
            buf[i] = 0;

            int diff = B[i] - A[i];
            if (diff <= 0) {
                buf[i] = -1 * diff;
                plus += 1;
            } else {
                required += diff;
                minus += 1;
            }
        }

        if (minus == 0) {
            return 0;
        }

        Arrays.sort(buf, Collections.reverseOrder());
        for(int i = 0; i < plus; i++) {
            required -= buf[i];
            if (required <= 0) {
                return (i+1) + minus;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int ans = solve(N, A, B);
        System.out.println(ans);
    }
}
