import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temp {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];
        String[] s = br.readLine().trim().split("\\s+");
        for(int i=0 ; i<n ; i++)
            arr[i] = Integer.parseInt(s[i]);

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(arr[0] - arr[1]);
        for(int i=2 ; i<n ; i++)
        {
            int x = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int y = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            dp[i] = Math.min(x, y);
        }

        System.out.println(dp[n-1]);
    }
}
