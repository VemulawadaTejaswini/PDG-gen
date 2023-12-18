import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] teleportDestArray = new int[n];
        for (int i = 0; i < n; i++) {
            teleportDestArray[i] = sc.nextInt();
        }
        List<Integer> roadList = new ArrayList<>();
        roadList.add(1);
        int breakPoint = 0;
        Integer breakTown = 0;
        for (int i = 0; i < teleportDestArray.length; i++) {
            if (!roadList.contains(teleportDestArray[(roadList.get(roadList.size() - 1) - 1)])) {
                roadList.add(teleportDestArray[(roadList.get(roadList.size() - 1) - 1)]);
                breakPoint++;
            } else {
                breakTown = teleportDestArray[(roadList.get(roadList.size() - 1) - 1)];
                break;
            }
        }
        int loopTownCount = breakPoint + 1 - roadList.indexOf(breakTown);
        if (k < breakPoint) {
            System.out.println(roadList.get((int) k));
            return;
        }
        long remainder = (k - (breakPoint + 1 - loopTownCount)) % loopTownCount;
        System.out.println(roadList.get(breakPoint + 1 - loopTownCount + (int) remainder));
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