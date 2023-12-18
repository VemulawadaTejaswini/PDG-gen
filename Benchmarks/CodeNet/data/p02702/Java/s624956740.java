import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        String str = in.next();
        char[] s = str.toCharArray();
        int[] dp = new int[s.length];
        int counter = 0;

        if (s.length > 9999)
            dp[0] = Integer.parseInt(String.valueOf(s[0]));
        for (int i = 1; i < s.length; i++) {
            dp[i] = dp[i - 1] + Integer.parseInt(String.valueOf(s[i]));
            if (dp[i] % 3 == 0 && i > 4) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
