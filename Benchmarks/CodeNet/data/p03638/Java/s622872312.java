import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().calc();
    }
    
    public void calc() {
        int H = in.nextInt(), W = in.nextInt(), N = in.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        
        int[][] ans = new int[H][W];

        // 1 = 下方向 -1 = 上方向 0 = 移動しない
        int dirH = 1;
        // 1 = 右方向 -1 = 左方向 0 = 移動しない
        int dirW = 0;
        // h, wの初期値
        int height = 0;
        int width = 0;

        // 各色について順番に塗っていく
        for (int color = 0; color < N; color++) {
            // 色の数a[color]だけ塗りつぶしていく
            for (int i = 0; i < a[color]; i++) {
                if (height >= 0 && height < H && width >= 0 && width < W) {
                    ans[height][width] = color;                    
                }
                else {
                    if (height >= H) {
                        height = H - 1;
                    }
                    else if (height < 0) {
                        height = 0;
                    }
                    else if (width >= W) {
                        width = W - 1;
                    }
                    else if (width < 0) {
                        width = 0;
                    }
                    i--;
                }
                // 上下方向に移動する場合
                if (dirH != 0) {
                    // まだ上 or 下にいけるならそのまま
                    if (height + dirH < H && height + dirH >= 0) {
                        height += dirH;
                    }
                    // そうでなければ左右方向へ
                    else {
                        dirW = dirH;
                        dirH = 0;                        
                    }
                }
                else {
                    // まだ左 or 右にいけるならそのまま
                    if (width + dirW < W && width + dirW >= 0) {
                        width += dirW;
                    }
                    // そうでなければ左右方向へ
                    else {
                        dirH = -dirW;
                        dirW = 0;                        
                    }                    
                }
            }
        }
        
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                out.print((ans[i][j] + 1) + " ");                
            }
            out.println();
        }

        out.close();
    }
    
    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
