import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        char[] s = nchars(1, 0);
        char[] t = nchars(1, 0);
        solve(s, t);
    }
    
    static void solve(char[] s, char[] t) {
        int ls = s.length;
        int lt = t.length;
        
        M[][] dp = new M[ls][lt];
        for (int i = 0; i < ls; i++)
            for (int j = 0; j < lt; j++)
                if (i == 0 || j == 0) dp[i][j] = new M(M.Prev.NA, 0);
                    
        for (int is = 1; is < ls; is++) {
            for (int it = 1; it < lt; it++) {
                
                if (s[is] == t[it]) {
                    dp[is][it] = new M(M.Prev.ST, dp[is-1][it-1].len + 1);
                    
                } else {
                    M ms = dp[is-1][it];
                    M mt = dp[is][it-1];
                    if (ms.len >= mt.len) {
                        dp[is][it] = new M(M.Prev.S, ms.len);
                    } else {
                        dp[is][it] = new M(M.Prev.T, mt.len);
                    }
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        int is = ls-1;
        int it = lt-1;
        while (true) {
            M m = dp[is][it];
            if (s[is] == t[it]) {
                sb.append(s[is]);
            }
            if (m.prev == M.Prev.S || m.prev == M.Prev.ST) is--;
            if (m.prev == M.Prev.T || m.prev == M.Prev.ST) it--;
            if (is <= 0 || it <= 0) {
                break;
            }
        }
        
        System.out.println(sb.reverse().toString());
    }
    
    static class M {
        enum Prev {
            S,
            T,
            ST,
            NA
        }
        
        Prev prev;
        int len;
        public M(Prev prev, int len) {
            super();
            this.prev = prev;
            this.len = len;
        }
    }
    
    static long max(long... longs) {
        return Arrays.stream(longs).max().getAsLong();
    }
    
    static long min(long... longs) {
        return Arrays.stream(longs).min().getAsLong();
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

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0);
    }

    private static char[][] nchars2(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
