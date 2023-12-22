import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

 
public class Main {
 
    void solve() throws IOException {
        int mod = 1000000007;
        int K = ni();
        String S = ns();
        int N = S.length();
        BigInteger[] numel = new BigInteger[K+1];
        numel[0] = BigInteger.ONE;
        for (int i = 0; i < N-1; i++) {
            numel[0] = numel[0].multiply(BigInteger.valueOf(N-1-i));
        }
        for (int i = 1; i < numel.length; i++) {
            numel[i] = numel[i-1].multiply(BigInteger.valueOf(N-1+i));
            numel[i] = numel[i].divide(BigInteger.valueOf(i));
        }
        BigInteger denom = numel[0];
        long[] d25 = new long[K+1];
        d25[0] = 1;
        for (int i = 1; i < d25.length; i++) {
            d25[i] = d25[i-1] * 25 %mod;
        }
        long[] d26 = new long[K+1];
        d26[0] = 1;
        for (int i = 1; i < d26.length; i++) {
            d26[i] = d26[i-1] * 26 %mod;
        }
        BigInteger ans = BigInteger.ZERO;

        BigInteger md = BigInteger.valueOf(1000000007);
        for (int i = 0; i <=K; i++) {
            BigInteger addv = numel[K-i].divide(denom);
            addv = addv.multiply(BigInteger.valueOf(d25[K-i]));
            addv = addv.multiply(BigInteger.valueOf(d26[i]));
            ans = ans.add(addv);
            ans = ans.mod(md);
        }
        out.println(ans);
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