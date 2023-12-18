import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    private static final long INF = Integer.MAX_VALUE;
    private static final int R = 0;
    private static final int C = 1;
    private Map<Long, Integer> idMap = new HashMap<>();
    private GraphL g = new GraphL();
    private Map<Integer, Long> nodeCost = new HashMap<>();
    private boolean ans = true;

    private long iToL(int fst, int snd) {
        return ((long) (fst) << 32) | (long) snd & 0xffffffffL;
    }

    private int getFst(long intPair) {
        return (int) (intPair >> 32);
    }

    private int getSnd(long intPair) {
        return (int) (intPair & 0xffffffffL);
    }

    private int toId(int fst, int snd) {
        long lid = iToL(fst, snd);
        Integer id = idMap.get(lid);
        if (id == null) {
            idMap.put(lid, id = idMap.size());
            g.assoc.add(new ArrayList<>());
        }
        return id;
    }

    private void solve() {
        FastScanner sc = new FastScanner();
        int rMax = sc.nextInt();
        int cMax = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int r = toId(R, sc.nextInt());
            int c = toId(C, sc.nextInt());
            int a = sc.nextInt();
            g.addEdge(r, c, a);
            g.addEdge(c, r, a);
        }
        for (Map.Entry<Long, Integer> e : idMap.entrySet()) {
            int i = e.getValue();
            if (nodeCost.containsKey(i)) continue;
            int rc = getFst(e.getKey());
            Pair p = dfs(i, 0, rc);
            ans &= p.fst + p.snd >= 0;
        }
        System.out.println(ans ? "Yes" : "No");
    }

    private Pair dfs(int i, long c, int rc) {
        nodeCost.put(i, c);
        Pair p = new Pair(rc == R ? c : INF, rc == C ? c : INF);
        for (long next : g.getNext(i)) {
            int j = getFst(next);
            long a = getSnd(next);
            if (nodeCost.containsKey(j)) {
                long d = nodeCost.get(j);
                ans &= d + c == a;
            } else {
                Pair q = dfs(j, a - c, 1 - rc);
                p.fst = Math.min(p.fst, q.fst);
                p.snd = Math.min(p.snd, q.snd);
            }
        }
        ans &= true;
        return p;
    }

    public static void main(String[] args) {
        new Main().solve();
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

    long fst;
    long snd;

    Pair(long fst, long snd) {
        this.fst = fst;
        this.snd = snd;
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

class GraphL {
    static long iToL(int fst, int snd) {
        return ((long) (fst) << 32) | (long) snd & 0xffffffffL;
    }

    static int getFst(long intPair) {
        return (int) (intPair >> 32);
    }

    static int getSnd(long intPair) {
        return (int) (intPair & 0xffffffffL);
    }

    List<List<Long>> assoc = new ArrayList<>();

    List<Long> getNext(int s) {
        return assoc.get(s);
    }

    void addEdge(int s, int t, int w) {
        assoc.get(s).add(iToL(t, w));
    }
}