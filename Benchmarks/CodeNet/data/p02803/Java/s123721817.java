import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AtCoder problem = new AtCoder(sc);
        problem.solve(out);

        out.flush();
    }

}

class AtCoder {

    /* 変数宣言 */
    final int H, W;
    final String[][] S;

    AtCoder(FastScanner sc) {
        H = sc.nextInt();
        W = sc.nextInt();
        S = new String[H][W];
        String[] dots = new String[H];
        for (int i = 0; i < H; i++) {
            dots[i] = sc.next();
        }

        for (int i = 0; i < H; i++) {
            char[] tmpCharArray = dots[i].toCharArray();
            for (int j = 0; j < W; j++) {
                S[i][j] = String.valueOf(tmpCharArray[j]);
            }
        } /**/
    }

    void solve(PrintWriter out) {
        int[][] disFromStart = new int[H][W];

        int max = 0;
        for (int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                if (S[y][x].equals(".")) {
                    initDisFromStart(disFromStart);
                    disFromStart[y][x] = 0;
                    MakeDisMap(disFromStart, x, y);
                    int tmpMax = findMaxDis(disFromStart);
                    if (tmpMax > max && tmpMax != -1) {
                        max = tmpMax;
                    }
                }
            }
        }
        out.println(max);
    }

    int findMaxDis(int disFromStart[][]) {
        int max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (disFromStart[i][j] > max && S[i][j].equals(".")) {
                    max = disFromStart[i][j];
                }
            }
        }
        //dispDisFromStart(disFromStart);
        return max;
    }

    void initDisFromStart(int disFromStart[][]) {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                disFromStart[i][j] = -1;
            }
        }
    }

    void dispDisFromStart(int disFromStart[][]) {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (!S[i][j].equals(".")) {
                    System.out.print("#");
                } else {
                    System.out.print(disFromStart[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
    }

    void MakeDisMap(int disFromStart[][], int StartX, int StartY) {
        // dispDisFromStart(disFromStart);
        // スタート時点かチェック
        // 異なれば更新
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, -1, 0, 1 };
        LinkedList<Point> q = new LinkedList<>();
        q.add(new Point(StartX, StartY));
        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = p.x + dx[i];
                int y = p.y + dy[i];
                if (x < 0 || y < 0 || x >= W || y >= H) {
                    continue;
                }
                if (!S[y][x].equals(".") || disFromStart[y][x] > -1) {
                    continue;
                }
                disFromStart[y][x] = disFromStart[p.y][p.x] + 1;
                q.add(new Point(x, y));
            }
        }

    }

    boolean isDoneCalc(int disFromStart[][]) {
        // dispDisFromStart(disFromStart);
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i - 1 >= 0 && S[i - 1][j].equals(".") && disFromStart[i - 1][j] > disFromStart[i][j] + 1) {
                    return false;
                }
                if (i + 1 < H && S[i + 1][j].equals(".") && disFromStart[i + 1][j] > disFromStart[i][j] + 1) {
                    return false;
                }
                if (j - 1 >= 0 && S[i][j - 1].equals(".") && disFromStart[i][j - 1] > disFromStart[i][j] + 1) {
                    return false;
                }
                if (j + 1 < W && S[i][j + 1].equals(".") && disFromStart[i][j + 1] > disFromStart[i][j] + 1) {
                    return false;
                }
            }
        }
        return true;
    }

    void fixDisMap(int disFromStart[][]) {
        int StartH = H;
        int StartW = W;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i - 1 >= 0 && S[i - 1][j].equals(".") && disFromStart[i - 1][j] > disFromStart[i][j] + 1) {
                    StartH = i;
                    StartW = j;
                    break;
                }
                if (i + 1 < H && S[i + 1][j].equals(".") && disFromStart[i + 1][j] > disFromStart[i][j] + 1) {
                    StartH = i;
                    StartW = j;
                    break;
                }
                if (j - 1 >= 0 && S[i][j - 1].equals(".") && disFromStart[i][j - 1] > disFromStart[i][j] + 1) {
                    StartH = i;
                    StartW = j;
                    break;
                }
                if (j + 1 < W && S[i][j + 1].equals(".") && disFromStart[i][j + 1] > disFromStart[i][j] + 1) {
                    StartH = i;
                    StartW = j;
                    break;
                }
            }
            if (StartH != H) {
                break;
            } else {
                continue;
            }
        }

        MakeDisMap(disFromStart, StartH, StartW);
    }

}

// https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
class FastScanner {

    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}