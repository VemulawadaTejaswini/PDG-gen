import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

import lib.io.ExtendedScanner;
import lib.io.Out;
import lib.util.IntPair;

public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int mod = 1000000007;
        int n = sc.nextInt();
        int m = sc.nextInt();
        var s = sc.nextChars();
        var cum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            cum[i + 1] = cum[i] + s[i] - '0';
        }
        var comb = new long[n + 1][];
        for (int i = 0; i <= n; i++) {
            comb[i] = new long[i + 1];
            comb[i][0] = comb[i][i] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j];
                if (comb[i][j] >= mod) {
                    comb[i][j] -= mod;
                }
            }
        }
        var segs = new ArrayList<IntPair>();
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            if (i == 0) {
                segs.add(new IntPair(l, r));
            } else {
                var last = segs.get(segs.size() - 1);
                if (last.fst == l && last.snd < r) {
                    last.snd = r;
                } else if (last.fst < l && last.snd < r) {
                    segs.add(new IntPair(l, r));
                }
            }
        }
        m = segs.size();
        var l = new int[m];
        var r = new int[m];
        for (int i = 0; i < m; i++) {
            var seg = segs.get(i);
            l[i] = seg.fst;
            r[i] = seg.snd;
            out.write(l[i]).write(' ').writeln(r[i]);
        }
        var dp = new long[m + 1][n + 1];
        dp[0][cum[r[0]] - cum[l[0]]] = 1;
        for (int i = 0; i < m - 1; i++) {
            int w = r[i] - l[i];
            int x = r[i] - l[i + 1];
            if (x <= 0) {
                long sum = 0;
                for (int j = 0; j <= w; j++) {
                    sum += dp[i][j] * comb[w][j];
                }
                sum %= mod;
                dp[i + 1][cum[r[i + 1]] - cum[l[i + 1]]] = sum;
                continue;
            }
            int p = cum[r[i + 1]] - cum[r[i]];
            for (int j = 0; j <= n; j++) {
                if (dp[i][j] == 0) continue;
                int l1 = Math.max(0, x - (w - j));
                int r1 = Math.min(j, x);
                for (int k = l1; k <= r1; k++) {
                    dp[i + 1][p + k] += comb[w - x][j - k] * dp[i][j];
                    dp[i + 1][p + k] %= mod;
                }
            }
        }
        for (int j = 0, w = r[m - 1] - l[m - 1]; j <= w; j++) {
            dp[m][j] = (dp[m - 1][j] * comb[w][j]) % mod;
        }
        long ans = 0;
        for (int j = 0; j <= n; j++) {
            ans += dp[m][j];
        }
        ans %= mod;
        out.writeln(ans < 0 ? ans + mod : ans);
    }
}
