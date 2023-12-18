import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String text = std.next();
        long[] dp = new long[text.length() + 1];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '<') {
                dp[i + 1] = Math.max(dp[i + 1], dp[i] + 1);
            } else if (c == '>') {
                long value = Math.max(dp[i] - 1, 0);
                dp[i + 1] = Math.min(dp[i + 1], value);
            }
        }

        for (int i = text.length() - 1; i >= 0 ; i--) {
            char c = text.charAt(i);
            if (c == '<') {
                long value = Math.max(dp[i + 1] - 1, 0);
                dp[i] = Math.min(dp[i], value);
            } else if (c == '>') {
                long value = Math.max(dp[i + 1] + 1, 0);
                dp[i] = Math.max(dp[i], value);
            }
        }

        System.out.println(Arrays.stream(dp).sum());
    }
}
