import java.io.*;
import java.util.*;

class MyScanner {
    private final InputStream in = System.in;
    private final byte[] buf = new byte[1024];
    private int p = 0;
    private int len = 0;
    private boolean hasNextByte() {
        if (p < len) {
            return true;
        }
        else {
            p = 0;
            try {
                len = in.read(buf);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return len >= 1;
        }
    }
    private int readByte() {
        if (hasNextByte()) {
            return buf[p++];
        }
        else {
            return -1;
        }
    }
    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buf[p])) p++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b;
        while (isPrintableChar(b = readByte())) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args){
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        Integer[][] a = new Integer[62][n + 1];
        int t = 1;
        for (int i = 1; i <= n; i++) a[0][i] = Integer.parseInt(sc.next());
        for (int i = 0; i < 61; i++) {
            for (int j = 1; j <= n; j++) {
                a[i + 1][j] = a[i][a[i][j]];
            }
            if ((k >> i & 1) == 1) t = a[i][t];
        }
        out.println(t);
        out.flush();
    }
}