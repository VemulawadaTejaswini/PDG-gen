import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Collection;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author liymsheep
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[][] a = new int[n][m];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    a[i][j] = in.nextInt() - 1;
                }
            }

            int low = 1, high = n;
            while (low < high) {
                int mid = (low + high) >> 1;
                if (go(n, m, a, mid)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            out.println(low);
        }

        private boolean go(int n, int m, int[][] a, int slot) {
            boolean[] bad = new boolean[m];
            boolean[] inQueue = new boolean[n];
            int[] count = new int[m];
            int[] pointer = new int[n];

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; ++i) {
                queue.add(i);
                inQueue[i] = true;
            }
            while (!queue.isEmpty()) {
                int now = queue.poll();
                inQueue[now] = false;
                while (pointer[now] < m) {
                    if (bad[a[now][pointer[now]]]) {
                        ++pointer[now];
                        continue;
                    }
                    if (++count[a[now][pointer[now]]] > slot) {
                        bad[a[now][pointer[now]]] = true;
                        for (int j = 0; j < n; ++j) {
                            if (j != now && a[now][pointer[now]] == a[j][pointer[j]] && !inQueue[j]) {
                                queue.add(j);
                                inQueue[j] = true;
                            }
                        }
                        ++pointer[now];
                    } else {
                        break;
                    }
                }
                if (pointer[now] == m) {
                    return false;
                }
            }
            return true;
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    throw new UnknownError();
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

