import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ICPCCalculator solver = new ICPCCalculator();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class ICPCCalculator {
        int n;
        String[] S;
        boolean[] visited;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            if (n == 0) throw new UnknownError();
            S = new String[n];
            visited = new boolean[n];
            Arrays.fill(visited, false);
            for (int i = 0; i < n; i++) {
                S[i] = in.next();
            }
            if (n == 1) {
                out.println(S[0]);
                return;
            }
            visited[0] = true;
            boolean ope = S[0].charAt(0) == '*';
            out.println(dfs(1, 0, ope));
        }

        private int dfs(int now, int dot, boolean ope) {
            if (n == now || visited[now]) return 0;
            final int len = S[now].length();
            if (dot >= len) return 0;
            int ans = -1;
            for (int i = now; i < n; i++) {
                if (i != now && visited[i]) continue;
                //System.err.println(now +"  " + i + "  " + (ope ? "*" : "+"));
                if (S[i].length() <= dot) break;
                //System.err.println(now +"  " + i + "  " + (ope ? "*" : "+"));
                if (len < S[i].length()) break;
                //System.err.println(now +"  " + i + "  " + (ope ? "*" : "+"));
                final char c = S[i].charAt(dot);
                if (c == '.') {
                    if (ans == -1) ans = dfs(i, dot + 1, ope);
                    else ans = (ope ? ans * dfs(i, dot + 1, ope) : ans + dfs(i, dot + 1, ope));
                } else if (c == '+' || c == '*') {
                    visited[i] = true;
                    if (ans == -1) ans = dfs(i + 1, dot + 1, c == '*');
                    else ans = (ope ? ans * dfs(i + 1, dot + 1, c == '*') : ans + dfs(i + 1, dot + 1, c == '*'));
                } else {
                    visited[i] = true;
                    if (ans == -1) {
                        if (i + 1 < n && len == S[i + 1].length()) {
                            ans = (ope ? (c - '0') * dfs(i + 1, dot, ope) : (c - '0') + dfs(now + 1, dot, ope));
                        } else {
                            ans = (c - '0');
                        }
                    } else {
                        if (i + 1 < n && len == S[i + 1].length()) {
                            ans = (ope ? ans * (c - '0') * dfs(i + 1, dot, ope) : ans + (c - '0') + dfs(now + 1, dot, ope));
                        } else {
                            ans = (ope ? ans * (c - '0') : ans + (c - '0'));
                        }
                    }
                    break;
                }
            }
            //System.err.println(now + " " + ans + " " + (ope ? "*" : "+"));
            return ans;
        }

    }
}