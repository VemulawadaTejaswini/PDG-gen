import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Star Orpheus
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            long a = in.nextLong(),
                    b = in.nextLong(),
                    c = in.nextLong();
            if ((a & 1) == 0 || (b & 1) == 0 || (c & 1) == 0) {
                out.println(0);
                return;
            }
            out.println(Long.min(a * b, Long.min(b * c, a * c)));
        }

    }

    static class FastScanner {
        final static int BUFFER_SIZE = 65536;
        BufferedReader br;
        char[] buf = new char[BUFFER_SIZE];
        int len = 0;
        int it = 0;
        boolean end = false;

        boolean delim(char c) {
            return c == ' ' || c == '\n' || c == '\r';
        }

        void fillBuffer() {
            try {
                len = br.read(buf);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        void ensureBuffer() {
            if (it == len) {
                it = 0;
                fillBuffer();
                if (len == -1) end = true;
            }
        }

        void moveNext() {
            while (!end) {
                ensureBuffer();
                if (!delim(buf[it])) return;
                while (it < len && delim(buf[it])) it++;
            }
        }

        public long nextLong() {
            moveNext();
            if (buf[it] == '-') {
                it++;
                return -nextLong();
            }
            if (buf[it] == '+') {
                it++;
                return nextLong();
            }
            long result = 0;
            while (!end) {
                int l = it;
                while (it < len && !delim(buf[it])) {
                    result = (result * 10) + buf[it] - '0';
                    it++;
                }
                ensureBuffer();
                if (delim(buf[it])) break;
            }
            return result;
        }

        public FastScanner(String file) {
            try {
                br = new BufferedReader(new FileReader(file), BUFFER_SIZE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is), BUFFER_SIZE);
        }

    }
}

