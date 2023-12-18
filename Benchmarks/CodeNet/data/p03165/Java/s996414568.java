import java.util.*;
import java.io.*;
class Main {

    private static int[][] getLISMatrix(String s, String t) {
        int N = s.length();
        int M = t.length();

        int [][]dp = new int[N+1][M+1];

        for(int i=0; i <= N; ++i)
            dp[i][0] = 0;
        for(int i=0; i <= M; ++i)
            dp[0][i] = 0;

        for(int i=1; i <= N; ++i)
            for(int j=1; j <= M; ++j) {
                if (s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i-1][j-1]);
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }

        // for(int i=0; i <= N; ++i) {
        //     for(int j=0; j <= M; ++j)
        //         System.out.print(dp[i][j] + " ");
        //     System.out.println();
        // }

        return dp;
    }

    private static String getLISString(int [][]dp, String s, String t) {
        int N = s.length();
        int M = t.length();

        int x = N, y = M;



        StringBuilder resultBuilder = new StringBuilder();

        while (x > 0 && y > 0) {

            if (dp[x][y] == dp[x-1][y])
                --x;

            else if (dp[x][y] == dp[x][y-1])
                --y;
            else {
                resultBuilder.append(s.charAt(x-1));
                --x;
                --y;
            }
        }

        return resultBuilder.reverse().toString();
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String t = br.readLine();
        

        System.out.println(getLISString(getLISMatrix(s, t), s, t));
    }
}