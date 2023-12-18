import java.util.Scanner;

public class Main {

    static int ANS = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        long[] a = new long[N];
        long[] sum = new long[N];

        long tsum = 0L;
        for (int i = 0; i < N; i++) {
            long elm = Long.parseLong(sc.next());
            a[i] = elm;
            tsum += elm;
            sum[i] = tsum;

        }

        solve(a, sum);
        solveSum(sum, a);
        System.out.println(ANS);
    }

    private static void solveSum(long[] sum, long[] a) {
        long limit = a.length;
        for (int i = 0; i < limit - 1; i++) {
            // 元配列のチェック
            long one = sum[i];
            long two = sum[i + 1];

            if (two == 0) {
                if (one >= 0) {
                    a[i + 1] -= 1;
                } else {
                    a[i + 1] += 1;
                }

                ANS++;
                sumStream(sum, a);
                solveSum(sum, a);
                return;
            }

            if (isMinus(one, two)) {
                a[i] -= 1;
                ANS++;
                sumStream(sum, a);
                solveSum(sum, a);
                return;
            }

            if (isPlus(one, two)) {
                a[i] += 1;
                ANS++;
                sumStream(sum, a);
                solveSum(sum, a);
                return;
            }
        }
    }

    private static void sumStream(long[] sum, long[] a) {
        long limit = a.length;
        long tsum = 0L;
        for (int i = 0; i < limit; i++) {
            tsum += a[i];
            sum[i] = tsum;
        }
    }

    /**
     * 符号を見る（配列）<br>
     * 符号を見る（合計）<br>
     * 合計を見る<br>
     */
    private static void solve(long[] a, long[] sum) {
        long limit = a.length;
        for (int i = 0; i < limit - 1; i++) {
            // 元配列のチェック
            long one = a[i];
            long two = a[i + 1];

            if (isMinus(one, two)) {
                a[i + 1] -= 1;
                sum[i + 1] -= 1;
                ANS++;
                solve(a, sum);
            }

            if (isPlus(one, two)) {
                a[i + 1] += 1;
                sum[i + 1] += 1;
                ANS++;
                solve(a, sum);
            }
        }
    }

    private static boolean isMinus(long one, long two) {
        return one >= 0 && two >= 0;
    }

    private static boolean isPlus(long one, long two) {
        return one < 0 && two < 0;
    }
}
