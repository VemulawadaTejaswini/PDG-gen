import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] a = new long[N];
        long[] aNegative = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
            aNegative[i] -= a[i];
        }

        long cnt = Math.min(cntCal(a), cntCal(aNegative));
        System.out.println(cnt);
    }

    public static long cntCal(long[] a) {
        long sum = 0;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            long tmpSum = sum + a[i];
            if (sum > 0 && tmpSum >= 0) {
                // sum > a[i]にしたい
                long n = -sum - 1;
                cnt += a[i] - n;
                a[i] = n;
            } else if (sum <= 0 && tmpSum <= 0) {
                long n = -sum + 1;
                cnt += n - a[i];
                a[i] = n;
            }

            sum = sum + a[i];
        }
        return cnt;
    }
}