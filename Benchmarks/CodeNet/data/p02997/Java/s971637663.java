import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int max = com(N-1, 2);
        if (max < K) {
            System.out.println(-1);
            return;
        }
        if (max == K) {
            System.out.println(N - 1);
            for (int i = 2; i <= N; i++) {
                System.out.printf("%d %d\n", 1, i);
            }
            return;
        }
        int lower = Math.max(0, max - (N - 1));
        if (lower <= K) {
            System.out.println(N - 1 + (max - K));
            for (int i = 2; i <= N; i++) {
                System.out.printf("%d %d\n", 1, i);
            }
            for (int i = 1; i <= max - K; i++) {
                System.out.printf("%d %d\n", i + 1, (i + 2 <= N ? i + 2 : i + 2 - N + 1));
            }
            return;
        }
        int count = max - (N - 1) - K < 0 ? max - (N - 1) : max - (N - 1) - K;
        System.out.println(N - 1 + N - 1 + count);
        for (int i = 2; i <= N; i++) {
            System.out.printf("%d %d\n", 1, i);
        }
        for (int i = 2; i <= N; i++) {
            System.out.printf("%d %d\n", i, (i + 1 <= N ? i + 1 : i + 1 - N + 1));
        }
        for (int i = 1; i <= count; i++) {
            System.out.printf("%d %d\n", i + 1, (i + 3 <= N ? i + 3 : i + 3 - N + 1));
        }
        return;
    }
    private int com(int N, int K) {
        if (N < K) {
            return 0;
        }
        if (N == K) {
            return 1;
        }
        int d1 = 1;
        int d2 = 1;
        for (int i = 1; i <= K; i++) {
            d1 *= (N - (i - 1));
            d2 *= i;
        }
        return d1 / d2;
    }
}
