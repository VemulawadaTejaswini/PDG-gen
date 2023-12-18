import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(arr[1] - arr[0]);

        for(int i = 2; i < n; i++){
            int first = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int second = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            dp[i] = Math.min(first,second);
        }

        System.out.print(dp[n-1]);
    }
}
