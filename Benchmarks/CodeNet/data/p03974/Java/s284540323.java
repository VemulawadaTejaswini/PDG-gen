import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        dp = new int[n][n];
        for (int i= 0; i < n; i ++) {
            strs[i] = sc.next();
            dp[i] = new int[n];
        }

        int q = sc.nextInt();
        for (int i= 0; i < q; i ++) {
            int k = sc.nextInt();
            String seq = sc.next();
            System.out.println(cal(strs, n , k - 1, seq));
        }
    }

    private static int cal(final String[] strs, final int n, final int k, final String seq) {
        int res = 0;
        for (int i = 0; i < n; i ++) {
            if (i != k) {
                if (comp(strs, i, k, seq)) {
                    res ++;
                }
            }
        }
        return n - res;
    }

    private static boolean comp(final String[] strs, final int str, final int str1, final String seq) {
        int[] seqA = new int[26];
        for (int i = 0; i < 26; i ++) {
            seqA[seq.charAt(i) - 'a'] = i;
        }
        char[] ch = strs[str].toCharArray();
        char[] ch1 = strs[str1].toCharArray();
        int l = ch.length;
        int l1 = ch1.length;
        int dpn = (str < str1) ? dp[str][str1] : dp[str1][str];
        for (int i = dpn; i < l && i < l1; i++) {
            int c1 = seqA[ch[i] - 'a'];
            int c2 = seqA[ch1[i] - 'a'];
            if (c1 < c2) {
                return false;
            } else if (c1 > c2) {
                return true;
            } else {
                if (str < str1) {
                    dp[str][str1] = i + 1;
                } else {
                    dp[str1][str] = i + 1;
                }
            }
        }
        if (l < l1) {
            return false;
        }
        return true;
    }

}
