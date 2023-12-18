import java.io.*;
import java.util.*;
 
public class Main {
    private static boolean elapsed = false;
 
    private int minCount = Integer.MAX_VALUE;
 
    private void solve(Scanner sc, PrintWriter out) {
        String s = sc.next();
 
        search(new StringBuilder(s));
 
        out.println(minCount);
    }
    private void search(StringBuilder sb) {
        if (check(sb)) {
            minCount = 0;
            return;
        }
 
        int leftCount = 0;
        boolean bFlg = (sb.charAt(0) == 'B');
        for (int i = 1; i < sb.length(); ++i) {
            if (sb.charAt(i) == 'B') {
                if (!bFlg) {
                    ++leftCount;
                }
                bFlg = true;
            } else if (sb.charAt(i) == 'W') {
                if (bFlg) {
                    ++leftCount;
                }
                bFlg = false;
            }
        }
 
        int rightCount = 0;
        bFlg = (sb.charAt(0) == 'B');
        for (int i = sb.length() - 1; i >= 0; --i) {
            if (sb.charAt(i) == 'B') {
                if (!bFlg) {
                    ++rightCount;
                }
                bFlg = true;
            } else if (sb.charAt(i) == 'W') {
                if (bFlg) {
                    ++rightCount;
                }
                bFlg = false;
            }
        }
 
        minCount = Math.min(leftCount, rightCount);
    }
    private boolean check(StringBuilder sb) {
        boolean bFlg = false;
        boolean wFlg = false;
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == 'B') {
                bFlg = true;
            } else if (sb.charAt(i) == 'W') {
                wFlg = true;
            }
            if (bFlg && wFlg) {
                return false;
            }
        }
        return true;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();
 
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(sc, out);
        out.flush();
 
        long G = System.currentTimeMillis();
        if (elapsed) {
            System.err.println((G - S) + "ms");
        }
    }
}