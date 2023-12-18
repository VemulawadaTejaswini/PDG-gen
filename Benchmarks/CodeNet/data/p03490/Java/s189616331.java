import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    char[] s;
    int x,y,N;
    boolean[][] xdp,ydp;
    ArrayList<Integer> vx,vy;

    private void xdfs(int n,int x) {
        if (xdp[n][x]) {
            return;
        }

        xdp[n][x] = true;
        if (n == vx.size()) {
            return;
        }
        xdfs(n + 1,x - vx.get(n));
        xdfs(n + 1,x + vx.get(n));
    }

    private void ydfs(int n,int y) {
        if (ydp[n][y]) {
            return;
        }

        ydp[n][y] = true;

        if (n == vy.size()) {
            return;
        }
        ydfs(n + 1,y + vy.get(n));
        ydfs(n + 1,y - vy.get(n));
    }

    private void solve() {
        s = next().toCharArray();
        N = s.length;
        x = nextInt();
        y = nextInt();

        vx = new ArrayList<>();
        vy = new ArrayList<>();
        vx.add(0);
        vy.add(0);

        int sumx = 0,sumy = 0;
        int countF = 0;
        int countT = 0;
        for(int i = 0;i < N;i++) {
            if (s[i] == 'F') {
                countF++;
            } else {
                if (countT % 2 == 0) {
                    vx.add(countF);
                    sumx += countF;
                } else {
                    vy.add(countF);
                    sumy += countF;
                }
                countT++;
                countF = 0;
            }
        }
        if (countF > 0) {
            if (countT % 2 == 0) {
                vx.add(countF);
                sumx += countF;
            } else {
                vy.add(countF);
                sumy += countF;
            }
        }

        xdp = new boolean[vx.size() + 1][sumx * 2 + 10];
        ydp = new boolean[vy.size() + 1][sumy * 2 + 10];

        xdfs(0,sumx);
        ydfs(0,sumy);

        if (xdp[vx.size()][x + sumx] && ydp[vy.size()][y + sumy]) {
            out.println("Yes");
            return;
        }
        out.println("No");
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