import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] hap= new int[N][3];
        for(int i=0;i<N;i++){
            hap[i][0] = sc.nextInt();
            hap[i][1] = sc.nextInt();
            hap[i][2] = sc.nextInt();
        }
        System.out.println(vacation(N,hap));
    }

    static int vacation(int N, int[][] happineses){

        int[][] dp = new int[2][N+1];
        dp[0][0] =0;
        dp[1][0] =-1;

        for(int i=1 ; i<=N ; i++){
            int max = 0;
            int maxIdx = -1;
            for(int j=0;j<3;j++){
                if(j == dp[1][i-1]) continue;
                int happiness = happineses[i-1][j];
                if(max < happiness){
                    max = happiness;
                    maxIdx = j;
                }
            }
            dp[0][i]=dp[0][i-1] + max;
            dp[1][i]=maxIdx;

        }

        return dp[0][N];
    }
}