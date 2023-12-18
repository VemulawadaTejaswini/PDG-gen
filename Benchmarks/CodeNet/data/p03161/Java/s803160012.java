import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int K= sc.nextInt();
        int[] arr= new int[N];
        for (int x=0; x<N; x++){
            arr[x]= sc.nextInt();
        }
        int[] dp= new int[N];
        dp[1]= Math.abs(arr[0]-arr[1]);
        for (int x=2; x<N; x++){
            int val= arr[x];
            int best= Integer.MAX_VALUE;
            for (int y=1; y<=K; y++){
                if (x-y<0) break;
                best= Math.min(best, dp[x-y]+ Math.abs(val- arr[x-y]));
            }
            dp[x]= best;
        }
        System.out.println(dp[N-1]);
    }
}
