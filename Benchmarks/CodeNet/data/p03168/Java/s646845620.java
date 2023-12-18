import java.util.Scanner;

/**
 * Created by Harry on 4/2/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_i
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] p = new double[N];
        for(int i=0; i<N; i++){
            p[i] = scanner.nextDouble();
        }
        double[] dp = new double[N+1];
        dp[0] = 1;
        for(int i=0; i<N; i++){
            for(int j=i+1; j>=0; j--){
                dp[j] = dp[j]*(1-p[i])+(j-1>=0 ? dp[j-1]*p[i] : 0);
            }
        }
        double res = 0.0;
        for(int i=(N+1)/2; i<=N; i++){
            res += dp[i];
        }
        System.out.print(res);
    }
}
