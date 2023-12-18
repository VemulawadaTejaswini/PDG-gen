import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] h = new int[N];
        int[] dp = new int[N];

        for(int i = 0; i < N ;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        int j = 0;
        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);
        for(j = 2; j < N  ;j++){
            int dp1 = Math.abs(h[j] - h[j -1]) + dp[j-1] ;
            int dp2 = Math.abs(h[j] - h[j -2]);
            if(dp1 <= dp2){
                dp[j] = dp1;
            }else{
                dp[j] = dp2;
            }
        }
        System.out.println(dp[j-1]);       
    }

}