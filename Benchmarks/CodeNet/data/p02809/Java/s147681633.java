import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
    void solve(int TC)throws Exception{
        int n = ni();
        int[] nxt = new int[1+n];
        for(int i = 1; i<= n; i++)nxt[i] = ni();
        int[] ans = new int[1+n];
        SegTree t = new SegTree(n);
        if(fill(ans, nxt, t, 1, -1)){
            for(int i = 1; i<= n; i++)p(ans[i]+" ");pn("");
        }else pn(-1);
    }
    boolean fill(int[] ans, int[] nxt, SegTree t, int ind, int p){
        if(ind >= ans.length)return true;
        int cur = t.nxt(0);
        while(cur < ans.length){
            t.upd(cur, false);
            ans[ind] = cur;
            if((p == -1 || nxt[p] != cur) && fill(ans, nxt, t, ind+1, cur))return true;
            int nn = t.nxt(cur);
            t.upd(cur, true);
            cur = nn;
        }
        return false;
    }
    class SegTree{
        int m = 1;
        boolean[] t;
        public SegTree(int n){
            while(m<=n)m<<=1;
            t = new boolean[m<<1];
            for(int i = 1; i<= n; i++)t[i+m] = true;
            for(int i = m-1; i> 0; i--)t[i] = t[i<<1]|t[i<<1|1];
        }
        void upd(int ind, boolean f){
            t[ind+=m] = f;
            for(ind>>=1; ind>0; ind>>=1)t[ind] = t[ind<<1]|t[ind<<1|1];
        }
        int nxt(int ind){
            int x = nxt(ind, (ind+m)>>1, 0, false);
            return x;
        }
        int nxt(int ind, int node, int bit, boolean flag){
            if(node == 0)return m;
            if(!flag){
                if(((ind>>bit)&1)==0 && t[node<<1|1])return nxt(ind, node<<1|1, bit-1, true);
                return nxt(ind, node>>1, bit+1, false);
            }
            if(node >= m)return node-m;
            if(t[node<<1])return nxt(ind, node<<1, bit, true);
            else return nxt(ind, node<<1|1, bit, true);
        }
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    long IINF = (long)1e18;
    final int INF = (int)1e9+2, MX = (int)2e6+5;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-7;
    static boolean multipleTC = false, memory = false, fileIO = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        if(fileIO){
            in = new FastReader("C:/users/user/desktop/inp.in");
            out = new PrintWriter("C:/users/user/desktop/out.out");
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