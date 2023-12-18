import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[][] = new int[2][N];
        for(int i=0;i<2;i++){
            for(int j=0;j<N;j++){
                A[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[2][N];
        for(int i=0;i<2;i++){
            for(int j=0;j<N;j++){
                if(i==0 && j==0) dp[0][0] = A[0][0];
                if(i==1 && j>0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + A[i][j];
                } else if(j>0 && i==0){
                    dp[i][j] = dp[i][j-1] + A[i][j];
                } else if(j==0 && i==1){
                    dp[i][j] = dp[i-1][j] + A[i][j];
                }
            }

        }
        System.out.println(dp[1][N-1]);
    }


}
