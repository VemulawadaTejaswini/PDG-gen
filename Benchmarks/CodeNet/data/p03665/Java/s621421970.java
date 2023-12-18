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

    public static long[][] memo;
    public static int N, P;
    public static int[] A;

    public static long solve(int index, int rem){
        if(index == N) return (rem == P) ? 1 : 0;
        if(memo[index][rem] != -1) return memo[index][rem];
        long total = solve(index+1, (rem + A[index]) % 2);
        total += solve(index+1, rem);

        return memo[index][rem] = total;
    }

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        memo = new long[N][2];
        for(int i = 0; i < N; i++){
            Arrays.fill(memo[i], -1);
        }

        pw.print(solve(0, 0) + "\n");

        pw.close(); 
        br.close();
    }
}