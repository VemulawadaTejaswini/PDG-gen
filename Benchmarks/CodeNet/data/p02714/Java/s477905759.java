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

        long cntR = 0; // need long for *
        long cntG = 0;
        long cntB = 0;
        
        for (int x=0; x<N; x++) {
            if(S[x]=='R') cntR++;
            if(S[x]=='G') cntG++;
            if(S[x]=='B') cntB++;
        }

        //no need, it never happen
        if(cntR*cntG*cntB==0){
            System.out.println(0);
            return;
        }

        long cnt = 0;
        for (int x=0; x<N; x++) {
            for (int y=x+1; y<N; y++) {
                int z= 2*y-x;
                if(z<N) {
                    if(S[x]!= S[y] & S[z]!= S[y] & S[x]!= S[z]){
                        cnt ++;
                    }
                }
            }
        }

        System.out.println(cntR*cntG*cntB - cnt);
        
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