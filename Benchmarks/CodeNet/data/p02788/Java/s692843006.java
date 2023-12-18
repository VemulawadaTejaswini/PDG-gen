import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    void pre() throws Exception{}
    void solve(int TC)throws Exception {
        int n = ni();long d = nl(), a = nl();
        long[][] mon = new long[n][];
        for(int  i = 0; i< n; i++)mon[i] = new long[]{nl(), nl()};
        Arrays.sort(mon, (long[] l1, long[] l2) -> Long.compare(l1[0], l2[0]));
        PriorityQueue<Pair> q = new PriorityQueue<>();
        long sum = 0;
        int p = 0;
        long ans = 0;
        for(int i = 0; i< n; i++){
            while(p< n && mon[i][0]+2*d >= mon[p][0])p++;
            while(!q.isEmpty() && q.peek().x <= i)sum -= q.poll().v;
            if(mon[i][1] <= sum)continue;
            long cnt = (mon[i][1]-sum+a-1)/a;
            ans += cnt;
            Pair pp = new Pair(p, cnt*a);
            sum += cnt*a;
            q.add(pp);
        }
        pn(ans);
    }
    class Pair implements Comparable<Pair>{
        long x, v;
        public Pair(long X, long V){x = X;v = V;}
        public int compareTo(Pair p){return Long.compare(x, p.x);}
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    long IINF = (long)1e15;
    final int INF = (int)1e9+2, MX = (int)2e6+5;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-7;
    static boolean multipleTC = false, memory = true, fileIO = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        if(fileIO){
            in = new FastReader("");
            out = new PrintWriter("");
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