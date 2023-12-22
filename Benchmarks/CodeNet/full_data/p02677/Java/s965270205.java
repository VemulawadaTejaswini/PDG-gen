import java.util.*; 
import java.io.*;

public class Main{
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int A = nextInt();
        int B = nextInt();
        int H = nextInt();
        int M = nextInt();
        
        double M_Angle = M * 360/60;
        double H_Angle = H * 360/12 + (double)M * 30/60;
        double M_Angle1 = M_Angle * Math.PI / 180;
        double H_Angle1 = H_Angle * Math.PI / 180;

        double xM = B * Math.sin(M_Angle1);
        double yM = B * Math.cos(M_Angle1);
        double xH = A * Math.sin(H_Angle1);
        double yH = A * Math.cos(H_Angle1);

        double ans = Math.sqrt((xM-xH)*(xM-xH) + (yM-yH)*(yM-yH));
       
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