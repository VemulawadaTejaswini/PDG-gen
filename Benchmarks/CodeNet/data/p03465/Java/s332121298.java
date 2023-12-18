import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = IntStream.range(0,N).map(i -> scan.nextInt()).toArray();
        Arrays.sort(A);
        int sumA = 0;
        for(int i=0;i<N;++i)sumA+=A[i];
        int k = (sumA+1)/2;
        //k以下の最大値
        boolean dp[][] = new boolean[N+1][2001];
        dp[0][0]=true;


        for(int i=0;i<N;++i){
            for(int j=0;j<=2000;++j){
                if(!dp[i][j])continue;
                dp[i+1][Math.abs(j-A[i])]=dp[i][j];
                if(j+A[i]<=2000)dp[i+1][j+A[i]]=dp[i][j];
            }
        }
        for(int i=0;i<2001;++i){
            if(dp[N][i]){
                System.out.println((sumA+i)/2);
                break;
            }
        }


    }
}