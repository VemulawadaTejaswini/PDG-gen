import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args)throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task2 solver = new Task2();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task2 {
        public final long CONST = (long) 1e9 + 7;

        public void solve(int testNumber, Reader in, PrintWriter out) throws Exception {
            int h = in.nextInt();
            int w = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            IntegerUtils intObj = new IntegerUtils();
            long fact[] = new long[200001];
            long invfact[] = new long[200001];
            fact[0] = 1;
            fact[1] = 1;
            invfact[1] = 1;
            invfact[0] = 1;
            for (int i = 2; i <= 200000; ++i) {
                fact[i] = (fact[i - 1] * i) % CONST;
            }
            for (int i = 2; i <= 200000; ++i) {
                invfact[i] = (invfact[i - 1] * intObj.modInvFermat((long) i, CONST - 2, CONST)) % CONST;
            }
            long ans = 0L;
            for (int i = b; i < w; ++i) {
                int totalup = (h - a - 1) + i;
                int minup = Math.min((h - a - 1), i);
                int totaldown = (a - 1) + (w - i - 1);
                int mindown = Math.min((a - 1), (w - i - 1));
                long combiup = (fact[totalup] * ((invfact[minup] * invfact[totalup - minup]) % CONST)) % CONST;
                long combidown = (fact[totaldown] * ((invfact[mindown] * invfact[totaldown - mindown]) % CONST)) % CONST;
                ans = (ans + (combiup * combidown) % CONST) % CONST;
            }
            out.println(ans);
        }

    }

    static class IntegerUtils {
        public int modInvFermat(long a, long b, long m) {
            if (b == 0) {
                return 1;
            }
            long pModulo = (modInvFermat(a, b / 2, m)) % m;
            if (b % 2 == 0) {
                return (int) ((pModulo * pModulo) % m);
            } else {
                return (int) ((((pModulo * pModulo) % m) * (a % m)) % m);
            }
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

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() throws IOException {
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

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }
}

