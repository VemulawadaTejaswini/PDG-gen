import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        HashSet<Integer>[] children = new HashSet[n];
        LinkedList<Integer>[] leafChildren = new LinkedList[n];
        HashSet<Integer> leafParents = new HashSet<>();
        HashSet<Integer> leafs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            children[i] = new HashSet<>();
            leafChildren[i] = new LinkedList<>();
            leafs.add(i);
        }
        int[] parent = new int[n];
        for (int i = 1; i < n; i++) {
            int p = fsc.nextInt() - 1;
            parent[i] = p;
            children[p].add(i);
            leafs.remove(p);
        }
        for (int e : leafs) {
            leafParents.add(parent[e]);
            leafChildren[parent[e]].addLast(e);
        }
        int rank = 0;
        int matches = 0;
        while (matches < n - 1) {
            HashSet<Integer> lpcp = new HashSet<>(leafParents);
            for (int p : lpcp) {
                int child = leafChildren[p].removeFirst();
                children[p].remove(child);
                if (leafChildren[p].size() == 0) {
                    leafParents.remove(p);
                }
                if (children[p].size() == 0) {
                    leafParents.remove(p);
                    leafParents.add(parent[p]);
                    leafChildren[parent[p]].addLast(p);
                }
                matches++;
            }
            rank++;
        }
        System.out.println(rank);
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
