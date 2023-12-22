import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    /**
     * 文字列s1から文字列s2に変換する際の操作回数の最小値(最小編集距離)を求める
     */
    public int minEditDistance(String s1,String s2) {
        int N = s1.length();
        int M = s2.length();

        int[][] minEditDis = new int[N + 1][M + 1];

        for(int i = 0;i < N + 1;i++) {
            minEditDis[i][0] = i;
        }

        for(int j = 0;j < M + 1;j++) {
            minEditDis[0][j] = j;
        }

        for(int i = 1;i < N + 1;i++) {
            for(int j = 1;j < M + 1;j++) {
//                s1[i-1]をs2[j-1]に置換する場合
                minEditDis[i][j] = minEditDis[i-1][j-1] + (s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 1);
//                s1[i]を削除する場合
                minEditDis[i][j] = Math.min(minEditDis[i][j], minEditDis[i-1][j] + 1);
//                s2[j]を追加する場合
                minEditDis[i][j] = Math.min(minEditDis[i][j], minEditDis[i][j-1] + 1);
            }
        }

        return minEditDis[N][M];
    }

    private void solve() {
        String s1 = next();
        String s2 = next();

        out.println(minEditDistance(s1,s2));
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
