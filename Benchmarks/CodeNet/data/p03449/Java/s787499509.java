import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new  Scanner(System.in);
        int N = in.nextInt();
        int [][]dp = new int[3][N + 1];
        int [][]A = new int[3][N + 1];
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= N; j++){
                A[i][j] = in.nextInt();
            }
        }
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= N; j++){
                dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1]) + A[i][j];
            }
        }
        System.out.println(dp[2][N]);
    }
}
