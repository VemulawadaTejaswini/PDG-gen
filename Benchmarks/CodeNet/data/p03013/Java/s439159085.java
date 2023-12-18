import java.util.*;

public class stairs {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int dp[] = new int[n];

        int a[] = new int[m];

        for (int i=0; i<m; i++){
            a[i] = sc.nextInt();
            dp[a[i]] = 0;
            dp[0] = 1;
            dp[1] = 1;
        }

        for (int j=0; j<n-2; j++){
            dp[j+2] = (dp[j+1]+dp[j])%1000000007;
        }

        System.out.println(dp[n-1]);

        }
    }

