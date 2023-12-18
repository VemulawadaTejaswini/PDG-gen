import java.util.*;
import java.io.*;
import java.text.*;
//Solution Credits: Taranpreet Singh
public class Main{
    //SOLUTION BEGIN
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        String s = n(), t = n();
        int n = s.length(), m = t.length();
        int[][] ans = new int[1+n][1+m];
        int[][][] b = new int[1+n][1+m][2];
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= m; j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    ans[i][j] = 1+ans[i-1][j-1];
                    b[i][j] = new int[]{i-1,j-1};
                }else if(ans[i][j-1] > ans[i-1][j]){
                    ans[i][j] = ans[i][j-1];
                    b[i][j] = new int[]{i,j-1};
                }else {
                    ans[i][j] = ans[i-1][j];
                    b[i][j] = new int[]{i-1,j};
                }
            }
        }
        StringBuilder o = new StringBuilder("");
        int[] x = new int[]{n,m};
        while(x[0]>0 && x[1]>0){
            int[] y = b[x[0]][x[1]];
            if(y[0]<x[0] && y[1]< x[1])o.append(s.charAt(y[0]));
            x = y;
        }
        pn(o.reverse().toString());
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