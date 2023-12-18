import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        Solver s = new Solver();
        int test = 1;
        for (int i = 1; i <= test; i++) {
            s.solve(i, in, out);
        }
        out.close();
    }
}

class Solver {

    void solve(int test_case, InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        for (int i = 0; i < n; i++) b[i] = in.nextInt();
        long a1 = 0, b1 = 0;
        boolean[] already = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                already[i] = true;
                continue;
            }
            if (a[i] < b[i]) {
                int diff = b[i] - a[i];
                if (a1 == 0) {
                    a[i] = b[i];
                    b1 += diff / 2;
                } else {
                    if (diff <= a1) {
                        a1 -= diff;
                        a[i] = b[i];
                    } else {
                        diff -= a1;
                        a1 = 0;
                        b1 += diff / 2;
                        a[i] = b[i];
                    }
                }
            } else {
                int diff = a[i] - b[i];
                if (b1 == 0) {
                    a1 += diff * 2;
                    b[i] = a[i];
                } else {
                    if (diff <= b1) {
                        b1 -= diff;
                        b[i] = a[i];
                    } else {
                        diff -= b1;
                        b1 = 0;
                        a1 += diff * 2;
                        b[i] = a[i];
                    }
                }
            }
            //            out.println(a1 + " " + b1 + " " + (i + 1));
        }
        //        out.println(a1 + " " + b1);
        if (a1 != 0) {
            boolean can = false;
            for (int i = 0; i < n; i++) {
                if (already[i]) {
                    can = true;
                    break;
                }
            }
            if (can) {
                if (b1 == 2 * a1) out.println("Yes");
                else out.println("No");
            } else {
                out.println("No");
            }
        } else out.println("Yes");
    }
}


class InputReader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public InputReader() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public InputReader(String file_name) throws IOException {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String nextLine() throws IOException {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }

    public long nextLong() throws IOException {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public double nextDouble() throws IOException {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');

        if (c == '.') {
            while ((c = read()) >= '0' && c <= '9') {
                ret += (c - '0') / (div *= 10);
            }
        }

        if (neg)
            return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read() throws IOException {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close() throws IOException {
        if (din == null)
            return;
        din.close();
    }

    public String next() throws IOException {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n' || c == ' ')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }
}