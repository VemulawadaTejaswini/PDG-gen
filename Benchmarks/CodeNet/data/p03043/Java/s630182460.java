import java.util.*;

public class Main {
    static long[][] dp;
    static long[] s;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int K = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= N; i++) {
            double value = 1;
            double k = K;
            while (i < k) {
                k = k/2;
                value = value/2;
            }
            ans += value;
        }
        ans = ans / N;
        System.out.println(ans);

    }
}