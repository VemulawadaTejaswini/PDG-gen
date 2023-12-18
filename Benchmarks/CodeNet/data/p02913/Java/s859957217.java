import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        String s = bf.readLine();
        int max = 0;
        for(int i=1; i<s.length()-1; i++) {
            String a = s.substring(0, i);
            String b = s.substring(i, s.length());
            max = Math.max(max, dynamicCount(a, b));
        }
        System.out.println(max);
    }

    public static int dynamicCount(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        int max = 0;
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0) dp[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max;
    }
}