import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    private static final int MUL = 1009;
    private static final int MOD = 999983;

    int H,W;
    char[][] ch;
    byte[] dp;
    boolean[] used;

    private int getHash() {
        long hash = 0;
        for(int i = 0;i < H;i++) {
            for(int j = 0;j < W;j++) {
                hash = (hash + ch[i][j] - 'a') * MUL % MOD;
            }
        }
        return (int)hash;
    }

    private boolean check() {
        for(int i = 0;i < H;i++) {
            for(int j = 0;j < W;j++) {
                if (ch[i][j] != ch[H - i - 1][W - j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    private byte dfs(int hash) {

        if (dp[hash] != 0) {
            return dp[hash];
        }

        if (check()) {
            return dp[hash] = 1;
        }

        for(int i = 0;i < H;i++) {
            for(int j = i + 1;j < H;j++) {
                for(int k = 0;k < W;k++) {
                    char tmp = ch[i][k];
                    ch[i][k] = ch[j][k];
                    ch[j][k] = tmp;
                }
                int nextHash = getHash();
                if (used[nextHash]) {
                    continue;
                }
                used[nextHash] = true;
                if (dp[nextHash] == 0) {
                    byte ok = dfs(nextHash);
                    if (ok == 1) {
                        return dp[hash] = 1;
                    }
                }
                for(int k = 0;k < W;k++) {
                    char tmp = ch[i][k];
                    ch[i][k] = ch[j][k];
                    ch[j][k] = tmp;
                }
            }
        }

        for(int i = 0;i < W;i++) {
            for(int j = i + 1;j < W;j++) {
                for(int k = 0;k < H;k++) {
                    char tmp = ch[k][i];
                    ch[k][i] = ch[k][j];
                    ch[k][j] = tmp;
                }
                int nextHash = getHash();
                if (used[nextHash]) {
                    continue;
                }
                used[nextHash] = true;
                if (dp[nextHash] == 0) {
                    byte ok = dfs(nextHash);
                    if (ok == 1) {
                        return dp[hash] = 1;
                    }
                }
                for(int k = 0;k < H;k++) {
                    char tmp = ch[k][i];
                    ch[k][i] = ch[k][j];
                    ch[k][j] = tmp;
                }
            }
        }
        return dp[hash] = -1;
    }


    private void solve() {
        H = nextInt();
        W = nextInt();

        ch = new char[H][];
        for(int i = 0;i < H;i++) {
            ch[i] = next().toCharArray();
        }

        dp = new byte[MOD+1];
        used = new boolean[MOD+1];
        int hash = getHash();
        used[hash] = true;
        if (dfs(hash) == 1) {
            out.println("YES");
        } else {
            out.println("NO");
        }

    }
    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[4096];
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