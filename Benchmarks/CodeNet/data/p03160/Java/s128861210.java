import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int arr[] = new int [n];

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int dp[] = new int [n];

        dp[1] = Math.abs(arr[1] - arr[0]);

        for(int i = 2 ; i < n ; i++)
        {
            dp[i] = Math.min(Math.abs(arr[i]-arr[i-1]) + dp[i-1] , Math.abs(arr[i] - arr[i-2]) + dp[i-2]);
        }

        out.println(dp[n-1]);

        out.flush();
        out.close();
    }

}