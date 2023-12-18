import java.util.Scanner;

public class Main {

    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String K = sc.next();
        int len = K.length();
        int D = sc.nextInt();
        char[] ch = K.toCharArray();
        int[] I = new int[len+1];
        for(int i = 1; i <= len; i++) I[i] = Character.getNumericValue(ch[len - i]);
        long[][][] dp = new long[len+1][D][2];
        dp[0][0][0] = 1;
        dp[0][0][1] = 1;
        for(int i = 1; i <= len ; i++){
            for(int j = 0; j < D; j++){
                for(int n = 0; n <= 9; n++){
                    dp[i][(j + n) % D][0] += dp[i-1][j][0];
                    dp[i][(j + n) % D][0] %= MOD;
                    if(n == I[i]) dp[i][(j + n) % D][1] += dp[i-1][j][1];
                    else if(n < I[i]) dp[i][(j + n) % D][1] += dp[i-1][j][0];
                    dp[i][(j + n) % D][1] %= MOD;
                }
            }
        }
        System.out.println(dp[len][0][1] -1);
        sc.close();

    }

}
