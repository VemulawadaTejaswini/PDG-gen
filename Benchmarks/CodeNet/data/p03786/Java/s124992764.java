import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;
    public static int MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        long[] A = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        int last = 0;
        for(int i = 0; i < N-1; i++){
            if(A[i+1] > 2 * A[i]){
                last = i+1;
            }
            A[i+1] += A[i];
        }
        pw.print(N-last + "\n");
        
        pw.close(); 
        br.close();
    }
}

class Pair {
    public int a, b;

    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }

}