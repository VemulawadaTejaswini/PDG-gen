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
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(A);
        int last = A[0];
        int ans = 1;
        int passengers = 1;

        for(int i = 1; i < N; i++){
            if(last + K < A[i] || passengers >= C){
                ans++;
                last = A[i];
                passengers = 1;
            } else{
                passengers++;
            }
        }
        pw.print(ans + "\n");
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