import java.util.*;
import java.io.*;
import java.text.*;
//Solution Credits: Taranpreet Singh
public class Main{
    //SOLUTION BEGIN
    long[][] f;
    void pre() throws Exception{
        f = new long[MX][2];
        f[0][0] = 1;
        for(int i = 1; i< MX; i++)f[i][0] = (f[i-1][0]*i)%mod;
        f[MX-1][1] = pow(f[MX-1][0],mod-2);
        for(int i = MX-2; i>= 0; i--)f[i][1] = (f[i+1][1]*(i+1))%mod;
    }
    long pow(long a, long p){
        long o = 1;
        while(p>0){
            if(p%2==1)o = (a*o)%mod;
            a = (a*a)%mod;
            p>>=1;
        }
        return o;
    }
    void solve(int TC) throws Exception{
        int h = ni(), w = ni(), n = ni();
        long[] ans = new long[1+n];
        int[][] p = new int[1+n][];
        for(int i = 0; i< n; i++)p[i] =new int[]{ni(), ni()};
        p[n] = new int[]{h,w};
        Arrays.sort(p, (int[] i1, int[] i2) -> {
            if(i1[0]!=i2[0])return Integer.compare(i1[0], i2[0]);
            return Integer.compare(i1[1], i2[1]);
        });
        for(int i = 0; i<= n; i++){
            ans[i] = f(1,1,p[i][0],p[i][1]);
            for(int j = 0; j< i; j++){
                if(p[j][1]<=p[i][1]){
                    ans[i] += mod-(ans[j]*f(p[j][0],p[j][1], p[i][0], p[i][1]))%mod;
                    if(ans[i]>=mod)ans[i]-=mod;
                }
            }
        }
        pn(ans[n]);
    }
    long f(int x1, int y1, int x2, int y2){
        int x = x2-x1, y = y2-y1;
        return f[x+y][0]*f[x][1]%mod*f[y][1]%mod;
    }
    //SOLUTION END
    void hold()throws Exception{throw new Exception("Hold right there, Sparky!");}
    long mod = (long)1e9+7, IINF = (long)4e18;
    final int INF = (int)2e9, MX = (int)1e6+1;
    DecimalFormat df = new DecimalFormat("0.000000000000000");
    double PI = 3.1415926535897932384626433832792884197169399375105820974944, eps = 1e-8;
    static boolean multipleTC = false, memory = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        int T = (multipleTC)?ni():1;
        //Solution Credits: Taranpreet Singh
        pre();for(int i = 1; i<= T; i++)solve(i);
        out.flush();
        out.close();
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
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

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
            try{   
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }  
            return str;
        }
    }
}    