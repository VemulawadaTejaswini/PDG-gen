import java.util.*; 
import java.io.*;


// A1 * Sum(A2+...+An)
// +A2 * Sum(A3+...+An)
// +A3 * Sum(A4+...+An)
public class Main  {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
    
    static long mod = (long)1e9 + 7;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = nextInt();
        long list[] = new long[N+1];
        long psm[] = new long[N+1];

        // we get PreSum
        for (int i=1; i<=N; i++) {
            list[i] = nextInt();
            psm[i] = psm[i-1] + list[i];
            psm[i] %= mod;
        }
    
        long ans = 0;
        for (int i=1; i<=N-1; i++) {
            ans += list[i] * (psm[N]-psm[i]);
            ans %= mod;
        }

        System.out.println(ans);
    }

      
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}