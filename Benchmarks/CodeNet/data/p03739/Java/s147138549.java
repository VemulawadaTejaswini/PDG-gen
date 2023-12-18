import java.util.Scanner;

public class Main {

    static int ANS;
    static int N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        long[] a = new long[N];
        long[] sum = new long[N];

        long tsum = 0L;
        for (int i = 0; i < N; i++) {
            long elm = Long.parseLong(sc.next());
            a[i] = elm;
            tsum += elm;
            sum[i] = tsum;
        }

        solve(sum, a);
        System.out.println(ANS);
    }

    private static void solve(long[] sum, long[] a) {
        for (int i = 0; i < N - 1; i++) {
            long one = sum[i];
            long two = sum[i + 1];

            if (two == 0) {
                if (one >= 0) {
                    ANS++;
                    a[i + 1]--;
                    sumStream(sum, a);
                    solve(sum, a);
                } else {
                    ANS++;
                    a[i + 1]++;
                    sumStream(sum, a);
                    solve(sum, a);
                }
            }

            if (one >= 0 && two >= 0) {
                ANS += Math.abs(two) + 1;
                a[i + 1] -= Math.abs(two) + 1;
                sumStream(sum, a);
                solve(sum, a);
            }
            if (one < 0 && two < 0) {
                ANS += Math.abs(two) + 1;
                a[i + 1] += Math.abs(two) + 1;
                sumStream(sum, a);
                solve(sum, a);
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
}
