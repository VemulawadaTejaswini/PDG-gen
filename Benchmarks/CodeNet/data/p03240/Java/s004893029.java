import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
 
public class Main {
 
    void solve() throws IOException {
        int N = ni();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = ni();
            y[i] = ni();
            h[i] = ni();
        }
        
        for (int cx = 0; cx <=100; cx++) {
            for (int cy = 0; cy <=100; cy++) {
                int ch = -1;
                boolean consistent = true;
                for (int i = 0; i < N; i++) {
                    if(h[i]==0) continue;
                    if(ch==-1 || ch == h[i]+Math.abs(x[i]-cx)+Math.abs(y[i]-cy)){
                        ch = h[i]+Math.abs(x[i]-cx)+Math.abs(y[i]-cy);
                    }else{
                        consistent = false;
                    }
                }
                if(consistent && ch>0){
                    out.print(cx);
                    out.print(" ");
                    out.print(cy);
                    out.print(" ");
                    out.println(ch);
                    return;
                }
            }
        }
    }

    final int mod = 1000000007;
    final BigInteger MOD = BigInteger.valueOf(mod);

    int mul(int x, int y){
        int val = (int)((x * 1L * y) % mod);
        return val>=0 ? val : val+mod;
    }
    int add(int x, int y) {
        x += y;
        if(x < 0) x += mod;
        if(x>=mod) x -= mod;
        return x;
    }
    int sub(int x, int y){
        x = add(x,mod-y);
        if(x < 0) x += mod;
        if(x>=mod) x -= mod;
        return x;
    }
    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }
 
    int ni() throws IOException {
        return Integer.parseInt(ns());
    }
 
    long nl() throws IOException {
        return Long.parseLong(ns());
    }
 
    double nd() throws IOException {
        return Double.parseDouble(ns());
    }
 
    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }
 
    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }
 
    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }
 
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
 
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}