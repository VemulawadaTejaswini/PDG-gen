import java.util.*;
import java.io.*;
import java.text.*;

class Main{
    //SOLUTION BEGIN
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int N = ni();
        int mx = (int)1e5+2;
        boolean[] sieve = new boolean[mx];
        int[] list = new int[mx];
        long[] sqpr = new long[mx];
        int c = 0;
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;
        sqpr[1] = 1;
        for(int p = 2; p < mx; p++) {
            sqpr[p] = p*(long)p;
            if (sieve[p]) {
                if (p < 2200) list[c++] = p;
                for (int q = p + p; q < mx; q += p)
                    sieve[q] = false;
            }
        }
        list = Arrays.copyOf(list, c);
        long[] A = new long[N];
        long MAX = (long)1e10+2;

        TreeMap<Long, Integer> mp = new TreeMap<>();
        TreeMap<Long, Long> con = new TreeMap<>();
        for(int i = 0; i< N; i++){
            A[i] = nl();
            long x = A[i];
            long norm = 1, conj = 1;
            for(int p:list){
                int cnt = 0;
                while(x%p == 0){x /= p;cnt++;}
                cnt %= 3;
                if(cnt == 0)continue;
                if(cnt == 1){
                    norm *= p;
                    conj = mul(conj, p, MAX);
                    conj = mul(conj, p, MAX);
                }else if(cnt == 2){
                    norm *= p*p;
                    conj = mul(conj, p, MAX);
                }
            }
            if(x > 1){
                int ind = Arrays.binarySearch(sqpr, x);
                if(ind == -1{
                    norm *= x;
                    conj = mul(conj, x, MAX);
                    conj = mul(conj, x, MAX);
                }else{
                    norm *= x;
                    conj = mul(conj, ind, MAX);
                }
            }
            mp.put(norm, mp.getOrDefault(norm, 0)+1);
            con.put(norm, conj);
        }
        int ans = 0;
        for(Map.Entry<Long, Integer> e:mp.entrySet()){
            long norm = e.getKey();
            long conj = con.get(norm);
            int c1 = mp.getOrDefault(norm, 0), c2 = mp.getOrDefault(conj, 0);
            if(norm == conj){
                ans++;
            }else if(norm < conj)ans += Math.max(c1, c2);
        }
        pn(ans);
    }
    long sq(long x){
        long s = (long)Math.sqrt(x);
        while (s*s >= x)s--;
        while ((s+1)*(s+1) <= x)s++;
        if(s*s == x)return s;
        return -1;
    }
    long mul(long x, long y, long MAX){
        if(MAX/x < y)return MAX;
        return x*y;
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    static void dbg(Object... o){System.err.println(Arrays.deepToString(o));}
    final long IINF = (long)1e17;
    final int INF = (int)1e9+2;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-8;
    static boolean multipleTC = false, memory = true, fileIO = false;
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
    int[][] make(int n, int e, int[] from, int[] to, boolean f){
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
    int[][][] makeS(int n, int e, int[] from, int[] to, boolean f){
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
    void p(Object... o){for(Object oo:o)out.print(oo+" ");}
    void pn(Object... o){for(int i = 0; i< o.length; i++)out.print(o[i]+(i+1 < o.length?" ":"\n"));}
    void pni(Object... o){for(Object oo:o)out.print(oo+" ");out.println();out.flush();}
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