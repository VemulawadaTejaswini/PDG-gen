import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = nextInt();
        long[] input = new long[N];

        for (int i=0; i<N; i++) {
            input[i] = nextLong();
            if(input[i]==0) {
                System.out.println(0);
                return;
            }
        }

        long ans =input[0];

        for (int i=1; i<N; i++) {
            // If you directly perform multiplication on 64-bit integers, it causes overflow
            // if((Math.log10(ans) + Math.log10(input[i]) >= 18) && ans * input[i] != 1e18){
            //if(ans> 1e18/ input[i]){ 
            // > not working, need use <=, because 1e18/ input[i] will lose 0.000001
            if((ans > (long)(1e18)/ input[i])){ 
                System.out.println(-1);
                return;
            }
            ans = ans * input[i];
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
