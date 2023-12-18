import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][3];

        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        int[][] dp = new int[N][3];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = arr[i][0]+Math.max(dp[i-1][1],dp[i-1][2]);
            dp[i][1] = arr[i][1]+Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][2] = arr[i][2]+Math.max(dp[i-1][1],dp[i-1][0]);
        }

        System.out.println(Math.max(dp[N-1][0],Math.max(dp[N-1][1],dp[N-1][2])));

    }
}
