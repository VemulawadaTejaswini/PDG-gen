import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

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
        for (int i = 0; i < H; i++) {
            initDisFromStart(disFromStart);
            for (int j = 0; j < W; j++) {
                if (S[i][j].equals(".")) {
                    disFromStart[i][j] = 0;
                    MakeDisMap(disFromStart, i, j);
                    int tmpMax = findMaxDis(disFromStart);
                    if (tmpMax > max && tmpMax != Integer.MAX_VALUE) {
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
        return max;
    }

    void initDisFromStart(int disFromStart[][]) {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                disFromStart[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    void dispDisFromStart(int disFromStart[][]) {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(disFromStart[i][j]);
            }
            System.out.println();
        }
    }

    void MakeDisMap(int disFromStart[][], int StartH, int StartW) {
        // dispDisFromStart(disFromStart);
        // スタート時点かチェック
        // 異なれば更新
        if (disFromStart[StartH][StartW] != 0) {
            int min = Integer.MAX_VALUE;
            // 四方向見る
            if (StartH - 1 >= 0 && S[StartH - 1][StartW].equals(".") && disFromStart[StartH - 1][StartW] < min) {
                min = disFromStart[StartH - 1][StartW];
            }
            if (StartH + 1 < H && S[StartH + 1][StartW].equals(".") && disFromStart[StartH + 1][StartW] < min) {
                min = disFromStart[StartH + 1][StartW];
            }
            if (StartW - 1 >= 0 && S[StartH][StartW - 1].equals(".") && disFromStart[StartH][StartW - 1] < min) {
                min = disFromStart[StartH][StartW - 1];
            }
            if (StartW + 1 < W && S[StartH][StartW + 1].equals(".") && disFromStart[StartH][StartW + 1] < min) {
                min = disFromStart[StartH][StartW + 1];
            }
            // 更新
            disFromStart[StartH][StartW] = min + 1;
        }
        // 再帰
        // 四方向見る
        if (StartH - 1 >= 0 && S[StartH - 1][StartW].equals(".")
                && disFromStart[StartH - 1][StartW] > disFromStart[StartH][StartW] + 1) {
            MakeDisMap(disFromStart, StartH - 1, StartW);
        }
        if (StartH + 1 < H && S[StartH + 1][StartW].equals(".")
                && disFromStart[StartH + 1][StartW] > disFromStart[StartH][StartW] + 1) {
            MakeDisMap(disFromStart, StartH + 1, StartW);
        }
        if (StartW - 1 >= 0 && S[StartH][StartW - 1].equals(".")
                && disFromStart[StartH][StartW - 1] > disFromStart[StartH][StartW] + 1) {
            MakeDisMap(disFromStart, StartH, StartW - 1);
        }
        if (StartW + 1 < W && S[StartH][StartW + 1].equals(".")
                && disFromStart[StartH][StartW + 1] > disFromStart[StartH][StartW] + 1) {
            MakeDisMap(disFromStart, StartH, StartW + 1);
        }
    }

    boolean isDoneCalc(int disFromStart[][]) {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (disFromStart[i][j] == Integer.MAX_VALUE && S[i][j].equals(".")) {
                    return false;
                }
            }
        }
        return true;
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