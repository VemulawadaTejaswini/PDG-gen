import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt(), l = 0, r = 0, d = 0;
            ArrayList<conn> a[] = (ArrayList<conn>[]) new ArrayList[n + 1];
            ArrayList<conn> ra[] = (ArrayList<conn>[]) new ArrayList[n + 1];
            boolean cd = true;
            for (int i = 0; i <= n; i++) {
                a[i] = new ArrayList<conn>();
                ra[i] = new ArrayList<conn>();
            }
            for (int i = 0; i < m; i++) {
                l = in.nextInt();
                r = in.nextInt();
                d = in.nextInt();
                a[r].add(new conn(l, d));
                ra[l].add(new conn(r, d));
            }
            Queue<Integer> q = new LinkedList<Integer>();
            boolean v[] = new boolean[n + 1];
            long val[] = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!v[i]) {
                    val[i] = 0;
                    v[i] = true;
                    q.add(i);
                    while (!q.isEmpty() && cd) {
                        int curr = q.poll();
                        Iterator<conn> it = a[curr].iterator();
                        while (it.hasNext()) {
                            conn next = it.next();
                            if (!v[next.l]) {
                                v[next.l] = true;
                                val[next.l] = val[curr] - next.d;
                                q.add(next.l);
                            } else {
                                if (val[next.l] != val[curr] - next.d) {
                                    cd = false;
                                    break;
                                }
                            }
                        }
                        it = ra[curr].iterator();
                        while (it.hasNext() && cd) {
                            conn next = it.next();
                            if (!v[next.l]) {
                                v[next.l] = true;
                                val[next.l] = val[curr] + next.d;
                                q.add(next.l);
                            } else {
                                if (val[next.l] != val[curr] + next.d) {
                                    cd = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (!cd) {
                    break;
                }
            }
            if (cd) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

        class conn {
            int l;
            int d;

            conn(int l, int d) {
                this.l = l;
                this.d = d;
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

