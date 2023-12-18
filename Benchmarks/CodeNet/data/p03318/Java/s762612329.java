import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Collections;
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
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static long[] nn1 = new long[19];

        static {
            nn1[0] = 0;
            for (int s = 1; s < nn1.length; s++) {
                nn1[s] = nn1[s - 1] * 10 + 9;
            }
        }

        public void solve(int testNumber, MyScan in, PrintWriter out) {

            int k = in.nextInt();
            ArrayList<Long> data = new ArrayList<>();
            for (int s = 0; s < 15; s++) {
                for (int l = 0; l < 99; l++) {
                    data.add(nn1[s] + (l * (nn1[s] + 1)));
                }
            }
            Collections.sort(data);


            LinkedList<Long> integers = new LinkedList<>();
            integers.add(1L);
            long last = 1L;
            for (long x : data) {
                if (x <= last) continue;
                while (integers.peekLast() * f(x) > x * f(integers.peekLast())) {
                    integers.pollLast();
                }
                integers.add(x);
                last = x;
            }

            for (long s : integers) {
                if (k == 0) break;
                k--;
                out.println(s);
            }
        }

        private long f(long s) {
            if (s == 0) return 0;
            return f(s / 10) + (s % 10);
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

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

    }
}

