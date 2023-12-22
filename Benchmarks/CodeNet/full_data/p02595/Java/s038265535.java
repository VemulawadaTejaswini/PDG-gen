import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        final int N = in.i();
        long D = in.l();
        D *= D;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            long x = in.l();
            long y = in.l();
            long d = x * x + y * y;
            if (d <= D) {
                ans++;
            }
        }
        out.println(ans);
    }

    static class MyReader extends BufferedReader {
        char[] cbuf = new char[1024];
        int head = 0;
        int tail = 0;

        MyReader(){
            super(new InputStreamReader(System.in));
        }

        char next() {
            if (head == tail) {
                try {
                    tail = super.read(cbuf, 0, cbuf.length);
                } catch (IOException e) {}
                head = 0;
            }
            return cbuf[head++];
        }

        void back() {
            head--;
        }

        boolean minus() {
            boolean minus;
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    if (!(minus = c == '-')) back();
                    return minus;
                }
            }
        }

        int i() {
            boolean minus = minus();
            int n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus ? -n : n;
        }

        int[] ii(final int N) {
            int[] a = new int[N];
            for (int j = 0; j < a.length; j++) a[j] = i();
            return a;
        }

        long l() {
            boolean minus = minus();
            long n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus ? -n : n;
        }
    }
}
