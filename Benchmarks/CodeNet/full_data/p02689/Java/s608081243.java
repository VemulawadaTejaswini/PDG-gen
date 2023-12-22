//package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Milo
 */
public class Main {
    
    static FastReader in = new FastReader();
    public static void main(String[] args) {
        int t = 1; //in.nextInt();
        while (t-- > 0)
            solve();
    }
 
    public static void solve() {
        List<List<Integer>> g = new ArrayList();
        int n = in.nextInt();
        int m = in.nextInt();
        int h[] = new int[n + 1];
        int ans = 0;
        for(int i = 0; i < n; ++i){
            h[i] = in.nextInt();
            g.add(new ArrayList());
        }
        for(int i = 0; i < m; ++i){
            int u = in.nextInt();
            int v = in.nextInt();
            --u;--v;
            g.get(u).add(v);
            g.get(v).add(u);
        }
        
        int z = 0;
        for(List<Integer> l : g){
            int f = 0;
            if(l.isEmpty()) continue;
            for(int nb : l){
                if(h[z] < h[nb]){
                    f = 1;
                    break;
                }
            }
            if(f == 0){
                ans++;
            }
            z++;
        }
        //System.out.println(g);
        System.out.println(ans);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
 
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
 
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, (a % b));
    }
}
