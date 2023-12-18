import java.io.*;
import java.util.*;

public class Main {
    final static long MOD07 = 1_000_000_007;
    final static long MOD09 = 1_000_000_009;

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = fs.nextInt();
        List<Pair<Long, Long>> lr = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            lr.add(new Pair(fs.nextLong(), fs.nextLong()));
        }
        long max = 0;
        Collections.sort(lr, (p1, p2) -> (int) ((-(p1.s - p1.f) + (p2.s - p2.f))));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (((p1.s - p1.f) - (p2.s - p2.f))));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (p1.f - p2.f));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (-p1.f + p2.f));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (p1.s - p2.s));
        max = Math.max(max, getMax(lr));
        Collections.sort(lr, (p1, p2) -> (int) (-p1.s + p2.s));
        max = Math.max(max, getMax(lr));

        out.println(max);
        out.flush();
    }

    public static long getMax(List<Pair<Long, Long>> lr) {
        long aLeft = lr.get(0).f;
        long aRight = lr.get(0).s;
        long bLeft = lr.get(1).f;
        long bRight = lr.get(1).s;
        int aSize = 1;
        int bSize = 1;

        for (int i = 2; i < lr.size(); i++) {
            // what if putting to a
            long li = lr.get(i).f;
            long ri = lr.get(i).s;
            long newALeft = Math.max(aLeft, li);
            long newARight = Math.min(aRight, ri);
            long scoreA = (newARight - newALeft) + (bRight - bLeft) + 2;

            long newBLeft = Math.max(bLeft, li);
            long newBRight = Math.min(bRight, ri);
            long scoreB = (aRight - aLeft) + (newBRight - newBLeft) + 2;

            if (scoreA == scoreB) {
                if (aSize > bSize) {
                    bSize++;
                    bLeft = newBLeft;
                    bRight = newBRight;
                } else {
                    aSize++;
                    aLeft = newALeft;
                    aRight = newARight;
                }
                continue;
            }

            if (scoreA > scoreB) {
                aSize++;
                aLeft = newALeft;
                aRight = newARight;
            } else {
                bSize++;
                bLeft = newBLeft;
                bRight = newBRight;
            }
        }

        return (aRight - aLeft) + (bRight - bLeft) + 2;
    }


    static class Pair<F extends Comparable<F>, S extends Comparable<S>> implements Comparable<Pair<F, S>> {
        F f;
        S s;

        Pair() {
        }

        Pair(F f, S s) {
            this.f = f;
            this.s = s;
        }

        Pair(Pair<F, S> p) {
            f = p.f;
            s = p.s;
        }

        @Override
        public int compareTo(Pair<F, S> p) {
            if (f.compareTo(p.f) != 0) {
                return f.compareTo(p.f);
            }
            return s.compareTo(p.s);
        }

        @Override
        public int hashCode() {
            return f.hashCode() ^ s.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.f == null || this.s == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            Pair p = (Pair) o;
            return this.f.equals(p.f) && this.s.equals(p.s);
        }

        @Override
        public String toString() {
            return "{" + f.toString() + ", " + s.toString() + "}";
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

    private boolean isPrintableChar(int c) {
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