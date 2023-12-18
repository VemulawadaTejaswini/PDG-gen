import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
    private static final int MAX = 600;
    private static ArrayList<Long> divs = new ArrayList<>();
    private static HashMap<Integer,Integer> primes = new HashMap<>();
    private static int [] prime = new int[MAX + 1];
    private static int [] f = new int[MAX + 1];

    private static int add(int a,int b,int mod) {
        a += b;
        if(a >= mod) a -= mod;
        if(a < 0) a += mod;
        return a;
    }
    private static int mul(int a,int b,int mod) {
        return (int)((a*1L*b)%mod);
    }
    private static int powmod(int a,int p,int mod) {
        if(p == 0) return 1;
        int b = 1;
        for (;p > 1;p >>= 1) {
            if(p%2 == 1) b = mul(a,b,mod);
            a = mul(a,a,mod);
        }
        return mul(a,b,mod);
    }

    private static void sieve(){
        for (int i = 2;i <= MAX;i++)
            if(prime[i] == 0) {
                prime[i] = i;
                for (long j = i*1L*i;j <= MAX;j += i)
                    prime[(int)j] = i;
            }
    }

    private static void factorize(int x,int sgn ) {
        while (x > 1) {
            int p = prime[x];
            int q = 0;
            while (x%p == 0) {
                x /= p;
                q++;
            }
            if(!primes.containsKey(p)) primes.put(p,0);
            primes.put(p,primes.get(p) + sgn * q);
        }
    }
    private static void get_divs(int l) {
        divs.clear();
        divs.add(1L);
        for (int p : primes.keySet()) {
            int siz = divs.size();
            int s = 0,e = siz;
            for (int i = 0,q = primes.get(p);i < q;i++){
                int ctr = 0;
                while (s < e) {
                    long val = divs.get(s)*p;
                    if(val-1 <= l) {
                        divs.add(val);
                        ++ctr;
                    }
                    s++;
                }
                e += ctr;
            }
        }
    }
    private static int mod = 1000*1000*1000 + 7;
    private static int N,K;
    private static Integer [] [] dp = new Integer[2002][2002];
    private static int [] fact = new int[2000*2000 + 10];
    private static int [] rev = new int[2000*2000 + 10];
    private static void init(){
        fact[0] = 1;
        rev[0] = 1;
        for (int i = 1;i < 2000*2000+10;i++) {
            fact[i] = mul(i, fact[i - 1], mod);
            rev[i] = powmod(fact[i],mod-2,mod);
        }
    }

    private static int C(int n,int k) {
        if(k > n) return 0;
        int ret = fact[n];
        ret = mul(mul(ret,rev[k],mod),rev[n-k],mod);
        return ret;
    }
    private static int solve(int r1,int r2) {
        if(r2 == N+1) return 1;
        if(dp[r1][r2] != null) return dp[r1][r2];
        int ret = 0;
        if(r1 <= N) ret = solve(r1+1,r2);
        if(r2 < r1) ret = add(ret,mul(solve(r1,r2+1),C(N*K-(r1-1)-(r2-1)*(K-1)-1,K-2),mod),mod);
        dp[r1][r2] = ret;
        //System.err.println(r1 + " " + r2 + " -> " + ret);
        return ret;
    }

    public static void main(String[] args) throws Exception{
        IO io = new IO(null,null);
    //    sieve();
        init();
        N = io.getNextInt();
        K = io.getNextInt();
        if(K == 1) io.println(1);
        else io.println(mul(fact[N],solve(1,1),mod));
        io.close();
    }
}


class frac{
    BigInteger A,B;
    public frac(long a,long b){
        A = BigInteger.valueOf(a);
        B = BigInteger.valueOf(b);
        BigInteger g = A.gcd(B);
        A = A.divide(g);
        B = B.divide(g);
    }
    public frac(BigInteger a,BigInteger b) {
        BigInteger g = a.gcd(b);
        a = a.divide(g);
        b = b.divide(g);
        this.A = a;
        this.B = b;
    }
    public frac mul(frac o) {
        BigInteger a = this.A.multiply(o.A);
        BigInteger b = this.B.multiply(o.B);
        return new frac(a,b);
    }
    public frac add(frac o) {
        BigInteger a = this.A.multiply(o.B).add(this.B.multiply(o.A));
        BigInteger b = this.B.multiply(o.B);
        return new frac(a,b);
    }
    public frac sub(frac o) {
        BigInteger a = this.A.multiply(o.B).subtract(this.B.multiply(o.A));
        BigInteger b = this.B.multiply(o.B);
        return new frac(a,b);
    }
    @Override
    public String toString(){
        return A + "/" + B ;
    }
}



class IO{
    private BufferedReader br;
    private StringTokenizer st;
    private PrintWriter writer;
    private String inputFile,outputFile;

    public String getNext() throws FileNotFoundException, IOException{
        while(st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public String getNextLine() throws FileNotFoundException, IOException{
        return br.readLine().trim();
    }

    public int getNextInt() throws FileNotFoundException, IOException{
        return Integer.parseInt(getNext());
    }
    public long getNextLong() throws FileNotFoundException, IOException{
        return Long.parseLong(getNext());
    }

    public void print(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f" ,x);
    }
    public void println(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f\n" ,x);
    }
    public void print(Object o) throws  IOException{
        writer.print(o.toString());
    }

    public void println(Object o) throws  IOException{
        writer.println(o.toString());
    }
    public IO(String x,String y) throws FileNotFoundException, IOException{
        inputFile = x;
        outputFile = y;
        if(x != null) br = new BufferedReader(new FileReader(inputFile));
        else br = new BufferedReader(new InputStreamReader(System.in));
        if(y != null) writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
        else writer = new PrintWriter(new OutputStreamWriter(System.out));
    }

    protected void close() throws IOException{
        br.close();
        writer.close();
    }
}