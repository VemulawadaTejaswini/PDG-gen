import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
 
public class Main {
 
    void solve() throws IOException {
        H = ni();
        W = ni();
        a = new int[H][W];
        for (int i = 0; i < H; i++) {
            String s = ns();
            for (int j = 0; j < W; j++) {
                if(s.charAt(j)=='.') a[i][j] = 1;
            }
        } 
        boolean in = (a[0][0]==0);
        int count = in ? 1: 0;
        dfs(0, 0, count, in);
 
        out.println(ans);
    }
    void dfs(int h, int w, int count, boolean in){
        if(count >= ans) return;
        if(h == H-1 && w == W-1){
            ans = Math.min(ans, count);
        }
        if(h+1<H) {
            if(!in && a[h+1][w]==0){
                dfs(h+1, w, count+1, true);
            }else if (in && a[h+1][w]==0){
                dfs(h+1, w, count, true);
            }else{
                dfs(h+1, w, count, false);
            }
        }
        if(w+1<W) {
            if(!in && a[h][w+1]==0){
                dfs(h, w+1, count+1, true);
            }else if (in && a[h][w+1]==0){
                dfs(h, w+1, count, true);
            }else{
                dfs(h, w+1, count, false);
            }
        }
    }
    int H;
    int W;
    int[][] a;
    int ans = Integer.MAX_VALUE;
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