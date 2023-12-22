import java.util.*; 
import java.io.*;

//the answer must be bountry * bountry
public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        long a = nextInt();
        long b = nextInt();
        long c = nextInt();
        long d = nextInt();

        long ans = Long.MIN_VALUE;
        ans = Math.max(a*c,ans);
        ans = Math.max(a*d,ans);
        ans = Math.max(b*c,ans);
        ans = Math.max(b*d,ans);

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
