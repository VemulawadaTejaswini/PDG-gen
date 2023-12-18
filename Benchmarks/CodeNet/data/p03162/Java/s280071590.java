import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] dp = new long[3];
        for(int i = 0; i < n; i++)
        {
            long [] c = new long[3];
            for(int j = 0; j < 3; j++)
                c[j] = sc.nextInt();
            long [] b = new long[3];
            b[0] = b[1] = b[2] = -1;
            for(int j = 0; j < 3; j++)
            {
                for(int k = 0; k < 3; k++)
                    if(k != j)
                        b[j] = Math.max(dp[k] + c[j], b[j]);
            }
            for(int j = 0; j < 3; j++)
                dp[j] = b[j];
        }
        System.out.println(Math.max(dp[0], Math.max(dp[1], dp[2])));
    }
}