import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);


        int n = Integer.parseInt(br.readLine());

        int arr[][] = new int [n][3];
        for(int i = 0 ; i < n ; i++)
        {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st1.nextToken());
            arr[i][1] = Integer.parseInt(st1.nextToken());
            arr[i][2] = Integer.parseInt(st1.nextToken());

        }

        int dp[][] = new int[n][3];

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for(int i = 1 ; i < n ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                for(int k = 0 ; k < 3 ; k++)
                {
                    if(j != k)
                        dp[i][j] = Math.max(dp[i][j] , dp[i-1][k] + arr[i][j]);
                }
            }
        }

        int res = 0;

        for(int i = 0 ; i < 3 ; i++)
        {
            res = Math.max(res , dp[n-1][i]);
        }

        out.println(res);


        out.flush();
        out.close();
    }

}