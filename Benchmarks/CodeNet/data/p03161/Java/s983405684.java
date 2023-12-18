import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        st1 = new StringTokenizer(br.readLine());

        int arr[] = new int [n];

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int dp[] = new int [n];

        for(int i = 1 ; i < n ; i++)
        {
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1 ; j <= k && i - j >= 0 ; j++)
                dp[i] = Math.min(Math.abs(arr[i]-arr[i-j]) + dp[i-j] , dp[i]);
        }

        out.println(dp[n-1]);

        out.flush();
        out.close();
    }

}