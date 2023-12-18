import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < x; i++)
            arr[i] = sc.nextInt();
        int dp[] = new int[x];
        if(x==1)
            System.out.println(arr[0]);
        for (int i = 1; i < x; i++) {
            int abs1 = Math.abs(arr[i] - arr[i - 1]);
            if (i == 1) {
                int abs = abs1;
                dp[i] = abs;
            } else {
                dp[i] = Math.min(abs1+dp[i-1], Math.abs(arr[i] - arr[i - 2])+dp[i-2]);
            }
        }
        System.out.println(dp[x - 1]);
    }
}
