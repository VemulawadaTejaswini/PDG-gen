import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

 
public class Main {
 
    void solve() throws IOException {
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
        // for (int i = 0; i < numel.length; i++) {
        //     System.out.println(numel[i]);
        // }
        // System.out.println(denom);
        BigInteger ans = BigInteger.ZERO;
        BigInteger b26 = BigInteger.valueOf(26);
        BigInteger b25 = BigInteger.valueOf(25);
        BigInteger md = BigInteger.valueOf(1000000007);
        for (int i = 0; i <=K; i++) {
            BigInteger ki = BigInteger.valueOf(K-i);
            BigInteger ii = BigInteger.valueOf(i);
            ans = ans.add(numel[K-i].divide(denom).multiply(b25.modPow(ki, md)).multiply(b26.modPow(ii, md)));
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