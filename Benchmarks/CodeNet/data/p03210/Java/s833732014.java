//提出は以下
import java.io.*;
import java.io.IOException;
import java.util.*;


public class Main {


    void submit() {

        int n = nextInt();

        if(n == 3|| n == 5|| n == 7) {
            out.println("YES");
        }else{
            out.println("NO");
        }
    }

    void test() {

    }


    Main() throws IOException {
        is = System.in;
        out = new PrintWriter(System.out);
        submit();
        // stress();
        // test();
        out.close();
    }


    public static void main(String[] args) throws IOException {
        new Main();
    }

    private InputStream is;
    PrintWriter out;

    private byte[] buf = new byte[1 << 14];
    private int bufSz = 0, bufPtr = 0;

    private int readByte() {
        if (bufSz == -1)
            throw new RuntimeException("Reading past EOF");
        if (bufPtr >= bufSz) {
            bufPtr = 0;
            try {
                bufSz = is.read(buf);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (bufSz <= 0)
                return -1;
        }
        return buf[bufPtr++];
    }

    private boolean isTrash(int c) {
        return c < 33 || c > 126;
    }

    private int skip() {
        int b;
        while ((b = readByte()) != -1 && isTrash(b))
            ;
        return b;
    }

    String nextToken() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!isTrash(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    String nextString() {
        int b = readByte();
        StringBuilder sb = new StringBuilder();
        while (!isTrash(b) || b == ' ') {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    double nextDouble() {
        return Double.parseDouble(nextToken());
    }

    char nextChar() {
        return (char) skip();
    }

    int nextInt() {
        int ret = 0;
        int b = skip();
        if (b != '-' && (b < '0' || b > '9')) {
            throw new InputMismatchException();
        }
        boolean neg = false;
        if (b == '-') {
            neg = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                ret = ret * 10 + (b - '0');
            } else {
                if (b != -1 && !isTrash(b)) {
                    throw new InputMismatchException();
                }
                return neg ? -ret : ret;
            }
            b = readByte();
        }
    }

    long nextLong() {
        long ret = 0;
        int b = skip();
        if (b != '-' && (b < '0' || b > '9')) {
            throw new InputMismatchException();
        }
        boolean neg = false;
        if (b == '-') {
            neg = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                ret = ret * 10 + (b - '0');
            } else {
                if (b != -1 && !isTrash(b)) {
                    throw new InputMismatchException();
                }
                return neg ? -ret : ret;
            }
            b = readByte();
        }
    }
}
//ここまで