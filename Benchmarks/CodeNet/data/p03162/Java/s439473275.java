import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] happy = new int[3][N];
        for(int n=0; n<N; n++){
            happy[0][n] = sc.nextInt();
            happy[1][n] = sc.nextInt();
            happy[2][n] = sc.nextInt();
        }
        int[][] dp = new int[3][N];
        //dp[i][n] : the max happiness in 'n' days when the 'n'-th activity is 'i'
        for(int i=0;i<3;i++) dp[i][0]=happy[i][0];
        for(int n=1;n<N;n++)
            for(int i=0;i<3;i++)
                for(int j=0; j<3;j++) if(i!=j){
                    dp[i][n] = Math.max(dp[i][n], dp[j][n-1] + happy[i][n]);
        }


        //for(int i=0;i<3;i++) System.err.println(Arrays.toString(dp[i]));
        System.out.println(Math.max(Math.max(dp[0][N-1], dp[1][N-1]),dp[2][N-1]));




    }
}
