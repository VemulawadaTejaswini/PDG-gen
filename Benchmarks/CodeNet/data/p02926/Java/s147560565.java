/**
 * Dennis Lo
 * 09/01/2019
 */

import java.util.*;
import java.io.*;

class Main {
    FileInputStream fs;
    InputStream is;
    PrintWriter out;
    String INPUT = "";

    class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        void update(Point p) {
            x += p.x;
            y += p.y;
        }
        double getDist() {
            return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }
    }

    void solve() {
        int n = ni();
        Point[] p = new Point[n];

        for(int i = 0; i < n; i++) {
            p[i] = new Point(ni(), ni());
        }

        Point[][] dp = new Point[n][4];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 4; j++) {
                dp[i][j] = new Point(0, 0);
            }
        }

        for(int i = 0; i < n; i++) {
            if(i > 0) {
                for(int j = 0; j < 4; j++) {
                    dp[i][j] = dp[i - 1][j];
                }
            }

            if(p[i].x + p[i].y > 0) {
                dp[i][0].update(p[i]);
            }
            if(-p[i].x - p[i].y > 0) {
                dp[i][2].update(p[i]);
            }
            if(-p[i].x + p[i].y > 0) {
                dp[i][1].update(p[i]);
            }
            if(p[i].x - p[i].y > 0) {
                dp[i][3].update(p[i]);
            }
        }

        double max = 0.0;
        for(int i = 0; i < 4; i++) {
            out.println(dp[n - 1][i].getDist());
            max = Math.max(max, dp[n - 1][i].getDist());
        }
        out.println(max);
    }

    /*
     ** Credit to Uwi Tenpen for fast I/O **
     */
    void run() throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);

        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty()) {
            tr(System.currentTimeMillis() - s + "ms");
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;

    private int readByte() {
        if(lenbuf == -1) {
            throw new InputMismatchException();
        }
        if(ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch(IOException e) {
                throw new InputMismatchException();
            }
            if(lenbuf <= 0) {
                return -1;
            }
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private int skip() {
        int b;
        while((b = readByte()) != -1 && isSpaceChar(b)) ;
        return b;
    }

    private double nd() {
        return Double.parseDouble(ns());
    }

    private char nc() {
        return (char) skip();
    }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for(int i = 0; i < n; i++) {
            map[i] = ns(m);
        }
        return map;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = ni();
        }
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
        if(b == '-') {
            minus = true;
            b = readByte();
        }

        while(true) {
            if(b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
        if(b == '-') {
            minus = true;
            b = readByte();
        }

        while(true) {
            if(b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private void tr(Object... o) {
        if(INPUT.length() > 0) {
            System.out.println(Arrays.deepToString(o));
        }
    }
}
