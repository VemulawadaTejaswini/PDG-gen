import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.*;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;
import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 998244353;

    String[] s, ans;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        long d = (0L + A + B + C);
        s = new String[n];
        ans = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
        }
        if (d != 2) {
            boolean ok = check(A, B, C, n);
            out.println(ok ? "Yes" : "No");
            if (ok) {
                for (int i = 0; i < n; i++) {
                    out.println(ans[i]);
                }
            }
        } else {
            boolean[][][] vis = new boolean[n + 1][3][3];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < 3; j++) Arrays.fill(vis[i][j], false);
            }
            vis[0][A][B] = true;
            for (int i = 0; i < n; i++)
                for (int a = 0; a < 3; a++)
                    for (int b = 0; b < 3; b++) if (vis[i][a][b]) {
                        int c = 2 - a - b;
                        if (s[i].equals("AB")) {
                            if (a > 0) {
                                vis[i + 1][a - 1][b + 1] = true;
                            }
                            if (b > 0) {
                                vis[i + 1][a + 1][b - 1] = true;
                            }
                        }
                        if (s[i].equals("BC")) {
                            if (b > 0) {
                                vis[i + 1][a][b - 1] = true;
                            }
                            if (c > 0) {
                                vis[i + 1][a][b + 1] = true;
                            }
                        }

                        if (s[i].equals("AC")) {
                            if (a > 0) {
                                vis[i + 1][a - 1][b] = true;
                            }
                            if (c > 0) {
                                vis[i + 1][a + 1][b] = true;
                            }
                        }
            }
            int a = 0, b = 0;
            boolean ok = false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) if (vis[n][i][j]) {
                    a = i;
                    b = j;
                    ok = true;
                }
            }
            out.println(ok ? "Yes" : "No");
            for (int i = n; i > 0; i--) {
                if (s[i - 1].equals("AB")) {
                    if (a > 0 && vis[i - 1][a - 1][b + 1]) {
                        a--;
                        b++;
                        ans[i - 1] = "A";
                    } else {
                        a++;
                        b--;
                        ans[i - 1] = "B";
                    }
                }
                if (s[i - 1].equals("BC")) {
                    if (b > 0 && vis[i - 1][a][b - 1]) {
                        b--;
                        ans[i - 1] = "B";
                    } else {
                        b++;
                        ans[i - 1] = "C";
                    }
                }
                if (s[i - 1].equals("AC")) {
                    if (a > 0 && vis[i - 1][a - 1][b]) {
                        a--;
                        ans[i - 1] = "A";
                    } else {
                        a++;
                        ans[i - 1] = "C";
                    }
                }
            }
            if (ok) {
                for (int i = 0; i < n; i++) {
                    out.println(ans[i]);
                }
            }
        }
    }

    private boolean check(int a, int b, int c, int n) {
        for (int i = 0; i < n; i++) {
            if (s[i].equals("AB")) {
                if (a == 0 && b == 0) {
                    return false;
                }
                if (a <= b) {
                    ans[i] = "A";
                } else {
                    ans[i] = "B";
                }
            }
            if (s[i].equals("BC")) {
                if (c == 0 && b == 0) {
                    return false;
                }
                if (c <= b) {
                    ans[i] = "C";
                } else {
                    ans[i] = "B";
                }
            }
            if (s[i].equals("AC")) {
                if (a == 0 && c == 0) {
                    return false;
                }
                if (a <= c) {
                    ans[i] = "A";
                } else {
                    ans[i] = "C";
                }
            }
        }
        return true;
    }

}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
