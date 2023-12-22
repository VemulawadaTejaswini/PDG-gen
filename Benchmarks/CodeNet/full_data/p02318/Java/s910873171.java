import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] s1 = br.readLine().toCharArray();
        int len1 = s1.length;
        char[] s2 = br.readLine().toCharArray();
        int len2 = s2.length;

        int[][] dp = new int[len1 + 1][len2 + 1];
        for(int i = 0; i <= len1; i++) {
            dp[i][0] = i;
        }
        for(int j = 1; j <= len2; j++) {
            dp[0][j] = j;
        }

        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                int tmp = Math.min(dp[i + 1][j], dp[i][j + 1]) + 1;
                if(s1[i] == s2[j]) dp[i + 1][j + 1] = Math.min(tmp, dp[i][j]);
                else dp[i + 1][j + 1] = Math.min(tmp, dp[i][j] + 1);
            }
        }

        System.out.println(dp[len1][len2]);

        br.close();
    }
}
