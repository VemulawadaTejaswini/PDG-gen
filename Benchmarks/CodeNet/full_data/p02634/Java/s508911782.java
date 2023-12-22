import java.util.InputMismatchException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    
    long MAX = (long) 1e5, MOD = (long)998244353;
    long dp[][];
    void solve(int TC) {
        int a = ni();
        int b = ni();
        int c = ni();
        int d = ni();
        dp = new long[c+1][d+1];
        for(int i=0;i<=c;i++) {
            for(int j=0;j<=d;j++) dp[i][j]=-1;
        }
        long ans = go(a,b,c,d);
        pn("ans: "+ans);
    }
    
    long go(int a, int b, int c, int d) {
        if(dp[a][b]!=-1) return dp[a][b];
        if(a==c && b==d) {
            return dp[a][b] = 1;
        } else if(a==c) {
            return dp[a][b] = (a * go(a,b+1,c,d)) % MOD;
        } else if(b==d) {
            return dp[a][b] = (b * go(a+1,b,c,d)) % MOD;
        } else {
            long t1 = (b * go(a+1,b,c,d)) % MOD;
            long t2 = (a * go(a,b+1,c,d)) % MOD;
            long t3 = ((a*1L*b)*1L*go(a+1,b+1,c,d)) % MOD;
            long t4 = (t1 + t2 - t3) % MOD;
            if(t4 < 0) t4 += MOD;
            return dp[a][b] = t4;
        }
    }
    
    boolean TestCases = false;
    public static void main(String[] args) throws Exception { new Main().run(); }
    
    long pow(long a, long b) { // return pow(a,b) % MOD
        if(b==0 || a==1) return 1;
        long o = 1;
        for(long p = b; p > 0; p>>=1) {
            if((p&1)==1) o = (o*a) % MOD;
            a = (a*a) % MOD;
        } return o;
    }
    
    long inv(long x) { // return Modular Inverse of x
        long o = 1;
        for(long p = MOD-2; p > 0; p>>=1) {
            if((p&1)==1)o = (o*x)%MOD;
            x = (x*x)%MOD;
        } return o;
    }
    long gcd(long a, long b) { return (b==0) ? a : gcd(b,a%b); }
    int gcd(int a, int b) { return (b==0) ? a : gcd(b,a%b); }
    
    void run() throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        int T = TestCases ? ni() : 1;
        for(int t=1;t<=T;t++) solve(t);
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    void p(Object o) { out.print(o); }
    void pn(Object o) { out.println(o); }
    void pni(Object o) { out.println(o);out.flush(); }
    double PI = 3.141592653589793238462643383279502884197169399;
    
    int ni() {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-') {
            minus = true;
            b = readByte();
        }
        while(true) {
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-') {
            minus = true;
            b = readByte();
        }
        while(true) {
            if(b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    double nd() { return Double.parseDouble(ns()); }
    char nc() { return (char)skip(); }
    
    int BUF_SIZE = 1024 * 8; // 1 MB is 1024*1024
    byte[] inbuf = new byte[BUF_SIZE];
    int lenbuf = 0, ptrbuf = 0;
    
    int readByte() {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        } return inbuf[ptrbuf++];
    }
    
    boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))) { // when nextLine, (b != '\n')
            sb.appendCodePoint(b); b = readByte();
        } return sb.toString();
    }
    
    char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        } return n == p ? buf : Arrays.copyOf(buf, p);
    }
    
    void tr(Object... o) { if(INPUT.length() > 0)System.out.println(Arrays.deepToString(o)); }
}