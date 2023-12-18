import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] p = new int [n];
        double[] q = new double [n];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            q[i] = sum(p[i]);
            q[i] /= p[i];
        }

        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += q[i];
        }
        double max = sum;


        for(int i = k; i < n; i++){
            sum += q[i];
            sum -= q[i - k];
            max = Math.max(sum, max);
        }

        System.out.println(max);
    }

    static int[] dp = new int[1001];
    static int sum(int n){
        if(dp[n] == 0){
            dp[n] = sum(n - 1) + n;
        }
        return dp[n];
    }

}
