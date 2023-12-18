import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, A) );
    }

    private static int solve(int N, long[] A) {
        int ans = 0;
        long a0 = A[0];
        long sum;
        if( a0 > 0 ) {
            sum = A[0];

        } else if( a0 < 0 ) {
            sum = A[0];

        } else {
            long[] A_plus = Arrays.copyOf(A, N);
            A_plus[0] = 1;
            int sum_plus = solve(N, A_plus) + 1;

            long[] A_minus = Arrays.copyOf(A, N);
            A_minus[0] = -1;
            int sum_minus = solve(N, A_minus) + 1;

            return Math.min(sum_plus, sum_minus);
        }

        for (int i = 1; i < N; i++) {
            long a = A[i];

            if( sum > 0 ) {
                // 次はminusになるのを期待
                if( a + sum >= 0 ) {
                    // sumが-1になるような値にまで変更する
                    //   a + sum が 5 の場合、6 だけ操作すると -1 にできる
                    long diff = a + sum + 1;
                    ans += diff;
                    sum = -1;

                } else {
                    sum += a;
                }

            } else {
                if( a + sum <= 0 ) {
                    long diff = (a + sum) * -1 + 1;
                    ans += diff;
                    sum = 1;

                } else {
                    sum += a;
                }
            }
        }
        return ans;
    }
}
