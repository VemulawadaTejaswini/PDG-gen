import java.util.*; 
import java.io.*;

//the answer must be bountry * bountry
public class Main  {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        String S = next();
        String T = next();
        
        int ans = Integer.MAX_VALUE;

        for (int i=1; i<=S.length()-T.length()+1; i++) {
             String temp = S.substring(i-1, i-1+T.length());
             int count = 0;
             for (int j=1; j<=T.length(); j++) {
                if(!temp.substring(j-1,j).equals(T.substring(j-1,j))){
                    count ++;
                }
             };  
             
             ans = Math.min(ans, count);
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
