import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        String t = next();
        String s = next();

        int[][] dp = new int[t.length()][s.length()];

        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                dp[i][j] = calcDpValue(i, j, dp, t, s);
            }
        }

        StringBuilder ans = new StringBuilder();
        int i = t.length() - 1;
        int j = s.length() - 1;
        while (i >= 0 && j >= 0) {
            if (i == 0 && j == 0 && t.charAt(0) == s.charAt(0)) {
                ans.insert(0, t.charAt(0));
                break;
            }
            if (i > 0 && j > 0 && t.charAt(i) == s.charAt(j) && 1 + dp[i - 1][j - 1] == dp[i][j]) {
                ans.insert(0, t.charAt(i));
                i--;
                j--;
            } else if (i > 0 && (j == 0 || dp[i - 1][j] > dp[i][j - 1])) {
                if (t.charAt(i) == s.charAt(j)) ans.insert(0, t.charAt(i));
                i--;
            } else if (j > 0 && (i == 0 || dp[i][j - 1] > dp[i - 1][j])) {
                if (t.charAt(i) == s.charAt(j)) ans.insert(0, t.charAt(i));
                j--;
            }
            else {
                if (j > i) j--;
                else i--;
            }
        }

//        for (int[] d: dp) System.out.println(Arrays.toString(d));
        System.out.println(ans);
    }

    private static int calcDpValue(int i, int j, int[][] dp, String t, String s) {
        int dpI1J = i == 0 ? 0 : dp[i - 1][j];
        int dpIJ1 = j == 0 ? 0 : dp[i][j - 1];
        int dpI1J1 = (i == 0 || j == 0) ? 0 : dp[i - 1][j - 1];
        if (t.charAt(i) == s.charAt(j)) return Math.max(1 + dpI1J1, Math.max(dpI1J, dpIJ1));

        return Math.max(dpI1J, dpIJ1);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }
}
