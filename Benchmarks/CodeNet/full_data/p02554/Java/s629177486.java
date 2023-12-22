import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    //static final long MOD = 998244353L;
    static final int INF = 50000000;
    static final int NINF = -500000000;
 
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        long N = sc.nl();
        pw.println((power(10,N,MOD)-2*power(9,N,MOD)+power(8,N,MOD)+10*MOD)%MOD);
        pw.close();
    }
    
    //Fast exponentiation (x^y mod m)
    public static long power(long x, long y, long m) {
      long ans = 1;
      x %= m;
      while (y > 0) {
        if((y&1)==1)
          ans = (ans * x) % m;
        y /= 2;
        x = (x * x) % m;
      }
      return ans;
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
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
 
        int ni() {
            return Integer.parseInt(next());
        }
 
        long nl() {
            return Long.parseLong(next());
        }
 
        double nd() {
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
}