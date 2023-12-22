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
        
        int[] A = new int[100000+1];

        long sum = 0;
        for (int x=0; x<N; x++) {
            int temp = nextInt();
            A[temp] ++;
            sum += temp;
        }

        int Q = nextInt();
 
        for (int x=0; x<Q; x++) {
            int B = nextInt();
            int C = nextInt();

            sum += C*A[B] - B*A[B];
            A[C] += A[B];
            A[B] = 0; 
            
            System.out.println(sum);
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