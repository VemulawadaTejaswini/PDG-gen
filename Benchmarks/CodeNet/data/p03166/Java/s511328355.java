import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        private ArrayList<Integer>[] adjList;
        private int[] dp;

        public void solve(int testNumber, Reader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            adjList = new ArrayList[n + 1];
            dp = new int[n + 1];
            Arrays.fill(dp, -1);
            for (int i = 0; i <= n; ++i) {
                adjList[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; ++i) {
                int u = in.nextInt();
                int v = in.nextInt();
                adjList[u].add(v);
            }
            for (int i = n; i >= 0; --i) {
                if (dp[i] == -1) {
                    dfs(i);
                }
            }
            int res = Integer.MIN_VALUE;
            for (int i = 1; i <= n; ++i) {
                res = Math.max(res, dp[i]);
            }
            out.println(res);
        }

        private int dfs(int node) {
            if (adjList[node].size() == 0) {
                return dp[node] = 0;
            }
            if (dp[node] != -1) return dp[node];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < adjList[node].size(); ++i) {
                max = Math.max(max, dfs(adjList[node].get(i)));
            }
            return dp[node] = 1 + max;
        }

    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public Reader(InputStream in) {
            din = new DataInputStream(in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) {
            try {
                din = new DataInputStream(new FileInputStream(file_name));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
        }

        private void fillBuffer() {
            try {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1) {
                    buffer[0] = -1;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private byte read() {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }
}

