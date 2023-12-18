import java.util.*;
import java.io.*;
import java.text.*;
//Solution Credits: Taranpreet Singh
public class Main{
    //SOLUTION BEGIN
    void pre(){}
    void solve(int TC) throws Exception {
        int x = ni();
        int mx = 2*x;
        int[] pr = new int[mx];
        for(int i = 2; i< mx; i++)
            if(pr[i] == 0)
                for(int j = i; j< mx; j+= i)
                    if(pr[j] == 0)
                        pr[j] = i;
        int ans = x;
        while(pr[ans] < ans)ans++;
        pn(ans);
    }
    //SOLUTION ENDS
    long mod = (int)1e9+7, IINF = (long)3e18;
    final int MAX = (int)1e6+1, INF = (int)1e9, root = 3;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399375105820974944, eps = 1e-8;
    static boolean multipleTC = false, memory = true;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        long ct = System.currentTimeMillis();
        in = new FastReader();
        out = new PrintWriter(System.out);
        pre();
        int T = (multipleTC)?ni():1;
//      Solution Credits: Taranpreet Singh
        for(int i = 1; i<= T; i++)solve(i);
        out.flush();
        out.close();
        System.err.println(System.currentTimeMillis()-ct);
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object o){out.print(o);}
    void pn(Object o){out.println(o);}
    void pni(Object o){out.println(o);out.flush();}
    String n(){return in.next();}
    String nln(){return in.nextLine();}
    int ni(){return Integer.parseInt(in.next());}
    long nl(){return Long.parseLong(in.next());}
    double nd(){return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}
        public FastReader(String s) throws Exception{br = new BufferedReader(new FileReader(s));}
        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        String nextLine(){
            String str = "";
            try{str = br.readLine();}catch (IOException e){e.printStackTrace();}
            return str;
        }
    }
}