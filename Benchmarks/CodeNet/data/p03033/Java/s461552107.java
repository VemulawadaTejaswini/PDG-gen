import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        ERoadwork solver = new ERoadwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoadwork {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int q = in.nextInt();

            Map<Integer, List<Integer>> sp = new HashMap<>();
            Map<Integer, List<Integer>> ep = new HashMap<>();

            TreeSet<Integer> ts = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                Integer s = in.ni();
                Integer t = in.ni();
                Integer x = in.ni();

                Integer st = s - x;
                Integer et = t - x;

                if (!sp.containsKey(st)) {
                    sp.put(st, new ArrayList<>());
                }

                if (!ep.containsKey(et)) {
                    ep.put(et, new ArrayList<>());
                }

                sp.get(st).add(x);
                ep.get(et).add(x);

                ts.add(st);
                ts.add(et);
            }

            boolean rs = false;

            Integer start = -1;

            Integer p = -1;

            TreeSet<Integer> rts = new TreeSet<>();

            List<seg> segs = new ArrayList<>();

            for (Integer t : ts) {
                if (ep.containsKey(t)) {
                    List<Integer> cl = ep.get(t);

                    for (int i = 0; i < cl.size(); i++) {
                        Integer cle = cl.get(i);
                        rts.remove(cle);
                    }
                }

                if (sp.containsKey(t)) {
                    List<Integer> cl = sp.get(t);

                    for (int i = 0; i < cl.size(); i++) {
                        Integer cle = cl.get(i);
                        rts.add(cle);
                    }
                }

                if (rts.isEmpty()) {
                    if (rs) {
                        segs.add(new seg(start, t - 1, p));
                        rs = false;
                    }
                    continue;
                }

                Integer min = rts.first();

                if ((p == -1 || min != p) && rs) {
                    segs.add(new seg(start, t - 1, p));
                    start = t;
                    p = min;
                } else {
                    if (!rs) {
                        rs = true;
                        start = t;
                        p = min;
                    }
                }
            }

            segs.sort((s1, s2) -> Integer.compare(s1.s, s2.s));


            while (q-- > 0) {
                Integer d = in.nextInt();

                int lo = 0;
                int hi = segs.size() - 1;

                int ind = -1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;

                    if (segs.get(mid).s <= d && d <= segs.get(mid).e) {
                        ind = mid;
                        break;
                    } else if (segs.get(mid).s > d) {
                        hi = mid - 1;
                    } else {
                        lo = mid + 1;
                    }
                }

                if (ind != -1) {
                    out.println(segs.get(ind).x);
                } else {
                    out.println(-1);
                }
            }
        }

        class seg {
            Integer s;
            Integer e;
            Integer x;

            public seg(Integer s, Integer e, Integer x) {
                this.s = s;
                this.e = e;
                this.x = x;
            }

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public int ni() {
            return nextInt();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

