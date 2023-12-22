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
        boolean[][] visited = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            S[i] = in.s(W);
        }
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> possible = new ArrayList<>();
        list.add((Ch << 10) + Cw);
        int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int count = 0;
        int ans = -1;
        visited[Ch][Cw] = true;
        loop: while (list.size() > 0) {
            possible.addAll(list);
            while (list.size() > 0) {
                int hw = list.pop();
                int h = hw >> 10;
                int w = hw & ((1 << 10) - 1);

                for (int[] ij : d) {
                    int h2 = h + ij[0];
                    int w2 = w + ij[1];
                    boolean isRoad = 0 <= h2 && h2 < H && 0 <= w2 && w2 < W && S[h2][w2] == '.';
                    if (isRoad && !visited[h2][w2]) {
                        int n = (h2 << 10) + w2;
                        possible.add(n);
                        list.add(n);
                        visited[h2][w2] = true;
                    }
                }
                if (visited[Dh][Dw]) {
                    ans = count;
                    break loop;
                }
            }

            for (int hw : possible) {
                int h = hw >> 10;
                int w = hw & ((1 << 10) - 1);
                for (int i = -2; i < 3; i++) {
                    for(int j = -2; j < 3; j++) {
                        int h2 = h + i;
                        int w2 = w + j;
                        boolean isRoad = 0 <= h2 && h2 < H && 0 <= w2 && w2 < W && S[h2][w2] == '.';
                        if (isRoad && !visited[h2][w2]) {
                            list.add((h2 << 10) + w2);
                            visited[h2][w2] = true;
                        }
                    }
                }
            }
            count++;
            if (visited[Dh][Dw]) {
                ans = count;
                break;
            }
            possible.clear();
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
