import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

public class Main {
    static int MOD = 1000000007;

    public static class Mas {
        int x;
        int y;
        int step;

        Mas(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    private static final int[] vX = { 1, 0, 0, -1 };
    private static final int[] vY = { 0, 1, -1, 0 };

    public static void main(String[] args) {

        FastScanner fs = new FastScanner();
        int H = fs.nextInt();
        int W = fs.nextInt();
        char[][] a = new char[H][W];
        int black = 0;
        for (int i = 0; i < H; i++) {
            String s = fs.next();
            for (int j = 0; j < W; j++) {
                a[i][j] = s.charAt(j);
                if (a[i][j] == '#')
                    black++;
            }
        }

        Queue<Mas> q = new ArrayDeque<>();
        q.add(new Mas(0, 0, 1));
        boolean[][] seen = new boolean[H][W];
        int ans = 1;
        while (!q.isEmpty()) {
            Mas mas = q.poll();
            int x = mas.x;
            int y = mas.y;
            if (x == H - 1 && y == W - 1) {
                ans = mas.step;
                break;
            }
            for (int i = 0; i < 4; i++) {
                int wX = x + vX[i];
                int wY = y + vY[i];
                // System.out.println(wX + " " + wY);
                // System.out.println(seen[x][y]);
                // System.out.println(a[wX][wY])
                if (wX >= 0 && wX < H && wY >= 0 && wY < W && !seen[wX][wY] && a[wX][wY] != '#') {
                    Mas nMas = new Mas(wX, wY, mas.step + 1);
                    seen[wX][wY] = true;
                    q.add(nMas);
                }
            }
        }
        if (H * W - black - ans < 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(H * W - black - ans);
    }

}
