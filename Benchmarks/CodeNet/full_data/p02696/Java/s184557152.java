//package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        long a = in.nextLong();
        long b = in.nextLong();
        long n = in.nextLong();
        long mm = min((b - 1), n);
        long t = (long)(Math.floor((a * mm) / b) - a * Math.floor(mm / b));
        
        System.out.println(t);
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
 
    public static long max(long a, long b) {
        return a > b ? a : b;
    }
 
    public static long min(long a, long b) {
        return a < b ? a : b;
    }
 
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, (a % b));
    }
}
