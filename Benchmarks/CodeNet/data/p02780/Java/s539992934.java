import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N, K; {int[] a = in.ii(2); N = a[0]; K = a[1];}
        int[] p = in.ii(N);
        int[] sum = new int[N + 1];
        for(int i = 0; i < N; i++){
            sum[i + 1] = sum[i] + p[i];
        }

        int ans = 0;
        for(int i = 0, M = N - K + 1; i < M; i++){
            ans = Math.max(sum[i + K] - sum[i] + K, ans);
        }
        out.println(ans / 2.0);
    }

    static class MyReader extends BufferedReader {
        char[] cbuf = new char[1 << 10];
        int head = 0;
        int tail = 0;

        MyReader(){
            super(new InputStreamReader(System.in));
        }

        char next() {
            if (head == tail) {
                try {
                    tail = super.read(cbuf, 0, cbuf.length);
                    head = 0;
                } catch (IOException e) {}
            }
            try {
                return cbuf[head++];
            } catch (Exception e) {
                out.println(head + " " + tail);
                return next ();
            }
        }

        void back() {
            head--;
        }

        int i() {
            boolean minus;
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    if (!(minus = c == '-')) back();
                    break;
                }
            }
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
    }
}
