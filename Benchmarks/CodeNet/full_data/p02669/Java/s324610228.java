import java.io.*;
import java.util.*;
import java.math.BigInteger;

class Main{

    void solve(){
        int T = ni();
        for (int i = 0; i < T; i++) {
            long N = nl();
            long A = nl();
            long B = nl();
            long C = nl();
            long D = nl();
            PriorityQueue<Long> que = new PriorityQueue<>((x,y)->y.compareTo(x));
            que.add(N);
            HashMap<Long, Long> mincost = new HashMap<>();
            mincost.put(N,0L);
            while(que.size()>0){
                // System.out.println(mincost);
                long n = que.poll();
                long cost = mincost.get(n);
                long prev;
                long next;

                long next2d = n/2;
                if(!mincost.containsKey(next2d) && next2d!=0)  que.add(next2d);
                if(next2d==0) next = cost + D*n;
                else{
                    next = Long.MAX_VALUE;
                    if(cost + D * 1.0 * (n-next2d) < next) next = cost + D * (n-next2d);
                    if(cost + A + D * 1.0 *(n-2*next2d) < next) next = cost + A + D * (n-2*next2d);
                }
                prev = mincost.getOrDefault(next2d, Long.MAX_VALUE);
                mincost.put( next2d, Math.min(prev,next));
                
                long next2u = (n+1)/2;
                if(!mincost.containsKey(next2u) && next2u!=0)  que.add(next2u);
                if(next2u==0) next = cost + D*n;
                else {
                    next = Long.MAX_VALUE;
                    if(cost + D * 1.0 * (n-next2u) < next) next = cost + D * (n-next2u);
                    if(cost + A + D * 1.0 *(2*next2u-n) < next) next = cost + A + D * (2*next2u-n);
                }
                prev = mincost.getOrDefault(next2u, Long.MAX_VALUE);
                mincost.put( next2u, Math.min(prev,next));

                long next3d = n/3;
                if(!mincost.containsKey(next3d) && next3d!=0)  que.add(next3d);
                if(next3d==0) next = cost + D*n;
                else{
                    next = Long.MAX_VALUE;
                    if(cost + D * 1.0 * (n-next3d) < next) next = cost + D * (n-next3d);
                    if(cost + B + D * 1.0 *(n-3*next3d) < next) next = cost + B + D * (n-3*next3d);
                }
                prev = mincost.getOrDefault(next3d, Long.MAX_VALUE);
                mincost.put( next3d, Math.min(prev,next));

                long next3u = (n+3-1)/3;
                if(!mincost.containsKey(next3u) && next3u!=0)  que.add(next3u);
                if(next3u==0) next = cost + D*n;
                else {
                    next = Long.MAX_VALUE;
                    if(cost + D * 1.0 * (n-next3u) < next) next = cost + D * (n-next3u);
                    if(cost + B + D * 1.0 *(3*next3u-n) < next) next = cost + B + D * (3*next3u-n);
                }
                prev = mincost.getOrDefault(next3u, Long.MAX_VALUE);
                mincost.put( next3u, Math.min(prev,next));

                long next5d = n/5;
                if(!mincost.containsKey(next5d) && next5d!=0)  que.add(next5d);
                if(next5d==0) next = cost + D*n;
                else{
                    next = Long.MAX_VALUE;
                    if(cost + D * 1.0 * (n-next5d) < next) next = cost + D * (n-next5d);
                    if(cost + C + D * 1.0 *(n-5*next5d) < next) next = cost + C + D * (n-5*next5d);
                }
                prev = mincost.getOrDefault(next5d, Long.MAX_VALUE);
                mincost.put( next5d, Math.min(prev,next));

                long next5u = (n+5-1)/5;
                if(!mincost.containsKey(next5u) && next5u!=0)  que.add(next5u);
                if(next5u==0) next = cost + D*n;
                else {
                    next = Long.MAX_VALUE;
                    if(cost + D * 1.0 * (n-next5u) < next) next = cost + D * (n-next5u);
                    if(cost + C + D * 1.0 *(5*next5u-n) < next) next = cost + C + D * (5*next5u-n);
                }
                prev = mincost.getOrDefault(next5u, Long.MAX_VALUE);
                mincost.put( next5u, Math.min(prev,next));
            }
            out.println(mincost.get(0L));
        }
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
