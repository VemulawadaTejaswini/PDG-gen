import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    static int parent[]; 

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = nextInt();
    
        char[] S = next().toCharArray();

        long cnt = 0;
        for (int x=0; x<N; x++) {
            for (int y=x+1; y<N; y++) {
                for (int z=y+1; z<N; z++) {
                    if(y-x != z-y & S[x]!= S[y] & S[z]!= S[y] & S[x]!= S[z]){
                        cnt ++;
                    }
                }
            }
        }

        System.out.println(cnt);
        
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