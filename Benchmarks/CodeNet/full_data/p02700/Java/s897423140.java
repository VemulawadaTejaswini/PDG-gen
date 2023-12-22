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
        int D = nextInt();
 
        int fistround = C;
        int nextround = A;

        while(fistround>0 || nextround>0){
            fistround -=B;
            if(fistround<=0){
                System.out.println("Yes");
                return;
            }
    
            nextround -=D;
            if(nextround<=0){
                System.out.println("No");
                return;
            }
        }
        
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