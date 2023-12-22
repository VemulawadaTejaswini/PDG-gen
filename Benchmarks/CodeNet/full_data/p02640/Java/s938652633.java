import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int X = nextInt();
        int Y = nextInt();

        //We also consider the case in which there are only cranes or only turtles.
        if(Y<2*X){
            System.out.println("No");
            return;
        }
        if((Y-2*X)%2 == 1){
            System.out.println("No");
            return;
        }

        int turtle = (Y-2*X)/2;
        if(turtle > X){
            System.out.println("No");
            return;
        }
         
        System.out.println("Yes");
        return;
        
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