import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int arr[] = new int[n];
        int dp[] = new int[n];
        int m = 0;
        for (String s: input){
            arr[m++] = Integer.parseInt(s);
        }

        for (int i = 1; i < k && i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                int x = Math.abs(arr[i] - arr[j]) + dp[j];
                if (x < min) min = x;
            }
            dp[i] = min;
        }

        for (int i = k; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = i - k; j < i; j++) {
                int x = Math.abs(arr[i] - arr[j]) + dp[j];
                if (x < min) min = x;
            }
            dp[i] = min;
        }
        System.out.println(dp[n- 1]);
    }
}
