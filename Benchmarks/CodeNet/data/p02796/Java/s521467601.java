import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
    void solve(int TC)throws Exception {
        int n = ni();
        long[][] p = new long[n][];
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i< n; i++){
            long x = nl(), l = nl();
            p[i] = new long[]{x-l+1, x+l-1};
            set.add(x-l+1);
            set.add(x+l-1);
        }
        HashMap<Long, Integer> mp = new HashMap<>();
        int c = 0;
        for(long l:set)mp.put(l, c++);
        int[][] pp = new int[n][2];
        for(int i = 0; i< n; i++){
            pp[i][0] = mp.get(p[i][0]);
            pp[i][1] = mp.get(p[i][1]);
        }
        Arrays.sort(pp, (int[] i1, int[] i2) -> Integer.compare(i1[0], i2[0]));
        c++;
        SegTree t = new SegTree(c);
        t.u(c-1, 0);
        int ans = 0;
        for(int i = n-1; i>= 0; i--){
            int x = t.min(pp[i][1]+1, c-1);
            t.u(pp[i][0], x+1);
        }
        pn(t.min(0, c-1));
    }
    class SegTree{
        int m = 1;
        int[] t;
        public SegTree(int n){
            while(m<n)m<<=1;
            t = new int[m<<1];
        }
        void u(int p, int x){
            t[p+=m] = x;
            for(p>>=1; p>0; p>>=1)t[p] = Math.max(t[p<<1],t[p<<1|1]);
        }
        int min(int l, int r){
            if(l>r)return 0;
            return min(l, r, 0, m-1, 1);
        }
        int min(int l, int r, int ll, int rr, int i){
            if(l == ll && r == rr)return t[i];
            int mid = (ll+rr)>>1;
            if(r <= mid)return min(l, r, ll, mid, i<<1);
            else if(l> mid)return min(l, r, mid+1, rr, i<<1|1);
            else return Math.max(min(l, mid, ll, mid, i<<1), min(mid+1, r, mid+1, rr, i<<1|1));
        }
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    long IINF = (long)1e15;
    final int INF = (int)1e9+2, MX = (int)2e6+5;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-7;
    static boolean multipleTC = false, memory = false, fileIO = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        if(fileIO){
            in = new FastReader("threesum.in");
            out = new PrintWriter("threesum.out");
        }else {
            in = new FastReader();
            out = new PrintWriter(System.out);
        }
        //Solution Credits: Taranpreet Singh
        int T = (multipleTC)?ni():1;
        pre();
        for(int t = 1; t<= T; t++)solve(t);
        out.flush();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
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
            String str = "";
            try{
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }
            return str;
        }
    }
}