import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i= 0; i < n; i ++) {
            strs[i] = sc.next();
        }

        int q = sc.nextInt();
        for (int i= 0; i < n; i ++) {
            int k = sc.nextInt();
            String seq = sc.next();
            System.out.println(cal(strs, n , k - 1, seq));
        }
    }

    private static int cal(final String[] strs, final int n, final int k, final String seq) {
        int res = 0;
        for (int i = 0; i < n; i ++) {
            if (i != k) {
                if (comp(strs[i], strs[k], seq)) {
                    res ++;
                }
            }
        }
        return n - res;
    }

    private static boolean comp(final String str, final String str1, final String seq) {
        int[] seqA = new int[26];
        for (int i = 0; i < 26; i ++) {
            seqA[seq.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < str.length() && i < str1.length(); i++) {
            int c1 = seqA[str.charAt(i) - 'a'];
            int c2 = seqA[str1.charAt(i) - 'a'];
            if (c1 < c2) {
                return false;
            } else if (c1 > c2) {
                return true;
            }
        }
        if (str.length() < str1.length()) {
            return false;
        }
        return true;
    }

}
