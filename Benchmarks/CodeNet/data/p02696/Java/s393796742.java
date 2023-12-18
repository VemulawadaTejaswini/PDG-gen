import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int A = nextInt();
        long B = nextLong();
        long N = nextLong();

        // if Y = n*B + x, 
        // Y/B = n +x/B
        // Y and x answer is same
        // x=B, then = 0
        // let 0<=x<=B-1//a non-negative integer x
        // A × floor(x/B) = 0
        // floor(Ax/B) is increasing

        long low = Math.min(B-1, N);

        System.out.println(A*low/B);
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