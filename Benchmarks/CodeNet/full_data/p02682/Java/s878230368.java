import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        
        int A = nextInt();//health 
        int B = nextInt();//strength 
        int C = nextInt();
        int K = nextInt();
 
        int sum = 0;
  
        if(K>=A){
            sum += A;
            K = K-A;
        }
        else{
            sum += K;
            K=0;
        }
        if(K>=B){  
            K = K-B;
        } 
        else{
            K=0;
        }
        if(K>=C){
            sum += -C;
            K = K-A;
        }
        else{
            sum += -K;
        }
  
        System.out.println(sum);
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