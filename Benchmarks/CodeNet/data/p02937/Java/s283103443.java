import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(calc(s1, s2));
    }

    public static int calc(String s1, String s2) {

        for (int i = 0; i < s2.length(); i++) {
            if (!s1.contains(String.valueOf(s2.charAt(i)))) {
                return -1;
            }
        }

        int result = 0;
        // String search = s1;
        //
        // for (int i = 0; i < s2.length(); i++) {
        //
        // int index = search.indexOf(s2.charAt(i));
        // if (index < 0) {
        // search += s1;
        // index = search.indexOf(s2.charAt(i));
        // }
        // result += (index + 1);
        // if (search.length() >= index + 1) {
        // search = search.substring(index + 1);
        // } else {
        // search += s1;
        // }
        // }

        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        for (int i = 0; i < s2.length(); i++) {

            String search = sb.toString();
            int index = search.indexOf(s2.charAt(i));
            if (index < 0) {
                sb.append(s1);
                index = sb.toString().indexOf(s2.charAt(i));
                search = sb.toString();
            }
            System.out.println("s=" + s2.charAt(i) + " " + sb.toString() + " index=" + (index + 1));

            result += (index + 1);
            if (search.length() >= index + 1) {
                // search = search.substring(index + 1);
                sb = sb.delete(0, index + 1);
            }

        }

        return result;
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

    private boolean isPrintableChar(int c) {
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
        return (int)nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
