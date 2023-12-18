import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int R = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();
        List<Triple> rc = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int a = sc.nextInt();
            rc.add(new Triple(r, c, a));
        }

        Map<Pair, Integer> rRule = new HashMap<>();
        Collections.sort(rc, (o1, o2) -> Integer.compare(o1.fst, o2.fst));
        int r = rc.get(0).fst;
        int c = rc.get(0).snd;
        int a = rc.get(0).trd;
        for (int i = 1; i < N; i++) {
            int r2 = rc.get(i).fst;
            int c2 = rc.get(i).snd;
            int a2 = rc.get(i).trd;
            if (r == r2) {
                if (!rRule.containsKey(new Pair(c, c2))) {
                    rRule.put(new Pair(c, c2), a2 - a);
                } else {
                    int d = rRule.get(new Pair(c, c2));
                    if (a2 - a != d) {
                        System.out.println("No");
                        return;
                    }
                }
            }
            r = r2;
            c = c2;
            a = a2;
        }

        Map<Pair, Integer> cRule = new HashMap<>();
        Collections.sort(rc, (o1, o2) -> Integer.compare(o1.snd, o2.snd));
        r = rc.get(0).fst;
        c = rc.get(0).snd;
        a = rc.get(0).trd;
        for (int i = 1; i < N; i++) {
            int r2 = rc.get(i).fst;
            int c2 = rc.get(i).snd;
            int a2 = rc.get(i).trd;
            if (c == c2) {
                if (!cRule.containsKey(new Pair(r, r2))) {
                    cRule.put(new Pair(r, r2), a2 - a);
                } else {
                    int d = cRule.get(new Pair(r, r2));
                    if (a2 - a != d) {
                        System.out.println("No");
                        return;
                    }
                }
            }
            r = r2;
            c = c2;
            a = a2;
        }
        
        System.out.println("Yes");
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

class Triple {

    public int fst;
    public int snd;
    public int trd;

    public Triple(int fst, int snd, int trd) {
        this.fst = fst;
        this.snd = snd;
        this.trd = trd;
    }

    public Triple(List<Integer> list) {
        this.fst = list.get(0);
        this.snd = list.get(1);
        this.trd = list.get(2);
    }

    public Triple(int[] array) {
        this.fst = array[0];
        this.snd = array[1];
        this.trd = array[2];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triple triple = (Triple) o;

        return fst == triple.fst && snd == triple.snd && trd == triple.trd;

    }

    @Override
    public int hashCode() {
        int result = fst;
        result = 31 * result + snd;
        result = 31 * result + trd;
        return result;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ", " + trd + ")";
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