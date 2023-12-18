import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N+1000][3];
        int[] memo = new int[N+1000];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            memo[i]=-1;
        }
        int[][] dp = new int[N+1000][3];
//        for (int i = 0; i <dp.length ; i++) {
//            dp[i] = Integer.MAX_VALUE;
//        }

        dp[1][0] = arr[0][0];
        dp[1][1] = arr[0][1];
        dp[1][2] = arr[0][2];

        for (int i = 2; i <= N ; i++) {
            //A
            dp[i][0]=Math.max(dp[i-1][1],dp[i-1][2]) + arr[i-1][0];
            dp[i][1]=Math.max(dp[i-1][0],dp[i-1][2]) + arr[i-1][1];
            dp[i][2]=Math.max(dp[i-1][0],dp[i-1][1]) + arr[i-1][2];
        }

        System.out.println(Math.max(Math.max(dp[N][0],dp[N][1]),dp[N][2]));

//        System.out.println(recur(arr,memo,K,N-1));

    }

    static public int recur(int[] arr,int[] memo,int K, int idx){
        if(memo[idx]!=-1) return memo[idx];
        if(idx <=0){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int i = Math.max(0,idx-K); i <= idx-1; i++) {
            min = Math.min(min, recur(arr,memo,K,i) + Math.abs(arr[idx] - arr[i]));
        }

        memo[idx] =min;
        return min;
    }


}
