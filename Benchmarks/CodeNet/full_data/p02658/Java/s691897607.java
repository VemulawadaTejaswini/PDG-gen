//package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
        int n = in.nextInt();
        BigInteger b = BigInteger.ONE;
        BigInteger lim = BigInteger.valueOf((long)1e18);
        for(int i = 0; i < n; ++i){
            long t = in.nextLong();
            if(t == 0){
                System.out.println("0");
                return;
            }
            if(b.compareTo(lim) == 1){
                continue;
            }
            b = b.multiply(BigInteger.valueOf(t));
        }
        if(b.compareTo(lim) == 1){
            System.out.println("-1");
            return;
        }
        System.out.println(b);
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
