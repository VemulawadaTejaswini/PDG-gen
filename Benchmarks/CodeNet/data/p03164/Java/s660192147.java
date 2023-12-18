import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        for(int i=0;i<N;i++){
            w[N-i-1] = sc.nextInt();
            v[N-i-1] = sc.nextInt();
        }
        long[][] dp = new long[N+1][W+1];
        int[][] parents = new int[N+1][W+1];
        for(int i=1 ;i<=N;i++ ){//items
            for(int j=1;j<=W;j++){//Weight
                long m ;
                if(j-w[i-1]>=0){
                    long take =dp[i-1][j-w[i-1]]+v[i-1];
                    long notTake =dp[i-1][j];
                    m = Math.max(take,notTake );
                    parents[i][j] = m==take?j-w[i-1]:j ;
                }else{
                    m =  dp[i-1][j];
                    parents[i][j] = j;
                }
                dp[i][j]=m;
            }
        }
        System.out.println(dp[N][W]);

//        for(long[] l : dp){
//            System.out.println(Arrays.toString(l));
//        }
//
//
//        int pi= N-1;
//        int pw= parents[N][W];
//        while(pi>=0){
//            System.out.println(pi+" "+pw);
//            pw= parents[pi][pw];
//            pi--;
//        }



    }
}
