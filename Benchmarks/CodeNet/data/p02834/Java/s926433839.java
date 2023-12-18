import java.io.*;
import java.util.*;

import javax.xml.crypto.NodeSetData;

class Main{

    void solve(){
        int N = ni();
        int u = ni()-1;
        int v = ni()-1;
        ArrayList<ArrayList<Integer>> nodes  = new ArrayList<>();
        for(int i=0; i<N; i++){
            nodes .add(new ArrayList<>());
        }
        for(int i=0; i<N-1; i++){
            int a = ni()-1;
            int b = ni()-1;
            nodes.get(a).add(b);
            nodes.get(b).add(a);
        }
        int[] dfromt = new int[N];
        int[] dfroma = new int[N];
        Arrays.fill(dfromt, -1);
        Arrays.fill(dfroma, -1);
        Deque<Integer> que = new ArrayDeque<>();
        que.add(u);
        dfromt[u] = 0;
        while(!que.isEmpty()){
            int curr = que.removeFirst();
            for (Integer next : nodes.get(curr)) {
                if(dfromt[next] ==-1) {
                    dfromt[next] = dfromt[curr]  + 1;
                    que.addLast(next);
                }
            }
        }
        que.add(v);
        dfroma[v]  =0;
        while(!que.isEmpty()){
            int curr = que.removeFirst();
            for (Integer next : nodes.get(curr)) {
                if(dfroma[next] ==-1){
                    dfroma[next] = dfroma[curr]  + 1;
                    que.addLast(next);
                }
            }
        }

        // System.out.println(Arrays.toString(dfroma));
        // System.out.println(Arrays.toString(dfromt));
        int ans = 0;
        for(int i=0; i<N; i++){
            if(dfroma[i] > dfromt[i]) ans = Math.max(ans,dfroma[i]);   
        }

        out.println(ans-1);
        out.flush();
    } 


    public static void main(String[] args){
        Main m = new Main();
        m.solve();
    }

    Main(){
        this.scan = new FastScanner();
        this.out = new PrintWriter(System.out);
    }

    private FastScanner scan;
    private PrintWriter out;
    private final int MOD = 1_000_000_007;
    private final int INF = 2_147_483_647;
    private final long LINF = 9223372036854775807L;

    // Scanner
    int ni(){ return scan.nextInt();}
    int[] ni(int n){int[] a = new int[n]; for(int i = 0; i < n; i++){a[i] = ni();} return a;}
    int[][] ni(int y, int x){int[][] a = new int[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ni();}} return a;}
    long nl(){return scan.nextLong();}
    long[] nl(int n){long[] a = new long[n]; for(int i = 0; i < n; i++){a[i] = nl();} return a;}
    long[][] nl(int y, int x){long[][] a = new long[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = nl();}} return a;}
    String ns(){return scan.next();}
    String[] ns(int n){String[] a = new String[n]; for(int i = 0; i < n; i++){a[i] = ns();} return a;}
    String[][] ns(int y, int x){String[][] a = new String[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ns();}} return a;}
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