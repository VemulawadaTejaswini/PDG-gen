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

            for(int k=0;k<3;k++) {
                for (int j = 0; j < 3; j++) {
                    if (j == k ) continue;
                    int happiness;
                    if(i - 2 >=0 ){
                        if(k==dp[1][i-2]) continue;
                        happiness = happineses[i - 1][j] + happineses[i - 2][k];
                    }else{
                        happiness = happineses[i - 1][j];
                    }
                    if (max < happiness) {
                        max = happiness;
                        maxIdx = j;
                    }
                }
            }
            if(i - 2 >=0){
                dp[0][i]=dp[0][i-2] + max;
                dp[1][i]=maxIdx;
            }else{
                dp[0][i]=max;
                dp[1][i]=maxIdx;
            }

        }

        System.out.println(Arrays.toString(dp[1]));

        return dp[0][N];
    }
}