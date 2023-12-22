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
            out.println(dfs(0, 0, false));
        }

        private int dfs(int now, int dot, boolean ope) {
            int ans = ope ? 1 : 0;
            for (int i = now; i < n; i++) {
                if (S[i].length() <= dot) break;
                final char c = S[i].charAt(dot);
                if (Character.isDigit(c)) {
                    if (ope) {
                        ans *= c - '0';
                    } else {
                        ans += c - '0';
                    }
                } else if (c == '+' || c == '*') {
                    if (ope) {
                        ans *= dfs(i + 1, dot + 1, c == '*');
                    } else {
                        ans += dfs(i + 1, dot + 1, c == '*');
                    }
                } else if (c == '.') {
                    continue;
                } else {
                    throw new Error();
                }
            }
            return ans;
        }

    }
}