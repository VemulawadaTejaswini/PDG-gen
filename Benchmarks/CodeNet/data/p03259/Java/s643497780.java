import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        int testCount = Integer.parseInt(in.next());
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }

    static class TaskF {
        static final int INF = (int) 1e9;
        boolean[] matched;
        int[] queue;
        int[] degSrc;
        boolean[] readyDst;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            boolean[][] gSrc = new boolean[n][n];
            boolean[][] gDst = new boolean[n][n];
            int[] degSrc = new int[n];
            for (int i = 0; i < n - 1; ++i) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                ++degSrc[a];
                ++degSrc[b];
                gSrc[a][b] = gSrc[b][a] = true;
            }
            for (int i = 0; i < n - 1; ++i) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                gDst[a][b] = gDst[b][a] = true;
            }
            boolean allSame = true;
            for (int i = 0; i < n; ++i) for (int j = 0; j < n; ++j) if (gSrc[i][j] != gDst[i][j]) allSame = false;
            if (allSame) {
                out.println(0);
                return;
            }
            int res = INF;
            matched = new boolean[n];
            queue = new int[n];
            this.degSrc = new int[n];
            readyDst = new boolean[n];
            for (int first = 0; first < n; ++first)
                if (degSrc[first] == 1) {
                    int firstOldTo = 0;
                    while (!gSrc[first][firstOldTo]) ++firstOldTo;
                    for (int firstTo = 0; firstTo < n; ++firstTo) {
                        if (first != firstTo && !gSrc[first][firstTo]) {
                            gSrc[first][firstOldTo] = false;
                            gSrc[firstOldTo][first] = false;
                            gSrc[first][firstTo] = true;
                            gSrc[firstTo][first] = true;
                            res = Math.min(res, 1 + solveWithFixed(first, n, gSrc, gDst));
                            gSrc[first][firstTo] = false;
                            gSrc[firstTo][first] = false;
                            gSrc[first][firstOldTo] = true;
                            gSrc[firstOldTo][first] = true;
                        }
                    }
                }
            if (res >= INF) out.println(-1);
            else out.println(res);
        }

        private int solveWithFixed(int fixed, int n, boolean[][] gSrc, boolean[][] gDst) {
            Arrays.fill(matched, false);
            matched[fixed] = true;
            int qt = 0;
            int qh = 1;
            queue[0] = fixed;
            while (qt < qh) {
                int cur = queue[qt++];
                for (int i = 0; i < n; ++i)
                    if (!matched[i] && gSrc[cur][i] && gDst[cur][i]) {
                        matched[i] = true;
                        queue[qh++] = i;
                    }
            }
            int ret = 0;
            for (boolean x : matched) if (!x) ++ret;
            Arrays.fill(degSrc, 0);
            Arrays.fill(readyDst, false);
            for (int i = 0; i < n; ++i)
                if (!matched[i])
                    for (int j = 0; j < n; ++j) if (gSrc[i][j]) ++degSrc[i];
            for (int i = 0; i < n; ++i)
                if (matched[i])
                    for (int j = 0; j < n; ++j) if (!matched[j] && gDst[i][j]) readyDst[j] = true;
            qt = 0;
            qh = 0;
            for (int i = 0; i < n; ++i)
                if (!matched[i] && degSrc[i] == 1 && readyDst[i]) {
                    queue[qh++] = i;
                }
            while (qt < qh) {
                int cur = queue[qt++];
                matched[cur] = true;
                for (int i = 0; i < n; ++i)
                    if (gSrc[cur][i] && !matched[i]) {
                        --degSrc[i];
                        if (degSrc[i] == 1 && readyDst[i]) {
                            queue[qh++] = i;
                        }
                    }
                for (int i = 0; i < n; ++i)
                    if (gDst[cur][i] && !matched[i] && !readyDst[i]) {
                        readyDst[i] = true;
                        if (degSrc[i] == 1) {
                            queue[qh++] = i;
                        }
                    }
            }
            if (ret == qh)
                return ret;
            else
                return INF;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

