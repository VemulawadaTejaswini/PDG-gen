import java.util.*;
import java.lang.*;


public class Main {
    static String s;
    static String t;
    static int sl;
    static int tl;
    static int[][] lcs;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();
        sl = s.length();
        tl = t.length();
        lcs = new int[sl + 1][tl + 1];
        for (int i = 1; i <= sl; i++) {
            for (int j = 1; j <= tl; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }
        plcs(sl, tl);
        System.out.println(sb.reverse());
    }
    static void plcs(int i, int j) {
        if (i == 0 || j == 0) {
            return;
        }
        if (s.charAt(i - 1) == t.charAt(j - 1)) {
            sb.append(s.charAt(i - 1));
            plcs(i - 1, j - 1);
        } else {
            if (lcs[i][j - 1] > lcs[i - 1][j]) {
                plcs(i, j - 1);
            } else {
                plcs(i - 1, j);
            }
        }
    }
}