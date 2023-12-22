import java.util.*;

public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        int[] dp = new int[35];
        dp[0]=1;
        for(int i = 0; i < 30; i++){
            dp[i+1] += dp[i];
            dp[i+2] += dp[i];
            dp[i+3] += dp[i];
        }
        //System.out.println(Arrays.toString(dp));
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            System.out.println(dp[n]/10/365 + 1);
        }            

    }

    public static void main(String[] args){
        new Main().run();
    }
}