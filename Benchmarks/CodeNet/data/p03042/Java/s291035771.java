import java.util.*;
import java.io.*;

public class Main implements Runnable {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        // keep stack
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    public void run() {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        String S = sc.next();

        if (isYYMM(S) && isMMYY(S)) {
            out.printf("AMBIGUOUS\n");
        } else if (isYYMM(S)) {
            out.printf("YYMM\n");
        } else if (isMMYY(S)) {
            out.printf("MMYY\n");
        } else {
            out.printf("NA\n");
        }
        out.flush();
    }
    boolean isYYMM(String S) {
        if (isYY(S.substring(0, 2)) && isMM(S.substring(2))) {
            return true;
        }
        return false;
    }
    boolean isMMYY(String S) {
        if (isMM(S.substring(0, 2)) && isYY(S.substring(2))) {
            return true;
        }
        return false;
    }
    boolean isYY(String S) {
        int YY = Integer.parseInt(S);
        if (0 <= YY && YY <= 99) {
            return true;
        }
        return false;
    }
    boolean isMM(String S) {
        int MM = Integer.parseInt(S);
        if (1 <= MM && MM <= 12) {
            return true;
        }
        return false;
    }
}

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
        }
        else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
    }

    public boolean hasNext() {
        skipUnprintable();
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

    public int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int n = 0;
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
}