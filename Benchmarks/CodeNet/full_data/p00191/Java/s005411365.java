import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n, m;
    static double[][] dp, table;

    public static void main(String[] args) {
        while(read()){
            solve();
        }

    }

    static boolean read(){
        if(!sc.hasNext())return false;
        n = sc.nextInt();
        m = sc.nextInt();
        if(n == 0 || m == 0)return false;
        dp = new double[m][n];
        table = new double[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                table[i][j] = sc.nextDouble();
            }
        }

        for(int i = 0; i < 1; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = 1.0;
            }
        }

        return true;
    }

    static void solve(){
        int index = 0;
        double value = 0.0, res = 0.0;
        double[] array = new double[n];
        for(int i = 0; i < m-1; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    array[k] = table[j][k];
                }
                for(int k = 0; k < n; k++){
                    if(value < array[k]){
                        index = k;
                        value = array[k];
                    }
                }
                dp[i+1][index] = Math.max(dp[i+1][index], value*dp[i][j]);
            }
        }

        for(int j = 0; j < n; j++){
            res = Math.max(res, dp[m-1][j]);
        }
        System.out.printf("%.2f\n", res);
    }
}