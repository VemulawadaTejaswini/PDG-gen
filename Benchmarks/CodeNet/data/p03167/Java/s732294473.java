import java.math.*;
import java.io.*;
import java.util.*;
 
class Main{
    static ArrayList<Integer>[] lists;
    static long mod = 1000000007;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] l1 = br.readLine().split(" ");
        int M = Integer.parseInt(l1[0]);
        int N = Integer.parseInt(l1[1]);

        long[][] dp = new long[M][N];
        char[][] in = new char[M][N];

        dp[0][0] = (long)1;
        
        for(int i = 0; i < M; i++){
            String l2 = br.readLine();
            for(int j = 0; j < l2.length(); j++){
                in[i][j] = l2.charAt(j);
            }
        }

        // System.out.println(Arrays.deepToString(in));

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(in[i][j] == '#') continue;
                if(i - 1 >= 0) dp[i][j] = (dp[i - 1][j] + dp[i][j]) % mod;
                if(j - 1 >= 0) dp[i][j] = (dp[i][j - 1] + dp[i][j]) % mod;
            }
        }
        System.out.println(dp[M - 1][N - 1]);
    }
}