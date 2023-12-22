import java.util.*;
import java.io.*;
import java.text.*;

class Main{
    //SOLUTION BEGIN
    ArrayList<int[]> list;
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        list = new ArrayList<>();


        int BIT = 31;
        int A = 0, B = 1, ANS = 2;

        int adderA = 4, adderB = 5;
        int one = 6, zero = 7;

        add(A, B, one);
        cmp(zero, one, one);

        int A1 = 8, B1 = 9;
        add(A, one, A1);
        add(B, one, B1);


        for(int b1 = BIT-1; b1 >= 0; b1--){
            int cur1 = 10;

            add(zero, one, cur1);
            for(int b = 0; b< b1; b++)add(cur1, cur1, cur1);
            add(cur1, adderA, cur1);


            cmp(cur1, A1, cur1);

            int tmp = 16;
            add(cur1, zero, tmp);
            for(int b = 0; b< b1; b++)add(tmp, tmp, tmp);
            add(adderA, tmp, adderA);


            add(zero, zero, adderB);
            for(int b2 = BIT-1; b2 >= 0; b2--){

                int cur2 = 11;
                add(cur1, zero, cur2);
                for(int b = 0; b< b2; b++)add(cur2, cur2, cur2);
                add(adderB, cur2, cur2);

                cmp(cur2, B1, cur2);

                add(cur2, zero, tmp);
                for(int b = 0; b< b2; b++)add(tmp, tmp, tmp);
                add(adderB, tmp, adderB);




                int cur3 = 12;
                cmp(cur1, one, cur3);
                cmp(cur3, cur2, cur3);

                for(int b = 0; b< b1+b2; b++)add(cur3, cur3, cur3);
                add(ANS, cur3, ANS);

            }

        }


        pn(list.size());
        for(int[] op:list){
            if(op[0] == 0)pn("+", op[1], op[2], op[3]);
            else pn("<", op[1], op[2], op[3]);
        }
    }
    void add(int i, int j, int k){
        list.add(new int[]{0, i, j, k});
    }
    void cmp(int i, int j, int k){
        list.add(new int[]{1, i, j, k});
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