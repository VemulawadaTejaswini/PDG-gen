import java.util.Scanner;

public class Main {
    public static long exp(int n){
        if(n == 0)
            return 1;
        if(n == 1)
            return 2;
        if(n % 2 == 1){
            long result = exp(n / 2);
            return 2 * result * result;
        }else{
            long result = exp(n / 2);
            return result * result;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] ar = new int[n];
        for(int i =0; i < n; i++)
            ar[i] = sc.nextInt();
        /*long count = 0;
        int total, numElm;
        long limit = exp(n);
        for(long i = 1; i < limit; i++){
            total = 0;
            numElm = 0;
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) >> j == 1) {
                    total += ar[j];
                    numElm += 1;
                }
            }
            if(numElm > 0 && (numElm * a == total))
                count += 1;
        }
        System.out.println(count);*/
        long[][][] dp = new long[n + 1][n + 1][n * a + 1];
        dp[0][0][0] = 1;
        for(int j = 1; j <= n; j++){
            for(int k = 0; k <= n; k++){
                for(int s = 0; s <= n * a; s++){
                    if(k > 0 && s >= ar[k - 1]){
                        dp[j][k][s] = dp[j - 1][k][s] + dp[j - 1][k - 1][s - ar[k - 1]];
                    }else
                        dp[j][k][s] = dp[j - 1][k][s];
                }
            }
        }
        long count = 0;
        for(int k = 1; k <= n; k++){
            count += dp[n][k][k * a];
        }
        System.out.println(count);
    }
}
