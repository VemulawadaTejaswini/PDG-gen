import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
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
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, MyScan in, PrintWriter out) {
            String l = in.next();
            if (l.length() == 26) {
                PriorityQueue<Character> cr = new PriorityQueue<>((c1, c2) -> c2 - c1);
                for (int s = l.length() - 1; s >= 0; s--) {
                    char tm = l.charAt(s);
                    if (cr.size() == 0 || tm > cr.peek()) {
                        cr.add(tm);
                        continue;
                    }
                    while (cr.size() > 1) {
                        cr.poll();
                    }
                    out.print(l.substring(0, s) + cr.poll());
                    return;


                }
                out.println(-1);

            } else {
                out.print(l);
                boolean[] ff = new boolean[26];
                for (char k : l.toCharArray()) {
                    ff[k - 'a'] = true;
                }
                for (int i = 0; i < 26; i++) {
                    if (ff[i]) continue;
                    out.print((char) ('a' + i));
                    return;
                }


            }

        }

    }

    static class MyScan {
        private final InputStream in;
        private byte[] inbuf = new byte[1024];
        public int lenbuf = 0;
        public int ptrbuf = 0;

        public MyScan(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = in.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        public String next() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

    }
}

