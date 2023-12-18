import java.util.*;
import java.io.*;
public class Main {

    private static Integer solve(int []a, int []b, int []c, int N) {
        int [][]dp = new int[3][N];
        dp[0][0] = a[0];
        dp[1][0] = b[0];
        dp[2][0] = c[0];


        for(int i=1; i < N; ++i) {
            dp[0][i] = a[i] + Math.max(dp[1][i-1], dp[2][i-1]);
            dp[1][i] = b[i] + Math.max(dp[0][i-1], dp[2][i-1]);
            dp[2][i] = c[i] + Math.max(dp[1][i-1], dp[0][i-1]);
        }

        return Math.max(dp[0][N-1], Math.max(dp[1][N-1], dp[2][N-1]));
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        

        String []s = null;
        

        int []a = new int[N];
        int []b = new int[N];
        int []c = new int[N];

        for(int i=0; i < N; ++i) {
            s = br.readLine().split(" ");
            a[i] = Integer.parseInt(s[0]);
            b[i] = Integer.parseInt(s[1]);
            c[i] = Integer.parseInt(s[2]);
        }

        System.out.println(solve(a, b, c, N));
    }
}