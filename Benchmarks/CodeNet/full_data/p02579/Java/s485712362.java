import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int H = in.i();
        int W = in.i();
        int Ch = in.i() - 1;
        int Cw = in.i() - 1;
        int Dh = in.i() - 1;
        int Dw = in.i() - 1;
        char[][] S = new char[H][];
        for (int i = 0; i < H; i++) {
            S[i] = in.s(W);
        }

        int[][] walkDirection = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int[][] warpDirection = new int[25][2];
        for (int i = 0; i < 25; i++) {
            warpDirection[i][0] = i / 5 - 2;
            warpDirection[i][1] = i % 5 - 2;
        }

        boolean[][] visited = new boolean[H][W];
        LinkedList<Integer> walkVia = new LinkedList<>();
        LinkedList<Integer> warpTo = new LinkedList<>();

        visited[Ch][Cw] = true;
        int initial = (Ch << 10) + Cw;
        walkVia.add(initial);
        warpTo.add(initial);

        int warpCount = 0;
        int ans = -1;
        loop: while (walkVia.size() > 0) {
            while (walkVia.size() > 0) {
                int hw = walkVia.pop();
                int h = hw >> 10;
                int w = hw & ((1 << 10) - 1);

                for (int[] d : walkDirection) {
                    int h2 = h + d[0];
                    int w2 = w + d[1];
                    boolean isRoad = 0 <= h2 && h2 < H && 0 <= w2 && w2 < W && S[h2][w2] == '.';
                    if (isRoad && !visited[h2][w2]) {
                        int n = (h2 << 10) + w2;
                        walkVia.add(n);
                        warpTo.add(n);
                        visited[h2][w2] = true;
                    }
                }
                if (visited[Dh][Dw]) {
                    ans = warpCount;
                    break loop;
                }
            }

            int len = warpTo.size();
            for (int i = 0; i < len; i++) {
                int hw = warpTo.pop();
                int h = hw >> 10;
                int w = hw & ((1 << 10) - 1);
                for (int[] d : warpDirection) {
                    int h2 = h + d[0];
                    int w2 = w + d[1];
                    boolean isRoad = 0 <= h2 && h2 < H && 0 <= w2 && w2 < W && S[h2][w2] == '.';
                    if (isRoad && !visited[h2][w2]) {
                        int n = (h2 << 10) + w2;
                        walkVia.add(n);
                        warpTo.add(n);
                        visited[h2][w2] = true;
                    }
                }

            }
            warpCount++;
            if (visited[Dh][Dw]) {
                ans = warpCount;
                break;
            }
        }
        out.println(ans);
    }

}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = read(cbuf, 0, cbuf.length);
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

        void skip() {
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    back();
                    break;
                }
            }
        }

        char[] s(final int N) {
            skip();
            char[] s = new char[N];
            for (int i = 0; i < s.length; i++) {
                s[i] = next();
            }
            return s;
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
