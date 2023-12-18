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

    private static long solve(int N, long[] A) {
        long a0 = A[0];
        if( a0 > 0 ) {
            long p = solve1(N, A, a0, 0);
            long m = solve1(N, A, -1, (int)a0 + 1);
            return Math.min(p, m);

        } else if( a0 < 0 ) {
            long p = solve1(N, A, 1, (int)a0 + 1);
            long m = solve1(N, A, a0, 0);
            return Math.min(p, m);

        } else {
            long p = solve1(N, A, 1, 1);
            long m = solve1(N, A, -1, 1);
            return Math.min(p, m);
        }
    }

    private static long solve1(int N, long[] A, long sum, long ans) {
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
