import java.io.*;
import java.util.*;

class MyScanner {
    private final InputStream in = System.in;
    private final byte[] buf = new byte[1024];
    private int p = 0;
    private int len = 0;
    private boolean hasNextByte() {
        if (p >= len) {
            p = 0;
            try {
                len = in.read(buf);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return len >= 1;
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
        while (hasNextByte() && isPrintableChar(buf[p])) sb.appendCodePoint(buf[p++]);
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args){
        MyScanner sc = new MyScanner();
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] h = new Integer[n];
        for (int i = 0; i < n; i++) h[i] = Integer.parseInt(sc.next());
        Boolean[] f = new Boolean[n];
        Arrays.fill(f, true);
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            if (h[a] <= h[b]) {
                f[a] = false;
            }
            if (h[b] <= h[a]) {
                f[b] = false;
            }
        }
        int c = 0;
        for (boolean i : f){
            if (i) c++;
        }
        System.out.println(c);
    }
}