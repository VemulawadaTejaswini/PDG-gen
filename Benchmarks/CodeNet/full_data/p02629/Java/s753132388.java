import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        long N = nextLong();
    
        int[] level = new int[100];

        int x = 0;
        while(N > 0){
            int temp = (int) (N % 26);
            if(temp==0){
                level[x] = 26;
                N = N/26-1;
            }
            else{
                level[x] = temp;
                N = N/26;
            }

            x++;
        }
       
        String ans = "";
        char alphabet[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i = x-1; i>=0; i--){
            ans += alphabet[level[i]-1]; //0 base
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