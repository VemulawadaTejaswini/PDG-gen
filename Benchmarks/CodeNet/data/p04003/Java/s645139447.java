import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] r = new int[m][3];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> rmap = new HashMap<Integer, Integer>();
        int[] c = new int[2000000];
        int mapCount = 0;
        for(int i=0; i<m; i++){
            r[i][0] = sc.nextInt()-1;
            r[i][1] = sc.nextInt()-1;
            r[i][2] = sc.nextInt()-1;
            if(c[r[i][2]] == 0){
                map.put(mapCount, r[i][2]);
                rmap.put(r[i][2], mapCount);
                mapCount++;
            }
            c[r[i][2]]++;
        }

        c = null;

        ArrayList[] al = new ArrayList[mapCount];
        HashSet[] hs = new HashSet[mapCount];
        for(int i=0; i<mapCount; i++){
            al[i] = new ArrayList<Integer>();
            hs[i] = new HashSet<Integer>();
        }

        for(int i=0; i<m; i++){
            al[rmap.get(r[i][2])].add(i);
            hs[rmap.get(r[i][2])].add(r[i][0]);
            hs[rmap.get(r[i][2])].add(r[i][1]);
        }

        ArrayList[] cdata = new ArrayList[m];
        ArrayList[] stdata = new ArrayList[n];
        for(int i=0; i<m; i++){
            cdata[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<n; i++){
            stdata[i] = new ArrayList<Integer>();
        }

        int cdataCount = 0;

        for(int i=0; i<mapCount; i++){
            HashMap<Integer, Integer> mhm = new HashMap<Integer, Integer>();
            int mc = 0;
            for (Object mi : hs[i]) {
                mhm.put((int)mi, mc);
                mc++;
            }
            UnionFindTree uf = new UnionFindTree(mc);
            for(Object mal : al[i]){
                uf.unite(mhm.get(r[(int)mal][0]), mhm.get(r[(int)mal][1]));
            }

            HashMap<Integer, Integer> mcdata = new HashMap<Integer, Integer>();
            for(Object omst : hs[i]){
                int mst = (int)omst;
                int mmst = mhm.get(mst);
                if(mcdata.containsKey(uf.find(mmst))){
                    cdata[mcdata.get(uf.find(mmst))].add(mst);
                    stdata[mst].add(mcdata.get(uf.find(mmst)));
                }else{
                    mcdata.put(uf.find(mmst), cdataCount);
                    cdata[cdataCount].add(mst);
                    stdata[mst].add(cdataCount);
                    cdataCount++;
                }
            }

            al[i] = null;
            hs[i] = null;
        }

        int[] len = new int[n];
        boolean[] check = new boolean[n];
        ArrayDeque<Integer> que = new ArrayDeque<Integer>();
        Arrays.fill(len, -1);
        len[0] = 0;
        check[0] = true;
        que.add(0);
        while (!que.isEmpty()) {
            int mpos = que.poll();
            for(Object mc : stdata[mpos]){
                for(Object omst : cdata[(int)mc]){
                    int mst = (int)omst;
                    if(!check[mst]){
                        len[mst] = len[mpos]+1;
                        check[mst] = true;
                        que.add(mst);
                    }
                }
            }
        }

        System.out.println(len[n-1]);
    }
}

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
