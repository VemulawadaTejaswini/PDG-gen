import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;

    public static void main(String[] args) {
        char[] input = nstr().toCharArray();
        int len = input.length;

        char[] s = new char[len+1];
        System.arraycopy(input, 0, s, 1, input.length);
        
        final int MOD_2 = 13;
        long[][] dp = new long[len+1][MOD_2];
        
        dp[0][0] = 1;
        for (int i = 1; i <= len; i++) {
            for (int rem = 0; rem < MOD_2; rem++) {
                if (s[i] == '?') {
                    for (int digI = 0; digI <= 9; digI++) {
                        int newRem = (rem*10 + digI) % MOD_2;
                        dp[i][newRem] += dp[i-1][rem];
                        dp[i][newRem] %= MOD;
                    }
                } else {
                    // i文字目が確定している場合
                    int newRem = (rem*10 + (s[i]-'0')) % MOD_2;
                    dp[i][newRem] += dp[i-1][rem];
                    dp[i][newRem] %= MOD;
                }
            }
        }
        System.out.println(dp[len][5]);
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }
    
    private static String nstr() {
        return sc.next();
    }
}