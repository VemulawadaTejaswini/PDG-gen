import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    final int INF = Integer.MAX_VALUE / 4;

    String s;
    int[][] f;
    void solve() {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try { s = reader.readLine(); } catch (IOException e) {}
        final int N = s.length();
        f = new int[N + 1][26];
        for (int[] f_line : f) Arrays.fill(f_line, INF);
        final int[] last = new int[26]; Arrays.fill(last, INF);
        for (int i = N - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int c_index = (int)(c - 'a');
            last[c_index] = i;
            for (int j = 0; j < 26; j++) {
                f[i][j] = last[j];
            }
        }

        int count = 26;
        int last_char_index = -1;
        boolean[] used = new boolean[26]; Arrays.fill(used, false);
        for (int i = N - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int c_index = (int)(c - 'a');
            if (used[c_index]) continue;
            used[c_index] = true;
            count--;
            if (count == 0) last_char_index = c_index;
        }
        assert last_char_index >= 0;

        int[] g = new int[N]; Arrays.fill(g, INF);
        int[] n = new int[N]; Arrays.fill(n, INF);
        int[] c = new int[N]; Arrays.fill(n, INF);
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                int k = f[i + 1][j];
                int v = k == INF ? (last_char_index == j ? 2 : 1) : g[k] + 1;
                if (g[i] > v) {
                    g[i] = v;
                    n[i] = k;
                    c[i] = j == last_char_index ? 500 + j : j;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (g[i] == 1) {
                for (int j = 0; j < 26; j++) {
                    if (f[i][j] == INF) {
                        c[i] = j;
                        break;
                    }
                }
            }
        }
        int i = 0;
        final StringBuilder builder = new StringBuilder();
        while (i < N) {
            int j = c[i];
            if (j >= 500) {
                builder.append((char)(j - 500 + 'a'));
                builder.append((char)(j - 500 + 'a'));
            } else {
                builder.append((char)(j + 'a'));
            }
            i = n[i];
        }
        System.out.println(builder.toString());
        //System.out.println(Arrays.toString(g));
        //System.out.println(Arrays.toString(c));
    }
}