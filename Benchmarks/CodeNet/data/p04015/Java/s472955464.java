import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        long[] dp = new long[3000];
        dp[0] =1;
        for (int i=0;i<N;i++) {
            int x = sc.nextInt();
            long[] arr = new long[3000];
            for (int j=0;j<2600;j++) {
                arr[j] += dp[j];
                arr[j+x] += dp[j];
            }
            for (int j=0;j<3000;j++) {
                dp[j] = arr[j];
            }
        }
        long ans = 0L;
        for (int i=1;i<3000;i++) {
            if (i%A==0) ans+=dp[i];
        }
        // System.out.println(Arrays.toString(Arrays.copyOf(dp, 50)));
        System.out.println(ans);
    }
}