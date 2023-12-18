import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        long h = sc.nextInt();
        long w = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        long[] J = new long[10];

        Map<Pair, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = -1; j <= 1; j++) {
                for (int k = -1; k <= 1; k++) {
                    Pair p = new Pair(a[i] + j, b[i] + k);
                    if (2 <= p.fst && p.fst <= h - 1 && 2 <= p.snd && p.snd <= w - 1) {
                        map.put(p, (map.containsKey(p) ? map.get(p) : 0) + 1);
                    }
                }
            }
        }

        J[0] = (h - 2) * (w - 2) - map.size();
        for (int i : map.values()) {
            J[i]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(J[i]);
        }
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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

class Pair {

    public int fst;
    public int snd;

    public Pair(int fst, int snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public Pair(List<Integer> list) {
        this.fst = list.get(0);
        this.snd = list.get(1);
    }

    public Pair(int[] array) {
        this.fst = array[0];
        this.snd = array[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair pair = (Pair) o;

        return fst == pair.fst && snd == pair.snd;

    }

    @Override
    public int hashCode() {
        int result = fst;
        result = 31 * result + snd;
        return result;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }

    public void swap() {
        int swap = fst;
        fst = snd;
        snd = swap;
    }
}