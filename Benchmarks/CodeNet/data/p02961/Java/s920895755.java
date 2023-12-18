import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EGolf solver = new EGolf();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGolf {
        long k;
        long x;
        long y;
        long mx = 1;
        long my = 1;
        long curX;
        long curY;
        List<String> output = new ArrayList<>();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            k = in.nextLong();
            x = in.nextLong();
            y = in.nextLong();

            if (x < 0) {
                x *= -1;
                mx = -1;
            }
            if (y < 0) {
                y *= -1;
                my = -1;
            }

            long sum = x + y;

            if (sum % k != 0) {
                long offset = (k - sum % k);
                if (offset % 2 == 0) {
                    add(k - offset / 2, -offset / 2);
                    add(0, k);
                } else {
                    out.println(-1);
                    return;
                }
            }

            while (curX != x) {
                long moveX = Math.min(k, Math.abs(x - curX));
                long moveY = k - moveX;
                if (x < curX)
                    moveX *= -1;
                if (y < curY)
                    moveY *= -1;
                add(moveX, moveY);
            }
            while (curY != y) {
                add(0, k * (curY < y ? 1 : -1));
            }

            Util.ASSERT(curX == x && curY == y);

            out.println(output.size());
            for (String s : output) {
                out.println(s);
            }
        }

        void add(long moveX, long moveY) {
            Util.ASSERT(Math.abs(moveX) + Math.abs(moveY) == k);
            curX += moveX;
            curY += moveY;
            output.add(String.format("%d %d", curX * mx, curY * my));
            //        output.add(String.format("%d %d", curX, curY));
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

    static class Util {
        public static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

    }
}

