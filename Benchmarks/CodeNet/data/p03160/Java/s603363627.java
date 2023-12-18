import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int arr[] = new int[n];
        int dp[] = new int[n];
        int k = 0;

        for (String s: input){
            arr[k++] = Integer.parseInt(s);
        }
        dp[1] = Math.abs(arr[1] - arr[0]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(Math.abs(arr[i - 1] - arr[i]) + dp[i - 1],Math.abs(arr[i - 2] - arr[i]) + dp[i - 2]);
        }
        System.out.println(dp[n- 1]);
    }
}
