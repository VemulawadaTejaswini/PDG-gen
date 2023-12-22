import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(minimumChar(t, s));
    }

    static int minimumChar(String S1, String S2) {
        int n = S1.length();
        int m = S2.length();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < m - n + 1; i++) {
            int minRemovedChar = 0;
            for (int j = 0; j < n; j++) {
                if (S1.charAt(j) != S2.charAt(i + j)) {
                    minRemovedChar++;
                }
            }
            ans = Math.min(minRemovedChar, ans);
        }
        return ans;
    }
}
