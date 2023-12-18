import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ANS = (long) Math.sqrt(N);
        long ans = Long.MAX_VALUE;
        for (long i = 1; i <= (long) Math.sqrt(N); i++) {
            if (N % i == 0) {
                long A = Math.max(N / i, i);
                ans = Math.min(String.valueOf(A).length(), ans);
            }
        }
        System.out.println(ans);
    }
}