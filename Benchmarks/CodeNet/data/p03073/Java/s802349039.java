import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    // 10:33-
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            String s = sc.next();
            int[][] dp = new int[2][s.length()];
            char c = s.charAt(0);
            dp[0][0] = (c == '1' ? 1 : 0);
            dp[1][0] = (c == '0' ? 1 : 0);

            for (int i = 1; i < s.length(); i++) {
                char x = s.charAt(i);
                dp[0][i] = (x == '1' ? 1 : 0) + dp[1][i - 1];
                dp[1][i] = (x == '0' ? 1 : 0) + dp[0][i - 1];
            }

            out.println(Math.min(dp[0][s.length() - 1], dp[1][s.length() - 1]));
        }
    }
}
