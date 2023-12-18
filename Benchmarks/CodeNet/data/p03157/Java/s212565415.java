import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CAlternatingPath solver = new CAlternatingPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAlternatingPath {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        char[][] mat;
        int[] a;

        public void solve(int testNumber, inclass in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            mat = new char[n][m];
            for (int i = 0; i < n; i++) {
                String st = in.readLine();
                for (int j = 0; j < st.length(); j++) {
                    mat[i][j] = st.charAt(j);
                }
            }
            int dp[][] = new int[n][m];
            a = new int[(n * m) + 2];
            int k = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    char ch = mat[i][j];
                    if (ch == '#') {
                        boolean vis[][] = new boolean[n][m];
                        k++;
                        a[k] = dfs(i, j, dp, vis, k, set, 0);
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < a.length; i++) {
                ans += a[i];
            }
            out.println(ans);
        }

        private int dfs(int i, int j, int[][] dp, boolean[][] vis, int k, HashSet<Integer> set, int col) {
            dp[i][j] = k;
            vis[i][j] = true;
            int ans = 0;
            boolean flag = false;
            for (int l = 0; l < 4; l++) {
                int pt1 = i + dx[l];
                int pt2 = j + dy[l];
                if (isSafe(pt1, pt2, dp.length, dp[0].length)) {
                    if (!vis[pt1][pt2]) {
                        if (dp[pt1][pt2] == 0) {
                            if (mat[pt1][pt2] == (col == 0 ? '.' : '#')) {
                                if (col == 1) {
                                    ans = ans + dfs(pt1, pt2, dp, vis, k, set, col ^ 1);
                                } else {
                                    flag = true;
                                    ans = ans + 1 + dfs(pt1, pt2, dp, vis, k, set, col ^ 1);
                                }
                            }
                        } else if (col == 0 && mat[pt1][pt2] == '.') {
                            if (!set.contains(dp[pt1][pt2])) {
                                set.add(dp[pt1][pt2]);
                                if (col == 1) {
                                    ans = ans + a[dp[pt1][pt2]];
                                } else {
                                    ans = ans + a[dp[pt1][pt2]];
                                }

                            }
                        }
                    }
                }
            }
//        if(flag){
//            ans++;
//        }
            return ans;
        }

        private boolean isSafe(int pt1, int pt2, int n, int m) {
            if (pt1 < n && pt2 < m && pt1 >= 0 && pt2 >= 0) {
                return true;
            }
            return false;
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private String readLine0() {
            StringBuilder buf = new StringBuilder();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public String readLine() {
            String s = readLine0();
            while (s.trim().length() == 0) {
                s = readLine0();
            }
            return s;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

