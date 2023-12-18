import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Dhanin Gupta
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLine solver = new DLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLine {
        public void solve(int testNumber, InputReader in, PrintWriter w) {
            int n = in.nextInt();
            ArrayList<Integer>[] al = new ArrayList[n + 1];
            int x = in.nextInt();
            int y = in.nextInt();

            //w.println(n+" "+x+" "+y);
            for (int i = 1; i <= n; i++) {
                al[i] = new ArrayList<Integer>();
            }

            for (int i = 1; i <= n - 1; i++) {
                al[i].add(i + 1);
                al[i + 1].add(i);
            }

            al[x].add(y);
            al[y].add(x);
            // for (int i = 1; i <=n ; i++) {
            //   w.println(al[i]);
            //}

            Queue<Integer> qu = new LinkedList<>();
            int[][] dis = new int[n + 1][n + 1];
            int[] vis;
            for (int i = 1; i <= n; i++) {

                vis = new int[n + 1];
                qu.add(i);
                dis[i][i] = 0;
                vis[i] = 1;
                //w.println("src is: "+i);
                while (!qu.isEmpty()) {
                    int el = qu.poll();
                    // w.println("el is: "+el);
                    for (int j = 0; j < al[el].size(); j++) {
                        int vert = al[el].get(j);
                        // w.println("vert is: "+vert);
                        if (vis[vert] == 0) {
                            dis[i][vert] = dis[i][el] + 1;
                            vis[vert] = 1;
                            qu.add(vert);
                            //w.println("dist is: "+dis[i][vert]);
                        }
                    }
                }
            }

            int[] cnt = new int[n];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    cnt[dis[i][j]]++;
                    //w.println(i+" "+j+" "+dis[i][j]);
                }
            }

            for (int i = 1; i <= n - 1; i++) {
                w.println(cnt[i] / 2);
            }
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

