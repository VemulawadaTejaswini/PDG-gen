import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        UnionFindTree uft = new UnionFindTree(n);
        for(int i=0; i<m; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int z = sc.nextInt();

            uft.unite(x, y);
        }

        int ans = 0;
        boolean[] used = new boolean[n];
        for(int i=0; i<n; i++){
            int par = uft.find(i);
            if(!used[par]){
                used[par] = true;
                ans++;
            }
        }

        System.out.println(ans);
    }

    private static class FastScanner {
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
}

//蟻本p84

class UnionFindTree{
    int[] par;
    int[] rank;

    public UnionFindTree(int size){
        par = new int[size];
        rank = new int[size];
        for(int i=0; i<size; i++){
            par[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x){
        if(par[x] == x){
            return x;
        }else {
            return par[x] = find(par[x]);
        }
    }

    public void unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x == y) return;

        if(rank[x] < rank[y]){
            par[x] = y;
        }else{
            par[y] = x;
            if(rank[x] == rank[y]) rank[x]++;
        }
    }

    public boolean same(int x, int y){
        return find(x) == find(y);
    }
}