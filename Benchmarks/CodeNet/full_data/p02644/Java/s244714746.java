import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception {}
    void solve(int TC) throws Exception{
        int H = ni(), W = ni(), K = ni();
        int[] src = new int[]{ni()-1, ni()-1}, dest = new int[]{ni()-1, ni()-1};
        LST[] row = new LST[H], col = new LST[W];
        for(int i = 0; i< H; i++){
            row[i] = new LST(W);
            row[i].setRange(W);
        }
        for(int i = 0; i< W; i++){
            col[i] = new LST(H);
            col[i].setRange(H);
        }
        boolean[][] leaf = new boolean[H][W];
        for(int i = 0; i< H; i++){
            String s = n();
            for(int j = 0; j< W; j++)leaf[i][j] = s.charAt(j) == '@';
        }
        Queue<int[]> q = new LinkedList<>();

        int[][] dist = new int[H][W];
        for(int i = 0; i< H; i++)Arrays.fill(dist[i], 5*H*W);
        dist[src[0]][src[1]] = 0;
        q.add(src);
        row[src[0]].unset(src[1]);
        col[src[1]].unset(src[0]);
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            for(int prv = row[r].prev(c); prv != -1 && c-prv <= K; prv = row[r].prev(prv)){
                if(leaf[r][prv])break;
                dist[r][prv] = dist[r][c]+1;
                row[r].unset(prv);
                col[prv].unset(r);
                q.add(new int[]{r, prv});
            }
            for(int nxt = row[r].next(c); nxt != -1 && nxt-c <= K; nxt = row[r].next(nxt)){
                if(leaf[r][nxt])break;
                dist[r][nxt] = dist[r][c]+1;
                row[r].unset(nxt);
                col[nxt].unset(r);
                q.add(new int[]{r, nxt});
            }

            for(int prv = col[c].prev(r); prv != -1 && r-prv <= K; prv = col[c].prev(prv)){
                if(leaf[prv][c])break;
                dist[prv][c] = dist[r][c]+1;
                row[prv].unset(c);
                col[c].unset(prv);
                q.add(new int[]{prv, c});
            }
            for(int nxt = col[c].next(r); nxt != -1 && nxt-r <= K; nxt = col[c].next(nxt)){
                if(leaf[nxt][c])break;
                dist[nxt][c] = dist[r][c]+1;
                row[nxt].unset(c);
                col[c].unset(nxt);
                q.add(new int[]{nxt, c});
            }
        }
        if(dist[dest[0]][dest[1]] == 5*H*W)pn(-1);
        else pn(dist[dest[0]][dest[1]]);
    }
    class LST {
        public long[][] set;
        public int n;

        public LST(int n) {
            this.n = n;
            int d = 1;
            for(int m = n;m > 1;m>>>=6, d++);
            set = new long[d][];
            for(int i = 0, m = n>>>6;i < d;i++, m>>>=6)set[i] = new long[m+1];
        }
        // [0,r)
        public LST setRange(int r){
            for(int i = 0;i < set.length;i++, r=r+63>>>6){
                for(int j = 0;j < r>>>6;j++){
                    set[i][j] = -1L;
                }
                if((r&63) != 0)set[i][r>>>6] |= (1L<<r)-1;
            }
            return this;
        }
        // [0,r)
        public LST unsetRange(int r){
            if(r >= 0){
                for(int i = 0;i < set.length;i++, r=r+63>>>6){
                    for(int j = 0;j < r+63>>>6;j++){
                        set[i][j] = 0;
                    }
                    if((r&63) != 0)set[i][r>>>6] &= ~((1L<<r)-1);
                }
            }
            return this;
        }

        public LST set(int pos){
            if(pos >= 0 && pos < n){
                for(int i = 0;i < set.length;i++, pos>>>=6){
                    set[i][pos>>>6] |= 1L<<pos;
                }
            }
            return this;
        }

        public LST unset(int pos){
            if(pos >= 0 && pos < n){
                for(int i = 0;i < set.length && (i == 0 || set[i-1][pos] == 0L);i++, pos>>>=6){
                    set[i][pos>>>6] &= ~(1L<<pos);
                }
            }
            return this;
        }

        public boolean get(int pos){
            return pos >= 0 && pos < n && set[0][pos>>>6]<<~pos<0;
        }

        public LST toggle(int pos){
            return get(pos) ? unset(pos) : set(pos);
        }

        public int prev(int pos){
            for(int i = 0;i < set.length && pos >= 0;i++, pos>>>=6, pos--){
                int pre = prev(set[i][pos>>>6], pos&63);
                if(pre != -1){
                    pos = pos>>>6<<6|pre;
                    while(i > 0)pos = pos<<6|63-Long.numberOfLeadingZeros(set[--i][pos]);
                    return pos;
                }
            }
            return -1;
        }

        public int next(int pos){
            for(int i = 0;i < set.length && pos>>>6 < set[i].length;i++, pos>>>=6, pos++){
                int nex = next(set[i][pos>>>6], pos&63);
                if(nex != -1){
                    pos = pos>>>6<<6|nex;
                    while(i > 0)pos = pos<<6|Long.numberOfTrailingZeros(set[--i][pos]);
                    return pos;
                }
            }
            return -1;
        }

        private int prev(long set, int n){
            long h = set<<~n;
            if(h == 0L)return -1;
            return -Long.numberOfLeadingZeros(h)+n;
        }

        private int next(long set, int n){
            long h = set>>>n;
            if(h == 0L)return -1;
            return Long.numberOfTrailingZeros(h)+n;
        }
        @Override
        public String toString(){
            List<Integer> list = new ArrayList<Integer>();
            for(int pos = next(0);pos != -1;pos = next(pos+1)){
                list.add(pos);
            }
            return list.toString();
        }
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    static void debug(Object... o){System.out.println(Arrays.deepToString(o));}
    final long IINF = (long)2e18;
    final int INF = (int)1e9+2;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-8;
    static boolean multipleTC = false, memory = false, fileIO = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        long ct = System.currentTimeMillis();
        if (fileIO) {
            in = new FastReader("");
            out = new PrintWriter("");
        } else {
            in = new FastReader();
            out = new PrintWriter(System.out);
        }
        //Solution Credits: Taranpreet Singh
        int T = multipleTC? ni():1;
        pre();
        for (int t = 1; t <= T; t++) solve(t);
        out.flush();
        out.close();
        System.err.println(System.currentTimeMillis() - ct);
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    int[][] make(int n, int[] from, int[] to, int e, boolean f){
        int[][] g = new int[n][];int[]cnt = new int[n];
        for(int i = 0; i< e; i++){
            cnt[from[i]]++;
            if(f)cnt[to[i]]++;
        }
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]];
        for(int i = 0; i< e; i++){
            g[from[i]][--cnt[from[i]]] = to[i];
            if(f)g[to[i]][--cnt[to[i]]] = from[i];
        }
        return g;
    }
    int[][][] makeS(int n, int[] from, int[] to, int e, boolean f){
        int[][][] g = new int[n][][];int[]cnt = new int[n];
        for(int i = 0; i< e; i++){
            cnt[from[i]]++;
            if(f)cnt[to[i]]++;
        }
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]][];
        for(int i = 0; i< e; i++){
            g[from[i]][--cnt[from[i]]] = new int[]{to[i], i, 0};
            if(f)g[to[i]][--cnt[to[i]]] = new int[]{from[i], i, 1};
        }
        return g;
    }
    int find(int[] set, int u){return set[u] = (set[u] == u?u:find(set, set[u]));}
    int digit(long s){int ans = 0;while(s>0){s/=10;ans++;}return ans;}
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object o){out.print(o);}
    void pn(Object o){out.println(o);}
    void pni(Object o){out.println(o);out.flush();}
    String n()throws Exception{return in.next();}
    String nln()throws Exception{return in.nextLine();}
    int ni()throws Exception{return Integer.parseInt(in.next());}
    long nl()throws Exception{return Long.parseLong(in.next());}
    double nd()throws Exception{return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next() throws Exception{
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }

        String nextLine() throws Exception{
            String str;
            try{
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }
            return str;
        }
    }
}