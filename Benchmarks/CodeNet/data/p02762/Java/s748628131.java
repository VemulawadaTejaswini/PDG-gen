
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static class Root {
        int root;
        int size;
        Root (int root) {
            this.root = root;
            this.size = 1;
        }
    }

    static Root find(int i) {
        if(roots[i].root == i) {
            return roots[i];
        }
        roots[i].root = roots[roots[i].root].root;
        return find(roots[i].root);
    }

    static void union(Root a, Root b) {
        if(a.root == b.root) return;
        if(a.size < b.size){
            a.root = b.root;
            b.size += a.size;
        } else {
            b.root = a.root;
            a.size += b.size;
        }
    }

    static Root[] roots;

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        FastScanner scan = new FastScanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();
        roots = new Root[N];
        int[] friends = new int[N];
        int[] blocks = new int[N];
        for(int i = 0; i < N; i++) {
            roots[i] = new Root(i);
        }

        for(int i = 0; i < M; i++) {
            int A = scan.nextInt()-1;
            int B = scan.nextInt()-1;
            friends[A]++;
            friends[B]++;
            Root rootA = find(A);
            Root rootB = find(B);
            union(rootA, rootB);
        }

        for(int i = 0; i < K; i++) {
            int C = scan.nextInt()-1;
            int D = scan.nextInt()-1;
            Root rootC = find(roots[C].root);
            Root rootD = find(roots[D].root);
            if(rootC.root == rootD.root) {
                blocks[C]++;
                blocks[D]++;
            }
        }

        for(int i = 0; i < N; i++) {
            Root root = find(i);
            int possible = root.size - friends[i] - blocks[i] - 1;
            os.print(possible);
            if(i != N-1)
                os.print(" ");
        }
        os.println();
    }
}

class FastScanner {
    private final InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    FastScanner(InputStream is) {
        in = is;
    }
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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
    public double nextDouble() { return Double.parseDouble(next());}
}