import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final char[] T = sc.next().toCharArray();
        final int[] dp = new int[T.length + 1];
        final int[] prev = new int[T.length];
        for (int i = 0; i < T.length; i++)
            if (T[i] == 'D') {
                if(dp[i + 1] < dp[i] + 1) {
                    dp[i + 1] = dp[i] + 1;
                    prev[i] = 1;
                }
            } else if (T[i] == 'P') {
                if (i < T.length - 1 && (T[i + 1] == 'D' || T[i + 1] == '?')) {
                    if (dp[i + 2] < dp[i] + 2) {
                        dp[i + 2] = dp[i] + 2;
                        prev[i + 1] = 2;
                    }
                }
                if(dp[i + 1] < dp[i]) {
                    dp[i + 1] = dp[i];
                    prev[i] = 1;
                }
            } else {
                // P
                if (i < T.length - 1 && (T[i + 1] == 'D' || T[i + 1] == '?')) {
                    if (dp[i + 2] < dp[i] + 2) {
                        dp[i + 2] = dp[i] + 2;
                        prev[i + 1] = 2;
                    }
                }
                // D
                if (dp[i + 1] < dp[i] + 1) {
                    dp[i + 1] = dp[i] + 1;
                    prev[i] = 1;
                }
            }
        System.err.println(dp[T.length]);
        for (int i = 0; i < T.length; i++)
            if (T[i] == '?') {
                if (prev[i] == 1) {
                    T[i] = 'D';
                } else if (prev[i] == 2) {
                    T[i - 1] = 'P';
                    T[i] = 'D';
                }
            }
        System.out.println(T);
    }
}
public class Main {
    public static void main(String... args) {
        B.main();
    }
}
