import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String t = sc.next();
        long k = sc.nextLong();
        int n = t.length();
        List<Integer> list = new ArrayList<>();
        int cnt = 1;
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (t.charAt(i) == t.charAt(i + 1)) {
                cnt++;
                continue;
            }
            list.add(cnt);
            cnt = 1;
        }
        list.add(cnt);
        // System.out.println(list);

        if (list.size() == 1) {
            ans = k * list.get(0) / 2;
            System.out.println(ans);
            return;
        }

        ans += list.get(0) / 2;
        ans += list.get(list.size() - 1) / 2;

        if (list.size() == 2) {
            System.out.println(k * ans);
            return;
        }

        if (t.charAt(0) == t.charAt(n - 1)) {
            ans += (k - 1) * (list.get(0) + list.get(list.size() - 1)) / 2;
        }

        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) < 2) {
                continue;
            }
            ans += k * (list.get(i) / 2);
        }

        System.out.println(ans);
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
