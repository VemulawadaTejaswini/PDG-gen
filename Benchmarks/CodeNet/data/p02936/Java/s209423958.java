import java.util.*;
import java.io.*;

class Node {
    int value = 0;
    List<Node> children = new ArrayList<Node>();
}

class Main {
    static void dfs(Node v, Node parent, int sum) {
        v.value += sum;
        for (Node u: v.children) {
            if (u != parent) {
                dfs(u, v, v.value);
            }
        }
    }

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int Q = sc.nextInt();
        Node V[] = new Node[N + 1];
        for (int i = 1; i <= N; i++) {
            V[i] = new Node();
        }
        for (int i = 1; i <= N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            V[a].children.add(V[b]);
            V[b].children.add(V[a]);
        }
        for (int i = 1; i <= Q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            V[p].value += x;
        }
        dfs(V[1], null, 0);
        System.out.print(V[1].value);
        for (int i = 2; i <= N; i++) {
            System.out.print(" " + V[i].value);
        }
        System.out.println();
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
