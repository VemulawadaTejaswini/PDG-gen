import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1000];
        int[] memo = new int[N+1000];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            memo[i]=-1;
        }

//        int[] dp = new int[N+1000];
//        for (int i = 0; i <dp.length ; i++) {
//            dp[i] = Integer.MAX_VALUE;
//        }
//        dp[1] = 0;
//        for (int i = 1; i <= N ; i++) {
//            dp[i+1] =Math.min(dp[i+1], dp[i] +Math.abs(arr[i-1]-arr[i]));
//            dp[i+2] =Math.min(dp[i+2], dp[i] +Math.abs(arr[i-1]-arr[i+1]));
//        }
//        System.out.println(dp[N]);


        System.out.println(recur(arr,memo,N-1));

    }

    static public int recur(int[] arr,int[] memo, int idx){
        if(memo[idx]!=-1) return memo[idx];
        if(idx <=0){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        if(idx-1>=0)
        min = Math.min(min, recur(arr,memo,idx-1) + Math.abs(arr[idx] - arr[idx-1]));

        if(idx-2>=0)
        min = Math.min(min, recur(arr,memo,idx-2) + Math.abs(arr[idx] - arr[idx-2]));

        memo[idx] =min;
        return min;
    }


}
