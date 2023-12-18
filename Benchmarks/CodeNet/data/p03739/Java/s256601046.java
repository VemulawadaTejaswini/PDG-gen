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

    public static long cntCal(long[] a){
        long sum = 0;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            long tmpSum = sum + a[i];

            if (sum > 0) {
                while (tmpSum >= 0) {
                    tmpSum = sum + --a[i];
                    cnt++;
                }
            } else {
                while (tmpSum <= 0) {
                    tmpSum = sum + ++a[i];
                    cnt++;
                }
            }

            sum = sum + a[i];
        }
        return cnt;
    }
}